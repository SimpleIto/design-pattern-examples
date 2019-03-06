package creational.builder;

/**
 * 更常见的简化用法，省略指挥者，builder为产品的内部类、
 * 以链式调用的形式构建对象
 */
public class ComplexObject {

    private final String mName;
    private final String mValue;

    private ComplexObject(Builder builder) {
        this.mName = builder.name;
        this.mValue = builder.value;
    }

    public static class Builder {
        private String name;
        private String value;

        public Builder buildName(String nameObj) {
            this.name = nameObj;
            return this;
        }

        public Builder buildValue(String valueObj) {
            this.value = valueObj;
            return this;
        }

        public ComplexObject build() {
            return new ComplexObject(this);
        }
    }
}