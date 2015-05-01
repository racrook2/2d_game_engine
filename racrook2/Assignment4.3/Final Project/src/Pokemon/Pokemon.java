package Pokemon;

/**
 * Contains all data necessary to represent a Pokemon
 * @author Ran Crook
 */

import java.util.*;
import java.awt.*;

public abstract class Pokemon
{
    private int baseHP;
    private int baseAtk;
    private int baseDef;
    private int baseSpA;
    private int baseSpD;
    private int baseSpe;
    private String gender;
    private LinkedList<Moves.Move> movepool;
    private Moves.Move[] currMoveset;
    private Image frontSprite;
    private Image backSprite;
    private Types.Type type1;
    private Types.Type type2;
    private int HP;
    private int atk;
    private int def;
    private int spA;
    private int spD;
    private int spe;
    private int currHP = 0;
    private int HPEV = 0;
    private int atkEV = 0;
    private int defEV = 0;
    private int spAEV = 0;
    private int spDEV = 0;
    private int speEV = 0;

    /**
     * Constructor for a Pokemon
     * @param baseHP base hit point stat
     * @param baseAtk base attack stat
     * @param baseDef base defense stat
     * @param baseSpA base special attack stat
     * @param baseSpD base special defense stat
     * @param baseSpe base speed stat
     * @param gender male, female or null
     * @param movepool moves the Pokemon learns by level
     * @param frontSprite image of Pokemon as enemy during battle
     * @param backSprite image of Pokemon as ally during battle
     * @param type1 the primary elemental attribute of the Pokemon
     * @param type2 the secondary elemental attribute of the Pokemon
     */
    public Pokemon(int baseHP, int baseAtk, int baseDef, int baseSpA, int baseSpD, int baseSpe, String gender,
                   LinkedList<Moves.Move> movepool, Image frontSprite, Image backSprite, Types.Type type1, Types.Type type2)
    {
        if (baseHP > 255) {
            this.baseHP = 255;
        }
        else if (baseHP < 1) {
            this.baseHP = 1;
        }
        else {
            this.baseHP = baseHP;
        }

        if (baseAtk > 255) {
            this.baseAtk = 255;
        }
        else if (baseAtk < 1) {
            this.baseAtk = 1;
        }
        else {
            this.baseAtk = baseAtk;
        }

        if (baseDef > 255) {
            this.baseDef = 255;
        }
        else if (baseDef < 1) {
            this.baseDef = 1;
        }
        else {
            this.baseDef = baseDef;
        }

        if (baseSpA > 255) {
            this.baseSpA = 255;
        }
        else if (baseSpA < 1) {
            this.baseSpA = 1;
        }
        else {
            this.baseSpA = baseSpA;
        }

        if (baseSpD > 255) {
            this.baseSpD = 255;
        }
        else if (baseSpD < 1) {
            this.baseSpD = 1;
        }
        else {
            this.baseSpD = baseSpD;
        }

        if (baseSpe > 255) {
            this.baseSpe = 255;
        }
        else if (baseSpe < 1) {
            this.baseSpe = 1;
        }
        else {
            this.baseSpe = baseSpe;
        }

        if (gender != null && (gender.equals("male") || gender.equals("female"))) {
            this.gender = gender;
        }
        else {
            this.gender = null;
        }

        // initialize current moveset
        this.movepool = movepool;
        currMoveset = new Moves.Move[4];
        for (int i = 0; i < currMoveset.length; i++) {
            currMoveset[i] = null;
        }
        calculateCurrMoveset();

        this.frontSprite = frontSprite;
        this.backSprite = backSprite;
        this.type1 = type1;
        this.type2 = type2;
        calculateStats();
        currHP = HP;
    }

    /**
     * Lets you set the effort values of the Pokemon
     * @param HPEV hit point effort value
     * @param atkEV attack effort value
     * @param defEV defense effort value
     * @param spAEV special attack effort value
     * @param spDEV special defense effort value
     * @param speEV speed effort value
     */
    public void setEVs(int HPEV, int atkEV, int defEV, int spAEV, int spDEV, int speEV)
    {
        // Each individual EV cannot exceed 255 and the total cannot exceed 510
        if (HPEV > 255) {
            HPEV = 255;
        }
        else if (HPEV < 0) {
            HPEV = 0;
        }

        if (atkEV > 255) {
            atkEV = 255;
        }
        else if (atkEV < 0) {
            atkEV = 0;
        }

        if (defEV > 255) {
            defEV = 255;
        }
        else if (defEV < 0) {
            defEV = 0;
        }

        if (spAEV > 255) {
            spAEV = 255;
        }
        else if (spAEV < 0) {
            spAEV = 0;
        }

        if (spDEV > 255) {
            spDEV = 255;
        }
        else if (spDEV < 0) {
            spDEV = 0;
        }

        if (speEV > 255) {
            speEV = 255;
        }
        else if (speEV < 0) {
            speEV = 0;
        }

        if (HPEV + atkEV + defEV + spAEV + spDEV + speEV > 510) {
            return;
        }

        this.HPEV = HPEV;
        this.atkEV = atkEV;
        this.defEV = defEV;
        this.spAEV = spAEV;
        this.spDEV = spDEV;
        this.speEV = speEV;
        calculateStats();
    }

