package com.example.asus_pc.marketanalyserdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class StockPrices extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_prices);

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        data = findViewById(R.id.priceTV);

        final String[] Companies = {"ABIOMED, Inc."
                ,"Activision Blizzard, Inc"
                ,"Adobe Systems Incorporated"
                ,"Advanced Micro Devices, Inc."
                ,"AGNC Investment Corp."
                ,"Akamai Technologies, Inc."
                ,"Alexion Pharmaceuticals, Inc."
                ,"Align Technology, Inc."
                ,"Alkermes plc"
                ,"Alnylam Pharmaceuticals, Inc."
                ,"Alphabet Inc."
                ,"Altaba Inc."
                ,"Amazon.com, Inc."
                ,"Amdocs Limited"
                ,"Amerco"
                ,"America Movil, S.A.B. de C.V."
                ,"American Airlines Group, Inc."
                ,"Amgen Inc."
                ,"Analog Devices, Inc."
                ,"ANGI Homeservices Inc."
                ,"ANSYS, Inc."
                ,"Apple Inc."
                ,"Applied Materials, Inc."
                ,"Arch Capital Group Ltd."
                ,"Ares Capital Corporation"
                ,"ASML Holding N.V."
                ,"Aspen Technology, Inc."
                ,"athenahealth, Inc."
                ,"Atlassian Corporation Plc"
                ,"Autodesk, Inc."
                ,"Automatic Data Processing, Inc."
                ,"Baidu, Inc."
                ,"Bank of the Ozarks"
                ,"Biogen Inc."
                ,"BioMarin Pharmaceutical Inc."
                ,"Bio-Techne Corp"
                ,"Blackbaud, Inc."
                ,"Blue Buffalo Pet Products, Inc."
                ,"bluebird bio, Inc."
                ,"BOK Financial Corporation"
                ,"Booking Holdings Inc."
                ,"Brighthouse Financial, Inc."
                ,"Broadcom Inc."
                ,"C.H. Robinson Worldwide, Inc."
                ,"CA Inc."
                ,"Cadence Design Systems, Inc."
                ,"Caesars Entertainment Corporation"
                ,"Carlyle Group L.P. (The)"
                ,"Cavium, Inc."
                ,"Cboe Global Markets, Inc."
                ,"CDK Global, Inc."
                ,"CDW Corporation"
                ,"Celgene Corporation"
                ,"Cerner Corporation"
                ,"Charter Communications, Inc."
                ,"Check Point Software Technologies Ltd."
                ,"Cincinnati Financial Corporation"
                ,"Cintas Corporation"
                ,"Cisco Systems, Inc."
                ,"Citrix Systems, Inc."
                ,"CME Group Inc."
                ,"Cognex Corporation"
                ,"Cognizant Technology Solutions Corporation"
                ,"Columbia Sportswear Company"
                ,"Comcast Corporation"
                ,"Commerce Bancshares, Inc."
                ,"CommScope Holding Company, Inc."
                ,"Copart, Inc."
                ,"CoStar Group, Inc."
                ,"Costco Wholesale Corporation"
                ,"Credit Acceptance Corporation"
                ,"CSX Corporation"
                ,"Ctrip.com International, Ltd."
                ,"Cypress Semiconductor Corporation"
                ,"DENTSPLY SIRONA Inc."
                ,"DexCom, Inc."
                ,"Diamondback Energy, Inc."
                ,"Discovery, Inc."
                ,"Discovery, Inc."
                ,"Discovery, Inc."
                ,"DISH Network Corporation"
                ,"Dollar Tree, Inc."
                ,"Dropbox, Inc."
                ,"Dunkin' Brands Group, Inc."
                ,"E*TRADE Financial Corporation"
                ,"East West Bancorp, Inc."
                ,"eBay Inc."
                ,"EchoStar Corporation"
                ,"Elbit Systems Ltd."
                ,"Electronic Arts Inc."
                ,"Equinix, Inc."
                ,"Erie Indemnity Company"
                ,"Exelixis, Inc."
                ,"Expedia Group, Inc."
                ,"Expeditors International of Washington, Inc."
                ,"Express Scripts Holding Company"
                ,"F5 Networks, Inc."
                ,"Facebook, Inc."
                ,"Fastenal Company"
                ,"Fifth Third Bancorp"
                ,"First Solar, Inc."
                ,"Fiserv, Inc."
                ,"Flex Ltd."
                ,"FLIR Systems, Inc."
                ,"Fortinet, Inc."
                ,"Gaming and Leisure Properties, Inc."
                ,"Garmin Ltd."
                ,"GCI Liberty, Inc."
                ,"Gentex Corporation"
                ,"Gilead Sciences, Inc."
                ,"Goodyear Tire & Rubber Company (The)"
                ,"Grand Canyon Education, Inc."
                ,"Hasbro, Inc."
                ,"HD Supply Holdings, Inc."
                ,"Henry Schein, Inc."
                ,"Hologic, Inc."
                ,"Huntington Bancshares Incorporated"
                ,"Huntington Bancshares Incorporated"
                ,"IAC/InterActiveCorp"
                ,"Icahn Enterprises L.P."
                ,"ICON plc"
                ,"ICU Medical, Inc."
                ,"IDEXX Laboratories, Inc."
                ,"IHS Markit Ltd."
                ,"Illumina, Inc."
                ,"Incyte Corporation"
                ,"Intel Corporation"
                ,"Interactive Brokers Group, Inc."
                ,"Intuit Inc."
                ,"Intuitive Surgical, Inc."
                ,"Ionis Pharmaceuticals, Inc."
                ,"IPG Photonics Corporation"
                ,"J.B. Hunt Transport Services, Inc."
                ,"Jack Henry & Associates, Inc."
                ,"Jazz Pharmaceuticals plc"
                ,"JD.com, Inc."
                ,"JetBlue Airways Corporation"
                ,"KLA-Tencor Corporation"
                ,"Kraft Heinz Company (The)"
                ,"Lam Research Corporation"
                ,"Lamar Advertising Company"
                ,"Lincoln Electric Holdings, Inc."
                ,"Littelfuse, Inc."
                ,"LKQ Corporation"
                ,"Logitech International S.A."
                ,"LogMein, Inc."
                ,"LPL Financial Holdings Inc."
                ,"lululemon athletica inc."
                ,"Madison Square Garden Company (The)"
                ,"MarketAxess Holdings, Inc."
                ,"Marriott International"
                ,"Marvell Technology Group Ltd."
                ,"Match Group, Inc."
                ,"Maxim Integrated Products, Inc."
                ,"MercadoLibre, Inc."
                ,"Methanex Corporation"
                ,"Microchip Technology Incorporated"
                ,"Micron Technology, Inc."
                ,"Microsemi Corporation"
                ,"Microsoft Corporation"
                ,"Middleby Corporation (The)"
                ,"MKS Instruments, Inc."
                ,"Momo Inc."
                ,"Mondelez International, Inc."
                ,"Monster Beverage Corporation"
                ,"Mylan N.V."
                ,"Nasdaq, Inc."
                ,"National Instruments Corporation"
                ,"Nektar Therapeutics"
                ,"NetApp, Inc."
                ,"NetEase, Inc."
                ,"Netflix, Inc."
                ,"Neurocrine Biosciences, Inc."
                ,"News Corporation"
                ,"News Corporation"
                ,"Nordson Corporation"
                ,"Northern Trust Corporation"
                ,"Norwegian Cruise Line Holdings Ltd."
                ,"Nutanix, Inc."
                ,"NVIDIA Corporation"
                ,"NXP Semiconductors N.V."
                ,"Old Dominion Freight Line, Inc."
                ,"ON Semiconductor Corporation"
                ,"Open Text Corporation"
                ,"O'Reilly Automotive, Inc."
                ,"PACCAR Inc."
                ,"PacWest Bancorp"
                ,"Paychex, Inc."
                ,"PayPal Holdings, Inc."
                ,"People's United Financial, Inc."
                ,"Pepsico, Inc."
                ,"Pilgrim's Pride Corporation"
                ,"Pinnacle Financial Partners, Inc."
                ,"Pool Corporation"
                ,"PowerShares QQQ Trust, Series 1"
                ,"PRA Health Sciences, Inc."
                ,"Principal Financial Group Inc"
                ,"Proofpoint, Inc."
                ,"PTC Inc."
                ,"Qiagen N.V."
                ,"Qorvo, Inc."
                ,"QUALCOMM Incorporated"
                ,"Regeneron Pharmaceuticals, Inc."
                ,"Ross Stores, Inc."
                ,"Royal Gold, Inc."
                ,"Ryanair Holdings plc"
                ,"Sabre Corporation"
                ,"Sage Therapeutics, Inc."
                ,"SBA Communications Corporation"
                ,"Seagate Technology PLC"
                ,"Seattle Genetics, Inc."
                ,"SEI Investments Company"
                ,"Shire plc"
                ,"Signature Bank"
                ,"Sina Corporation"
                ,"Sirius XM Holdings Inc."
                ,"Skyworks Solutions, Inc."
                ,"Splunk Inc."
                ,"SS&C Technologies Holdings, Inc."
                ,"Starbucks Corporation"
                ,"Steel Dynamics, Inc."
                ,"Stericycle, Inc."
                ,"SVB Financial Group"
                ,"Symantec Corporation"
                ,"Synopsys, Inc."
                ,"T. Rowe Price Group, Inc."
                ,"Take-Two Interactive Software, Inc."
                ,"TD Ameritrade Holding Corporation"
                ,"Tesla, Inc. "
                ,"Texas Instruments Incorporated"
                ,"T-Mobile US, Inc."
                ,"Tractor Supply Company"
                ,"Trimble Inc."
                ,"TripAdvisor, Inc."
                ,"Twenty-First Century Fox, Inc."
                ,"Ubiquiti Networks, Inc."
                ,"Ulta Beauty, Inc."
                ,"Ultimate Software Group, Inc. (The)"
                ,"VeriSign, Inc."
                ,"Verisk Analytics, Inc."
                ,"Vertex Pharmaceuticals Incorporated"
                ,"Viacom Inc."
                ,"Virtu Financial, Inc."
                ,"Vodafone Group Plc"
                ,"Walgreens Boots Alliance, Inc."
                ,"Weibo Corporation"
                ,"Western Digital Corporation"
                ,"Willis Towers Watson Public Limited Company"
                ,"Workday, Inc."
                ,"Wynn Resorts, Limited"
                ,"Xcel Energy Inc."
                ,"Xilinx, Inc."
                ,"Yandex N.V."
                ,"Zebra Technologies Corporation"
                ,"Zillow Group, Inc."
                ,"Zions Bancorporation"
        };

        final String[] Codes = {"ABMD",
                "ATVI",
                "ADBE",
                "AMD",
                "AGNC",
                "AKAM",
                "ALXN",
                "ALGN",
                "ALKS",
                "ALNY",
                "GOOG",
                "AABA",
                "AMZN",
                "DOX",
                "UHAL",
                "AMOV",
                "AAL",
                "AMGN",
                "ADI",
                "ANGI",
                "ANSS",
                "AAPL",
                "AMAT",
                "ACGL",
                "ARCC",
                "ASML",
                "AZPN",
                "ATHN",
                "TEAM",
                "ADSK",
                "ADP",
                "BIDU",
                "OZRK",
                "BIIB",
                "BMRN",
                "TECH",
                "BLKB",
                "BUFF",
                "BLUE",
                "BOKF",
                "BKNG",
                "BHF",
                "AVGO",
                "CHRW",
                "CA",
                "CDNS",
                "CZR",
                "CG",
                "CAVM",
                "CBOE",
                "CDK",
                "CDW",
                "CELG",
                "CERN",
                "CHTR",
                "CHKP",
                "CINF",
                "CTAS",
                "CSCO",
                "CTXS",
                "CME",
                "CGNX",
                "CTSH",
                "COLM",
                "CMCSA",
                "CBSH",
                "COMM",
                "CPRT",
                "CSGP",
                "COST",
                "CACC",
                "CSX",
                "CTRP",
                "CY",
                "XRAY",
                "DXCM",
                "FANG",
                "DISCB",
                "DISCA",
                "DISCK",
                "DISH",
                "DLTR",
                "DBX",
                "DNKN",
                "ETFC",
                "EWBC",
                "EBAY",
                "SATS",
                "ESLT",
                "EA",
                "EQIX",
                "ERIE",
                "EXEL",
                "EXPE",
                "EXPD",
                "ESRX",
                "FFIV",
                "FB",
                "FAST",
                "FITB",
                "FSLR",
                "FISV",
                "FLEX",
                "FLIR",
                "FTNT",
                "GLPI",
                "GRMN",
                "GLIBA",
                "GNTX",
                "GILD",
                "GT",
                "LOPE",
                "HAS",
                "HDS",
                "HSIC",
                "HOLX",
                "HBANO",
                "HBAN",
                "IAC",
                "IEP",
                "ICLR",
                "ICUI",
                "IDXX",
                "INFO",
                "ILMN",
                "INCY",
                "INTC",
                "IBKR",
                "INTU",
                "ISRG",
                "IONS",
                "IPGP",
                "JBHT",
                "JKHY",
                "JAZZ",
                "JD",
                "JBLU",
                "KLAC",
                "KHC",
                "LRCX",
                "LAMR",
                "LECO",
                "LFUS",
                "LKQ",
                "LOGI",
                "LOGM",
                "LPLA",
                "LULU",
                "MSG",
                "MKTX",
                "MAR",
                "MRVL",
                "MTCH",
                "MXIM",
                "MELI",
                "MEOH",
                "MCHP",
                "MU",
                "MSCC",
                "MSFT",
                "MIDD",
                "MKSI",
                "MOMO",
                "MDLZ",
                "MNST",
                "MYL",
                "NDAQ",
                "NATI",
                "NKTR",
                "NTAP",
                "NTES",
                "NFLX",
                "NBIX",
                "NWS",
                "NWSA",
                "NDSN",
                "NTRS",
                "NCLH",
                "NTNX",
                "NVDA",
                "NXPI",
                "ODFL",
                "ON",
                "OTEX",
                "ORLY",
                "PCAR",
                "PACW",
                "PAYX",
                "PYPL",
                "PBCT",
                "PEP",
                "PPC",
                "PNFP",
                "POOL",
                "QQQ",
                "PRAH",
                "PFG",
                "PFPT",
                "PTC",
                "QGEN",
                "QRVO",
                "QCOM",
                "REGN",
                "ROST",
                "RGLD",
                "RYAAY",
                "SABR",
                "SAGE",
                "SBAC",
                "STX",
                "SGEN",
                "SEIC",
                "SHPG",
                "SBNY",
                "SINA",
                "SIRI",
                "SWKS",
                "SPLK",
                "SSNC",
                "SBUX",
                "STLD",
                "SRCL",
                "SIVB",
                "SYMC",
                "SNPS",
                "TROW",
                "TTWO",
                "AMTD",
                "TSLA",
                "TXN",
                "TMUS",
                "TSCO",
                "TRMB",
                "TRIP",
                "FOX",
                "UBNT",
                "ULTA",
                "ULTI",
                "VRSN",
                "VRSK",
                "VRTX",
                "VIA",
                "VIRT",
                "VOD",
                "WBA",
                "WB",
                "WDC",
                "WLTW",
                "WDAY",
                "WYNN",
                "XEL",
                "XLNX",
                "YNDX",
                "ZBRA",
                "ZG",
                "ZION"
        };

        ArrayAdapter<String> AD = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Companies);
        AD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(AD);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                Toast.makeText(getApplicationContext(), Companies[position], Toast.LENGTH_LONG).show();
                FetchPrices Foo = new FetchPrices();
                Foo.execute("https://cloud.iexapis.com/beta/stock/"+ Codes[position] + "/quote?token=pk_48dee474cbcc4ead83337b76471a1175");
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });

    }
}
