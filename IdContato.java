import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;

public class IdContato {
    
    public static void main(String[] args) {
        System.out.println("ORDEM ALEATÓRIA");
        Map<Integer, Contato> agenda = new HashMap<>() {{

            put(1 , new Contato("Harvey", 7777));
            put(2, new Contato("Mike", 8888));
            put(3, new Contato("Donna", 4444));
            
        }};

        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());

        }

        System.out.println("---------\nAgenda Ordem de Inserção: ");
        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{

            put(1 , new Contato("Harvey", 7777));
            put(2, new Contato("Mike", 8888));
            put(3, new Contato("Donna", 4444));
           
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("---------\nAgenda Ordem dos códigos: ");
        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }


       /* System.out.println("---------\nAgenda Ordem de Numérica: ");
        System.out.println("--\tOrdem número telefone\t--");
       
        //precisamos organizar os valores. Logo:
        
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorOrdemNumerica());
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        } */

        //EXEMPLO CLASSE ANÔNIMA AULA STREAM API PARTE 1

        System.out.println("--\tOrdem número telefone\t--");
        //precisamos organizar os valores. Logo:
       /* Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>> () {
            @Override
            public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
               return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());

            }

        });*/
        
        
        /*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
            new Function<Map.Entry<Integer, Contato>, Integer >() {

                @Override
                public Integer apply(Entry<Integer, Contato> cont) {
                    // TODO Auto-generated method stub
                    return cont.getValue().getNumero();
                }
            
        }));
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {


            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());

        }*/

        // LAMBDA AULA STREAM API PARTE 1

        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
            cont -> cont.getValue().getNumero()));
               
        
        
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {


            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());

        }




        

        
        
    
    
    
    
    
    
    }

        
        
 


        
        
    







    
        
    }

    