    /**
     * Calculates the Pokemon's stats based on its base stats and EVs
     */
    public void calculateStats()
    {
        HP = 141 + 2*baseHP + HPEV/4;
        atk = 36 + 2*baseAtk + atkEV/4;
        def = 36 + 2*baseDef + defEV/4;
        spA = 36 + 2*baseSpA + spAEV/4;
        spD = 36 + 2*baseSpD + spDEV/4;
        spe = 36 + 2*baseSpe + speEV/4;
    }

    public int getHP()
    {
        return HP;
    }

    public int getAtk()
    {
        return atk;
    }

    public int getDef()
    {
        return def;
    }

    public int getSpA()
    {
        return spA;
    }

    public int getSpD()
    {
        return spD;
    }

    public int getSpe()
    {
        return spe;
    }

    public int getCurrHP()
    {
        return currHP;
    }

    public int getHPEV()
    {
        return HPEV;
    }

    public int getAtkEV()
    {
        return atkEV;
    }

    public int getDefEV()
    {
        return defEV;
    }

    public int getSpAEV()
    {
        return spAEV;
    }

    public int getSpDEV()
    {
        return spDEV;
    }

    public int getSpeEV()
    {
        return speEV;
    }

    /**
     * Increases the Pokemon's HP by the given amount
     * @param amount the amount by which to heal the Pokemon
     */
    public void incrementCurrHP(int amount)
    {
        currHP += amount;
        if (currHP > HP) {
            currHP = HP;
        }
    }

    /**
     * Decreases the Pokemon's HP by the given amount
     * @param damage the amount by which to damage the Pokemon
     */
    public void decrementCurrHP(int damage)
    {
        currHP -= damage;
        if (currHP < 0) {
            currHP = 0;
        }
    }

    public void setCurrHP(int currHP)
    {
        this.currHP = currHP;
        if (this.currHP < 0) {
            this.currHP = 0;
        }
        else if (this.currHP > HP) {
            this.currHP = HP;
        }
    }

    public double getHPPercent()
    {
        return (double)currHP/HP;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        if (gender != null && (gender.equals("male") || gender.equals("female"))) {
            this.gender = gender;
        }
        else {
            // Default to genderless
            this.gender = null;
        }
    }

    /**
     * Randomly determines the gender of the Pokemon based on a ratio
     * @param ratio percentage of this Pokemon who are male
     */
    public void assignGender(int ratio)
    {
        if (ratio > 100 || ratio < 0) {
            gender = null;
        }
        else {
            int randNbr = (new Random()).nextInt(100) + 1;
            if (randNbr <= ratio) {
                gender = "male";
            }
            else {
                gender = "female";
            }
        }
    }

    public LinkedList<Moves.Move> getMovepool()
    {
        return movepool;
    }

    public void setMovepool(LinkedList<Moves.Move> movepool)
    {
        this.movepool = movepool;
        calculateCurrMoveset();
    }

    public Moves.Move[] getCurrMoveset()
    {
        return currMoveset;
    }

    /**
     * Works out the Pokemon's moveset based on its level-up movepool
     */
    public void calculateCurrMoveset()
    {
        if (movepool == null) {
            return;
        }

        if (movepool.size() == 1) {
            currMoveset[0] = movepool.get(0);
        }
        else if (movepool.size() == 2) {
            currMoveset[0] = movepool.get(1);
            currMoveset[1] = movepool.get(0);
        }
        else if (movepool.size() == 3) {
            currMoveset[0] = movepool.get(2);
            currMoveset[1] = movepool.get(1);
            currMoveset[2] = movepool.get(0);
        }
        else if (movepool.size() >= 4) {
            for (int i = 0; i < currMoveset.length; i++) {
                currMoveset[i] = movepool.get(movepool.size() - i - 1);
            }
        }
    }

    /**
     * Allows you to replace a move with a new one or delete a move
     * @param index the index within the Pokemon's current moveset that should be changed
     * @param move the new move to be added
     */
    public void setNewMove(int index, Moves.Move move)
    {
        if (index < 0 || index > 3) {
            return;
        }

        // cannot delete move if it's the Pokemon's last move
        if (move == null && index == 0 && currMoveset[0] != null && currMoveset[1] == null &&currMoveset[2] == null && currMoveset[3] == null) {
            return;
        }

        currMoveset[index] = move;

        // move all attacks over to prevent gaps
        for (int i = 0; i < currMoveset.length - 1; i++) {
            boolean noMoreMoves = true;
            for (int j = i + 1; j < currMoveset.length; j++) {
                if (currMoveset[j] != null) {
                    noMoreMoves = false;
                    break;
                }
            }

            if (currMoveset[i] == null && !noMoreMoves) {
                for (int j = i; j < currMoveset.length - 1; j++) {
                    currMoveset[j] = currMoveset[j + 1];
                }
                currMoveset[currMoveset.length - 1] = null;
                i--;
            }
        }
    }

    public Image getFrontSprite()
    {
        return frontSprite;
    }

    public void setFrontSprite(Image frontSprite)
    {
        this.frontSprite = frontSprite;
    }

    public Image getBackSprite()
    {
        return backSprite;
    }

    public void setBackSprite(Image backSprite)
    {
        this.backSprite = backSprite;
    }

    public Types.Type getType1()
    {
        return type1;
    }

    public Types.Type getType2()
    {
        return type2;
    }

    public abstract String getName();
}