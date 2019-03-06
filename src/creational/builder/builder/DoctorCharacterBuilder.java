package creational.builder.builder;

public class DoctorCharacterBuilder extends CharacterBuilder {
    @Override
    public void buildGender() {
        character.setGender("Female");
    }

    @Override
    public void buildClothes() {
        character.setClothes("Skirt");
    }

    @Override
    public void buildHaircut() {
        character.setHaircut("Long hair");
    }
}
