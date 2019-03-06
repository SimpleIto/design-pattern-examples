package creational.builder.director;

import creational.builder.builder.CharacterBuilder;
import creational.builder.product.GameCharacter;

public class CharacterDirector {
    private CharacterBuilder builder;

    public CharacterDirector(CharacterBuilder builder){
        this.builder = builder;
    }
    public GameCharacter createCharacter(){
        builder.buildGender();
        builder.buildClothes();
        builder.buildHaircut();
        return builder.build();
    }
}
