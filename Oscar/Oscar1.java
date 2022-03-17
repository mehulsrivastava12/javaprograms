package Oscar;

import java.nio.file.Paths;
import java.util.Collections;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Oscar1 {

    public static void main(String[] args, Collections Collection) throws Exception{
        Path filePath = Paths.get("C:\\Users\\DELL\\Desktop\\oscar_age_male.csv");
        Charset charset = StandardCharsets.UTF_8;
        Set<Main17> main17=new TreeSet<>();
        int i=0;
        List<String> lines = Files.readAllLines(filePath, charset);
        for (i=0;i<lines.size();i++) {
            if(i==0){
                
            }
            else{
                String line=lines.get(i);
                String[] val = line.split(",");
                main17.add(new Main17(val[0], val[1], val[2], val[3], val[4]));

            }

        }
        System.out.println(main17);
    }

}