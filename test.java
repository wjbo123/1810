<<<<<<< HEAD
public class signClss {
    private static  SignState = null;
    private signClss(){
    }
    public static SignState getSign(){
        if (SignState==null){
          synchronized(signClss.class){
            if (SignState==null){
                SignState = new SignState();
             }
            }
        }
    }

}
//Íõ½¨²©
public class Singleton {

	  private Singleton() {};

	  private static Singleton single ;
	  
	  public static Singleton getInstance() {
	
		if(null == single){
			synchronized(single){
				if(null == single){
					single = new Singleton();
				}
			}
		}
		return single;
	  }
}}


//boryer zhang

public class Singleton(){
	private Singleton singleton;
	private Singleton(){};
	public Singleton getSingleton(){
		if(singleton==null){
			synchronized(Singleton.class){
				if(singleton==null){
					singleton = new Singleton£¨£©£»
				}
			}
		}
		return singleton;
	}
}
<<<<<<< HEAD

//wjb  


public class Singleton {

	  private Singleton() {};

	  private static Singleton single ;
	  
	  public static Singleton getInstance() {
	
		if(null == single){
			synchronized(single){
				if(null == single){
					single = new Singleton();
				}
			}
		}
		return single;
	  }
}}
=======
public class signClss {
    private static  SignState = null;
    private signClss(){
    }
    public static SignState getSign(){
        if (SignState==null){
          synchronized(signClss.class){
            if (SignState==null){
                SignState = new SignState();
             }
            }
        }
    }

}
>>>>>>> 18709f5bf9bbee6f10d656958656963f1507b137
=======
>>>>>>> 5f5ba380afffa5fb0cb0ab5d8df59fc3fe76c2e5
