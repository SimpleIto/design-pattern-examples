package creational.builder.builder;

import creational.builder.product.GameCharacter;

public abstract class CharacterBuilder {
    protected GameCharacter character = new GameCharacter();

    public abstract void buildGender();
    public abstract void buildClothes();
    public abstract void buildHaircut();

    public GameCharacter build(){
        return character;
    }
}
