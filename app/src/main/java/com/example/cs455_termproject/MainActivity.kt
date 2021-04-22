package com.example.cs455_termproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
// Variable init
   private var e1: TextView? = null
   private var e2: TextView? = null
   private var e3: TextView? = null
   private var e4: TextView? = null
   private var e5: TextView? = null
   private var e6: TextView? = null
   private var e7: TextView? = null
   private var e8: TextView? = null
   private var e9: TextView? = null
   private var e10: TextView? = null
   private var e11: TextView? = null
   private var e12: TextView? = null
   private var e13: TextView? = null
   private var e14: TextView? = null
   private var e15: TextView? = null
   private var e16: TextView? = null
   private var e17: TextView? = null
   private var e18: TextView? = null
   private var e19: TextView? = null
   private var e20: TextView? = null
   private var e21: TextView? = null
   private var e22: TextView? = null
   private var e23: TextView? = null
   private var e24: TextView? = null
   private var e25: TextView? = null
   private var e26: TextView? = null
   private var e27: TextView? = null
   private var e28: TextView? = null
   private var e29: TextView? = null
   private var e30: TextView? = null
   private var e31: TextView? = null
   private var e32: TextView? = null
   private var e33: TextView? = null
   private var e34: TextView? = null
   private var e35: TextView? = null
   private var e36: TextView? = null
   private var e37: TextView? = null
   private var e38: TextView? = null
   private var e39: TextView? = null
   private var e40: TextView? = null
   private var e41: TextView? = null
   private var e42: TextView? = null
   private var e43: TextView? = null
   private var e44: TextView? = null
   private var e45: TextView? = null
   private var e46: TextView? = null
   private var e47: TextView? = null
   private var e48: TextView? = null
   private var e49: TextView? = null
   private var e50: TextView? = null
   private var e51: TextView? = null
   private var e52: TextView? = null
   private var e53: TextView? = null
   private var e54: TextView? = null
   private var e55: TextView? = null
   private var e56: TextView? = null
   private var e57: TextView? = null
   private var e58: TextView? = null
   private var e59: TextView? = null
   private var e60: TextView? = null
   private var e61: TextView? = null
   private var e62: TextView? = null
   private var e63: TextView? = null
   private var e64: TextView? = null
   private var e65: TextView? = null
   private var e66: TextView? = null
   private var e67: TextView? = null
   private var e68: TextView? = null
   private var e69: TextView? = null
   private var e70: TextView? = null
   private var e71: TextView? = null
   private var e72: TextView? = null
   private var e73: TextView? = null
   private var e74: TextView? = null
   private var e75: TextView? = null
   private var e76: TextView? = null
   private var e77: TextView? = null
   private var e78: TextView? = null
   private var e79: TextView? = null
   private var e80: TextView? = null
   private var e81: TextView? = null
   private var e82: TextView? = null
   private var e83: TextView? = null
   private var e84: TextView? = null
   private var e85: TextView? = null
   private var e86: TextView? = null
   private var e87: TextView? = null
   private var e88: TextView? = null
   private var e89: TextView? = null
   private var e90: TextView? = null
   private var e91: TextView? = null
   private var e92: TextView? = null
   private var e93: TextView? = null
   private var e94: TextView? = null
   private var e95: TextView? = null
   private var e96: TextView? = null
   private var e97: TextView? = null
   private var e98: TextView? = null
   private var e99: TextView? = null
   private var e100: TextView? = null
   private var e101: TextView? = null
   private var e102: TextView? = null
   private var e103: TextView? = null
   private var e104: TextView? = null
   private var e105: TextView? = null
   private var e106: TextView? = null
   private var e107: TextView? = null
   private var e108: TextView? = null
   private var e109: TextView? = null
   private var e110: TextView? = null
   private var e111: TextView? = null
   private var e112: TextView? = null
   private var e113: TextView? = null
   private var e114: TextView? = null
   private var e115: TextView? = null
   private var e116: TextView? = null
   private var e117: TextView? = null
   private var e118: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
