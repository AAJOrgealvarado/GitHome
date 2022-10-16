
package com.mycompany.proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Proyecto extends JFrame {
    private JTextArea Chatarea = new JTextArea();
    private JTextField Chatbox = new JTextField();
    
    
    public Proyecto(){
       
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600, 1000);
        frame.setTitle("Vulnerabilidades");
        frame.add(Chatarea);
        frame.add(Chatbox);
        
        //Text Chat
        Chatarea.setSize(500, 800);
        Chatarea.setLocation(40, 20);
        
        //Text 
        Chatbox.setSize(500, 40);
        Chatbox.setLocation(40,870);
        Chatbox.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String gtext = Chatbox.getText().toLowerCase();
                Chatarea.append("Jorge: "+ gtext +"\n");
                Chatbox.setText("");
                if(gtext.contains("hola") || gtext.contains("buenos")|| gtext.contains("buenas")){
                    bot("Hola vamos a detectar seguridad.");
                    bot("Selecciona el el problema y te indicamos el fallo");
                    bot("1. Datos encriptados y secuetro de informaciòn");
                    bot("2. Pagina Insegura");
                    bot("3. Cabeceras desconfigurardas");
                    bot("4. Protocolos inseguros");
                    bot("5. Inyecciòn codigo sql");
                    bot("6. Anemia");
                    bot("7. Problemas digestivos");
                    bot("8. Problemas articulares");
                    bot("9. Digestivos o estreñimiento");
                    
                    
                    
                }else if(gtext.contains("1") ){
                    bot("Es unn ransomeware, apoyadte de copia de seguridad y tu probvedor de antivirus");
                    
                }else if(gtext.contains("2")){
                    bot("Activar certificado SSL");
                }else if(gtext.contains("3") ){
                    bot("Configuraciòn de header");
                }else if(gtext.contains("4")){
                    bot("Navegar por portocolo https y puerto 443");
                }else if(gtext.contains("5") ){
                    bot("Rebustecer base de datos y cambiar password de acceso");
                }else if(gtext.contains("6") ||gtext.contains("alzheimer") ||gtext.contains("memoria") ||gtext.contains("olvidar cosas")){
                    bot("Arandanos, Mora, Naranja");
                }else if(gtext.contains("7") ||gtext.contains("digestivos") ||gtext.contains("digestion") ||gtext.contains("estomago")){
                    bot("Plátano");
                }else if(gtext.contains("8") ||gtext.contains("alzheimer") ||gtext.contains("memoria") ||gtext.contains("olvidar cosas")){
                    bot("Uvas rojas y moradas");
                }else if(gtext.contains("9") ||gtext.contains("digestion") ||gtext.contains("estomago") ||gtext.contains("estreñimiento")){
                    bot("Papaya");
                }
            }
        
        });
        
        }
        private void bot(String string){
        Chatarea.append("Bot : "+string+"\n");
        
        
    }
        public static void main(String[] args) {
        new Proyecto();
        System.out.println("Hello World!");        
    }
}
