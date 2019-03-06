package creational.builder.builder;

public class WizardCharacterBuilder extends CharacterBuilder {

    @Override
    public void buildGender() {
        character.setGender("Male");
    }

    @Override
    public void buildClothes() {
        character.setClothes("Cloak");
    }

    @Override
    public void buildHaircut() {
        character.setHaircut("unknown");
    }
}
