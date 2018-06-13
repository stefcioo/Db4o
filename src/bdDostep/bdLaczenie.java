package bdDostep;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

public class bdLaczenie {

    public bdLaczenie() {


    ObjectContainer oc = Db4o.openFile("mojaBazaDanych");

    try{


    }
    finally{
        oc.close();
    }

    }
}
