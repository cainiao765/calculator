package com.example.siyu_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_00,btn_sum,btn_sub,btn_dot,btn_del,btn_mult,btn_div,btn_clr,btn_equ,btn_quyu;
    private TextView cal_result;
    private  boolean flag=false;
    private String exp,strnum;
    private  List<String> mexp,bexp;
    private double resnum;
    private double  num1,res;
    private double  num2;
    private String operation="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cal_result = findViewById(R.id.edittext_input);
        btn_00=findViewById(R.id.button_00);
        btn_0=findViewById(R.id.button_0);
        btn_1=findViewById(R.id.button_1);
        btn_2=findViewById(R.id.button_2);
        btn_3=findViewById(R.id.button_3);
        btn_4=findViewById(R.id.button_4);
        btn_5=findViewById(R.id.button_5);
        btn_6=findViewById(R.id.button_6);
        btn_7=findViewById(R.id.button_7);
        btn_8=findViewById(R.id.button_8);
        btn_9=findViewById(R.id.button_9);
        btn_dot=findViewById(R.id.button_dian);
        btn_sum=findViewById(R.id.button_jia);
        btn_sub=findViewById(R.id.button_jian);
        btn_mult=findViewById(R.id.button_cheng);
        btn_div=findViewById(R.id.button_chu);
        btn_clr=findViewById(R.id.button_C);
        btn_equ=findViewById(R.id.button_dengyu);
        btn_del=findViewById(R.id.button_del);
        btn_quyu=findViewById(R.id.button_quyu);

        btn_00.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_sum.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_mult.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_clr.setOnClickListener(this);
        btn_equ.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_quyu.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button_00:
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+"00");
                break;
            case R.id.button_0:
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+"0");
                break;
            case R.id.button_1:
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+"1");
                break;
            case R.id.button_2:
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+"2");
                break;
            case R.id.button_3:
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+"3");
                break;
            case R.id.button_4:
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+"4");
                break;
            case R.id.button_5:
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+"5");
                break;
            case R.id.button_6:
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+"6");
                break;
            case R.id.button_7:
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+"7");
                break;
            case R.id.button_8:
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+"8");
                break;
            case R.id.button_9:
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+"9");
                break;
            case R.id.button_C:
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText("0");
                break;
            case R.id.button_dian:
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+".");
                break;
            case R.id.button_jia:
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+"+");
                break;
            case R.id.button_jian:
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+"-");
                break;
            case R.id.button_cheng :
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+"*");
                break;
            case R.id.button_chu :
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+"/");
                break;
            case R.id.button_quyu :
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                cal_result.setText(cal_result.getText().toString()+"%");
                break;
            case R.id.button_dengyu:
                exp=cal_result.getText().toString();
                if(exp.equals(" ")){
                    break;
                }
                cal_result.setText("");
                mexp=expList(exp);
                bexp=expbList(mexp);
                resnum=result_str(bexp);
                cal_result.setText(resnum+"");
                flag=true;
                break;
            case R.id.button_del:
                if(flag){
                    cal_result.setText("");
                    flag=false;
                }
                StringBuilder t=new StringBuilder(cal_result.getText().toString()+"");
                t.deleteCharAt(t.length()-1);
                cal_result.setText(t.toString());
                break;
        }
    }

    private double result_str(List<String> bexp) {
        Stack<String> stack = new Stack<String>();
        for(String i :bexp)
        {
            if(i.matches("\\d+")||(i.matches("\\d+\\.\\d+"))){
                stack.push(i);
            }else {
                num2=Double.parseDouble(stack.pop());
                num1=Double.parseDouble(stack.pop());
                res=0;
                if(i.equals("+"))
                    res=num1+num2;
                else if(i.equals("-"))
                    res=num1-num2;
                else if(i.equals("*"))
                    res=num1*num2;
                else if(i.equals("/"))
                    res=num1/num2;
                else if(i.equals("%"))
                    res=num1%num2;
                else {
                    throw  new RuntimeException();
                }
                stack.push(""+res);
            }
        }
        return res;
    }

    //将中缀表达式转换成后缀表达式
    private List<String> expbList(List<String> mexp) {
        Stack<String> s1=new Stack<String>();//运算符栈s1
        List<String> s2=new ArrayList<String>();//存储中间结果的栈
        for(String i :mexp){
            if(i.matches("\\d+")||(i.matches("\\d+\\.\\d+"))){//是否为数字
                s2.add(i);
            }else {
                while(s1.size()!=0&&opera(i)<opera(s1.peek())){
                    s2.add(s1.pop());
                }
                s1.push(i);
            }
        }
        while(s1.size()!=0){
            s2.add(s1.pop());
        }
        return s2;
    }

    private int opera(String oper) {
        switch(oper){
            case "+": return 1;
            case "-": return 1;
            case "*": return 2;
            case "/": return 2;
            default:
                return -1;
        }
    }

    //将表达式转换成中缀表达式,要注意的是多位数的表达式转成中缀式
    private List<String> expList(String exp) {
        List<String> list=new ArrayList<String>();
        int i=0;//指针
        char c = '0';
        String str;
        while(i<exp.length()){
            if((c=exp.charAt(i))<48||(c=exp.charAt(i))>57){//运算符
                list.add(c+"");
                i++;
            }
            else{
                str="";
                while(i<exp.length()&&(c=exp.charAt(i))>=48&&((c=exp.charAt(i))<=57)||c=='.'){
                    str+=c;
                    i++;
                }
                list.add(str);
            }
        }
        return list;
    }

}