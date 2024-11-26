class Warrior extends ROLE implements LifeRecoverable, MagicRecoverable {
    
    Warrior() {}
    
    Warrior(String name, int life, int magic) {
        super(name, life, magic);
    }

    public void NewMoon(ROLE R) {
        if (getMagic() < 10) {
            System.out.println("Ran out of mana, did not cast attack");
        } else {
            setMagic(getMagic() - 10);
            
            if (R instanceof Warrior) {
                R.setLife(R.getLife() - 25);
            } else if (R instanceof Priest) {
                R.setLife(getLife() - 30);
            } else {
                R.setLife(R.getLife() - 40);
            }
            
            if (R.getLife() <= 0) {
                System.out.printf("%s was slained by %s%n", R.getName(), getName());
                System.exit(0);
            }
        }
    }

    @Override
    public void recoverLife() {
        // Warrior recovers life using the LIFERATE constant
        System.out.printf("%s recovers %d life.%n", getName(), LIFERATE);
        setLife(getLife() + LIFERATE);
    }

    @Override
    public void recoverMagic() {
        // Warrior recovers magic using the MAGICRATE constant
        System.out.printf("%s recovers %d magic.%n", getName(), MAGICRATE);
        setMagic(getMagic() + MAGICRATE);
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %d%n%s: %d%n", "Character name", getName(), "Life", getLife(), "Magic", getMagic());
    }
}
