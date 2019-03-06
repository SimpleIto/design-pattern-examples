package creational.builder;

import creational.builder.builder.CharacterBuilder;
import creational.builder.builder.DoctorCharacterBuilder;
import creational.builder.director.CharacterDirector;
import creational.builder.product.GameCharacter;

public class Client {
    //完整定义方式
    CharacterBuilder builder = new DoctorCharacterBuilder();
    CharacterDirector director = new CharacterDirector(builder);
    GameCharacter character = director.createCharacter();

    //第二种常用简化方式（与上述例子不同）
    ComplexObject object = new ComplexObject.Builder()
            .buildName("这是属性1名称")
            .buildValue("这是属性2值")
            .build();
}
