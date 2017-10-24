package gitam.ceoconclave;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import it.sephiroth.android.library.imagezoom.ImageViewTouchBase;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
static String agendaloc;
    static String[] names ={
            "Sarit Kumar",
            "Asif Iqbal",
            "Krishna Kumar, IAS",
            "Sanjay Sahay, IPS",
            "Souad Tenfiche",
            "Chuck Menahem Kanafi",
            "Niket Gupta",
            "Hendrikus Van Dord",
            "Sanjay Vijayakumar",
            "Suhas Gopinath"




    };
    static int[] photos ={

            R.drawable.sarit,R.drawable.asif_iqbal,R.drawable.s_krishna_kumar,R.drawable.sanjay,R.drawable.souad,R.drawable.chuck,
            R.drawable.nopic, R.drawable.vandok,R.drawable.sanjayvij,R.drawable.suhas


    };

    static String[] details={

            "Presently Dr Sarit Kumar, is in the board of management in IIM-B and consultant of MOOCS Initiative in IIM-B and also he holds the position of BOS,BOE in Bangalore University and VTU. He also holds the position of DEAN BSMS, GITAM University\n" +
                    "\n" +
                    "Corporate Experience \n" +
                    "15 years strategy and operations consulting experience with Big 4 Corporate Experience across multiple  industry sectors, business issues and organization types • Extensive experience in entry strategy, business  transformation, business performance tracking • Experience in business transformation, entry strategy, M&A advice and enterprise performance management  Worked on extensive process improvement / cost reduction exercise with external consultants - co-ordinated  efforts for advertising sales function \n" +
                    "  Designed and implemented sales planning, forecasting and review process across 11 branches - conducted training for entire advertising sales team across country.\n\n" +
                    "Teaching Experience   \n" +
                    " 10 Years In various University across the globe as a Adjunct Faculty and soft skill trainer Undertaking many specialized course like : \uF0A7 Profile Matching, Body Clock \uF0A7 Accent Control and Communication Skill \uF0A7 Social Psychology \uF0A7 Competence, Capability and Competitive Strategy \uF0A7 Laboratory in Entrepreneurial Motivation \uF0A7 Product Management, consumer Behavior, Sales and Distribution \uF0A7 Independent project for developing sales strategy for an organisation \uF0A7  Running courses like Marketing management and Corporate Strategic Management. \uF0A7 Production and operation management with back office system \uF0A7 Project Management and Business Portfolio Analysis \uF0A7 Security and Portfolio Management. ",

            ///////////////////////////////////////////////////////////////////

            "Asif Iqbal is the President of the Indian Economic Trade Organisation (IETO) an enterprise that serves in 39 countries of the world and links Indian Diplomacy. He is also the Executive President of the LACFI ( Latin American Caribbean Federation of India) . He has led LACFI's growth from its initial start-up until today. He has extensive transaction and operating experience including the completion of transactions worldwide. Asif helped develop the strategy of a \"Global infrastructure Company\" India Infrastructure Public Limited in Hong Kong and, pursuant to this strategy, originated a number of first-of-a-kind transactions that are now major areas of economic activity. He executed significant acquisitions of some of the largest utilities.\n" +
                    "\n" +
                    "Asif held several management positions and led various First in history - Indian business delegations to countries like Morocco, Pacific Islands, South East Europe and was also awarded the highest civilian honour of Bosnia & Herzegovina for his outstanding contribution to the Relations between those countries. Asif has been a director of both listed and private companies as well as member of a number of industry, academic and non-profit boards.\n" +
                    "\n" +
                    "As the President of the Defense Technology Infrastructure Society he has conceived the first Defence Corridor connecting 4 states of Karnataka-APKerala-Tamilnadu and he is also the Executive Director of the Asian Arab Chamber of Commerce. He has extensive transaction and operating experience including the completion of transactions with a value totalling over US $300 million worldwide. Asif is an architect by profession having finished from BMS Engineering college and had several management positions with Martins group in France, UNDP.\n" +
                    "\n" +
                    "Asif Iqbal served as the Honorary Consul of the Republic of Suriname has extensively laid foundation for relationships between two countries especially with Bangalore when HAL sent its Chetak Helicopters to Suriname. He has been Responsible for maintaining pro bono relationships with various International Government representatives and India for the growth of Trade and Commerce.\n",


            /////////////////////////////////////////////////////

        "3 times Member of Parliament from Kerala.\n" +
                "\n" +
                "Union Minister for 9 years with Prime Ministers – Sri Rajiv Gandhi and Sri P.V. Narasimha Rao(1984-1989).\n" +
                "\n" +
                "handling Ministries of  Health and Family Welfare, Textiles, Information and Broadcasting,\n" +
                "\n" +
                "Petroleum and Natural Gas, Defence, Non Conventional Energy and Agriculture.( 1991-1996)\n" +
                "\n" +
                "Joins the Indian Administrative Service(1963)\n" +
                "IAS – 17 years – District Collector (Ernakulam), Chairman, Greater Cochin Development Authority, Civil Supplies Commissioner, Industries Commissioner, Principal Secretary (Industries, Local Administration, Urban Development, Fisheries & Social welfare) Govt. of Kerala. (1963-1980)\n" +
                "\n" +
                "Chairman, Hindustan Latex (Central PSU), Govt. of India.( 1981-1983)\n" +
                "\n" +
                "Legendary District Collector of Ernakulam who conducted Mass Family Planning Campaigns in Kerala 1970-73 winning international recognition, credited with reversing the state’s population growth momentum and making Kerala first State to achieve zero growth rate. Noted for implementing land reforms in Kerala, author of the ‘Greater Cochin Development Master Plan’ implementing major urban development schemes earning public approbation as ‘the builder of modern Cochin’. Emancipation of Kerala fishermen through fisheries village societies. Architect of Kerala’s ‘Ten Thousand Industries’ campaign. Famed Chairman of Hindustan Latex, turning around the permanently losing PSU  and transforming it into the leading condom and medical accessories manufacturer in Asia. Rajiv Gandhi’s Minister for universalizing Television in India. Champion of indigenization of Defence Production. Building up the Ministry of New and Renewable Energy Sources with massive thrusts in Wind, Small Hydro and Solar Energy. Widely recognized as a Developmental Leader.\n" +
                "\n" +
                "FICCI (1973) (Presented by Smt. Indira Gandhi) || Swami Vivekananda Centenary Award - 2013 || International Rotary’s highest civilian award ‘For The Sake of Honour’ 1979 || 1995 ‘Energy Man of the Year’ National Award || ‘NAYE’ National Award for contribution to MSMES || ‘Thanks Medal’ by Bharat Scouts and Guides || Pazhassi Raja Award 2007 (Presented by Vice President of India), K.R. Narayanan Award 2007, R Sankar Birth Centenary Award 2009, MKK Nair Award 2009 for productivity in Public Administration, CM Stephen Award 2010 for public leadership.\n",


    ///////////////////////////////




"He belongs to the 1989 batch of the IPS, borne on Karnataka cadre. Accomplished high degree of professionalism in wide and varied professional assignments and finally got groomed and refined into an officer who has 360 degrees experience of all policing tasks, simultaneously maintaining keen interest in all staff functions and a passion for usage of appropriate technology in policing at all levels and in all fields.\n\n Important assignments providing immense value addition to his professional persona includes,\n" +
        "Chiefs of Police of three districts Raichur, Mandya and Chamrajnagar\n" +
        "SP and DIG in the State CID\n" +
        "DIG in charge of Finance\n" +
        "UN Peacekeeping in Kosovo and Sudan\n" +
        "Additional Commissioner in Bangalore City\n" +
        "Head of Police Computerization\n" +
        "Communications and State Crime Records Bureau\n" +
        "\nHe created an Enterprise Resource Planning (ERP) software, the Police IT, for Karnataka State Police and headed the CCTNS project since its inception in 2008 till nearly the end of Bid Process for the selection of System Integrator (SI) in Sept 2011 besides single handedly creating all professional documentation pertaining to the project. He has gained immense expertise in a broad band of technologies like TETRA, Geospatial Technology, ERP, Interception etc and is regularly invited to deliver lectures at national and international forums on these topics. His presentation was read out at the TETRA World Congress, Dubai, 2012. He has been writing articles for a large number of magazines, mostly professional ones. As IGP, Eastern Range, located at Davangere, from Sept 2011- June 2013, handled a lot of critical issues in Bellary and situation in Shimoga also needed regular and meticulous professional attention. The Public Order in the whole range, covering Davangere, Chitradurga, Shimoga and Bellary, is completely within control now through wide a wide range of very effective initiatives – policing, disciplinary, technology, innovative etc. From July 2013 – Dec 2013 as IGP , Internal Security Division, Karnataka – handled a counter terrorism assignment with basic criticals of counter intelligence, coastal security, training/deployment of commandos, coastal security and anti-naxalite operations.From January 2014 -December 2014 as a ADGP, Police Computer Wing working with assignment deals with a comprehensive computerization of the Karnataka State Police, stabilization of functioning of Police ERP software and its enhancement, running the MHA sponsored CCTNS project, up gradation and maintenance of statewide broadband networking KSPWAN and Data Center, creation of a Disaster Recovery Center and increasing the usage of Police IT functionalities to the last task and last user.Presently from Jan -2015 working as a ADGP in Grievances and Human Rights Wing This Profile is slightly unconventional, to suit the broadbased Website visitors and is broadly divided into Important Assignments, Core Competencies, Core Technology Areas, Major Documents Created, Recent Lectures Delivered, Training, Recognition and Papers both published and unpublished.\n",


            ////////////////////////
"Engineer\n" +
        "novembre 2003 - juin 2005 (1 an 8 mois)\n" +
        "MFFF Project_ DCS consortium_ Denver Design Office\n" +

        "-Electrical equipment selection (motors, actuators, sensors…)\n" +
        "-Design according to USA nuclear policies, involving high security issues (NRC Regulations, NEC, IEEE,\n" +
        " UL)\n" +
        "-Responsible for designers training to CAD software SEE Electrical\n" +
        "\n" +
        "Engineer at Duke Cogema Stone & Webster\n" +
        "juillet 2005 - août 2007 (2 ans 2 mois)\n" +
        "MDG - Manufacturing Design Group of MFFF (Mox Fuel Fabrication Facilities) project.\n" +
        "In a French/American working culture, responsible for the design and engineering of different MFFF (Mox\n" +
        " Fuel Fabrication Facilities) process units.\n" +
        "\n" +
        "Lead Engineer\n" +
        "septembre 2007 - janvier 2010 (2 ans 5 mois)\n" +
        "FA3 French EPR plant _ I&C department\n" +
        "-In charge of the engineering team designing AREVA fluid systems functional test campaigns.\n" +
        "International Offer Coordinator at AREVA NP(January 2010 – April 2012)\n" +
        "\n" +
        "Business Head(Feb 2014 – September 2015)\n" +
        "\n" +
        "Director of Acceleration Program at NUMA Bengaluru(october 2015 - décember 2016)\n" +
        "\n" +
        "Chief Executive Officer at NUMA Bengaluru(january 2017 – Present)\n",



            //////////////////////

            "Retired ambassador, storyteller and consultant.\n" +
                    " \n" +
                    "Chuck emigrated at the age of 18 from New York to Tel Aviv, studied Law at the Hebrew University of Jerusalem, and practiced law in the Israel Defence Forces for five years, specializing in civil law advice and high value negotiations. After his demobilization, Chuck began a career of almost 25 years in the Israeli Foreign Service, culminating with his appointments as Ambassador to Eritrea and Ghana, and Consul General of Israel to South India.\n" +
                    " \n" +
                    "Since leaving the Foreign Service, Chuck has been sharing his unique knowledge of Israeli and Indian commonalities and synergises his extensive international network and experience into superior business outcomes. He guides leaders and business people through the intricacies of cross-cultural interactions, and acting as a value multiplier for all parties.\n",
/////////////////////////////////////////////////////////////


            "Niket Gupta completed his Masters of Science in Software Engineering from Birla Institute of Technology and Science. He is currently the Talent Acquisition Head in Huawei Technologies, Bengaluru. He has worked in many challenging roles in different companies. He was an Assistant Manager (Talent Acquisition) in Tech Mahindra from Oct 2006 - May 2011. He worked as an Associate Manager- Talent Acquisition in HCL Technologies for one year. He moved on to Infosys Technologies as a Lead Talent Acquisition where he worked for 10months. Then he served as Talent Acquisition Business Partner in HP for 4.5 years. He also won the BPI Annual award for Hiring during his tenure in HP",


            ////////////////////////////

            "Hendrikus van dord is a retired officer from the Ministry of Interior, Govt of Netherlands.  He served in the Intelligence wing of the Ministry and was responsible for very high profile operations conducted by the Intelligence wing of the country. He headed successful operations in countries of Africa, Latin America and as far as Pacific Islands.\n" +
                    "\n" +
                    "He comes from a family of distinguished Army men with his elder brother heading the Royal navy in Netherlands.  He currently is the Ambassador for Internations, an organisation having 229 offices all over the globe and that brings expatriates together in every country.  He conducts regular sessions of bringing together expatriates and help them in meeting their local needs. In india, He also serves on the board of Indian Economic trade Organisation as the Vice President of the Diplomatic Advisory Committee.\n" +
                    "He has taken delegations in the last one year to UK, Singapore, Netherlands.\n" +
                    "\n" +
                    "He is an expert speaker at major international platforms sharing his experiences on the current trends in intelligence gathering and safety standards for corporates.\n" +
                    "\n" +
                    "He is also the India head for certifying students going abroad on the course of \"FOREIGN ORIENTATION PROGRAM\" FOP standards that require employees/students to take certification to serve in foreign countries. This course helps them to understand the cultural aspects and business relationships that are needed to successfully become as entrepreneurs.",
            //////////////////////////////////////////////

            "Starting an entrepreneurial journey at the age of 22 while in 3rd year of engineering, Sanjay lead and created a team of engineering graduates who were passionate about technology to build up MobME Wireless, one of India’s most exciting and innovative telecom companies. MobME quickly raised angel funding from investors based out of India, Middle East and Silicon Valley.\n" +
                    "\n" +
                    "He is also Chairman of the Board for Startup Village, India’s first Technology Incubator in PPP mode promoted jointly by MobME along with Dept. of Science and Technology, Govt. of India. Government of India nominated Sanjay to the board of Indo-US Science and Technology Forum established by Govt. of India and United states to strengthen bilateral relationships in technology.\n" +
                    "\n" +
                    "Sanjay is also a Rajeev Motwani Fellow instituted in the memory of late Stanford Professor Rajeev Motwani, mentor to Google Founders, Larry Page and Sergey Brin, A Scholar of Aspen Institute, Colorado, he was selected by World Economic Forum as a Global Shaper for making significant contribution to the community. Asia Society also selected Sanjay amongst the Asia’s 21 young leaders under 40.\n" +
                    "\n" +
                    "A graduate of Industrial Engineering from College of Engineering, Trivandrum, Sanjay is a passionate basketball player, Sanjay has lead the college team to various tournaments and played state level Basketball in Kerala before being bit by the entrepreneur bug. He now dreams of the day when the sun sets at dusk in the valley, it would rise to see the Dawn of a Silicon Coast in India.",



            //////////////////////

            "Suhas Gopinath, hailing from a middle class family, where his father was a defense scientist, founded Globals at the age of 14 years from a cyber café in Bangalore in the year 2000. He was soon recognized as the World’s Youngest CEO by various media such as BBC, Limca Book of Records, CBS, Times of India, Straits, The Age, etc. Under his leadership, Globals expanded into non-English speaking markets, and later started to focus on Emerging Markets such as India, Africa and Middle-East. Being a programmer himself was highly passionate about innovation and technology, and co-created educube™ (formerly known as educationERP.net).\n" +
                    "\n" +
                    "Suhas currently serves on various boards such as ICT Advisory Board of the World Bank Group, Ministry of Science & Technology, Govt. of India, Social Peace Foundation, IIT Bombay Entrepreneurship Cell, and more. Suhas is recipient of numerous awards including Karnataka State’s Rajyotsava Award, Incredible Europe Award (Austria), Social Innovator Prize (Singapore), and more. Suhas is also the Young Global Leader of the World Economic Forum and holds a Diploma from the Harvard Kennedy School, Harvard University."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        agendaloc="android.resource://" + getPackageName() +"/"+R.drawable.agenda;

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
fab.setVisibility(View.GONE);
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/
/*

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
*/

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_speakers, container, false);

            /*TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));


            */

            switch (getArguments().getInt(ARG_SECTION_NUMBER))
            {
                case 1:
                    rootView = inflater.inflate(R.layout.fragment_speakers, container, false);
                    ListView lv=(ListView) rootView.findViewById(R.id.android_mylist);
                    lv.setAdapter(new CustomAdapter(getActivity(),names,photos,details));


                    break;
                case 2:
                    rootView = inflater.inflate(R.layout.fragment_agenda, container, false);

                    ImageButton agenda=(ImageButton) rootView.findViewById(R.id.imageViewAgenda);
                    agenda.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
Intent s=new Intent(getContext(),AgendaFullView.class);
                            startActivity(s);
                        }
                    });
                  /*  agenda.setDisplayType(ImageViewTouchBase.DisplayType.FIT_IF_BIGGER);


                    agenda.setSingleTapListener(
                            new ImageViewTouch.OnImageViewTouchSingleTapListener() {

                                @Override
                                public void onSingleTapConfirmed() {

                                }
                            }
                    );

                    agenda.setDoubleTapListener(
                            new ImageViewTouch.OnImageViewTouchDoubleTapListener() {

                                @Override
                                public void onDoubleTap() {

                                }
                            }
                    );

                    agenda.setOnDrawableChangedListener(
                            new ImageViewTouchBase.OnDrawableChangeListener() {

                                @Override
                                public void onDrawableChanged(Drawable drawable) {

                                }
                            }
                    );
*/

//agenda.setImageDrawable(getResources().getDrawable(R.drawable.agenda));
                  //  agenda.setImageBitmap(R.drawable.agenda, null, -1, -1);

                    break;
                case 3:
                    rootView = inflater.inflate(R.layout.fragment_contact_us, container, false);

                    break;



            }
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SPEAKERS";
                case 1:
                    return "AGENDA";
                case 2:
                    return "CONTACT US";
            }
            return null;
        }
    }
}
