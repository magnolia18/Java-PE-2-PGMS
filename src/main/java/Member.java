import java.io.*;
interface Member {
    final String name = "";
    final int age = 0;
    float salary = 0.0F;
}

class MemberVariable implements java.lang.reflect.Member{

    @Override
    public Class<?> getDeclaringClass() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getModifiers() {
        return 0;
    }

    @Override
    public boolean isSynthetic() {
        return false;
    }

}