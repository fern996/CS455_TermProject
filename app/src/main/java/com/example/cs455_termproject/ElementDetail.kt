package com.example.cs455_termproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ElementDetail : AppCompatActivity() {
    private var element: String? = null
    private var elementNumber: TextView? = null
    private var elementName: TextView? = null
    private var elementSymbol: TextView? = null
    private var englishName: TextView? = null
    private var latinName: TextView? = null
    private var yearDiscovered: TextView? = null
    private var atomicNumber: TextView? = null
    private var atomicWeight: TextView? = null
    private var density: TextView? = null
    private var imgElementImage: ImageView? = null
    private var imgElementStruct: ImageView? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_element_detail)
        elementNumber = findViewById(R.id.element_number)
        elementName = findViewById(R.id.element_name)
        elementSymbol = findViewById(R.id.element_symbol)
        englishName=findViewById(R.id.english_name)
        latinName = findViewById(R.id.latin_name)
        yearDiscovered = findViewById(R.id.year_discovered)
        atomicNumber = findViewById(R.id.atomic_number)
        atomicWeight = findViewById(R.id.atomic_weight)
        density = findViewById(R.id.density)
        imgElementImage = findViewById(R.id.img_element_image)
        imgElementStruct = findViewById(R.id.img_element_structural_image)
        val intent = intent
        element = intent.getStringExtra("e")
        when {
            element.equals("e1") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.hydrogen_pic)
                imgElementStruct!!.setBackgroundResource(R.drawable.hydrogenstruc)
                elementNumber!!.text = "1"
                elementSymbol!!.text = "H"

                elementName!!.text = "Hydrogen"
                englishName!!.text="Hydrogen"
                latinName!!.text = "Hydrogenium"
                yearDiscovered!!.text = "1766"
                atomicNumber!!.text = "1"
                atomicWeight!!.text = "1.008 g/mol"
                density!!.text = "0.0000899 g/cm^3"
            }
            element.equals("e2") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.heliumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.heliumstruct)
                elementNumber!!.text = "2"

                elementSymbol!!.text = "He"

                elementName!!.text = "Helium"
                englishName!!.text="Helium"
                latinName!!.text = "Helium"
                yearDiscovered!!.text = "1895"
                atomicNumber!!.text = "2"
                atomicWeight!!.text = "4.0026 g/mol"
                density!!.text = "0.000017846 g/cm^3"
            }
            element.equals("e3") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.lithiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.lithiumstruct)
                elementNumber!!.text = "3"
                elementSymbol!!.text = "Li"

                elementName!!.text = "Lithium"
                englishName!!.text="Lithium"
                latinName!!.text = "Lithium"
                yearDiscovered!!.text = "1817"
                atomicNumber!!.text = "3"
                atomicWeight!!.text = "6.941 g/mol"
                density!!.text = "0.534 g/cm^3"
            }
            element.equals("e4") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.berkeliumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.berkeliumstruc)
                elementNumber!!.text = "4"
                atomicNumber!!.text = "4"
                elementSymbol!!.text = "Be"
                elementName!!.text = "Beryllium"
                englishName!!.text="Beryllium"
                latinName!!.text = "Beryllium"
                yearDiscovered!!.text = "1798"
                atomicWeight!!.text = "9.0121 g/mol"
                density!!.text = "1.848 g/cm^3"
            }
            element.equals("e5") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.boronimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.boronstruc)
                elementNumber!!.text = "5"
                atomicNumber!!.text = "5"
                elementSymbol!!.text = "Bo"
                elementName!!.text = "Boron"
                englishName!!.text="Boron"
                latinName!!.text = "Borum"
                yearDiscovered!!.text = "1808"
                atomicWeight!!.text = "10.811 g/mol"
                density!!.text = "2.34 g/cm^3"
            }
            element.equals("e6") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.carbonimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.carbonstruct)
                elementNumber!!.text = "6"
                atomicNumber!!.text = "6"
                elementSymbol!!.text = "C"
                elementName!!.text = "Carbon"
                englishName!!.text="Carbon"
                latinName!!.text = "Carbonium"
                yearDiscovered!!.text = "null"
                atomicWeight!!.text = "12.0107 g/mol"
                density!!.text = "2.26 g/cm^3"
            }
            element.equals("e7") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.nitrogenimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.nitrogenstruc)
                elementNumber!!.text = "7"
                atomicNumber!!.text = "7"
                elementSymbol!!.text = "N"
                elementName!!.text = "Nitrogen"
                englishName!!.text="Nitrogen"
                latinName!!.text = "Nitrogenium"
                yearDiscovered!!.text = "1772"
                atomicWeight!!.text = "14.0067 g/mol"
                density!!.text = "0.001251 g/cm^3"
            }
            element.equals("e8") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.oxygenimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.oxygenstruc)
                elementNumber!!.text = "8"
                atomicNumber!!.text = "8"
                elementSymbol!!.text = "O"
                elementName!!.text = "Oxygen"
                englishName!!.text="Oxygen"
                latinName!!.text = "Oxygenium"
                yearDiscovered!!.text = "1774"
                atomicWeight!!.text = "14.9994 g/mol"
                density!!.text = "0.0009002 g/cm^3"
            }
            element.equals("e9") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.fluorineimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.fluorinestruc)
                elementNumber!!.text = "9"
                atomicNumber!!.text = "9"
                elementSymbol!!.text = "F"
                elementName!!.text = "Flourine"
                englishName!!.text="Flourine"
                latinName!!.text = "Fluorum"
                yearDiscovered!!.text = "1886"
                atomicWeight!!.text = "18.9984 g/mol"
                density!!.text = "0.001696 g/cm^3"
            }
            element.equals("e10") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.neonimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.neonstruc)
                elementNumber!!.text = "10"
                atomicNumber!!.text = "10"
                elementSymbol!!.text = "Ne"
                elementName!!.text = "Neon"
                englishName!!.text="Neon"
                latinName!!.text = "Neon"
                yearDiscovered!!.text = "1898"
                atomicWeight!!.text = "20.1797 g/mol"
                density!!.text = "0.0009002 g/cm^3"
            }
            element.equals("e11") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.sodiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.sodiumstruc)
                elementNumber!!.text = "11"
                atomicNumber!!.text = "11"
                elementSymbol!!.text = "Na"
                elementName!!.text = "Sodium"
                englishName!!.text="Sodium"
                latinName!!.text = "Natrium"
                yearDiscovered!!.text = "1807"
                atomicWeight!!.text = "22.9897 g/mol"
                density!!.text = "971 g/cm^3"
            }
            element.equals("e12") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.magnesiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.magnesiumstruc)
                elementNumber!!.text = "12"
                atomicNumber!!.text = "12"
                elementSymbol!!.text = "Mg"
                elementName!!.text = "Magnesium"
                englishName!!.text="Magnesium"
                latinName!!.text = "Magnesium"
                yearDiscovered!!.text = "1808"
                atomicWeight!!.text = "24.305 g/mol"
                density!!.text = "1.738 g/cm^3"
            }
            element.equals("e13") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.alumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.alumstruc)
                elementNumber!!.text = "13"
                atomicNumber!!.text = "13"
                elementSymbol!!.text = "Al"
                elementName!!.text = "Aluminium"
                englishName!!.text="Aluminium"
                latinName!!.text = "Aluminium"
                yearDiscovered!!.text = "1825"
                atomicWeight!!.text = "26.9815 g/mol"
                density!!.text = "2.6989 g/cm^3"
            }
            element.equals("e14") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.siliconimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.siliconstruc)
                elementNumber!!.text = "14"
                atomicNumber!!.text = "14"
                elementSymbol!!.text = "Si"
                elementName!!.text = "Silicon"
                englishName!!.text="Silicon"
                latinName!!.text = "Silicium"
                yearDiscovered!!.text = "1824"
                atomicWeight!!.text = "28.0855 g/mol"
                density!!.text = "2.33 g/cm^3"
            }
            element.equals("e15") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.phosimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.phosstruc)
                elementNumber!!.text = "15"
                atomicNumber!!.text = "15"
                elementSymbol!!.text = "P"
                elementName!!.text = "Phosphorus"
                englishName!!.text="Phosphorus"
                latinName!!.text = "Phosphorus"
                yearDiscovered!!.text = "1669"
                atomicWeight!!.text = "30.9737 g/mol"
                density!!.text = "2.82 g/cm^3"
            }
            element.equals("e16") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.sulphurimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.sulphurstruc)
                elementNumber!!.text = "16"
                atomicNumber!!.text = "16"
                elementSymbol!!.text = "S"
                elementName!!.text = "Sulfur"
                englishName!!.text="Sulfur"
                latinName!!.text = "Sulfphurus"
                yearDiscovered!!.text = "null"
                atomicWeight!!.text = "32.065 g/mol"
                density!!.text = "2.07 g/cm^3"
            }
            element.equals("e17") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.chlorineimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.chlorinestruct)
                elementNumber!!.text = "17"
                atomicNumber!!.text = "17"
                elementSymbol!!.text = "Cl"
                elementName!!.text = "Chlorine"
                englishName!!.text="Chlorine"
                latinName!!.text = "Chlorum"
                yearDiscovered!!.text = "1774"
                atomicWeight!!.text = "35.453 g/mol"
                density!!.text = "0.003214 g/cm^3"
            }
            element.equals("e18") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.argonimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.argonstruc)
                elementNumber!!.text = "18"
                atomicNumber!!.text = "18"
                elementSymbol!!.text = "Ar"
                elementName!!.text = "Argon"
                englishName!!.text="Argon"
                latinName!!.text = "Argon"
                yearDiscovered!!.text = "1894"
                atomicWeight!!.text = "39.948 g/mol"
                density!!.text = "0.001784 g/cm^3"
            }
            element.equals("e19") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.potassiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.potassiumstruc)
                elementNumber!!.text = "19"
                atomicNumber!!.text = "19"
                elementSymbol!!.text = "K"
                elementName!!.text = "Potassium"
                englishName!!.text="Potassium"
                latinName!!.text = "Kalium"
                yearDiscovered!!.text = "1807"
                atomicWeight!!.text = "39.0983 g/mol"
                density!!.text = "0.856 g/cm^3"
            }
            element.equals("e20") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.calciumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.calciumstruc)
                elementNumber!!.text = "20"
                atomicNumber!!.text = "20"
                elementSymbol!!.text = "Ca"
                elementName!!.text = "Calcium"
                englishName!!.text="Calcium"
                latinName!!.text = "Calcium"
                yearDiscovered!!.text = "1808"
                atomicWeight!!.text = "40.078 g/mol"
                density!!.text = "1.55 g/cm^3"
            }
            element.equals("e21") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.scandiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.scandiumstruc)
                elementNumber!!.text = "21"
                atomicNumber!!.text = "21"
                elementSymbol!!.text = "Sc"
                elementName!!.text = "Scandium"
                englishName!!.text="Scandium"
                latinName!!.text = "Scandium"
                yearDiscovered!!.text = "1879"
                atomicWeight!!.text = "44.9559 g/mol"
                density!!.text = "2.99 g/cm^3"
            }
            element.equals("e22") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.titaniumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.titniumstruc)
                elementNumber!!.text = "22"
                atomicNumber!!.text = "22"
                elementSymbol!!.text = "Ti"
                elementName!!.text = "Titanium"
                englishName!!.text="Titanium"
                latinName!!.text = "Titanium"
                yearDiscovered!!.text = "1795"
                atomicWeight!!.text = "47.867 g/mol"
                density!!.text = "4.54 g/cm^3"
            }
            element.equals("e23") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.vanadiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.vanadiumstruc)
                elementNumber!!.text = "23"
                atomicNumber!!.text = "23"
                elementSymbol!!.text = "V"
                elementName!!.text = "Vanadium"
                englishName!!.text="Vanadium"
                latinName!!.text = "Vanadium"
                yearDiscovered!!.text = "1830"
                atomicWeight!!.text = "50.9415 g/mol"
                density!!.text = "6.11 g/cm^3"
            }
            element.equals("e24") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.chromiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.chromiumstruc)
                elementNumber!!.text = "24"
                atomicNumber!!.text = "24"
                elementSymbol!!.text = "Cr"
                elementName!!.text = "Chromium"
                englishName!!.text="Chromium"
                latinName!!.text = "Chromium"
                yearDiscovered!!.text = "1797"
                atomicWeight!!.text = "51.9961 g/mol"
                density!!.text = "7.19 g/cm^3"
            }
            element.equals("e25") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.manganeseimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.manganesestruc)
                elementNumber!!.text = "25"
                atomicNumber!!.text = "25"
                elementSymbol!!.text = "Mn"
                elementName!!.text = "Manganese"
                englishName!!.text="Manganese"
                latinName!!.text = "Manganum"
                yearDiscovered!!.text = "1774"
                atomicWeight!!.text = "54.938 g/mol"
                density!!.text = "7.21 g/cm^3"
            }
            element.equals("e26") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.ironimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.ironstruc)
                elementNumber!!.text = "26"
                atomicNumber!!.text = "26"
                elementSymbol!!.text = "Fe"
                elementName!!.text = "Iron"
                englishName!!.text="Iron"
                latinName!!.text = "Ferrum"
                yearDiscovered!!.text = "null"
                atomicWeight!!.text = "55.845 g/mol"
                density!!.text = "7.88 g/cm^3"
            }
            element.equals("e27") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.cobaltimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.cobaltstruc)
                elementNumber!!.text = "27"
                atomicNumber!!.text = "27"
                elementSymbol!!.text = "Co"
                elementName!!.text = "Cobalt"
                englishName!!.text="Cobalt"
                latinName!!.text = "Cobaltium"
                yearDiscovered!!.text = "1735"
                atomicWeight!!.text = "58.9331 g/mol"
                density!!.text = "8.9 g/cm^3"
            }
            element.equals("e28") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.nickelimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.nickelstruc)
                elementNumber!!.text = "28"
                atomicNumber!!.text = "28"
                elementSymbol!!.text = "Ni"
                elementName!!.text = "Nickel"
                englishName!!.text="Nickel"
                latinName!!.text = "Niccolum"
                yearDiscovered!!.text = "1791"
                atomicWeight!!.text = "58.6934 g/mol"
                density!!.text = "8.902 g/cm^3"
            }
            element.equals("e29") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.copperimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.copperstruc)
                elementNumber!!.text = "29"
                atomicNumber!!.text = "29"
                elementSymbol!!.text = "Cu"
                elementName!!.text = "Copper"
                englishName!!.text="Copper"
                latinName!!.text = "Cuprum"
                yearDiscovered!!.text = "null"
                atomicWeight!!.text = "63.546 g/mol"
                density!!.text = "8.92 g/cm^3"
            }
            element.equals("e30") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.zincimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.zincstruc)
                elementNumber!!.text = "30"
                atomicNumber!!.text = "30"
                elementSymbol!!.text = "Zn"
                elementName!!.text = "Zinc"
                englishName!!.text="Zinc"
                latinName!!.text = "Zincum"
                yearDiscovered!!.text = "null"
                atomicWeight!!.text = "65.38 g/mol"
                density!!.text = "7.133 g/cm^3"
            }
            element.equals("e31") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.galliumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.galliumstruc)
                elementNumber!!.text = "31"
                atomicNumber!!.text = "31"
                elementSymbol!!.text = "Ga"
                elementName!!.text = "Gallium"
                englishName!!.text="Gallium"
                latinName!!.text = "Gallium"
                yearDiscovered!!.text = "1875"
                atomicWeight!!.text = "69.723 g/mol"
                density!!.text = "5.91 g/cm^3"
            }
            element.equals("e32") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.germiniumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.germiniumstruc)
                elementNumber!!.text = "32"
                atomicNumber!!.text = "32"
                elementSymbol!!.text = "Ge"
                elementName!!.text = "Germinium"
                englishName!!.text="Germinium"
                latinName!!.text = "Germinium"
                yearDiscovered!!.text = "1886"
                atomicWeight!!.text = "72.64 g/mol"
                density!!.text = "5.323 g/cm^3"
            }
            element.equals("e33") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.arseniimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.arsenicstruc)
                elementNumber!!.text = "33"
                atomicNumber!!.text = "33"
                elementSymbol!!.text = "As"
                elementName!!.text = "Arsenic"
                englishName!!.text="Arsenic"
                latinName!!.text = "Arsenicum"
                yearDiscovered!!.text = "1250"
                atomicWeight!!.text = "74.9216 g/mol"
                density!!.text = "5.72 g/cm^3"
            }
            element.equals("e34") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.seleniumstruc)
                imgElementStruct!!.setBackgroundResource(R.drawable.seleniumstruc)
                elementNumber!!.text = "34"
                atomicNumber!!.text = "34"
                elementSymbol!!.text = "Se"
                elementName!!.text = "Selenium"
                englishName!!.text="Selenium"
                latinName!!.text = "Selenium"
                yearDiscovered!!.text = "1817"
                atomicWeight!!.text = "18.96 g/mol"
                density!!.text = "4.79 g/cm^3"
            }
            element.equals("e35") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.bromineimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.brominestruc)
                elementNumber!!.text = "35"
                atomicNumber!!.text = "35"
                elementSymbol!!.text = "Br"
                elementName!!.text = "Bromine"
                englishName!!.text="Bromine"
                latinName!!.text = "Bromun"
                yearDiscovered!!.text = "1826"
                atomicWeight!!.text = "79.904 g/mol"
                density!!.text = "3.14 g/cm^3"
            }
            element.equals("e36") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.kryptonimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.keyptonstruc)
                elementNumber!!.text = "36"
                atomicNumber!!.text = "36"
                elementSymbol!!.text = "Kr"
                elementName!!.text = "Krypton"
                englishName!!.text="Krypton"
                latinName!!.text = "Krypton"
                yearDiscovered!!.text = "1898"
                atomicWeight!!.text = "83.798 g/mol"
                density!!.text = "0.003749 g/cm^3"
            }
            element.equals("e37") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.rubidiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.rubidiumstruc)
                elementNumber!!.text = "37"
                atomicNumber!!.text = "37"
                elementSymbol!!.text = "Rb"
                elementName!!.text = "Rubidium"
                englishName!!.text="Rubidium"
                latinName!!.text = "Rubidium"
                yearDiscovered!!.text = "1861"
                atomicWeight!!.text = "85.467 g/mol"
                density!!.text = "1.53 g/cm^3"
            }
            element.equals("e38") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.strontiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.strontiumstruc)
                elementNumber!!.text = "38"
                atomicNumber!!.text = "38"
                elementSymbol!!.text = "Sr"
                elementName!!.text = "Strontium"
                englishName!!.text="Strontium"
                latinName!!.text = "Stontium"
                yearDiscovered!!.text = "1790"
                atomicWeight!!.text = "87.62 g/mol"
                density!!.text = "2.54 g/cm^3"
            }
            element.equals("e39") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.yttriumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.yttriumstruc)
                elementNumber!!.text = "39"
                atomicNumber!!.text = "39"
                elementSymbol!!.text = "Y"
                elementName!!.text = "Yttrium"
                englishName!!.text="Yttrium"
                latinName!!.text = "Yttrium"
                yearDiscovered!!.text = "1794"
                atomicWeight!!.text = "88.905 g/mol"
                density!!.text = "4.47 g/cm^3"
            }
            element.equals("e40") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.zicroniumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.zicroniumstruc)
                elementNumber!!.text = "39"
                atomicNumber!!.text = "39"
                elementSymbol!!.text = "Zr"
                elementName!!.text = "Zirconium"
                englishName!!.text="Zirconium"
                latinName!!.text = "Zirconium"
                yearDiscovered!!.text = "1789"
                atomicWeight!!.text = "91.224 g/mol"
                density!!.text = "6.51 g/cm^3"
            }
            element.equals("e41") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.niobiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.niobiumstruc)
                elementNumber!!.text = "41"
                atomicNumber!!.text = "41"
                elementSymbol!!.text = "Nb"
                elementName!!.text = "Niobium"
                englishName!!.text="Niobium"
                latinName!!.text = "Niobium"
                yearDiscovered!!.text = "1801"
                atomicWeight!!.text = "92.906 g/mol"
                density!!.text = "8.58 g/cm^3"
            }
            element.equals("e42") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.molybdenumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.molybdenumstruc)
                elementNumber!!.text = "42"
                atomicNumber!!.text = "42"
                elementSymbol!!.text = "Mo"
                elementName!!.text = "Molybednum"
                englishName!!.text="Molybednum"
                latinName!!.text = "Molybednum"
                yearDiscovered!!.text = "1778"
                atomicWeight!!.text = "95.94 g/mol"
                density!!.text = "10.22 g/cm^3"
            }
            element.equals("e43") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.technetiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.technetiumstruc)
                elementNumber!!.text = "43"
                atomicNumber!!.text = "43"
                elementSymbol!!.text = "Tc"
                elementName!!.text = "Technetium"
                englishName!!.text="Technetium"
                latinName!!.text = "Technetium"
                yearDiscovered!!.text = "1937"
                atomicWeight!!.text = "98.906 g/mol"
                density!!.text = "11.49 g/cm^3"
            }
            element.equals("e44") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.rutheniumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.rutheniumstruc)
                elementNumber!!.text = "44"
                atomicNumber!!.text = "44"
                elementSymbol!!.text = "Ru"
                elementName!!.text = "Ruthenium"
                englishName!!.text="Ruthenium"
                latinName!!.text = "Ruthenium"
                yearDiscovered!!.text = "1844"
                atomicWeight!!.text = "101.07 g/mol"
                density!!.text = "12.41 g/cm^3"
            }
            element.equals("e45") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.rhodiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.rhodiumstruc)
                elementNumber!!.text = "45"
                atomicNumber!!.text = "45"
                elementSymbol!!.text = "Rh"
                elementName!!.text = "Rhodium"
                englishName!!.text="Rhodium"
                latinName!!.text = "Rhodium"
                yearDiscovered!!.text = "1804"
                atomicWeight!!.text = "102.905 g/mol"
                density!!.text = "12.41 g/cm^3"
            }
            element.equals("e46") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.palladiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.palladiumstruct)
                elementNumber!!.text = "46"
                atomicNumber!!.text = "46"
                elementSymbol!!.text = "Pd"
                elementName!!.text = "Palladium"
                englishName!!.text="Palladium"
                latinName!!.text = "Palladium"
                yearDiscovered!!.text = "1803"
                atomicWeight!!.text = "106.42 g/mol"
                density!!.text = "12.02 g/cm^3"
            }
            element.equals("e47") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.silverimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.silverstruc)
                elementNumber!!.text = "47"
                atomicNumber!!.text = "47"
                elementSymbol!!.text = "Ag"
                elementName!!.text = "Silver"
                englishName!!.text="Silver"
                latinName!!.text = "Argenyum"
                yearDiscovered!!.text = "null"
                atomicWeight!!.text = "107.868 g/mol"
                density!!.text = "10.47 g/cm^3"
            }
            element.equals("e48") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.cadiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.cadiumstruc)
                elementNumber!!.text = "48"
                atomicNumber!!.text = "48"
                elementSymbol!!.text = "Cd"
                elementName!!.text = "Cadmium"
                englishName!!.text="Cadmium"
                latinName!!.text = "Cadmium"
                yearDiscovered!!.text = "1817"
                atomicWeight!!.text = "112.411 g/mol"
                density!!.text = "8.64 g/cm^3"
            }
            element.equals("e49") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.indiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.indiumstruc)
                elementNumber!!.text = "49"
                atomicNumber!!.text = "49"
                elementSymbol!!.text = "In"
                elementName!!.text = "Indium"
                englishName!!.text="Indium"
                latinName!!.text = "Indium"
                yearDiscovered!!.text = "1863"
                atomicWeight!!.text = "114.818 g/mol"
                density!!.text = "7.31 g/cm^3"
            }
            element.equals("e50") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.tinimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.tinstruc)
                elementNumber!!.text = "50"
                atomicNumber!!.text = "50"
                elementSymbol!!.text = "Sn"
                elementName!!.text = "Tin"
                englishName!!.text="Tin"
                latinName!!.text = "Stannum"
                yearDiscovered!!.text = "null"
                atomicWeight!!.text = "118.71 g/mol"
                density!!.text = "7.29 g/cm^3"
            }
            element.equals("e51") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.antimonyimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.antimonystruc)
                elementNumber!!.text = "51"
                atomicNumber!!.text = "51"
                elementSymbol!!.text = "Sb"
                elementName!!.text = "Antimony"
                englishName!!.text="Antimony"
                latinName!!.text = "Stibium"
                yearDiscovered!!.text = "null"
                atomicWeight!!.text = "121.76 g/mol"
                density!!.text = "6.69 g/cm^3"
            }
            element.equals("e52") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.telluriumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.telluriumstruc)
                elementNumber!!.text = "52"
                atomicNumber!!.text = "52"
                elementSymbol!!.text = "Te"
                elementName!!.text = "Tellurium"
                englishName!!.text="Tellurium"
                latinName!!.text = "Tellurium"
                yearDiscovered!!.text = "1782"
                atomicWeight!!.text = "127.6 g/mol"
                density!!.text = "6.25 g/cm^3"
            }
            element.equals("e53") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.iodineimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.iodinestruc)
                elementNumber!!.text = "53"
                atomicNumber!!.text = "53"
                elementSymbol!!.text = "I"
                elementName!!.text = "Iodine"
                englishName!!.text="Iodine"
                latinName!!.text = "Iodium"
                yearDiscovered!!.text = "1811"
                atomicWeight!!.text = "126.904 g/mol"
                density!!.text = "4.94 g/cm^3"
            }
            element.equals("e54") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.xenonimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.xenonstruc)
                elementNumber!!.text = "54"
                atomicNumber!!.text = "54"
                elementSymbol!!.text = "Xe"
                elementName!!.text = "Xenon"
                englishName!!.text="Xenon"
                latinName!!.text = "Xenon"
                yearDiscovered!!.text = "1898"
                atomicWeight!!.text = "131.293 g/mol"
                density!!.text = "0.005894 g/cm^3"
            }
            element.equals("e55") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.caesiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.caesiumstruct)
                elementNumber!!.text = "55"
                atomicNumber!!.text = "55"
                elementSymbol!!.text = "Cs"
                elementName!!.text = "Caesium"
                englishName!!.text="Caesium"
                latinName!!.text = "Caesium"
                yearDiscovered!!.text = "1860"
                atomicWeight!!.text = "132.905 g/mol"
                density!!.text = "1.9 g/cm^3"
            }
            element.equals("e56") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.bariumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.bariumstruc)
                elementNumber!!.text = "56"
                atomicNumber!!.text = "56"
                elementSymbol!!.text = "Ba"
                elementName!!.text = "Barium"
                englishName!!.text="Barium"
                latinName!!.text = "Barium"
                yearDiscovered!!.text = "1774"
                atomicWeight!!.text = "137.327 g/mol"
                density!!.text = "3.5 g/cm^3"
            }
            element.equals("e57") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.lanthanumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.lanthanumstruc)
                elementNumber!!.text = "57"
                atomicNumber!!.text = "57"
                elementSymbol!!.text = "La"
                elementName!!.text = "Lanthanum"
                englishName!!.text="Lanthanum"
                latinName!!.text = "Lanthanum"
                yearDiscovered!!.text = "1839"
                atomicWeight!!.text = "138.905 g/mol"
                density!!.text = "6.16 g/cm^3"
            }
            element.equals("e58") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.ceriumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.ceriumstruc)
                elementNumber!!.text = "58"
                atomicNumber!!.text = "58"
                elementSymbol!!.text = "Ce"
                elementName!!.text = "Cerium"
                englishName!!.text="Cerium"
                latinName!!.text = "Cerium"
                yearDiscovered!!.text = "1803"
                atomicWeight!!.text = "140.116 g/mol"
                density!!.text = "6.77 g/cm^3"
            }
            element.equals("e59") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.praseodymiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.praseodymiumstruc)
                elementNumber!!.text = "59"
                atomicNumber!!.text = "59"
                elementSymbol!!.text = "Pr"
                elementName!!.text = "Praseodymium"
                englishName!!.text="Praseodymium"
                latinName!!.text = "Praseodymium"
                yearDiscovered!!.text = "1885"
                atomicWeight!!.text = "140.904 g/mol"
                density!!.text = "6.773 g/cm^3"
            }
            element.equals("e60") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.neodymiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.neodymiumstruc)
                elementNumber!!.text = "60"
                atomicNumber!!.text = "60"
                elementSymbol!!.text = "Nd"
                elementName!!.text = "Neodymium"
                englishName!!.text="Neodymium"
                latinName!!.text = "Neodymium"
                yearDiscovered!!.text = "1885"
                atomicWeight!!.text = "144.242 g/mol"
                density!!.text = "7 g/cm^3"
            }
            element.equals("e61") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.promethiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.promethiumstruc)
                elementNumber!!.text = "61"
                atomicNumber!!.text = "61"
                elementSymbol!!.text = "Pm"
                elementName!!.text = "Promethium"
                englishName!!.text="Promethium"
                latinName!!.text = "Promethium"
                yearDiscovered!!.text = "1945"
                atomicWeight!!.text = "144.912 g/mol"
                density!!.text = "7.2 g/cm^3"
            }
            element.equals("e62") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.samariumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.samariumstruc)
                elementNumber!!.text = "62"
                atomicNumber!!.text = "62"
                elementSymbol!!.text = "Sm"
                elementName!!.text = "Samarium"
                englishName!!.text="Samarium"
                latinName!!.text = "Samarium"
                yearDiscovered!!.text = "1879"
                atomicWeight!!.text = "150.36 g/mol"
                density!!.text = "7.54 g/cm^3"
            }
            element.equals("e63") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.europiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.europiumstruc)
                elementNumber!!.text = "63"
                atomicNumber!!.text = "63"
                elementSymbol!!.text = "Eu"
                elementName!!.text = "Europium"
                englishName!!.text="Europium"
                latinName!!.text = "Europium"
                yearDiscovered!!.text = "1901"
                atomicWeight!!.text = "151.964 g/mol"
                density!!.text = "5.25 g/cm^3"
            }
            element.equals("e64") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.gandoliniumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.gandoliniumstruc)
                elementNumber!!.text = "64"
                atomicNumber!!.text = "64"
                elementSymbol!!.text = "Gd"
                elementName!!.text = "Gadolinium"
                englishName!!.text="Gadolinium"
                latinName!!.text = "Gadolinium"
                yearDiscovered!!.text = "1886"
                atomicWeight!!.text = "157.25 g/mol"
                density!!.text = "7.89 g/cm^3"
            }
            element.equals("e65") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.terbiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.terbiumstruc)
                elementNumber!!.text = "65"
                atomicNumber!!.text = "65"
                elementSymbol!!.text = "Tb"
                elementName!!.text = "Terbium"
                englishName!!.text="Terbium"
                latinName!!.text = "Terbium"
                yearDiscovered!!.text = "1843"
                atomicWeight!!.text = "158.925 g/mol"
                density!!.text = "8.25 g/cm^3"
            }
            element.equals("e66") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.dysprosiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.dysprosiumstruc)
                elementNumber!!.text = "66"
                atomicNumber!!.text = "66"
                elementSymbol!!.text = "Dy"
                elementName!!.text = "Dysprosium"
                englishName!!.text="Dysprosium"
                latinName!!.text = "Dysprosium"
                yearDiscovered!!.text = "1886"
                atomicWeight!!.text = "162.5 g/mol"
                density!!.text = "8.56 g/cm^3"
            }
            element.equals("e67") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.holmiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.holmiumstruc)
                elementNumber!!.text = "67"
                atomicNumber!!.text = "67"
                elementSymbol!!.text = "Ho"
                elementName!!.text = "Holmium"
                englishName!!.text="Holmium"
                latinName!!.text = "Holmium"
                yearDiscovered!!.text = "1878"
                atomicWeight!!.text = "164.93 g/mol"
                density!!.text = "8.78 g/cm^3"
            }
            element.equals("e68") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.erbiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.erbiumstruc)
                elementNumber!!.text = "68"
                atomicNumber!!.text = "68"
                elementSymbol!!.text = "Er"
                elementName!!.text = "Erbium"
                englishName!!.text="Erbium"
                latinName!!.text = "Erbium"
                yearDiscovered!!.text = "1842"
                atomicWeight!!.text = "167.259 g/mol"
                density!!.text = "9.05 g/cm^3"
            }
            element.equals("e69") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.thuliumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.thuriumstruc)
                elementNumber!!.text = "69"
                atomicNumber!!.text = "69"
                elementSymbol!!.text = "Tm"
                elementName!!.text = "Thurium"
                englishName!!.text="Thurium"
                latinName!!.text = "Thurium"
                yearDiscovered!!.text = "1879"
                atomicWeight!!.text = "168.934 g/mol"
                density!!.text = "9.32 g/cm^3"
            }
            element.equals("e70") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.ytterbiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.ytterbiumstruc)
                elementNumber!!.text = "70"
                atomicNumber!!.text = "70"
                elementSymbol!!.text = "Yb"
                elementName!!.text = "Ytterbium"
                englishName!!.text="Ytterbium"
                latinName!!.text = "Ytterbium"
                yearDiscovered!!.text = "1878"
                atomicWeight!!.text = "173.04 g/mol"
                density!!.text = "6.97 g/cm^3"
            }
            element.equals("e71") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.lutetiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.lutetiumstruc)
                elementNumber!!.text = "71"
                atomicNumber!!.text = "71"
                elementSymbol!!.text = "Lu"
                elementName!!.text = "Lutetium"
                englishName!!.text="Lutetium"
                latinName!!.text = "Lutetium"
                yearDiscovered!!.text = "1907"
                atomicWeight!!.text = "174.967 g/mol"
                density!!.text = "9.84 g/cm^3"
            }
            element.equals("e72") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.hafniumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.hafniumstruc)
                elementNumber!!.text = "72"
                atomicNumber!!.text = "72"
                elementSymbol!!.text = "Hf"
                elementName!!.text = "Hafnium"
                englishName!!.text="Hafnium"
                latinName!!.text = "Hafnium"
                yearDiscovered!!.text = "1923"
                atomicWeight!!.text = "178.49 g/mol"
                density!!.text = "13.31 g/cm^3"
            }
            element.equals("e73") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.tantalumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.tantalumstruc)
                elementNumber!!.text = "73"
                atomicNumber!!.text = "73"
                elementSymbol!!.text = "Ta"
                elementName!!.text = "Tantalum"
                englishName!!.text="Tantalum"
                latinName!!.text = "Tantalum"
                yearDiscovered!!.text = "1802"
                atomicWeight!!.text = "180.947 g/mol"
                density!!.text = "16.68 g/cm^3"
            }
            element.equals("e74") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.tungstenimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.tungstenstruc)
                elementNumber!!.text = "74"
                atomicNumber!!.text = "74"
                elementSymbol!!.text = "W"
                elementName!!.text = "Tungsten"
                englishName!!.text="Tungsten"
                latinName!!.text = "Wolframium"
                yearDiscovered!!.text = "1781"
                atomicWeight!!.text = "183.84 g/mol"
                density!!.text = "19.26 g/cm^3"
            }
            element.equals("e75") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.rheniumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.rheniumstruc)
                elementNumber!!.text = "75"
                atomicNumber!!.text = "75"
                elementSymbol!!.text = "Re"
                elementName!!.text = "Rhenium"
                englishName!!.text="Rhenium"
                latinName!!.text = "Rhenium"
                yearDiscovered!!.text = "1925"
                atomicWeight!!.text = "186.207 g/mol"
                density!!.text = "21.03 g/cm^3"
            }
            element.equals("e76") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.osmiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.osmiumstruc)
                elementNumber!!.text = "76"
                atomicNumber!!.text = "76"
                elementSymbol!!.text = "Os"
                elementName!!.text = "Osmium"
                englishName!!.text="Osmium"
                latinName!!.text = "Osmium"
                yearDiscovered!!.text = "1804"
                atomicWeight!!.text = "190.23 g/mol"
                density!!.text = "22.587 g/cm^3"
            }
            element.equals("e77") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.iridiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.iridiumstruc)
                elementNumber!!.text = "77"
                atomicNumber!!.text = "77"
                elementSymbol!!.text = "Ir"
                elementName!!.text = "Iridium"
                englishName!!.text="Iridium"
                latinName!!.text = "Iridium"
                yearDiscovered!!.text = "1804"
                atomicWeight!!.text = "192.217 g/mol"
                density!!.text = "22.562 g/cm^3"
            }
            element.equals("e78") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.platinumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.platinumstruc)
                elementNumber!!.text = "78"
                atomicNumber!!.text = "78"
                elementSymbol!!.text = "Pt"
                elementName!!.text = "Platinum"
                englishName!!.text="Platinum"
                latinName!!.text = "Platinum"
                yearDiscovered!!.text = "1735"
                atomicWeight!!.text = "195.084 g/mol"
                density!!.text = "21.45 g/cm^3"
            }
            element.equals("e79") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.goldimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.goldstruc)
                elementNumber!!.text = "79"
                atomicNumber!!.text = "79"
                elementSymbol!!.text = "Au"
                elementName!!.text = "Gold"
                englishName!!.text="Gold"
                latinName!!.text = "Aurum"
                yearDiscovered!!.text = "Null"
                atomicWeight!!.text = "196.966 g/mol"
                density!!.text = "19.3 g/cm^3"
            }
            element.equals("e80") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.mercuryimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.mercurystruc)
                elementNumber!!.text = "80"
                atomicNumber!!.text = "80"
                elementSymbol!!.text = "Hg"
                elementName!!.text = "Mercury"
                englishName!!.text="Mercury"
                latinName!!.text = "Hydrargyrum"
                yearDiscovered!!.text = "Null"
                atomicWeight!!.text = "200.59 g/mol"
                density!!.text = "13.55 g/cm^3"
            }
            element.equals("e81") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.thaliumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.thaliumstruc)
                elementNumber!!.text = "81"
                atomicNumber!!.text = "81"
                elementSymbol!!.text = "Tl"
                elementName!!.text = "Thalium"
                englishName!!.text="Thalium"
                latinName!!.text = "Thalium"
                yearDiscovered!!.text = "1861"
                atomicWeight!!.text = "204.383 g/mol"
                density!!.text = "11.85 g/cm^3"
            }
            element.equals("e82") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.leadimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.leadstruc)
                elementNumber!!.text = "82"
                atomicNumber!!.text = "82"
                elementSymbol!!.text = "Pb"
                elementName!!.text = "Lead"
                englishName!!.text="Lead"
                latinName!!.text = "Plumbum"
                yearDiscovered!!.text = "null"
                atomicWeight!!.text = "207.2 g/mol"
                density!!.text = "11.34 g/cm^3"
            }
            element.equals("e83") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.bismuthimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.bismuthstruc)
                elementNumber!!.text = "83"
                atomicNumber!!.text = "83"
                elementSymbol!!.text = "Bi"
                elementName!!.text = "Bismuth"
                englishName!!.text="Bismuth"
                latinName!!.text = "Bismuth"
                yearDiscovered!!.text = "1450"
                atomicWeight!!.text = "20898404 g/mol"
                density!!.text = "9.8 g/cm^3"
            }
            element.equals("e84") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.polonium)
                imgElementStruct!!.setBackgroundResource(R.drawable.poloniumstruc)
                elementNumber!!.text = "84"
                atomicNumber!!.text = "84"
                elementSymbol!!.text = "Po"
                elementName!!.text = "Polonium"
                englishName!!.text="Polonium"
                latinName!!.text = "Polonium"
                yearDiscovered!!.text = "1898"
                atomicWeight!!.text = "208.9824 g/mol"
                density!!.text = "9.2 g/cm^3"
            }
            element.equals("e85") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.astatineimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.astatinestruc)
                elementNumber!!.text = "85"
                atomicNumber!!.text = "85"
                elementSymbol!!.text = "At"
                elementName!!.text = "Astatine"
                englishName!!.text="Astatine"
                latinName!!.text = "Astatun"
                yearDiscovered!!.text = "1940"
                atomicWeight!!.text = "209.9871 g/mol"
                density!!.text = "6.4 g/cm^3"
            }
            element.equals("e86") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.radonimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.radonstruc)
                elementNumber!!.text = "86"
                atomicNumber!!.text = "86"
                elementSymbol!!.text = "Rn"
                elementName!!.text = "Radon"
                englishName!!.text="Radon"
                latinName!!.text = "Radon"
                yearDiscovered!!.text = "1900"
                atomicWeight!!.text = "222.0176 g/mol"
                density!!.text = "0.0098 g/cm^3"
            }
            element.equals("e87") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.franciumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.franciumstruc)
                elementNumber!!.text = "87"
                atomicNumber!!.text = "87"
                elementSymbol!!.text = "Fr"
                elementName!!.text = "Francium"
                englishName!!.text="Francium"
                latinName!!.text = "Francium"
                yearDiscovered!!.text = "1939"
                atomicWeight!!.text = "223.0197 g/mol"
                density!!.text = "2.48 g/cm^3"
            }
            element.equals("e88") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.radiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.radiumstruc)
                elementNumber!!.text = "88"
                atomicNumber!!.text = "88"
                elementSymbol!!.text = "Ra"
                elementName!!.text = "Radium"
                englishName!!.text="Radium"
                latinName!!.text = "Radium"
                yearDiscovered!!.text = "1898"
                atomicWeight!!.text = "226.0254 g/mol"
                density!!.text = "5.5 g/cm^3"
            }
            element.equals("e89") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.actiniumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.actiniumstruc)
                elementNumber!!.text = "89"
                atomicNumber!!.text = "89"
                elementSymbol!!.text = "Ac"
                elementName!!.text = "Actinium"
                englishName!!.text="Actinium"
                latinName!!.text = "Actinium"
                yearDiscovered!!.text = "1899"
                atomicWeight!!.text = "227.0278 g/mol"
                density!!.text = "10.07 g/cm^3"
            }
            element.equals("e90") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.thoriumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.thoriumstruc)
                elementNumber!!.text = "90"
                atomicNumber!!.text = "90"
                elementSymbol!!.text = "Th"
                elementName!!.text = "Thorium"
                englishName!!.text="Thorium"
                latinName!!.text = "Thorium"
                yearDiscovered!!.text = "1828"
                atomicWeight!!.text = "232.038 g/mol"
                density!!.text = "11.72 g/cm^3"
            }
            element.equals("e91") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.protactiniumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.protactiniumstruc)
                elementNumber!!.text = "91"
                atomicNumber!!.text = "91"
                elementSymbol!!.text = "Pa"
                elementName!!.text = "Protactinium"
                englishName!!.text="Protactinium"
                latinName!!.text = "Protactinium"
                yearDiscovered!!.text = "1918"
                atomicWeight!!.text = "231.0358 g/mol"
                density!!.text = "15.37 g/cm^3"
            }
            element.equals("e92") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.uraniumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.uraniumstruc)
                elementNumber!!.text = "92"
                atomicNumber!!.text = "92"
                elementSymbol!!.text = "U"
                elementName!!.text = "Uranium"
                englishName!!.text="Uranium"
                latinName!!.text = "Uranium"
                yearDiscovered!!.text = "1789"
                atomicWeight!!.text = "238.0289 g/mol"
                density!!.text = "19.05 g/cm^3"
            }
            element.equals("e93") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.neptuniumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.neptuniumstruc)
                elementNumber!!.text = "93"
                atomicNumber!!.text = "93"
                elementSymbol!!.text = "Np"
                elementName!!.text = "Neptunium"
                englishName!!.text="Neptunium"
                latinName!!.text = "Neprunium"
                yearDiscovered!!.text = "1940"
                atomicWeight!!.text = "237.0482 g/mol"
                density!!.text = "20.48 g/cm^3"
            }
            element.equals("e94") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.plotoniumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.plotoniumstruc)
                elementNumber!!.text = "94"
                atomicNumber!!.text = "94"
                elementSymbol!!.text = "Pu"
                elementName!!.text = "Plotonium"
                englishName!!.text="Plotonium"
                latinName!!.text = "Plotonium"
                yearDiscovered!!.text = "1940"
                atomicWeight!!.text = "244.0642 g/mol"
                density!!.text = "19.74 g/cm^3"
            }
            element.equals("e95") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.americiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.americiumstruc)
                elementNumber!!.text = "95"
                atomicNumber!!.text = "95"
                elementSymbol!!.text = "Am"
                elementName!!.text = "Americium"
                englishName!!.text="Americium"
                latinName!!.text = "Americium"
                yearDiscovered!!.text = "1944"
                atomicWeight!!.text = "243.0614 g/mol"
                density!!.text = "13.67 g/cm^3"
            }
            element.equals("e96") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.curiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.curiumstruc)
                elementNumber!!.text = "96"
                atomicNumber!!.text = "96"
                elementSymbol!!.text = "Cm"
                elementName!!.text = "Curium"
                englishName!!.text="Curium"
                latinName!!.text = "Curium"
                yearDiscovered!!.text = "1944"
                atomicWeight!!.text = "247.0703 g/mol"
                density!!.text = "13.91 g/cm^3"
            }
            element.equals("e97") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.berkeliumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.berkeliumstruc)
                elementNumber!!.text = "97"
                atomicNumber!!.text = "97"
                elementSymbol!!.text = "Bk"
                elementName!!.text = "Berkelium"
                englishName!!.text="Berkelium"
                latinName!!.text = "Berkelium"
                yearDiscovered!!.text = "1949"
                atomicWeight!!.text = "247.0703 g/mol"
                density!!.text = "13.25 g/cm^3"
            }
            element.equals("e98") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.caleforniumstruc)
                elementNumber!!.text = "98"
                atomicNumber!!.text = "98"
                elementSymbol!!.text = "Cf"
                elementName!!.text = "Calefornium"
                englishName!!.text="Calefornium"
                latinName!!.text = "Calefornium"
                yearDiscovered!!.text = "1950"
                atomicWeight!!.text = "291.0796 g/mol"
                density!!.text = "15.1 g/cm^3"
            }
            element.equals("e99") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.einsteniumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.einsteiniumstruc)
                elementNumber!!.text = "99"
                atomicNumber!!.text = "99"
                elementSymbol!!.text = "Es"
                elementName!!.text = "Einsteinium"
                englishName!!.text="Einsteinium"
                latinName!!.text = "Einsteinium"
                yearDiscovered!!.text = "1952"
                atomicWeight!!.text = "252.0829 g/mol"
                density!!.text = "13.5 g/cm^3"
            }
            element.equals("e100") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.fermiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.fermiumstruc)
                elementNumber!!.text = "100"
                atomicNumber!!.text = "100"
                elementSymbol!!.text = "Fr"
                elementName!!.text = "Fermium"
                englishName!!.text="Fermium"
                latinName!!.text = "Fermium"
                yearDiscovered!!.text = "1952"
                atomicWeight!!.text = "257.0951 g/mol"
                density!!.text = "19.05 g/cm^3"
            }
            element.equals("e101") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.mendeleviumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.mendeleviumstruc)
                elementNumber!!.text = "101"
                atomicNumber!!.text = "101"
                elementSymbol!!.text = "Md"
                elementName!!.text = "Mendelevium"
                englishName!!.text="Mendelevium"
                latinName!!.text = "Medelevium"
                yearDiscovered!!.text = "1955"
                atomicWeight!!.text = "258.0951 g/mol"
                density!!.text = "null g/cm^3"
            }
            element.equals("e102") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.nobeliumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.nobeliumstruc)
                elementNumber!!.text = "102"
                atomicNumber!!.text = "102"
                elementSymbol!!.text = "No"
                elementName!!.text = "Nobelium"
                englishName!!.text="Nobelium"
                latinName!!.text = "Nobelium"
                yearDiscovered!!.text = "1965"
                atomicWeight!!.text = "259.1009 g/mol"
                density!!.text = "null g/cm^3"
            }
            element.equals("e103") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.lawrenciumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.lawrenciumstruc)
                elementNumber!!.text = "103"
                atomicNumber!!.text = "103"
                elementSymbol!!.text = "Lr"
                elementName!!.text = "Lawrencium"
                englishName!!.text="Lawrencium"
                latinName!!.text = "Lawrencium"
                yearDiscovered!!.text = "1961"
                atomicWeight!!.text = "266.1193 g/mol"
                density!!.text = "null g/cm^3"
            }
            element.equals("e104") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.rutherfordiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.rutherfordiumstruc)
                elementNumber!!.text = "104"
                atomicNumber!!.text = "104"
                elementSymbol!!.text = "Rf"
                elementName!!.text = "Rutherfordium"
                englishName!!.text="Rutherfordium"
                latinName!!.text = "Rutherfordium"
                yearDiscovered!!.text = "1964"
                atomicWeight!!.text = "261.1087 g/mol"
                density!!.text = "23 g/cm^3"
            }
            element.equals("e105") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.dubniumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.dubniumstruc)
                elementNumber!!.text = "105"
                atomicNumber!!.text = "105"
                elementSymbol!!.text = "Db"
                elementName!!.text = "Dubnium"
                englishName!!.text="Dubnium"
                latinName!!.text = "Dubnium"
                yearDiscovered!!.text = "1968"
                atomicWeight!!.text = "262.1138 g/mol"
                density!!.text = "29 g/cm^3"
            }
            element.equals("e106") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.seaborgiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.seaborgiumstruc)
                elementNumber!!.text = "106"
                atomicNumber!!.text = "106"
                elementSymbol!!.text = "Sg"
                elementName!!.text = "Seaborgium"
                englishName!!.text="Seaborgium"
                latinName!!.text = "Seaborgium"
                yearDiscovered!!.text = "1974"
                atomicWeight!!.text = "263.1182 g/mol"
                density!!.text = "35 g/cm^3"
            }
            element.equals("e107") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.bohriumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.bohriumstruc)
                elementNumber!!.text = "107"
                atomicNumber!!.text = "107"
                elementSymbol!!.text = "Bh"
                elementName!!.text = "Bohrium"
                englishName!!.text="Bohrium"
                latinName!!.text = "Bohrium"
                yearDiscovered!!.text = "1981"
                atomicWeight!!.text = "262.1229 g/mol"
                density!!.text = "37 g/cm^3"
            }
            element.equals("e108") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.hassiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.hassiumstruc)
                elementNumber!!.text = "108"
                atomicNumber!!.text = "108"
                elementSymbol!!.text = "Hs"
                elementName!!.text = "Hassium"
                englishName!!.text="Hassium"
                latinName!!.text = "Hassium"
                yearDiscovered!!.text = "1984"
                atomicWeight!!.text = "269 g/mol"
                density!!.text = "null g/cm^3"
            }
            element.equals("e109") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.meitneriumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.meitneriumstruc)
                elementNumber!!.text = "109"
                atomicNumber!!.text = "109"
                elementSymbol!!.text = "Mt"
                elementName!!.text = "Meitnerium"
                englishName!!.text="Meitnerium"
                latinName!!.text = "Meitnerium"
                yearDiscovered!!.text = "1982"
                atomicWeight!!.text = "278 g/mol"
                density!!.text = "37.4 g/cm^3"
            }
            element.equals("e110") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.darmsdatiumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.darmsdatiumstruc)
                elementNumber!!.text = "110"
                atomicNumber!!.text = "110"
                elementSymbol!!.text = "Ds"
                elementName!!.text = "Darmsdatium"
                englishName!!.text="Darmsdatium"
                latinName!!.text = "Darmsdatium"
                yearDiscovered!!.text = "1994"
                atomicWeight!!.text = "281.162 g/mol"
                density!!.text = "34.8 g/cm^3"
            }
            element.equals("e111") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.roentgeniumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.roentgeniumstruc)
                elementNumber!!.text = "111"
                atomicNumber!!.text = "111"
                elementSymbol!!.text = "Rg"
                elementName!!.text = "Roentgenium"
                englishName!!.text="Roentgenium"
                latinName!!.text = "Roentgenium"
                yearDiscovered!!.text = "1994"
                atomicWeight!!.text = "281.1684 g/mol"
                density!!.text = "null g/cm^3"
            }
            element.equals("e112") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.coperniciumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.coperniciumstruc)
                elementNumber!!.text = "112"
                atomicNumber!!.text = "112"
                elementSymbol!!.text = "Cn"
                elementName!!.text = "Copernicium"
                englishName!!.text="Copernicium"
                latinName!!.text = "Copernicium"
                yearDiscovered!!.text = "1996"
                atomicWeight!!.text = "285.1744 g/mol"
                density!!.text = "20 g/cm^3"
            }
            element.equals("e113") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.nihoniumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.nihoniumstruc)
                elementNumber!!.text = "113"
                atomicNumber!!.text = "113"
                elementSymbol!!.text = "Nh"
                elementName!!.text = "Nihonium"
                englishName!!.text="Nihonium"
                latinName!!.text = "Nihonium"
                yearDiscovered!!.text = "2004"
                atomicWeight!!.text = "286.181 g/mol"
                density!!.text = "16 g/cm^3"
            }
            element.equals("e114") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.fleroviumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.fleroviumstruc)
                elementNumber!!.text = "114"
                atomicNumber!!.text = "114"
                elementSymbol!!.text = "Fl"
                elementName!!.text = "Flerovium"
                englishName!!.text="Flerovium"
                latinName!!.text = "Flerovium"
                yearDiscovered!!.text = "1998"
                atomicWeight!!.text = "287.1904 g/mol"
                density!!.text = "14 g/cm^3"
            }
            element.equals("e115") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.moscoviumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.moscoviumstruc)
                elementNumber!!.text = "115"
                atomicNumber!!.text = "115"
                elementSymbol!!.text = "Mc"
                elementName!!.text = "Moscovium"
                englishName!!.text="Moscovium"
                latinName!!.text = "Moscovium"
                yearDiscovered!!.text = "2003"
                atomicWeight!!.text = "288.1943 g/mol"
                density!!.text = "13.5 g/cm^3"
            }
            element.equals("e116") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.livermoriumimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.livermoriumstruc)
                elementNumber!!.text = "116"
                atomicNumber!!.text = "116"
                elementSymbol!!.text = "Lv"
                elementName!!.text = "Livermorium"
                englishName!!.text="Livermorium"
                latinName!!.text = "Livermorium"
                yearDiscovered!!.text = "2000"
                atomicWeight!!.text = "291,2045 g/mol"
                density!!.text = "null g/cm^3"
            }
            element.equals("e117") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.tennesineimg)
                imgElementStruct!!.setBackgroundResource(R.drawable.tennesinestruc)
                elementNumber!!.text = "117"
                atomicNumber!!.text = "117"
                elementSymbol!!.text = "Ts"
                elementName!!.text = "Tennesine"
                englishName!!.text="Tennesine"
                latinName!!.text = "Tennesine"
                yearDiscovered!!.text = "2010"
                atomicWeight!!.text = "294.2104 g/mol"
                density!!.text = "null g/cm^3"
            }
            element.equals("e118") -> {

                imgElementImage!!.setBackgroundResource(R.drawable.ogganesson)
                imgElementStruct!!.setBackgroundResource(R.drawable.ogganessonstruc)
                elementNumber!!.text = "118"
                atomicNumber!!.text = "118"
                elementSymbol!!.text = "Og"
                elementName!!.text = "Oganesson"
                englishName!!.text="Oganesson"
                latinName!!.text = "Oganesson"
                yearDiscovered!!.text = "2005"
                atomicWeight!!.text = "294.2139 g/mol"
                density!!.text = "5 g/cm^3"
            }
        }
    }

}