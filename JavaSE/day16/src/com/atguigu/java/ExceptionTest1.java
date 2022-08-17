package com.atguigu.java;

import org.junit.Test;

/*
 * һ���쳣�Ĵ���ץ��ģ��
 *
 * ����һ��"��"������������ִ�еĹ����У�һ�������쳣���ͻ����쳣���봦����һ����Ӧ�쳣��Ķ���
 *           �����˶����׳���
 *           һ���׳������Ժ����Ĵ���Ͳ���ִ�С�
 *
 * 		�����쳣����Ĳ������� ϵͳ�Զ����ɵ��쳣����
 * 					 �� �ֶ�������һ���쳣���󣬲��׳���throw��
 *
 * ���̶���"ץ"���������Ϊ�쳣�Ĵ���ʽ���� try-catch-finally  �� throws

 * ����try-catch-finally��ʹ��
 *
 * try{
 * 		//���ܳ����쳣�Ĵ���
 *
 * }catch(�쳣����1 ������1){
 * 		//�����쳣�ķ�ʽ1
 * }catch(�쳣����2 ������2){
 * 		//�����쳣�ķ�ʽ2
 * }catch(�쳣����3 ������3){
 * 		//�����쳣�ķ�ʽ3
 * }
 * ....
 * finally{
 * 		//һ����ִ�еĴ���
 * }
 *
 * ˵����
 * 1. finally�ǿ�ѡ�ġ�
 * 2. ʹ��try�����ܳ����쳣�����װ��������ִ�й����У�һ�������쳣���ͻ�����һ����Ӧ�쳣��Ķ��󣬸��ݴ˶���
 *    �����ͣ�ȥcatch�н���ƥ��
 * 3. һ��try�е��쳣����ƥ�䵽ĳһ��catchʱ���ͽ���catch�н����쳣�Ĵ���һ��������ɣ���������ǰ��
 *    try-catch�ṹ����û��дfinally�������������ִ�����Ĵ���
 * 4. catch�е��쳣�������û���Ӹ����ϵ����˭�������ϣ�˭������������ν��
 *    catch�е��쳣������������Ӹ����ϵ����Ҫ������һ�������ڸ�������档���򣬱���
 * 5. ���õ��쳣������ķ�ʽ�� �� String  getMessage()    �� printStackTrace()
 * 6. ��try�ṹ�������ı������ٳ���try�ṹ�Ժ󣬾Ͳ����ٱ�����
 * 7. try-catch-finally�ṹ����Ƕ��
 *
 * ���1��ʹ��try-catch-finally�������ʱ�쳣���ǵó����ڱ���ʱ�Ͳ��ٱ�����������ʱ�Կ��ܱ���
 *     �൱������ʹ��try-catch-finally��һ������ʱ���ܳ��ֵ��쳣���ӳٵ�����ʱ���֡�
 *
 * ���2�������У���������ʱ�쳣�Ƚϳ�������������ͨ���Ͳ��������ʱ�쳣��дtry-catch-finally�ˡ�
 *      ����ڱ���ʱ�쳣������˵һ��Ҫ�����쳣�Ĵ���

 */
public class ExceptionTest1 {

    @Test
    public void test1(){
        String str = "123";
        str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println("hello - 1");
        }catch (NumberFormatException e){
//            System.out.println("????????????");
            //String gerMessage
            System.out.println(e.getMessage());
            //printStackTrace();
            //e.printStackTrace();
        }

        System.out.println("hello - 2����");

    }
}
