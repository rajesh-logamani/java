package B_accessModifiers.second;

import B_accessModifiers.first.Class;

public class SubClassOutsidePackage extends Class {
    // This class is in a different package and cannot access the protected or default members of Class.
    // It can only access public members.

    @Override
    public void publicMethod() {
        System.out.println("Public Method from SubClassOutsidePackage");
    }

//    productedMehod(); // This will cause a compilation error since protectedMethod is not accessible here.
//    defaultMethod(); // This will cause a compilation error since defaultMethod is not accessible here.

    public void accessProductedMethodFromParent(){
        protectedMethod();
        System.out.println(protectedVar);
    }


    // Cannot override protected or default methods here, as they are not accessible.
    // Attempting to do so will result in a compilation error.

    // If you need to access protected or default members, you would typically do so through a subclass in the same package.
}