// Pairing variables with their respective element IDs
    private fun init() {
        e1 = findViewById(R.id.e1)
        e2 = findViewById(R.id.e2)
        e3 = findViewById(R.id.e3)
        e4 = findViewById(R.id.e4)
        e5 = findViewById(R.id.e5)
        e6 = findViewById(R.id.e6)
        e7 = findViewById(R.id.e7)
        e8 = findViewById(R.id.e8)
        e9 = findViewById(R.id.e9)
        e10 = findViewById(R.id.e10)
        e11 = findViewById(R.id.e11)
        e12 = findViewById(R.id.e12)
        e13 = findViewById(R.id.e13)
        e14 = findViewById(R.id.e14)
        e15 = findViewById(R.id.e15)
        e16 = findViewById(R.id.e16)
        e17 = findViewById(R.id.e17)
        e18 = findViewById(R.id.e18)
        e19 = findViewById(R.id.e19)
        e20 = findViewById(R.id.e20)
        e21 = findViewById(R.id.e21)
        e22 = findViewById(R.id.e22)
        e23 = findViewById(R.id.e23)
        e24 = findViewById(R.id.e24)
        e25 = findViewById(R.id.e25)
        e26 = findViewById(R.id.e26)
        e27 = findViewById(R.id.e27)
        e28 = findViewById(R.id.e28)
        e29 = findViewById(R.id.e29)
        e30 = findViewById(R.id.e30)
        e31 = findViewById(R.id.e31)
        e32 = findViewById(R.id.e32)
        e33 = findViewById(R.id.e33)
        e34 = findViewById(R.id.e34)
        e35 = findViewById(R.id.e35)
        e36 = findViewById(R.id.e36)
        e37 = findViewById(R.id.e37)
        e38 = findViewById(R.id.e38)
        e39 = findViewById(R.id.e39)
        e40 = findViewById(R.id.e40)
        e41 = findViewById(R.id.e41)
        e42 = findViewById(R.id.e42)
        e43 = findViewById(R.id.e43)
        e44 = findViewById(R.id.e44)
        e45 = findViewById(R.id.e45)
        e46 = findViewById(R.id.e46)
        e47 = findViewById(R.id.e47)
        e48 = findViewById(R.id.e48)
        e49 = findViewById(R.id.e49)
        e50 = findViewById(R.id.e50)
        e51 = findViewById(R.id.e51)
        e52 = findViewById(R.id.e52)
        e53 = findViewById(R.id.e53)
        e54 = findViewById(R.id.e54)
        e55 = findViewById(R.id.e55)
        e56 = findViewById(R.id.e56)
        e57 = findViewById(R.id.e57)
        e58 = findViewById(R.id.e58)
        e59 = findViewById(R.id.e59)
        e60 = findViewById(R.id.e60)
        e61 = findViewById(R.id.e61)
        e62 = findViewById(R.id.e62)
        e63 = findViewById(R.id.e63)
        e64 = findViewById(R.id.e64)
        e65 = findViewById(R.id.e65)
        e66 = findViewById(R.id.e66)
        e67 = findViewById(R.id.e67)
        e68 = findViewById(R.id.e68)
        e69 = findViewById(R.id.e69)
        e70 = findViewById(R.id.e70)
        e71 = findViewById(R.id.e71)
        e72 = findViewById(R.id.e72)
        e73 = findViewById(R.id.e73)
        e74 = findViewById(R.id.e74)
        e75 = findViewById(R.id.e75)
        e76 = findViewById(R.id.e76)
        e77 = findViewById(R.id.e77)
        e78 = findViewById(R.id.e78)
        e79 = findViewById(R.id.e79)
        e80 = findViewById(R.id.e80)
        e81 = findViewById(R.id.e81)
        e82 = findViewById(R.id.e82)
        e83 = findViewById(R.id.e83)
        e84 = findViewById(R.id.e84)
        e85 = findViewById(R.id.e85)
        e86 = findViewById(R.id.e86)
        e87 = findViewById(R.id.e87)
        e88 = findViewById(R.id.e88)
        e89 = findViewById(R.id.e89)
        e90 = findViewById(R.id.e90)
        e91 = findViewById(R.id.e91)
        e92 = findViewById(R.id.e92)
        e93 = findViewById(R.id.e93)
        e94 = findViewById(R.id.e94)
        e95 = findViewById(R.id.e95)
        e96 = findViewById(R.id.e96)
        e97 = findViewById(R.id.e97)
        e98 = findViewById(R.id.e98)
        e99 = findViewById(R.id.e99)
        e100 = findViewById(R.id.e100)
        e101 = findViewById(R.id.e101)
        e102 = findViewById(R.id.e102)
        e103 = findViewById(R.id.e103)


        e104 = findViewById(R.id.e104)
        e105 = findViewById(R.id.e105)
        e106 = findViewById(R.id.e106)
        e107 = findViewById(R.id.e107)
        e108 = findViewById(R.id.e108)
        e109 = findViewById(R.id.e109)
        e110 = findViewById(R.id.e110)
        e111 = findViewById(R.id.e111)
        e112 = findViewById(R.id.e112)
        e113 = findViewById(R.id.e113)
        e114 = findViewById(R.id.e114)
        e115 = findViewById(R.id.e115)
        e116 = findViewById(R.id.e116)
        e117 = findViewById(R.id.e117)
        e118 = findViewById(R.id.e118)

        e1!!.setOnClickListener(this)
        e2!!.setOnClickListener(this)
        e3!!.setOnClickListener(this)
        e4!!.setOnClickListener(this)
        e5!!.setOnClickListener(this)
        e6!!.setOnClickListener(this)
        e7!!.setOnClickListener(this)
        e8!!.setOnClickListener(this)
        e9!!.setOnClickListener(this)
        e10!!.setOnClickListener(this)
        e11!!.setOnClickListener(this)
        e12!!.setOnClickListener(this)
        e13!!.setOnClickListener(this)
        e14!!.setOnClickListener(this)
        e15!!.setOnClickListener(this)
        e16!!.setOnClickListener(this)
        e17!!.setOnClickListener(this)
        e18!!.setOnClickListener(this)
        e19!!.setOnClickListener(this)
        e20!!.setOnClickListener(this)
        e21!!.setOnClickListener(this)
        e22!!.setOnClickListener(this)
        e23!!.setOnClickListener(this)

        e24!!.setOnClickListener(this)
        e25!!.setOnClickListener(this)
        e26!!.setOnClickListener(this)
        e27!!.setOnClickListener(this)
        e28!!.setOnClickListener(this)
        e29!!.setOnClickListener(this)
        e30!!.setOnClickListener(this)
        e31!!.setOnClickListener(this)
        e32!!.setOnClickListener(this)
        e33!!.setOnClickListener(this)
        e34!!.setOnClickListener(this)
        e35!!.setOnClickListener(this)
        e36!!.setOnClickListener(this)
        e37!!.setOnClickListener(this)
        e38!!.setOnClickListener(this)
        e39!!.setOnClickListener(this)
        e40!!.setOnClickListener(this)
        e41!!.setOnClickListener(this)
        e42!!.setOnClickListener(this)
        e43!!.setOnClickListener(this)
        e44!!.setOnClickListener(this)
        e45!!.setOnClickListener(this)
        e46!!.setOnClickListener(this)
        e47!!.setOnClickListener(this)
        e48!!.setOnClickListener(this)
        e49!!.setOnClickListener(this)
        e50!!.setOnClickListener(this)
        e51!!.setOnClickListener(this)
        e52!!.setOnClickListener(this)
        e53!!.setOnClickListener(this)
        e54!!.setOnClickListener(this)
        e55!!.setOnClickListener(this)
        e56!!.setOnClickListener(this)
        e57!!.setOnClickListener(this)
        e58!!.setOnClickListener(this)
        e59!!.setOnClickListener(this)
        e60!!.setOnClickListener(this)

        e61!!.setOnClickListener(this)
        e62!!.setOnClickListener(this)
        e63!!.setOnClickListener(this)
        e64!!.setOnClickListener(this)
        e65!!.setOnClickListener(this)
        e66!!.setOnClickListener(this)
        e67!!.setOnClickListener(this)
        e68!!.setOnClickListener(this)
        e69!!.setOnClickListener(this)
        e70!!.setOnClickListener(this)

        e71!!.setOnClickListener(this)
        e72!!.setOnClickListener(this)
        e73!!.setOnClickListener(this)
        e74!!.setOnClickListener(this)
        e75!!.setOnClickListener(this)
        e76!!.setOnClickListener(this)
        e77!!.setOnClickListener(this)
        e78!!.setOnClickListener(this)
        e79!!.setOnClickListener(this)
        e80!!.setOnClickListener(this)

        e81!!.setOnClickListener(this)
        e82!!.setOnClickListener(this)
        e83!!.setOnClickListener(this)
        e84!!.setOnClickListener(this)
        e85!!.setOnClickListener(this)
        e86!!.setOnClickListener(this)
        e87!!.setOnClickListener(this)
        e88!!.setOnClickListener(this)
        e89!!.setOnClickListener(this)
        e90!!.setOnClickListener(this)

        e91!!.setOnClickListener(this)
        e92!!.setOnClickListener(this)
        e93!!.setOnClickListener(this)
        e94!!.setOnClickListener(this)
        e95!!.setOnClickListener(this)
        e96!!.setOnClickListener(this)
        e97!!.setOnClickListener(this)
        e98!!.setOnClickListener(this)
        e99!!.setOnClickListener(this)
        e100!!.setOnClickListener(this)

        e101!!.setOnClickListener(this)
        e102!!.setOnClickListener(this)
        e103!!.setOnClickListener(this)

        e104!!.setOnClickListener(this)
        e105!!.setOnClickListener(this)
        e106!!.setOnClickListener(this)
        e107!!.setOnClickListener(this)
        e108!!.setOnClickListener(this)
        e109!!.setOnClickListener(this)
        e110!!.setOnClickListener(this)
        e111!!.setOnClickListener(this)
        e112!!.setOnClickListener(this)
        e113!!.setOnClickListener(this)
        e114!!.setOnClickListener(this)
        e115!!.setOnClickListener(this)
        e116!!.setOnClickListener(this)
        e117!!.setOnClickListener(this)
        e118!!.setOnClickListener(this)
    }

    /*This is the body of the click listener for the periodic table. It looks at all the element ids.
    When a user clicks on a text view, the click listener will then execute the required code and open
    a new Activity through intent.*/

    override fun onClick(p0: View?) {
        if (p0 != null) {
            when (p0.id) {
                R.id.e1 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e1")
                    startActivity(intent)
                }
                R.id.e2 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e2")
                    startActivity(intent)

                }
                R.id.e3 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e3")
                    startActivity(intent)
                }
                R.id.e4 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e4")
                    startActivity(intent)

                }
                R.id.e5 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e5")
                    startActivity(intent)
                }
                R.id.e6 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e6")
                    startActivity(intent)

                }
                R.id.e7 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e7")
                    startActivity(intent)
                }
                R.id.e8 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e8")
                    startActivity(intent)

                }
                R.id.e9 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e9")
                    startActivity(intent)
                }
                R.id.e10 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e10")
                    startActivity(intent)

                }
                R.id.e11 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e11")
                    startActivity(intent)
                }
                R.id.e12 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e12")
                    startActivity(intent)

                }
                R.id.e13 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e13")
                    startActivity(intent)
                }
                R.id.e14 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e14")
                    startActivity(intent)

                }
                R.id.e15 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e15")
                    startActivity(intent)
                }
                R.id.e16 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e16")
                    startActivity(intent)

                }
                R.id.e17 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e17")
                    startActivity(intent)
                }
                R.id.e18 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e18")
                    startActivity(intent)

                }
                R.id.e19 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e19")
                    startActivity(intent)
                }
                R.id.e20 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e20")
                    startActivity(intent)

                }
                R.id.e21 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e21")
                    startActivity(intent)
                }
                R.id.e22 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e22")
                    startActivity(intent)

                }
                R.id.e23 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e23")
                    startActivity(intent)
                }
                R.id.e24 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e24")
                    startActivity(intent)

                }
                R.id.e25 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e25")
                    startActivity(intent)
                }
                R.id.e26 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e26")
                    startActivity(intent)

                }
                R.id.e27 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e27")
                    startActivity(intent)
                }
                R.id.e28 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e28")
                    startActivity(intent)

                }
                R.id.e29 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e29")
                    startActivity(intent)
                }
                R.id.e30 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e30")
                    startActivity(intent)

                }
                R.id.e31 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e31")
                    startActivity(intent)
                }
                R.id.e32 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e32")
                    startActivity(intent)

                }
                R.id.e33 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e33")
                    startActivity(intent)
                }
                R.id.e34 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e34")
                    startActivity(intent)

                }
                R.id.e35 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e35")
                    startActivity(intent)
                }
                R.id.e36 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e36")
                    startActivity(intent)

                }
                R.id.e37 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e37")
                    startActivity(intent)
                }
                R.id.e38 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e38")
                    startActivity(intent)

                }
                R.id.e39 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e39")
                    startActivity(intent)
                }
                R.id.e40 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e40")
                    startActivity(intent)

                }
                R.id.e41 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e41")
                    startActivity(intent)
                }
                R.id.e42 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e42")
                    startActivity(intent)

                }
                R.id.e43 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e43")
                    startActivity(intent)
                }
                R.id.e44 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e44")
                    startActivity(intent)

                }
                R.id.e45 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e45")
                    startActivity(intent)
                }
                R.id.e46 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e46")
                    startActivity(intent)

                }
                R.id.e47 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e47")
                    startActivity(intent)
                }
                R.id.e48 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e48")
                    startActivity(intent)

                }
                R.id.e49 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e49")
                    startActivity(intent)
                }
                R.id.e50 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e50")
                    startActivity(intent)

                }
                R.id.e51 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e51")
                    startActivity(intent)
                }
                R.id.e52 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e52")
                    startActivity(intent)

                }
                R.id.e53 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e53")
                    startActivity(intent)
                }
                R.id.e54 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e54")
                    startActivity(intent)

                }
                R.id.e55 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e55")
                    startActivity(intent)
                }
                R.id.e56 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e56")
                    startActivity(intent)

                }
                R.id.e57 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e57")
                    startActivity(intent)
                }
                R.id.e58 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e58")
                    startActivity(intent)

                }
                R.id.e59 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e59")
                    startActivity(intent)
                }
                R.id.e60 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e60")
                    startActivity(intent)

                }
                R.id.e61 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e61")
                    startActivity(intent)
                }
                R.id.e62 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e62")
                    startActivity(intent)

                }
                R.id.e63 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e63")
                    startActivity(intent)
                }
                R.id.e64 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e64")
                    startActivity(intent)

                }
                R.id.e65 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e65")
                    startActivity(intent)
                }
                R.id.e66 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e66")
                    startActivity(intent)

                }
                R.id.e67 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e67")
                    startActivity(intent)
                }
                R.id.e68 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e68")
                    startActivity(intent)

                }
                R.id.e69 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e69")
                    startActivity(intent)
                }
                R.id.e70 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e70")
                    startActivity(intent)

                }
                R.id.e71 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e71")
                    startActivity(intent)
                }
                R.id.e72 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e72")
                    startActivity(intent)

                }
                R.id.e73 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e73")
                    startActivity(intent)
                }
                R.id.e74 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e74")
                    startActivity(intent)

                }
                R.id.e75 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e75")
                    startActivity(intent)
                }
                R.id.e76 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e76")
                    startActivity(intent)

                }
                R.id.e77 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e77")
                    startActivity(intent)
                }
                R.id.e78 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e78")
                    startActivity(intent)

                }
                R.id.e79 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e79")
                    startActivity(intent)
                }
                R.id.e80 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e80")
                    startActivity(intent)

                }
                R.id.e81 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e81")
                    startActivity(intent)
                }
                R.id.e82 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e82")
                    startActivity(intent)

                }
                R.id.e83 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e83")
                    startActivity(intent)
                }
                R.id.e84 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e84")
                    startActivity(intent)

                }
                R.id.e85 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e85")
                    startActivity(intent)
                }
                R.id.e86 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e86")
                    startActivity(intent)

                }
                R.id.e87 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e87")
                    startActivity(intent)
                }
                R.id.e88 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e88")
                    startActivity(intent)

                }
                R.id.e89 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e89")
                    startActivity(intent)
                }
                R.id.e90 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e90")
                    startActivity(intent)

                }



                R.id.e91 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e91")
                    startActivity(intent)
                }
                R.id.e92 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e92")
                    startActivity(intent)

                }
                R.id.e93 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e93")
                    startActivity(intent)
                }
                R.id.e94 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e94")
                    startActivity(intent)

                }
                R.id.e95 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e95")
                    startActivity(intent)
                }
                R.id.e96 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e96")
                    startActivity(intent)

                }
                R.id.e97 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e97")
                    startActivity(intent)
                }
                R.id.e98 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e98")
                    startActivity(intent)

                }
                R.id.e99 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e99")
                    startActivity(intent)
                }
                R.id.e100 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e100")
                    startActivity(intent)

                }
                R.id.e101 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e101")
                    startActivity(intent)
                }
                R.id.e102 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e102")
                    startActivity(intent)

                }
                R.id.e103 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e103")
                    startActivity(intent)
                }
                R.id.e104 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e104")
                    startActivity(intent)

                }
                R.id.e105 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e105")
                    startActivity(intent)
                }
                R.id.e106 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e106")
                    startActivity(intent)

                }
                R.id.e107 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e107")
                    startActivity(intent)
                }
                R.id.e108 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e108")
                    startActivity(intent)

                }
                R.id.e109 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e109")
                    startActivity(intent)
                }
                R.id.e110 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e110")
                    startActivity(intent)

                }
                R.id.e111 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e111")
                    startActivity(intent)
                }
                R.id.e112 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e112")
                    startActivity(intent)

                }
                R.id.e113 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e113")
                    startActivity(intent)
                }
                R.id.e114 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e114")
                    startActivity(intent)

                }
                R.id.e115 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e115")
                    startActivity(intent)
                }
                R.id.e116 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e116")
                    startActivity(intent)

                }
                R.id.e117 -> {

                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e117")
                    startActivity(intent)
                }
                R.id.e118 -> {
                    val intent = Intent(this@MainActivity,ElementDetail::class.java)
                    intent.putExtra("e","e118")
                    startActivity(intent)

                }
            }
        }

    }

}