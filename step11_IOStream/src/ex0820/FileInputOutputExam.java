package ex0820;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputExam {

    FileInputStream fileInputStream = null;

    //생성자
    public FileInputOutputExam(){
    	FileOutputStream fos = null;
        try{
            fileInputStream = new FileInputStream("src/ex0820/a.txt");

            //-----바이트 단위로 파일 읽기-----//
            /*
            while(true){ //끝까지 돎
                int i = fileInputStream.read(); //읽기 -> 1바이트씩만 읽으므로 H만 나옴
                if(i == -1) break;
                System.out.println(i + " = " + (char)i);
            }

            System.out.println("완료");*/

            /// ////////////////////////////////////

            //-----byte [] 크기 만큼 한번에 읽기-----//

            //바이트 배열의 크기 알아보기(읽을 수 있는 바이트 수를 반환하는 메서드 사용)
            int len = fileInputStream.available();

            byte[] b = new byte[len]; //배열은 크기 지정 미리 필요
            fileInputStream.read();

            //바이트 배열을 그대로 출력하면 주소값이 나오므로 String으로 변환 필요
            //fileInputStream.read(b);

            //String으로 변환
            String str = new String(b);
            System.out.println(str);

            System.out.println("완료");
            
            //파일에 내용 저장 = 쓰기
            fos = new FileOutputStream("src/ex0820/save.txt", true);
            fos.write(b);
            /*fos.write(65);
            fos.write(66);
            fos.write(67);*/
            
            // String ->byte[]로 변환
            String data = "집에 가고싶어요~";
            fos.write(data.getBytes());

        }catch (IOException e){

            e.printStackTrace();

        }finally {

            try{
                if(fileInputStream!=null) fileInputStream.close();
                if(fos != null) fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {

        FileInputOutputExam fileInputOutputExam = new FileInputOutputExam();
    }
}