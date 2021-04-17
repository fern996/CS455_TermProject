package com.example.cs455_termproject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val one = findViewById<TextView>(R.id.H)
        one.setOnClickListener(this);
        val two = findViewById<TextView>(R.id.He)
        two.setOnClickListener(this);
        val three = findViewById<TextView>(R.id.Li)
               three .setOnClickListener(this);
        val four = findViewById<TextView>(R.id.Be)
               four .setOnClickListener(this);
        val five = findViewById<TextView>(R.id.B)
               five .setOnClickListener(this);
        val six = findViewById<TextView>(R.id.C)
               six .setOnClickListener(this);
        val seven = findViewById<TextView>(R.id.N)
               seven .setOnClickListener(this);
        val eight = findViewById<TextView>(R.id.O)
               eight .setOnClickListener(this);
        val nine = findViewById<TextView>(R.id.F)
               nine .setOnClickListener(this);
        val ten = findViewById<TextView>(R.id.Ne)
               ten .setOnClickListener(this);
        val eleven = findViewById<TextView>(R.id.Na)
               eleven .setOnClickListener(this);
        val twelve = findViewById<TextView>(R.id.Mg)
               twelve .setOnClickListener(this);
        val thirteen = findViewById<TextView>(R.id.Al)
               thirteen.setOnClickListener(this);
        val fourteen = findViewById<TextView>(R.id.Si)
                fourteen.setOnClickListener(this);
        val fifteen = findViewById<TextView>(R.id.P)
                fifteen.setOnClickListener(this);
        val sixteen = findViewById<TextView>(R.id.S)
                sixteen.setOnClickListener(this);
        val seventeen = findViewById<TextView>(R.id.Cl)
               seventeen .setOnClickListener(this);
        val eighteen = findViewById<TextView>(R.id.Ar)
                eighteen.setOnClickListener(this);
        val nineteen = findViewById<TextView>(R.id.K)
               nineteen .setOnClickListener(this);
        val twenty = findViewById<TextView>(R.id.Ca)
               twenty .setOnClickListener(this);
        val twentyone = findViewById<TextView>(R.id.Sc)
               twentyone .setOnClickListener(this);
        val twentytwo = findViewById<TextView>(R.id.Ti)
               twentytwo .setOnClickListener(this);
        val twentythree = findViewById<TextView>(R.id.V)
               twentythree .setOnClickListener(this);
        val twentyfour = findViewById<TextView>(R.id.Cr)
               twentyfour .setOnClickListener(this);
        val twentyfive = findViewById<TextView>(R.id.Mn)
               twentyfive .setOnClickListener(this);
        val twentysix = findViewById<TextView>(R.id.Fe)
                twentysix.setOnClickListener(this);
        val twentyseven = findViewById<TextView>(R.id.Co)
               twentyseven .setOnClickListener(this);
        val twentyeight = findViewById<TextView>(R.id.Ni)
               twentyeight .setOnClickListener(this);
        val twentynine = findViewById<TextView>(R.id.Cu)
               twentynine .setOnClickListener(this);
        val thrity = findViewById<TextView>(R.id.Zn)
                thrity.setOnClickListener(this);
        val  thirtyone = findViewById<TextView>(R.id.Ga)
                thirtyone .setOnClickListener(this);
        val  thirtytwo= findViewById<TextView>(R.id.Ge)
                thirtytwo.setOnClickListener(this);
        val  thirtythree= findViewById<TextView>(R.id.As)
                thirtythree.setOnClickListener(this);
        val  thirtyfour= findViewById<TextView>(R.id.Se)
                thirtyfour.setOnClickListener(this);
        val  thirtyfive= findViewById<TextView>(R.id.Br)
                thirtyfive.setOnClickListener(this);
        val  thirtysix= findViewById<TextView>(R.id.Kr)
                thirtysix.setOnClickListener(this);
        val  thirtyseven= findViewById<TextView>(R.id.Rb)
                thirtyseven.setOnClickListener(this);
        val  thrityeight= findViewById<TextView>(R.id.Sr)
               thrityeight .setOnClickListener(this);
        val thirtynine = findViewById<TextView>(R.id.Y)
                thirtynine.setOnClickListener(this);
        val  forty= findViewById<TextView>(R.id.Zr)
                forty.setOnClickListener(this);
        val  fortyone= findViewById<TextView>(R.id.Nb)
                fortyone.setOnClickListener(this);
        val  fortytwo= findViewById<TextView>(R.id.Mo)
               fortytwo .setOnClickListener(this);
        val fortythree = findViewById<TextView>(R.id.Tc)
               fortythree .setOnClickListener(this);
        val fortyfour = findViewById<TextView>(R.id.Ru)
               fortyfour .setOnClickListener(this);
        val fortyfive = findViewById<TextView>(R.id.Rh)
               fortyfive .setOnClickListener(this);
        val fortysix = findViewById<TextView>(R.id.Pd)
               fortysix .setOnClickListener(this);
        val fortyseven = findViewById<TextView>(R.id.Ag)
               fortyseven .setOnClickListener(this);
        val fortyeight = findViewById<TextView>(R.id.Cd)
               fortyeight .setOnClickListener(this);
        val fortynine = findViewById<TextView>(R.id.In)
               fortynine .setOnClickListener(this);
        val fifty = findViewById<TextView>(R.id.Sn)
                fifty.setOnClickListener(this);
        val fiftyone = findViewById<TextView>(R.id.Sb)
               fiftyone .setOnClickListener(this);
        val fiftytwo = findViewById<TextView>(R.id.Te)
               fiftytwo .setOnClickListener(this);
        val fiftythree = findViewById<TextView>(R.id.I)
               fiftythree .setOnClickListener(this);
        val fiftyfour = findViewById<TextView>(R.id.Xe)
               fiftyfour .setOnClickListener(this);
        val fiftyfive = findViewById<TextView>(R.id.Cs)
               fiftyfive .setOnClickListener(this);
        val fiftysix = findViewById<TextView>(R.id.Ba)
               fiftysix .setOnClickListener(this);
        val fiftyseven = findViewById<TextView>(R.id.La)
               fiftyseven .setOnClickListener(this);
        val fiftyeight = findViewById<TextView>(R.id.Ce)
               fiftyeight .setOnClickListener(this);
        val fiftynine = findViewById<TextView>(R.id.Pr)
               fiftynine .setOnClickListener(this);
        val sixty = findViewById<TextView>(R.id.Nd)
               sixty .setOnClickListener(this);
        val sixtyone = findViewById<TextView>(R.id.Pm)
               sixtyone .setOnClickListener(this);
        val sixtytwo = findViewById<TextView>(R.id.Sm)
               sixtytwo .setOnClickListener(this);
        val sixtythree = findViewById<TextView>(R.id.Eu)
               sixtythree .setOnClickListener(this);
        val sixtyfour = findViewById<TextView>(R.id.Gd)
               sixtyfour .setOnClickListener(this);
        val sixtyfive = findViewById<TextView>(R.id.Tb)
               sixtyfive .setOnClickListener(this);
        val sixtysix = findViewById<TextView>(R.id.Dy)
               sixtysix .setOnClickListener(this);
        val sixtyseven = findViewById<TextView>(R.id.Ho)
               sixtyseven .setOnClickListener(this);
        val sixtyeight = findViewById<TextView>(R.id.Er)
               sixtyeight .setOnClickListener(this);
        val sixtynine = findViewById<TextView>(R.id.Tm)
               sixtynine .setOnClickListener(this);
        val seventy = findViewById<TextView>(R.id.Yb)
               seventy .setOnClickListener(this);
        val seventyone = findViewById<TextView>(R.id.Lu)
               seventyone .setOnClickListener(this);
        val seventytwo = findViewById<TextView>(R.id.Hf)
               seventytwo .setOnClickListener(this);
        val seventythree = findViewById<TextView>(R.id.Ta)
               seventythree .setOnClickListener(this);
        val seventyfour = findViewById<TextView>(R.id.W)
               seventyfour .setOnClickListener(this);
        val seventyfive = findViewById<TextView>(R.id.Re)
               seventyfive .setOnClickListener(this);
        val seventysix = findViewById<TextView>(R.id.Os)
               seventysix .setOnClickListener(this);
        val seventyseven = findViewById<TextView>(R.id.Ir)
               seventyseven .setOnClickListener(this);
        val seventyeight = findViewById<TextView>(R.id.Pt)
               seventyeight .setOnClickListener(this);
        val sevntynine = findViewById<TextView>(R.id.Au)
               sevntynine .setOnClickListener(this);
        val eighty = findViewById<TextView>(R.id.Hg)
               eighty .setOnClickListener(this);
        val eightyone = findViewById<TextView>(R.id.Tl)
               eightyone .setOnClickListener(this);
        val eightytwo = findViewById<TextView>(R.id.Pb)
               eightytwo .setOnClickListener(this);
        val eightythree = findViewById<TextView>(R.id.Bi)
               eightythree .setOnClickListener(this);
        val eightyfour = findViewById<TextView>(R.id.Po)
               eightyfour .setOnClickListener(this);
        val eightyfive = findViewById<TextView>(R.id.At)
               eightyfive .setOnClickListener(this);
        val eighysix = findViewById<TextView>(R.id.Rn)
               eighysix .setOnClickListener(this);
        val eightyseven = findViewById<TextView>(R.id.Fr)
               eightyseven .setOnClickListener(this);
        val eightyeight = findViewById<TextView>(R.id.Ra)
               eightyeight .setOnClickListener(this);
        val eightynine = findViewById<TextView>(R.id.Ac)
               eightynine .setOnClickListener(this);
        val ninety = findViewById<TextView>(R.id.Th)
               ninety .setOnClickListener(this);
        val ninetyone = findViewById<TextView>(R.id.Pa)
               ninetyone .setOnClickListener(this);
        val ninetytwo = findViewById<TextView>(R.id.U)
               ninetytwo .setOnClickListener(this);
        val ninethree = findViewById<TextView>(R.id.Np)
               ninethree .setOnClickListener(this);
        val ninetyfour = findViewById<TextView>(R.id.Pu)
               ninetyfour .setOnClickListener(this);
        val ninetyfive = findViewById<TextView>(R.id.Am)
               ninetyfive .setOnClickListener(this);
        val ninetysix = findViewById<TextView>(R.id.Cm)
               ninetysix .setOnClickListener(this);
        val ninetseven = findViewById<TextView>(R.id.Bk)
               ninetseven .setOnClickListener(this);
        val ninetyeight = findViewById<TextView>(R.id.Cf)
               ninetyeight .setOnClickListener(this);
        val ninetynine = findViewById<TextView>(R.id.Es)
               ninetynine .setOnClickListener(this);
        val hundred = findViewById<TextView>(R.id.Fm)
               hundred .setOnClickListener(this);
        val hundredone = findViewById<TextView>(R.id.Md)
               hundredone .setOnClickListener(this);
        val hundredtwo = findViewById<TextView>(R.id.No)
               hundredtwo .setOnClickListener(this);
        val hundredthree = findViewById<TextView>(R.id.Lr)
               hundredthree .setOnClickListener(this);
        val hundredfour = findViewById<TextView>(R.id.Rf)
               hundredfour .setOnClickListener(this);
        val hundredfive = findViewById<TextView>(R.id.Db)
               hundredfive .setOnClickListener(this);
        val hundredsix = findViewById<TextView>(R.id.Sg)
               hundredsix .setOnClickListener(this);
        val hundredseven = findViewById<TextView>(R.id.Bh)
               hundredseven .setOnClickListener(this);
        val hundredeight = findViewById<TextView>(R.id.Hs)
               hundredeight .setOnClickListener(this);
        val hundrednine = findViewById<TextView>(R.id.Mt)
                hundrednine .setOnClickListener(this);
        val hundredten = findViewById<TextView>(R.id.Ds)
               hundredten .setOnClickListener(this);
        val hundredelven = findViewById<TextView>(R.id.Rg)
               hundredelven .setOnClickListener(this);
        val hundretwelve = findViewById<TextView>(R.id.Cn)
               hundretwelve .setOnClickListener(this);
        val hundredthirteen = findViewById<TextView>(R.id.Nh)
               hundredthirteen .setOnClickListener(this);
        val hundredfourteen = findViewById<TextView>(R.id.Fl)
               hundredfourteen .setOnClickListener(this);
        val hudnredfifteen = findViewById<TextView>(R.id.Mc)
               hudnredfifteen .setOnClickListener(this);
        val hundredsixteen = findViewById<TextView>(R.id.Lv)
               hundredsixteen .setOnClickListener(this);
        val hundredseventeen = findViewById<TextView>(R.id.Ts)
               hundredseventeen .setOnClickListener(this);
        val hundredeighteen = findViewById<TextView>(R.id.Og)
               hundredeighteen .setOnClickListener(this);
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.H ->{
                    val iD = "H"
                    val intent = Intent(this@MainActivity, ElementActivity::class.java)
                    intent.putExtra(iD, iD)
                    startActivity(intent)
                }
                R.id.He ->
                R.id.Li ->
                R.id.Be ->
                R.id.B ->
                R.id.C ->
                R.id.N ->
                R.id.O ->
                R.id.F ->
                R.id.Ne ->
                R.id.Na ->
                R.id.Mg ->
                R.id.Al ->
                R.id.Si ->
                R.id.P ->
                R.id.S ->
                R.id.Cl ->
                R.id.Ar ->
                R.id.K ->
                R.id.Ca ->
                R.id.Sc ->
                R.id.Ti ->
                R.id.V ->
                R.id.Cr ->
                R.id.Mn ->
                R.id.Fe ->
                R.id.Co ->
                R.id.Ni ->
                R.id.Cu ->
                R.id.Zn ->
                R.id.Ga ->
                R.id.Ge ->
                R.id.As ->
                R.id.Se ->
                R.id.Br ->
                R.id.Kr ->
                R.id.Rb ->
                R.id.Sr ->
                R.id.Y ->
                R.id.Zr ->
                R.id.Nb ->
                R.id.Mo ->
                R.id.Tc ->
                R.id.Ru ->
                R.id.Rh ->
                R.id.Pd ->
                R.id.Ag ->
                R.id.Cd ->
                R.id.In ->
                R.id.Sn ->
                R.id.Sb ->
                R.id.Te ->
                R.id.I ->
                R.id.Xe ->
                R.id.Cs ->
                R.id.Ba ->
                R.id.Lu ->
                R.id.Hf ->
                R.id.Ta ->
                R.id.W ->
                R.id.Re ->
                R.id.Os ->
                R.id.Ir ->
                R.id.Pt ->
                R.id.Au ->
                R.id.Hg ->
                R.id.Tl ->
                R.id.Pb ->
                R.id.Bi ->
                R.id.Po ->
                R.id.At ->
                R.id.Rn ->
                R.id.Fr ->
                R.id.Ra ->
                R.id.Lr ->
                R.id.Rf ->
                R.id.Db ->
                R.id.Sg ->
                R.id.Bh ->
                R.id.Hs ->
                R.id.Mt ->
                R.id.Ds ->
                R.id.Rg ->
                R.id.Cn ->
                R.id.Nh ->
                R.id.Fl ->
                R.id.Mc ->
                R.id.Lv ->
                R.id.Ts ->
                R.id.Og ->
                R.id.La ->
                R.id.Ce ->
                R.id.Pr ->
                R.id.Nd ->
                R.id.Pm ->
                R.id.Sm ->
                R.id.Eu ->
                R.id.Gd ->
                R.id.Tb ->
                R.id.Dy ->
                R.id.Ho ->
                R.id.Er ->
                R.id.Tm ->
                R.id.Yb ->
                R.id.Ac ->
                R.id.Th ->
                R.id.Pa ->
                R.id.U ->
                R.id.Np ->
                R.id.Pu ->
                R.id.Am ->
                R.id.Cm ->
                R.id.Bk ->
                R.id.Cf ->
                R.id.Es ->
                R.id.Fm ->
                R.id.Md ->
                R.id.No ->

            }
        }
    }


}