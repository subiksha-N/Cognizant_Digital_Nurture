module com.utils {
    exports com.utils;
}
package com.utils;

public class Utility {

    public static void display() {

        System.out.println("Utility Method");
    }
}
module com.greetings {

    requires com.utils;
}
package com.greetings;

import com.utils.Utility;

public class Main {

    public static void main(String[] args) {

        Utility.display();
    }
}
  
