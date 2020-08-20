package com.csao.cybersecurity.adapter

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.csao.cybersecurity.R
import com.csao.cybersecurity.model.LearnCyberCrime

class LearnCyberCrimeRecyclerAdapter(val context: Context, val itemList: ArrayList<LearnCyberCrime>) : RecyclerView.Adapter<LearnCyberCrimeRecyclerAdapter.LearnCyberCrimeViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearnCyberCrimeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_learn_cyber_crime_single_row,parent,false)

        return LearnCyberCrimeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: LearnCyberCrimeViewHolder, position: Int) {
        val learnCyberCrime = itemList[position]
        holder.txtCyberCrimeHeader.text = learnCyberCrime.learncyberCrimeName


        holder.llContentLCC.setOnClickListener {
            if(position==0){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("CHILD PORNOGRAPHY/ CHILD SEXUAL ABUSE")
                myDialog.setMessage("Child sexually abusive material (CSAM) refers to material containing sexual image in any form, of a toddler who is abused or sexually exploited. Section 67 (B) of IT Act states that “it is punishable for publishing or transmitting of fabric depicting children in sexually explicit act, etc. in electronic form.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==1){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("A sort of harassment or bullying inflicted through the utilization of electronic or communication devices like computer, mobile , laptop, etc.\n")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==2){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Cyber stalking is that the use of transmission by an individual to follow an individual , or attempts to contact an individual to foster personal interaction repeatedly despite a transparent indication of disinterest by such person; or monitors the web , email or the other sort of transmission commits the offence of stalking.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==3){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Cyber Grooming is when an individual builds a web relationship with a youth and tricks or pressures him/ her into doing sexual act.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==4){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Online Job Fraud is an effort to defraud people that are in need of employment by giving them a false hope/ promise of higher employment with higher wages.\n")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==5){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Online Sextortion occurs when someone threatens to distribute private and sensitive material using an electronic medium if he/ she doesn’t provide images of a sexual nature, sexual favours, or money.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==6){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Vishing is an attempt where fraudsters try to seek personal information like Customer ID, Net Banking password, ATM PIN, OTP, Card expiry date, CVV etc. through a phone call.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==7){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Sexting is an act of sending sexually explicit digital images, videos, text messages, or emails, usually by telephone .")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==8){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Smishing may be a sort of fraud that uses mobile text messages to lure victims into calling back on a fraudulent telephone number , visiting fraudulent websites or downloading malicious content via phone or web.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==9){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("SIM Swap Scam occurs when fraudsters manage to get a new SIM card issued against a registered mobile number fraudulently through the mobile service provider. With the assistance of this new SIM card, they get just one occasion Password (OTP) and alerts, required for creating financial transactions through victim's checking account . Getting a new SIM card against a registered mobile number fraudulently is known as SIM Swap.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==10){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Credit card (or debit card) fraud involves an unauthorized use of another's credit or debit card information for the purpose of purchases or withdrawing funds from it.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==11){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Impersonation and fraud is an act of fraudulently or dishonestly making use of the electronic signature, password or the other unique identification feature of the other person.\n")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==12){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Phishing is a type of fraud that involves stealing personal information such as Customer ID, IPIN, Credit/Debit Card number, Card expiry date, CVV number, etc. through emails that appear to be from a legitimate source.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==13){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Spamming occurs when someone receives an unsolicited commercial messages sent via email, SMS, MMS and any other similar electronic messaging media. They may try to persuade recepient to buy a product or service, or visit a website where he can make purchases; or they may attempt to trick him/ her into divulging bank account or credit card details.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==14){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Ransomware is a type of computer malware that encrypts the files, storage media on communication devices like desktops, Laptops, Mobile phones etc., holding data/information as a hostage. The victim is asked to pay the demanded ransom to urge his device decrypts.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==15){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Computer Virus is a program written to enter to your computer and damage/alter your files/data and replicate themselves.\n" +
                        "\n" +
                        "Worms are malicious programs that make copies of themselves again and again on the local drive, network shares, etc.\n" +
                        "\n" +
                        "A Trojan horse is not a virus. It is a destructive program that appears as a real application. Unlike viruses, Trojan horses don't replicate themselves but they will be even as destructive. Trojans open a backdoor entry to your computer which provides malicious users/programs access to your system, allowing confidential and private information to be theft.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==16){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("A data breach is an incident in which information is accessed without authorization.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==17){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Denial of Services (DoS) attack is an attack intended for denying access to computer resource without permission of the owner or any other person who is in-charge of a computer, computer system or computer network.\n" +
                        "\n" +
                        "A Distributed Denial of Service (DDoS) attack is an effort to form a web service unavailable by overwhelming it with traffic from multiple sources.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==18){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Website Defacement is an attack intended to change visual appearance of a website and/ or make it dysfunctional. The attacker may post indecent, hostile and obscene images, messages, videos, etc.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==19){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Cyber-Squatting is an act of registering, trafficking in, or employing a name with an intent to take advantage of the goodwill of a trademark belonging to somebody else .")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==20){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Pharming is cyber-attack aiming to redirect a website's traffic to another, bogus website.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==21){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Cryptojacking is the unauthorized use of computing resources to mine cryptocurrencies.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==22){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Online drug trafficking could also be a criminal offense of selling, transporting, or illegally importing unlawful controlled substances, like heroin, cocaine, marijuana, or other illegal drugs using electronic means.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }
            if(position==23){
                val myDialog = AlertDialog.Builder(context)
                myDialog.setTitle("${holder.txtCyberCrimeHeader.text}")
                myDialog.setMessage("Espionage is the act or practice of obtaining data and information without the permission and knowledge of the owner.")
                myDialog.setNegativeButton("Ok"){text, which ->
                }
                myDialog.create()
                myDialog.show()
            }

        }
    }
    class LearnCyberCrimeViewHolder(view: View) : RecyclerView.ViewHolder(view){

        var txtCyberCrimeHeader: TextView = view.findViewById(R.id.txtCyberCrimeHeader)

        var llContentLCC: LinearLayout = view.findViewById(R.id.llContentLCC)


    }

}