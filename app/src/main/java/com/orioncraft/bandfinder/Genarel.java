package com.orioncraft.bandfinder;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;



public class Genarel extends Fragment {

    EditText text1,text2,text3,text4,text5,text6;
    TextView reset1,reset2,reset3,calculate,calculate1,calculate2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_genarel, container, false);

        text1 = view.findViewById(R.id.text1);
        text2 = view.findViewById(R.id.text2);
        text3 = view.findViewById(R.id.text3);
        text4 = view.findViewById(R.id.text4);
        text5 = view.findViewById(R.id.text5);
        text6 = view.findViewById(R.id.text6);
        reset1 = view.findViewById(R.id.reset1);
        reset2 = view.findViewById(R.id.reset2);
        reset3 = view.findViewById(R.id.reset3);
        calculate = view.findViewById(R.id.calculate);
        calculate1 = view.findViewById(R.id.calculate1);
        calculate2 = view.findViewById(R.id.calculate2);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String stext11 =text1.getText().toString();

                if (stext11.length()>0){

                    float ftext1 = Float.parseFloat(stext11);

                    if(ftext1==40 && ftext1<41){

                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 9.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);

                    }
                    else if (ftext1==39) {

                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 8.5.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);

                    }


                    else if (ftext1>=37 && ftext1<=38) {

                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 8.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);

                    }
                    else if (ftext1==36) {

                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 7.5.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext1>=34 && ftext1<=35) {
                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 7.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext1>=32 && ftext1<=33) {
                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 6.5.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext1>=30 && ftext1<=31) {
                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 6.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext1>=27 && ftext1<=29) {

                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 5.5.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);

                    }
                    else if (ftext1>=23 && ftext1<=26) {

                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 5.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext1>=18 && ftext1<=22) {

                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 4.5.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);

                    }
                    else if (ftext1>=15 && ftext1<=17) {

                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 4.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext1>=13 && ftext1<=14) {

                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 3.5.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);

                    }
                    else if (ftext1>=10 && ftext1<=12) {
                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 3.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext1>=8 && ftext1<=9) {

                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 2.5.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext1>=6 && ftext1<=7) {
                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 2.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);

                    }

                    else if (ftext1>=4 && ftext1<=5) {
                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 1.5.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext1>=2 && ftext1<=3) {
                        Show_Result.Fbar_text="Reading GT";
                        Show_Result.Fresult="Your Reading Band score is 1.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext1==1) {
                        new AlertDialog.Builder(getActivity())
                                .setTitle("No result!")
                                .setMessage("Your Reading Band score is 0.0.")
                                .setNegativeButton("Thank You", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                })
                                .show();

                    }
                    else {
                        new AlertDialog.Builder(getActivity())
                                .setTitle("Wrong number!")
                                .setMessage("Please enter a valid number")
                                .setNegativeButton("Thank You", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                })
                                .show();
                    }

                }
                else {
                    text1.setError("Enter a number");
                    new AlertDialog.Builder(getActivity())
                            .setTitle("No number!")
                            .setMessage("Enter number!")
                            .setNegativeButton("Thank You", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .show();
                }

            }
        });

        calculate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String stext2 =text2.getText().toString();

                if (stext2.length()>0){

                    float ftext2 = Float.parseFloat(stext2);
                    if (ftext2>=39 && ftext2<=40){
                        Show_Result.Fbar_text="Listening GT";
                        Show_Result.Fresult="Your Listening Band score is 9.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);

                    }
                    else if (ftext2>=37 && ftext2<=38) {
                        Show_Result.Fbar_text="Listening GT";
                        Show_Result.Fresult="Your Listening Band score is 8.5.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext2>=35 && ftext2<=36) {

                        Show_Result.Fbar_text="Listening GT";
                        Show_Result.Fresult="Your Listening Band score is 8.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext2>=32 && ftext2<=34) {
                        Show_Result.Fbar_text="Listening GT";
                        Show_Result.Fresult="Your Listening Band score is 7.5.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext2>=30 && ftext2<=31) {

                        Show_Result.Fbar_text="Listening GT";
                        Show_Result.Fresult="Your Listening Band score is 7.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext2>=26 && ftext2<=29) {
                        Show_Result.Fbar_text="Listening GT";
                        Show_Result.Fresult="Your Listening Band score is 6.5.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext2>=23 && ftext2<=25) {
                        Show_Result.Fbar_text="Listening GT";
                        Show_Result.Fresult="Your Listening Band score is 6.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext2>=18 && ftext2<=22) {

                        Show_Result.Fbar_text="Listening GT";
                        Show_Result.Fresult="Your Listening Band score is 5.5.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext2>=16 && ftext2<=17) {

                        Show_Result.Fbar_text="Listening GT";
                        Show_Result.Fresult="Your Listening Band score is 5.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext2>=13 && ftext2<=15) {

                        Show_Result.Fbar_text="Listening GT";
                        Show_Result.Fresult="Your Listening Band score is 4.5.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext2>=10 && ftext2<=12) {
                        Show_Result.Fbar_text="Listening GT";
                        Show_Result.Fresult="Your Listening Band score is 4.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext2>=8 && ftext2<=9) {

                        Show_Result.Fbar_text="Listening GT";
                        Show_Result.Fresult="Your Listening Band score is 3.5.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext2>=6 && ftext2<=7) {
                        Show_Result.Fbar_text="Listening GT";
                        Show_Result.Fresult="Your Listening Band score is 3.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext2>=4 && ftext2<=5) {
                        Show_Result.Fbar_text="Listening GT";
                        Show_Result.Fresult="Your Listening Band score is 2.5.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }
                    else if (ftext2>=2 && ftext2<=3) {
                        Show_Result.Fbar_text="Listening GT";
                        Show_Result.Fresult="Your Listening Band score is 2.0.";
                        Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                        startActivity(nextActivity);
                    }

                    else if (ftext2==1) {
                        new AlertDialog.Builder(getActivity())
                                .setTitle("No result")
                                .setMessage("Your Listening Band score is 0.0.")
                                .setNegativeButton("Thank You", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                })
                                .show();
                    }

                    else {
                        new AlertDialog.Builder(getActivity())
                                .setTitle("Wrong number")
                                .setMessage("Please enter a valid number")
                                .setNegativeButton("Thank You", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                })
                                .show();
                    }


                }
                else {
                    text2.setError("Enter a number");
                    new AlertDialog.Builder(getActivity())
                            .setTitle("No number")
                            .setMessage("Enter a Number")
                            .setNegativeButton("Thank You", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .show();
                }

            }
        });

        calculate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String stext3 = text3.getText().toString();
                String stext4 = text4.getText().toString();
                String stext5 = text5.getText().toString();
                String stext6 = text6.getText().toString();

                if (stext3.length()>0 && stext4.length()>0 && stext5.length()>0 && stext6.length()>0) {

                    float ftext3 = Float.parseFloat(stext3);
                    float ftext4 = Float.parseFloat(stext4);
                    float ftext5 = Float.parseFloat(stext5);
                    float ftext6 = Float.parseFloat(stext6);

                    float total = (float) ftext3+ftext4+ftext5+ftext6;

                    float avarege = total/4;

                    if (ftext3<10 && ftext4<10 && ftext5<10 && ftext6<10)
                    {
                        if (avarege>=0 && avarege<=1.24) {

                            new AlertDialog.Builder(getActivity())
                                    .setTitle("No Result")
                                    .setMessage("Failed")
                                    .setNegativeButton("Thank You", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            dialog.dismiss();
                                        }
                                    })
                                    .show();
                        }
                        else if (avarege>=1.25 && avarege<=1.74) {

                            Show_Result.Fbar_text="General Result";
                            Show_Result.Fresult="Your Band Score is 1.5.";
                            Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                            startActivity(nextActivity);
                        }
                        else if (avarege>=1.75 && avarege<=2.24) {
                            Show_Result.Fbar_text="General Result";
                            Show_Result.Fresult="Your Band Score is 2.0.";
                            Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                            startActivity(nextActivity);
                        }
                        else if (avarege>=2.25 && avarege<=2.74) {
                            Show_Result.Fbar_text="General Result";
                            Show_Result.Fresult="Your Band Score is 2.5.";
                            Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                            startActivity(nextActivity);
                        }
                        else if (avarege>=2.75 && avarege<=3.24) {
                            Show_Result.Fbar_text="General Result";
                            Show_Result.Fresult="Your Band Score is 3.0.";
                            Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                            startActivity(nextActivity);
                        }
                        else if (avarege>=3.25 && avarege<=3.74) {
                            Show_Result.Fbar_text="General Result";
                            Show_Result.Fresult="Your Band Score is 3.5.";
                            Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                            startActivity(nextActivity);

                        }
                        else if (avarege>=3.75 && avarege<=4.24) {
                            Show_Result.Fbar_text="General Result";
                            Show_Result.Fresult="Your Band Score is 4.0.";
                            Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                            startActivity(nextActivity);

                        }
                        else if (avarege>=4.25 && avarege<=4.74) {

                            Show_Result.Fbar_text="General Result";
                            Show_Result.Fresult="Your Band Score is 4.5.";
                            Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                            startActivity(nextActivity);
                        }
                        else if (avarege>=4.75 && avarege<=5.24) {

                            Show_Result.Fbar_text="General Result";
                            Show_Result.Fresult="Your Band Score is 5.0.";
                            Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                            startActivity(nextActivity);

                        }
                        else if (avarege>=5.35 && avarege<=5.74) {

                            Show_Result.Fbar_text="General Result";
                            Show_Result.Fresult="Your Band Score is 5.5.";
                            Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                            startActivity(nextActivity);


                        }
                        else if (avarege>=5.75 && avarege<=6.24) {

                            Show_Result.Fbar_text="General Result";
                            Show_Result.Fresult="Your Band Score is 6.0.";
                            Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                            startActivity(nextActivity);


                        }
                        else if (avarege>=6.25 && avarege<=6.74) {

                            Show_Result.Fbar_text="General Result";
                            Show_Result.Fresult="Your Band Score is 6.5.";
                            Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                            startActivity(nextActivity);
                        }
                        else if (avarege>=6.75 && avarege<=7.24) {

                            Show_Result.Fbar_text="General Result";
                            Show_Result.Fresult="Your Band Score is 7.0.";
                            Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                            startActivity(nextActivity);

                        }
                        else if (avarege>=7.25 && avarege<=7.74) {

                            Show_Result.Fbar_text="General Result";
                            Show_Result.Fresult="Your Band Score is 7.5.";
                            Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                            startActivity(nextActivity);
                        }


                        else if (avarege>=7.75 && avarege<=8.24) {

                            Show_Result.Fbar_text="General Result";
                            Show_Result.Fresult="Your Band Score is 8.0.";
                            Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                            startActivity(nextActivity);

                        }

                        else if (avarege>=8.25 && avarege<=8.74) {

                            Show_Result.Fbar_text="General Result";
                            Show_Result.Fresult="Your Band Score is 8.5.";
                            Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                            startActivity(nextActivity);

                        }


                        else if (avarege>=8.75 && avarege<=9) {
                            Show_Result.Fbar_text="General Result";
                            Show_Result.Fresult="Your Band Score is 9.0.";
                            Intent nextActivity = new Intent(getActivity(), Show_Result.class);
                            startActivity(nextActivity);
                        }


                    }
                    else {
                        new AlertDialog.Builder(getActivity())
                                .setTitle("Wrong number!")
                                .setMessage("Please enter a valid number")
                                .setNegativeButton("Thank You", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                })
                                .show();
                    }


                }
                else {
                    new AlertDialog.Builder(getActivity())
                            .setTitle("No number!")
                            .setMessage("Enter a Number")
                            .setNegativeButton("Thank You", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .show();
                }




            }
        });



        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.getText().clear();

            }
        });

        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.getText().clear();

            }
        });

        reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text3.getText().clear();
                text4.getText().clear();
                text5.getText().clear();
                text6.getText().clear();

            }
        });

        return view;
    }


}