package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class ext  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm const656;

  protected static IStrategoTerm constSVar1;

  protected static IStrategoTerm const655;

  protected static IStrategoTerm const654;

  protected static IStrategoTerm constempty_grammar0;

  protected static IStrategoTerm constSort53;

  protected static IStrategoTerm constCons54;

  protected static IStrategoTerm constSortNoArgs318;

  protected static IStrategoTerm const653;

  protected static IStrategoTerm constSort52;

  protected static IStrategoTerm constCons53;

  protected static IStrategoTerm constSortNoArgs317;

  protected static IStrategoTerm const652;

  protected static IStrategoTerm constSortNoArgs316;

  protected static IStrategoTerm const651;

  protected static IStrategoTerm constSortNoArgs315;

  protected static IStrategoTerm const650;

  protected static IStrategoTerm const649;

  protected static IStrategoTerm constSortNoArgs314;

  protected static IStrategoTerm const648;

  protected static IStrategoTerm const647;

  protected static IStrategoTerm const646;

  protected static IStrategoTerm const645;

  protected static IStrategoTerm const644;

  protected static IStrategoTerm const643;

  protected static IStrategoTerm const642;

  protected static IStrategoTerm constSort51;

  protected static IStrategoTerm constCons52;

  protected static IStrategoTerm const641;

  protected static IStrategoTerm const640;

  protected static IStrategoTerm const639;

  protected static IStrategoTerm const638;

  protected static IStrategoTerm const637;

  protected static IStrategoTerm const636;

  protected static IStrategoTerm const635;

  protected static IStrategoTerm const634;

  protected static IStrategoTerm const633;

  protected static IStrategoTerm const632;

  protected static IStrategoTerm const631;

  protected static IStrategoTerm const630;

  protected static IStrategoTerm const629;

  protected static IStrategoTerm const628;

  protected static IStrategoTerm const627;

  protected static IStrategoTerm const626;

  protected static IStrategoTerm const625;

  protected static IStrategoTerm const624;

  protected static IStrategoTerm const623;

  protected static IStrategoTerm const622;

  protected static IStrategoTerm const621;

  protected static IStrategoTerm const620;

  protected static IStrategoTerm const619;

  protected static IStrategoTerm const618;

  protected static IStrategoTerm const617;

  protected static IStrategoTerm constSort50;

  protected static IStrategoTerm constCons51;

  protected static IStrategoTerm const616;

  protected static IStrategoTerm const615;

  protected static IStrategoTerm const614;

  protected static IStrategoTerm const613;

  protected static IStrategoTerm constSort49;

  protected static IStrategoTerm constCons50;

  protected static IStrategoTerm const612;

  protected static IStrategoTerm const611;

  protected static IStrategoTerm const610;

  protected static IStrategoTerm const609;

  protected static IStrategoTerm const608;

  protected static IStrategoTerm const607;

  protected static IStrategoTerm const606;

  protected static IStrategoTerm const605;

  protected static IStrategoTerm const604;

  protected static IStrategoTerm const603;

  protected static IStrategoTerm const602;

  protected static IStrategoTerm constSort48;

  protected static IStrategoTerm constCons49;

  protected static IStrategoTerm const601;

  protected static IStrategoTerm const600;

  protected static IStrategoTerm const599;

  protected static IStrategoTerm const598;

  protected static IStrategoTerm const597;

  protected static IStrategoTerm const596;

  protected static IStrategoTerm constSort47;

  protected static IStrategoTerm constCons48;

  protected static IStrategoTerm const595;

  protected static IStrategoTerm const594;

  protected static IStrategoTerm const593;

  protected static IStrategoTerm const592;

  protected static IStrategoTerm const591;

  protected static IStrategoTerm const590;

  protected static IStrategoTerm const589;

  protected static IStrategoTerm const588;

  protected static IStrategoTerm const587;

  protected static IStrategoTerm const586;

  protected static IStrategoTerm const585;

  protected static IStrategoTerm const584;

  protected static IStrategoTerm const583;

  protected static IStrategoTerm const582;

  protected static IStrategoTerm const581;

  protected static IStrategoTerm const580;

  protected static IStrategoTerm const579;

  protected static IStrategoTerm const578;

  protected static IStrategoTerm const577;

  protected static IStrategoTerm const576;

  protected static IStrategoTerm const575;

  protected static IStrategoTerm const574;

  protected static IStrategoTerm const573;

  protected static IStrategoTerm const572;

  protected static IStrategoTerm const571;

  protected static IStrategoTerm const570;

  protected static IStrategoTerm const569;

  protected static IStrategoTerm const568;

  protected static IStrategoTerm const567;

  protected static IStrategoTerm const566;

  protected static IStrategoTerm const565;

  protected static IStrategoTerm const564;

  protected static IStrategoTerm const563;

  protected static IStrategoTerm const562;

  protected static IStrategoTerm const561;

  protected static IStrategoTerm const560;

  protected static IStrategoTerm const559;

  protected static IStrategoTerm constSort46;

  protected static IStrategoTerm constCons47;

  protected static IStrategoTerm const558;

  protected static IStrategoTerm constSort45;

  protected static IStrategoTerm constCons46;

  protected static IStrategoTerm const557;

  protected static IStrategoTerm const556;

  protected static IStrategoTerm const555;

  protected static IStrategoTerm const554;

  protected static IStrategoTerm const553;

  protected static IStrategoTerm const552;

  protected static IStrategoTerm const551;

  protected static IStrategoTerm constSort44;

  protected static IStrategoTerm constCons45;

  protected static IStrategoTerm const550;

  protected static IStrategoTerm const549;

  protected static IStrategoTerm const548;

  protected static IStrategoTerm const547;

  protected static IStrategoTerm const546;

  protected static IStrategoTerm const545;

  protected static IStrategoTerm constSort43;

  protected static IStrategoTerm constCons44;

  protected static IStrategoTerm const544;

  protected static IStrategoTerm const543;

  protected static IStrategoTerm const542;

  protected static IStrategoTerm const541;

  protected static IStrategoTerm const540;

  protected static IStrategoTerm const539;

  protected static IStrategoTerm const538;

  protected static IStrategoTerm const537;

  protected static IStrategoTerm const536;

  protected static IStrategoTerm const535;

  protected static IStrategoTerm const534;

  protected static IStrategoTerm const533;

  protected static IStrategoTerm const532;

  protected static IStrategoTerm const531;

  protected static IStrategoTerm const530;

  protected static IStrategoTerm constSort42;

  protected static IStrategoTerm constCons43;

  protected static IStrategoTerm const529;

  protected static IStrategoTerm const528;

  protected static IStrategoTerm const527;

  protected static IStrategoTerm const526;

  protected static IStrategoTerm const525;

  protected static IStrategoTerm const524;

  protected static IStrategoTerm const523;

  protected static IStrategoTerm const522;

  protected static IStrategoTerm const521;

  protected static IStrategoTerm constSort41;

  protected static IStrategoTerm constCons42;

  protected static IStrategoTerm const520;

  protected static IStrategoTerm const519;

  protected static IStrategoTerm const518;

  protected static IStrategoTerm const517;

  protected static IStrategoTerm const516;

  protected static IStrategoTerm const515;

  protected static IStrategoTerm const514;

  protected static IStrategoTerm const513;

  protected static IStrategoTerm const512;

  protected static IStrategoTerm const511;

  protected static IStrategoTerm const510;

  protected static IStrategoTerm const509;

  protected static IStrategoTerm const508;

  protected static IStrategoTerm const507;

  protected static IStrategoTerm const506;

  protected static IStrategoTerm const505;

  protected static IStrategoTerm const504;

  protected static IStrategoTerm const503;

  protected static IStrategoTerm const502;

  protected static IStrategoTerm constSort40;

  protected static IStrategoTerm constCons41;

  protected static IStrategoTerm const501;

  protected static IStrategoTerm const500;

  protected static IStrategoTerm const499;

  protected static IStrategoTerm const498;

  protected static IStrategoTerm const497;

  protected static IStrategoTerm const496;

  protected static IStrategoTerm const495;

  protected static IStrategoTerm const494;

  protected static IStrategoTerm const493;

  protected static IStrategoTerm const492;

  protected static IStrategoTerm const491;

  protected static IStrategoTerm const490;

  protected static IStrategoTerm const489;

  protected static IStrategoTerm const488;

  protected static IStrategoTerm const487;

  protected static IStrategoTerm const486;

  protected static IStrategoTerm const485;

  protected static IStrategoTerm const484;

  protected static IStrategoTerm const483;

  protected static IStrategoTerm constSort39;

  protected static IStrategoTerm constCons40;

  protected static IStrategoTerm const482;

  protected static IStrategoTerm const481;

  protected static IStrategoTerm const480;

  protected static IStrategoTerm const479;

  protected static IStrategoTerm const478;

  protected static IStrategoTerm const477;

  protected static IStrategoTerm const476;

  protected static IStrategoTerm const475;

  protected static IStrategoTerm const474;

  protected static IStrategoTerm constSort38;

  protected static IStrategoTerm constCons39;

  protected static IStrategoTerm const473;

  protected static IStrategoTerm const472;

  protected static IStrategoTerm const471;

  protected static IStrategoTerm const470;

  protected static IStrategoTerm const469;

  protected static IStrategoTerm const468;

  protected static IStrategoTerm constSort37;

  protected static IStrategoTerm constCons38;

  protected static IStrategoTerm const467;

  protected static IStrategoTerm const466;

  protected static IStrategoTerm const465;

  protected static IStrategoTerm const464;

  protected static IStrategoTerm const463;

  protected static IStrategoTerm const462;

  protected static IStrategoTerm const461;

  protected static IStrategoTerm const460;

  protected static IStrategoTerm const459;

  protected static IStrategoTerm const458;

  protected static IStrategoTerm const457;

  protected static IStrategoTerm const456;

  protected static IStrategoTerm const455;

  protected static IStrategoTerm const454;

  protected static IStrategoTerm constSort36;

  protected static IStrategoTerm constCons37;

  protected static IStrategoTerm const453;

  protected static IStrategoTerm const452;

  protected static IStrategoTerm const451;

  protected static IStrategoTerm const450;

  protected static IStrategoTerm const449;

  protected static IStrategoTerm const448;

  protected static IStrategoTerm const447;

  protected static IStrategoTerm const446;

  protected static IStrategoTerm const445;

  protected static IStrategoTerm const444;

  protected static IStrategoTerm const443;

  protected static IStrategoTerm const442;

  protected static IStrategoTerm const441;

  protected static IStrategoTerm const440;

  protected static IStrategoTerm constSort35;

  protected static IStrategoTerm constCons36;

  protected static IStrategoTerm const439;

  protected static IStrategoTerm const438;

  protected static IStrategoTerm const437;

  protected static IStrategoTerm const436;

  protected static IStrategoTerm constSort34;

  protected static IStrategoTerm constCons35;

  protected static IStrategoTerm const435;

  protected static IStrategoTerm const434;

  protected static IStrategoTerm const433;

  protected static IStrategoTerm const432;

  protected static IStrategoTerm constSort33;

  protected static IStrategoTerm constCons34;

  protected static IStrategoTerm const431;

  protected static IStrategoTerm constSort32;

  protected static IStrategoTerm constCons33;

  protected static IStrategoTerm const430;

  protected static IStrategoTerm const429;

  protected static IStrategoTerm const428;

  protected static IStrategoTerm const427;

  protected static IStrategoTerm const426;

  protected static IStrategoTerm constSort31;

  protected static IStrategoTerm constCons32;

  protected static IStrategoTerm const425;

  protected static IStrategoTerm const424;

  protected static IStrategoTerm const423;

  protected static IStrategoTerm const422;

  protected static IStrategoTerm const421;

  protected static IStrategoTerm const420;

  protected static IStrategoTerm const419;

  protected static IStrategoTerm constSort30;

  protected static IStrategoTerm constCons31;

  protected static IStrategoTerm constSort29;

  protected static IStrategoTerm constCons30;

  protected static IStrategoTerm const418;

  protected static IStrategoTerm const417;

  protected static IStrategoTerm const416;

  protected static IStrategoTerm const415;

  protected static IStrategoTerm const414;

  protected static IStrategoTerm const413;

  protected static IStrategoTerm constSort28;

  protected static IStrategoTerm constCons29;

  protected static IStrategoTerm const412;

  protected static IStrategoTerm constSort27;

  protected static IStrategoTerm constCons28;

  protected static IStrategoTerm const411;

  protected static IStrategoTerm const410;

  protected static IStrategoTerm const409;

  protected static IStrategoTerm const408;

  protected static IStrategoTerm const407;

  protected static IStrategoTerm const406;

  protected static IStrategoTerm const405;

  protected static IStrategoTerm const404;

  protected static IStrategoTerm const403;

  protected static IStrategoTerm const402;

  protected static IStrategoTerm const401;

  protected static IStrategoTerm const400;

  protected static IStrategoTerm const399;

  protected static IStrategoTerm const398;

  protected static IStrategoTerm const397;

  protected static IStrategoTerm const396;

  protected static IStrategoTerm const395;

  protected static IStrategoTerm const394;

  protected static IStrategoTerm const393;

  protected static IStrategoTerm const392;

  protected static IStrategoTerm const391;

  protected static IStrategoTerm const390;

  protected static IStrategoTerm const389;

  protected static IStrategoTerm constSort26;

  protected static IStrategoTerm constCons27;

  protected static IStrategoTerm const388;

  protected static IStrategoTerm const387;

  protected static IStrategoTerm const386;

  protected static IStrategoTerm const385;

  protected static IStrategoTerm constSort25;

  protected static IStrategoTerm constCons26;

  protected static IStrategoTerm const384;

  protected static IStrategoTerm const383;

  protected static IStrategoTerm const382;

  protected static IStrategoTerm const381;

  protected static IStrategoTerm const380;

  protected static IStrategoTerm const379;

  protected static IStrategoTerm constSort24;

  protected static IStrategoTerm constCons25;

  protected static IStrategoTerm const378;

  protected static IStrategoTerm const377;

  protected static IStrategoTerm const376;

  protected static IStrategoTerm const375;

  protected static IStrategoTerm constSort23;

  protected static IStrategoTerm constCons24;

  protected static IStrategoTerm const374;

  protected static IStrategoTerm const373;

  protected static IStrategoTerm const372;

  protected static IStrategoTerm const371;

  protected static IStrategoTerm const370;

  protected static IStrategoTerm const369;

  protected static IStrategoTerm const368;

  protected static IStrategoTerm const367;

  protected static IStrategoTerm const366;

  protected static IStrategoTerm const365;

  protected static IStrategoTerm constSort22;

  protected static IStrategoTerm constCons23;

  protected static IStrategoTerm const364;

  protected static IStrategoTerm constSort21;

  protected static IStrategoTerm constCons22;

  protected static IStrategoTerm const363;

  protected static IStrategoTerm constSort20;

  protected static IStrategoTerm constCons21;

  protected static IStrategoTerm const362;

  protected static IStrategoTerm const361;

  protected static IStrategoTerm constSort19;

  protected static IStrategoTerm constCons20;

  protected static IStrategoTerm const360;

  protected static IStrategoTerm const359;

  protected static IStrategoTerm const358;

  protected static IStrategoTerm const357;

  protected static IStrategoTerm constSort18;

  protected static IStrategoTerm constCons19;

  protected static IStrategoTerm const356;

  protected static IStrategoTerm constSort17;

  protected static IStrategoTerm constCons18;

  protected static IStrategoTerm constSortNoArgs313;

  protected static IStrategoTerm const355;

  protected static IStrategoTerm const354;

  protected static IStrategoTerm const353;

  protected static IStrategoTerm const352;

  protected static IStrategoTerm const351;

  protected static IStrategoTerm const350;

  protected static IStrategoTerm const349;

  protected static IStrategoTerm const348;

  protected static IStrategoTerm const347;

  protected static IStrategoTerm const346;

  protected static IStrategoTerm const345;

  protected static IStrategoTerm const344;

  protected static IStrategoTerm const343;

  protected static IStrategoTerm const342;

  protected static IStrategoTerm const341;

  protected static IStrategoTerm constSortNoArgs312;

  protected static IStrategoTerm const340;

  protected static IStrategoTerm const339;

  protected static IStrategoTerm const338;

  protected static IStrategoTerm constSort16;

  protected static IStrategoTerm constCons17;

  protected static IStrategoTerm const337;

  protected static IStrategoTerm constSort15;

  protected static IStrategoTerm constCons16;

  protected static IStrategoTerm const336;

  protected static IStrategoTerm constSort14;

  protected static IStrategoTerm constCons15;

  protected static IStrategoTerm const335;

  protected static IStrategoTerm constSort13;

  protected static IStrategoTerm constCons14;

  protected static IStrategoTerm constSort12;

  protected static IStrategoTerm constCons13;

  protected static IStrategoTerm const334;

  protected static IStrategoTerm constSortNoArgs311;

  protected static IStrategoTerm const333;

  protected static IStrategoTerm const332;

  protected static IStrategoTerm const331;

  protected static IStrategoTerm const330;

  protected static IStrategoTerm const329;

  protected static IStrategoTerm const328;

  protected static IStrategoTerm const327;

  protected static IStrategoTerm const326;

  protected static IStrategoTerm const325;

  protected static IStrategoTerm const324;

  protected static IStrategoTerm const323;

  protected static IStrategoTerm const322;

  protected static IStrategoTerm constSortNoArgs310;

  protected static IStrategoTerm const321;

  protected static IStrategoTerm constSortNoArgs309;

  protected static IStrategoTerm const320;

  protected static IStrategoTerm constSortNoArgs308;

  protected static IStrategoTerm const319;

  protected static IStrategoTerm constSortNoArgs307;

  protected static IStrategoTerm const318;

  protected static IStrategoTerm constSortNoArgs306;

  protected static IStrategoTerm const317;

  protected static IStrategoTerm constSortNoArgs305;

  protected static IStrategoTerm const316;

  protected static IStrategoTerm constSortNoArgs304;

  protected static IStrategoTerm const315;

  protected static IStrategoTerm constSortNoArgs303;

  protected static IStrategoTerm const314;

  protected static IStrategoTerm constSortNoArgs302;

  protected static IStrategoTerm const313;

  protected static IStrategoTerm constSortNoArgs301;

  protected static IStrategoTerm const312;

  protected static IStrategoTerm constSortNoArgs300;

  protected static IStrategoTerm const311;

  protected static IStrategoTerm constSortNoArgs299;

  protected static IStrategoTerm const310;

  protected static IStrategoTerm constSortNoArgs298;

  protected static IStrategoTerm const309;

  protected static IStrategoTerm constSortNoArgs297;

  protected static IStrategoTerm const308;

  protected static IStrategoTerm constSortNoArgs296;

  protected static IStrategoTerm const307;

  protected static IStrategoTerm constSortNoArgs295;

  protected static IStrategoTerm const306;

  protected static IStrategoTerm constSortNoArgs294;

  protected static IStrategoTerm const305;

  protected static IStrategoTerm constSortNoArgs293;

  protected static IStrategoTerm const304;

  protected static IStrategoTerm constSortNoArgs292;

  protected static IStrategoTerm const303;

  protected static IStrategoTerm constSortNoArgs291;

  protected static IStrategoTerm const302;

  protected static IStrategoTerm constSortNoArgs290;

  protected static IStrategoTerm const301;

  protected static IStrategoTerm constSortNoArgs289;

  protected static IStrategoTerm const300;

  protected static IStrategoTerm constSortNoArgs288;

  protected static IStrategoTerm const299;

  protected static IStrategoTerm constSortNoArgs287;

  protected static IStrategoTerm const298;

  protected static IStrategoTerm constSortNoArgs286;

  protected static IStrategoTerm const297;

  protected static IStrategoTerm constSortNoArgs285;

  protected static IStrategoTerm const296;

  protected static IStrategoTerm constSortNoArgs284;

  protected static IStrategoTerm const295;

  protected static IStrategoTerm constSortNoArgs283;

  protected static IStrategoTerm const294;

  protected static IStrategoTerm constSortNoArgs282;

  protected static IStrategoTerm const293;

  protected static IStrategoTerm constSortNoArgs281;

  protected static IStrategoTerm const292;

  protected static IStrategoTerm constSortNoArgs280;

  protected static IStrategoTerm const291;

  protected static IStrategoTerm constSortNoArgs279;

  protected static IStrategoTerm const290;

  protected static IStrategoTerm constSortNoArgs278;

  protected static IStrategoTerm const289;

  protected static IStrategoTerm constSortNoArgs277;

  protected static IStrategoTerm const288;

  protected static IStrategoTerm constSortNoArgs276;

  protected static IStrategoTerm const287;

  protected static IStrategoTerm constSortNoArgs275;

  protected static IStrategoTerm const286;

  protected static IStrategoTerm constSortNoArgs274;

  protected static IStrategoTerm const285;

  protected static IStrategoTerm constSortNoArgs273;

  protected static IStrategoTerm const284;

  protected static IStrategoTerm constSortNoArgs272;

  protected static IStrategoTerm const283;

  protected static IStrategoTerm constSortNoArgs271;

  protected static IStrategoTerm const282;

  protected static IStrategoTerm constSortNoArgs270;

  protected static IStrategoTerm const281;

  protected static IStrategoTerm constSortNoArgs269;

  protected static IStrategoTerm const280;

  protected static IStrategoTerm constSortNoArgs268;

  protected static IStrategoTerm const279;

  protected static IStrategoTerm constSortNoArgs267;

  protected static IStrategoTerm const278;

  protected static IStrategoTerm constSortNoArgs266;

  protected static IStrategoTerm const277;

  protected static IStrategoTerm constSortNoArgs265;

  protected static IStrategoTerm const276;

  protected static IStrategoTerm constSortNoArgs264;

  protected static IStrategoTerm const275;

  protected static IStrategoTerm constSortNoArgs263;

  protected static IStrategoTerm const274;

  protected static IStrategoTerm constSortNoArgs262;

  protected static IStrategoTerm const273;

  protected static IStrategoTerm constSortNoArgs261;

  protected static IStrategoTerm const272;

  protected static IStrategoTerm constSortNoArgs260;

  protected static IStrategoTerm const271;

  protected static IStrategoTerm constSortNoArgs259;

  protected static IStrategoTerm const270;

  protected static IStrategoTerm constSortNoArgs258;

  protected static IStrategoTerm const269;

  protected static IStrategoTerm constSortNoArgs257;

  protected static IStrategoTerm const268;

  protected static IStrategoTerm constSortNoArgs256;

  protected static IStrategoTerm const267;

  protected static IStrategoTerm constSortNoArgs255;

  protected static IStrategoTerm const266;

  protected static IStrategoTerm constSortNoArgs254;

  protected static IStrategoTerm const265;

  protected static IStrategoTerm constSortNoArgs253;

  protected static IStrategoTerm const264;

  protected static IStrategoTerm constSortNoArgs252;

  protected static IStrategoTerm const263;

  protected static IStrategoTerm constSortNoArgs251;

  protected static IStrategoTerm const262;

  protected static IStrategoTerm constSortNoArgs250;

  protected static IStrategoTerm const261;

  protected static IStrategoTerm constSortNoArgs249;

  protected static IStrategoTerm const260;

  protected static IStrategoTerm constSortNoArgs248;

  protected static IStrategoTerm const259;

  protected static IStrategoTerm constSortNoArgs247;

  protected static IStrategoTerm const258;

  protected static IStrategoTerm constSortNoArgs246;

  protected static IStrategoTerm const257;

  protected static IStrategoTerm constSortNoArgs245;

  protected static IStrategoTerm const256;

  protected static IStrategoTerm constSortNoArgs244;

  protected static IStrategoTerm const255;

  protected static IStrategoTerm constSortNoArgs243;

  protected static IStrategoTerm const254;

  protected static IStrategoTerm constSortNoArgs242;

  protected static IStrategoTerm const253;

  protected static IStrategoTerm constSortNoArgs241;

  protected static IStrategoTerm const252;

  protected static IStrategoTerm constSortNoArgs240;

  protected static IStrategoTerm const251;

  protected static IStrategoTerm constSortNoArgs239;

  protected static IStrategoTerm const250;

  protected static IStrategoTerm constSortNoArgs238;

  protected static IStrategoTerm const249;

  protected static IStrategoTerm constSortNoArgs237;

  protected static IStrategoTerm const248;

  protected static IStrategoTerm constSortNoArgs236;

  protected static IStrategoTerm const247;

  protected static IStrategoTerm constSortNoArgs235;

  protected static IStrategoTerm const246;

  protected static IStrategoTerm constSortNoArgs234;

  protected static IStrategoTerm const245;

  protected static IStrategoTerm constSortNoArgs233;

  protected static IStrategoTerm const244;

  protected static IStrategoTerm constSortNoArgs232;

  protected static IStrategoTerm const243;

  protected static IStrategoTerm constSortNoArgs231;

  protected static IStrategoTerm const242;

  protected static IStrategoTerm constSortNoArgs230;

  protected static IStrategoTerm const241;

  protected static IStrategoTerm constSortNoArgs229;

  protected static IStrategoTerm const240;

  protected static IStrategoTerm constSortNoArgs228;

  protected static IStrategoTerm const239;

  protected static IStrategoTerm constSortNoArgs227;

  protected static IStrategoTerm const238;

  protected static IStrategoTerm constSortNoArgs226;

  protected static IStrategoTerm const237;

  protected static IStrategoTerm constSortNoArgs225;

  protected static IStrategoTerm const236;

  protected static IStrategoTerm constSortNoArgs224;

  protected static IStrategoTerm const235;

  protected static IStrategoTerm constSortNoArgs223;

  protected static IStrategoTerm const234;

  protected static IStrategoTerm constSortNoArgs222;

  protected static IStrategoTerm const233;

  protected static IStrategoTerm constSortNoArgs221;

  protected static IStrategoTerm const232;

  protected static IStrategoTerm constSortNoArgs220;

  protected static IStrategoTerm const231;

  protected static IStrategoTerm constSortNoArgs219;

  protected static IStrategoTerm const230;

  protected static IStrategoTerm constSortNoArgs218;

  protected static IStrategoTerm const229;

  protected static IStrategoTerm constSortNoArgs217;

  protected static IStrategoTerm const228;

  protected static IStrategoTerm constSortNoArgs216;

  protected static IStrategoTerm const227;

  protected static IStrategoTerm constSortNoArgs215;

  protected static IStrategoTerm const226;

  protected static IStrategoTerm constSortNoArgs214;

  protected static IStrategoTerm const225;

  protected static IStrategoTerm constSortNoArgs213;

  protected static IStrategoTerm const224;

  protected static IStrategoTerm constSortNoArgs212;

  protected static IStrategoTerm const223;

  protected static IStrategoTerm constSortNoArgs211;

  protected static IStrategoTerm const222;

  protected static IStrategoTerm constSortNoArgs210;

  protected static IStrategoTerm const221;

  protected static IStrategoTerm constSortNoArgs209;

  protected static IStrategoTerm const220;

  protected static IStrategoTerm constSortNoArgs208;

  protected static IStrategoTerm const219;

  protected static IStrategoTerm constSortNoArgs207;

  protected static IStrategoTerm const218;

  protected static IStrategoTerm constSortNoArgs206;

  protected static IStrategoTerm const217;

  protected static IStrategoTerm constSortNoArgs205;

  protected static IStrategoTerm const216;

  protected static IStrategoTerm constSortNoArgs204;

  protected static IStrategoTerm const215;

  protected static IStrategoTerm constSortNoArgs203;

  protected static IStrategoTerm const214;

  protected static IStrategoTerm constSortNoArgs202;

  protected static IStrategoTerm const213;

  protected static IStrategoTerm constSortNoArgs201;

  protected static IStrategoTerm const212;

  protected static IStrategoTerm constSortNoArgs200;

  protected static IStrategoTerm const211;

  protected static IStrategoTerm constSortNoArgs199;

  protected static IStrategoTerm const210;

  protected static IStrategoTerm constSortNoArgs198;

  protected static IStrategoTerm const209;

  protected static IStrategoTerm constSortNoArgs197;

  protected static IStrategoTerm const208;

  protected static IStrategoTerm constSortNoArgs196;

  protected static IStrategoTerm const207;

  protected static IStrategoTerm constSortNoArgs195;

  protected static IStrategoTerm const206;

  protected static IStrategoTerm constSortNoArgs194;

  protected static IStrategoTerm const205;

  protected static IStrategoTerm constSortNoArgs193;

  protected static IStrategoTerm const204;

  protected static IStrategoTerm constSortNoArgs192;

  protected static IStrategoTerm const203;

  protected static IStrategoTerm constSortNoArgs191;

  protected static IStrategoTerm const202;

  protected static IStrategoTerm constSortNoArgs190;

  protected static IStrategoTerm const201;

  protected static IStrategoTerm constSortNoArgs189;

  protected static IStrategoTerm const200;

  protected static IStrategoTerm constSortNoArgs188;

  protected static IStrategoTerm const199;

  protected static IStrategoTerm constSortNoArgs187;

  protected static IStrategoTerm const198;

  protected static IStrategoTerm constSortNoArgs186;

  protected static IStrategoTerm const197;

  protected static IStrategoTerm constSortNoArgs185;

  protected static IStrategoTerm const196;

  protected static IStrategoTerm constSortNoArgs184;

  protected static IStrategoTerm const195;

  protected static IStrategoTerm constSortNoArgs183;

  protected static IStrategoTerm const194;

  protected static IStrategoTerm constSortNoArgs182;

  protected static IStrategoTerm const193;

  protected static IStrategoTerm constSortNoArgs181;

  protected static IStrategoTerm const192;

  protected static IStrategoTerm constSortNoArgs180;

  protected static IStrategoTerm const191;

  protected static IStrategoTerm constSortNoArgs179;

  protected static IStrategoTerm const190;

  protected static IStrategoTerm constSortNoArgs178;

  protected static IStrategoTerm const189;

  protected static IStrategoTerm constSortNoArgs177;

  protected static IStrategoTerm const188;

  protected static IStrategoTerm constSortNoArgs176;

  protected static IStrategoTerm const187;

  protected static IStrategoTerm constSortNoArgs175;

  protected static IStrategoTerm const186;

  protected static IStrategoTerm constSortNoArgs174;

  protected static IStrategoTerm const185;

  protected static IStrategoTerm constSortNoArgs173;

  protected static IStrategoTerm const184;

  protected static IStrategoTerm constSortNoArgs172;

  protected static IStrategoTerm const183;

  protected static IStrategoTerm constSortNoArgs171;

  protected static IStrategoTerm const182;

  protected static IStrategoTerm constSortNoArgs170;

  protected static IStrategoTerm const181;

  protected static IStrategoTerm constSortNoArgs169;

  protected static IStrategoTerm const180;

  protected static IStrategoTerm constSortNoArgs168;

  protected static IStrategoTerm const179;

  protected static IStrategoTerm constSortNoArgs167;

  protected static IStrategoTerm const178;

  protected static IStrategoTerm constSortNoArgs166;

  protected static IStrategoTerm const177;

  protected static IStrategoTerm constSortNoArgs165;

  protected static IStrategoTerm const176;

  protected static IStrategoTerm constSortNoArgs164;

  protected static IStrategoTerm const175;

  protected static IStrategoTerm constSortNoArgs163;

  protected static IStrategoTerm const174;

  protected static IStrategoTerm constSortNoArgs162;

  protected static IStrategoTerm const173;

  protected static IStrategoTerm constSortNoArgs161;

  protected static IStrategoTerm const172;

  protected static IStrategoTerm constSortNoArgs160;

  protected static IStrategoTerm const171;

  protected static IStrategoTerm constSortNoArgs159;

  protected static IStrategoTerm const170;

  protected static IStrategoTerm constSortNoArgs158;

  protected static IStrategoTerm const169;

  protected static IStrategoTerm constSortNoArgs157;

  protected static IStrategoTerm const168;

  protected static IStrategoTerm constSortNoArgs156;

  protected static IStrategoTerm const167;

  protected static IStrategoTerm constSortNoArgs155;

  protected static IStrategoTerm const166;

  protected static IStrategoTerm constSortNoArgs154;

  protected static IStrategoTerm const165;

  protected static IStrategoTerm constSortNoArgs153;

  protected static IStrategoTerm const164;

  protected static IStrategoTerm constSortNoArgs152;

  protected static IStrategoTerm const163;

  protected static IStrategoTerm constSortNoArgs151;

  protected static IStrategoTerm const162;

  protected static IStrategoTerm constSortNoArgs150;

  protected static IStrategoTerm const161;

  protected static IStrategoTerm constSortNoArgs149;

  protected static IStrategoTerm const160;

  protected static IStrategoTerm constSortNoArgs148;

  protected static IStrategoTerm const159;

  protected static IStrategoTerm constSortNoArgs147;

  protected static IStrategoTerm const158;

  protected static IStrategoTerm constSortNoArgs146;

  protected static IStrategoTerm const157;

  protected static IStrategoTerm constSortNoArgs145;

  protected static IStrategoTerm const156;

  protected static IStrategoTerm constSortNoArgs144;

  protected static IStrategoTerm const155;

  protected static IStrategoTerm constSortNoArgs143;

  protected static IStrategoTerm const154;

  protected static IStrategoTerm constSortNoArgs142;

  protected static IStrategoTerm const153;

  protected static IStrategoTerm constSortNoArgs141;

  protected static IStrategoTerm const152;

  protected static IStrategoTerm constSortNoArgs140;

  protected static IStrategoTerm const151;

  protected static IStrategoTerm constSortNoArgs139;

  protected static IStrategoTerm const150;

  protected static IStrategoTerm constSortNoArgs138;

  protected static IStrategoTerm const149;

  protected static IStrategoTerm constSortNoArgs137;

  protected static IStrategoTerm const148;

  protected static IStrategoTerm constSortNoArgs136;

  protected static IStrategoTerm const147;

  protected static IStrategoTerm constSortNoArgs135;

  protected static IStrategoTerm const146;

  protected static IStrategoTerm constSortNoArgs134;

  protected static IStrategoTerm const145;

  protected static IStrategoTerm constSortNoArgs133;

  protected static IStrategoTerm const144;

  protected static IStrategoTerm constSortNoArgs132;

  protected static IStrategoTerm const143;

  protected static IStrategoTerm constSortNoArgs131;

  protected static IStrategoTerm const142;

  protected static IStrategoTerm constSortNoArgs130;

  protected static IStrategoTerm const141;

  protected static IStrategoTerm constSortNoArgs129;

  protected static IStrategoTerm const140;

  protected static IStrategoTerm constSortNoArgs128;

  protected static IStrategoTerm const139;

  protected static IStrategoTerm constSortNoArgs127;

  protected static IStrategoTerm const138;

  protected static IStrategoTerm constSortNoArgs126;

  protected static IStrategoTerm const137;

  protected static IStrategoTerm constSortNoArgs125;

  protected static IStrategoTerm const136;

  protected static IStrategoTerm constSortNoArgs124;

  protected static IStrategoTerm const135;

  protected static IStrategoTerm constSortNoArgs123;

  protected static IStrategoTerm const134;

  protected static IStrategoTerm constSortNoArgs122;

  protected static IStrategoTerm const133;

  protected static IStrategoTerm constSortNoArgs121;

  protected static IStrategoTerm const132;

  protected static IStrategoTerm constSortNoArgs120;

  protected static IStrategoTerm const131;

  protected static IStrategoTerm constSortNoArgs119;

  protected static IStrategoTerm const130;

  protected static IStrategoTerm constSortNoArgs118;

  protected static IStrategoTerm const129;

  protected static IStrategoTerm constSortNoArgs117;

  protected static IStrategoTerm const128;

  protected static IStrategoTerm constSortNoArgs116;

  protected static IStrategoTerm const127;

  protected static IStrategoTerm constSortNoArgs115;

  protected static IStrategoTerm const126;

  protected static IStrategoTerm constSortNoArgs114;

  protected static IStrategoTerm const125;

  protected static IStrategoTerm constSortNoArgs113;

  protected static IStrategoTerm const124;

  protected static IStrategoTerm constSortNoArgs112;

  protected static IStrategoTerm const123;

  protected static IStrategoTerm constSortNoArgs111;

  protected static IStrategoTerm const122;

  protected static IStrategoTerm constSortNoArgs110;

  protected static IStrategoTerm const121;

  protected static IStrategoTerm constSortNoArgs109;

  protected static IStrategoTerm const120;

  protected static IStrategoTerm constSortNoArgs108;

  protected static IStrategoTerm const119;

  protected static IStrategoTerm constSortNoArgs107;

  protected static IStrategoTerm const118;

  protected static IStrategoTerm constSortNoArgs106;

  protected static IStrategoTerm const117;

  protected static IStrategoTerm constSortNoArgs105;

  protected static IStrategoTerm const116;

  protected static IStrategoTerm constSortNoArgs104;

  protected static IStrategoTerm const115;

  protected static IStrategoTerm constSortNoArgs103;

  protected static IStrategoTerm const114;

  protected static IStrategoTerm constSort11;

  protected static IStrategoTerm constCons12;

  protected static IStrategoTerm constSortNoArgs102;

  protected static IStrategoTerm const113;

  protected static IStrategoTerm constSort10;

  protected static IStrategoTerm constCons11;

  protected static IStrategoTerm constSortNoArgs101;

  protected static IStrategoTerm const112;

  protected static IStrategoTerm constSortNoArgs100;

  protected static IStrategoTerm const111;

  protected static IStrategoTerm constSortNoArgs99;

  protected static IStrategoTerm const110;

  protected static IStrategoTerm constSortNoArgs98;

  protected static IStrategoTerm const109;

  protected static IStrategoTerm constSortNoArgs97;

  protected static IStrategoTerm const108;

  protected static IStrategoTerm constSortNoArgs96;

  protected static IStrategoTerm const107;

  protected static IStrategoTerm constSortNoArgs95;

  protected static IStrategoTerm const106;

  protected static IStrategoTerm constSortNoArgs94;

  protected static IStrategoTerm const105;

  protected static IStrategoTerm constSortNoArgs93;

  protected static IStrategoTerm const104;

  protected static IStrategoTerm constSortNoArgs92;

  protected static IStrategoTerm const103;

  protected static IStrategoTerm constSortNoArgs91;

  protected static IStrategoTerm const102;

  protected static IStrategoTerm constSortNoArgs90;

  protected static IStrategoTerm const101;

  protected static IStrategoTerm constSortNoArgs89;

  protected static IStrategoTerm const100;

  protected static IStrategoTerm constSortNoArgs88;

  protected static IStrategoTerm const99;

  protected static IStrategoTerm constSortNoArgs87;

  protected static IStrategoTerm const98;

  protected static IStrategoTerm constSortNoArgs86;

  protected static IStrategoTerm const97;

  protected static IStrategoTerm constSortNoArgs85;

  protected static IStrategoTerm const96;

  protected static IStrategoTerm constSortNoArgs84;

  protected static IStrategoTerm const95;

  protected static IStrategoTerm constSortNoArgs83;

  protected static IStrategoTerm const94;

  protected static IStrategoTerm constSort9;

  protected static IStrategoTerm constCons10;

  protected static IStrategoTerm constSortNoArgs82;

  protected static IStrategoTerm const93;

  protected static IStrategoTerm constSortNoArgs81;

  protected static IStrategoTerm const92;

  protected static IStrategoTerm constSort8;

  protected static IStrategoTerm constCons9;

  protected static IStrategoTerm constSortNoArgs80;

  protected static IStrategoTerm const91;

  protected static IStrategoTerm constSortNoArgs79;

  protected static IStrategoTerm const90;

  protected static IStrategoTerm constSortNoArgs78;

  protected static IStrategoTerm const89;

  protected static IStrategoTerm constSortNoArgs77;

  protected static IStrategoTerm const88;

  protected static IStrategoTerm constSortNoArgs76;

  protected static IStrategoTerm const87;

  protected static IStrategoTerm constSortNoArgs75;

  protected static IStrategoTerm const86;

  protected static IStrategoTerm constSortNoArgs74;

  protected static IStrategoTerm const85;

  protected static IStrategoTerm constSort7;

  protected static IStrategoTerm constCons8;

  protected static IStrategoTerm constSortNoArgs73;

  protected static IStrategoTerm const84;

  protected static IStrategoTerm constSortNoArgs72;

  protected static IStrategoTerm const83;

  protected static IStrategoTerm constSort6;

  protected static IStrategoTerm constCons7;

  protected static IStrategoTerm constSortNoArgs71;

  protected static IStrategoTerm const82;

  protected static IStrategoTerm constSortNoArgs70;

  protected static IStrategoTerm const81;

  protected static IStrategoTerm constSort5;

  protected static IStrategoTerm constCons6;

  protected static IStrategoTerm constSortNoArgs69;

  protected static IStrategoTerm const80;

  protected static IStrategoTerm constSortNoArgs68;

  protected static IStrategoTerm const79;

  protected static IStrategoTerm constSort4;

  protected static IStrategoTerm constCons5;

  protected static IStrategoTerm constSortNoArgs67;

  protected static IStrategoTerm const78;

  protected static IStrategoTerm constSortNoArgs66;

  protected static IStrategoTerm const77;

  protected static IStrategoTerm constSort3;

  protected static IStrategoTerm constCons4;

  protected static IStrategoTerm constSortNoArgs65;

  protected static IStrategoTerm const76;

  protected static IStrategoTerm constSortNoArgs64;

  protected static IStrategoTerm const75;

  protected static IStrategoTerm constSort2;

  protected static IStrategoTerm constCons3;

  protected static IStrategoTerm constSortNoArgs63;

  protected static IStrategoTerm const74;

  protected static IStrategoTerm constSortNoArgs62;

  protected static IStrategoTerm const73;

  protected static IStrategoTerm constSortNoArgs61;

  protected static IStrategoTerm const72;

  protected static IStrategoTerm constSortNoArgs60;

  protected static IStrategoTerm const71;

  protected static IStrategoTerm constSortNoArgs59;

  protected static IStrategoTerm const70;

  protected static IStrategoTerm constSort1;

  protected static IStrategoTerm constCons2;

  protected static IStrategoTerm constSortNoArgs58;

  protected static IStrategoTerm const69;

  protected static IStrategoTerm constSortNoArgs57;

  protected static IStrategoTerm const68;

  protected static IStrategoTerm constSort0;

  protected static IStrategoTerm constCons1;

  protected static IStrategoTerm constSortNoArgs56;

  protected static IStrategoTerm const67;

  protected static IStrategoTerm const66;

  protected static IStrategoTerm constSortNoArgs55;

  protected static IStrategoTerm const65;

  protected static IStrategoTerm constSortNoArgs54;

  protected static IStrategoTerm const64;

  protected static IStrategoTerm constSortNoArgs53;

  protected static IStrategoTerm const63;

  protected static IStrategoTerm constSortNoArgs52;

  protected static IStrategoTerm const62;

  protected static IStrategoTerm constSortNoArgs51;

  protected static IStrategoTerm const61;

  protected static IStrategoTerm constSortNoArgs50;

  protected static IStrategoTerm const60;

  protected static IStrategoTerm constSortNoArgs49;

  protected static IStrategoTerm const59;

  protected static IStrategoTerm constSortNoArgs48;

  protected static IStrategoTerm const58;

  protected static IStrategoTerm constSortNoArgs47;

  protected static IStrategoTerm const57;

  protected static IStrategoTerm constSortNoArgs46;

  protected static IStrategoTerm const56;

  protected static IStrategoTerm constSortNoArgs45;

  protected static IStrategoTerm const55;

  protected static IStrategoTerm constSortNoArgs44;

  protected static IStrategoTerm const54;

  protected static IStrategoTerm constSortNoArgs43;

  protected static IStrategoTerm const53;

  protected static IStrategoTerm constSortNoArgs42;

  protected static IStrategoTerm const52;

  protected static IStrategoTerm constSortNoArgs41;

  protected static IStrategoTerm const51;

  protected static IStrategoTerm constSortNoArgs40;

  protected static IStrategoTerm const50;

  protected static IStrategoTerm const49;

  protected static IStrategoTerm const48;

  protected static IStrategoTerm constCons0;

  protected static IStrategoTerm constDR_DUMMY0;

  protected static IStrategoTerm const47;

  protected static IStrategoTerm const46;

  protected static IStrategoTerm constSortNoArgs39;

  protected static IStrategoTerm const45;

  protected static IStrategoTerm constSortNoArgs38;

  protected static IStrategoTerm const44;

  protected static IStrategoTerm constSortNoArgs37;

  protected static IStrategoTerm const43;

  protected static IStrategoTerm constSortNoArgs36;

  protected static IStrategoTerm const42;

  protected static IStrategoTerm constSortNoArgs35;

  protected static IStrategoTerm const41;

  protected static IStrategoTerm constSortNoArgs34;

  protected static IStrategoTerm const40;

  protected static IStrategoTerm constSortNoArgs33;

  protected static IStrategoTerm const39;

  protected static IStrategoTerm constSortNoArgs32;

  protected static IStrategoTerm const38;

  protected static IStrategoTerm constSortNoArgs31;

  protected static IStrategoTerm const37;

  protected static IStrategoTerm constSortNoArgs30;

  protected static IStrategoTerm constSortNoArgs29;

  protected static IStrategoTerm const36;

  protected static IStrategoTerm constSortNoArgs28;

  protected static IStrategoTerm const35;

  protected static IStrategoTerm constSortNoArgs27;

  protected static IStrategoTerm const34;

  protected static IStrategoTerm constSortNoArgs26;

  protected static IStrategoTerm const33;

  protected static IStrategoTerm constSortNoArgs25;

  protected static IStrategoTerm const32;

  protected static IStrategoTerm constSortNoArgs24;

  protected static IStrategoTerm const31;

  protected static IStrategoTerm constSortNoArgs23;

  protected static IStrategoTerm const30;

  protected static IStrategoTerm constSortNoArgs22;

  protected static IStrategoTerm const29;

  protected static IStrategoTerm constSortNoArgs21;

  protected static IStrategoTerm const28;

  protected static IStrategoTerm constSortNoArgs20;

  protected static IStrategoTerm const27;

  protected static IStrategoTerm constSortNoArgs19;

  protected static IStrategoTerm const26;

  protected static IStrategoTerm constSortNoArgs18;

  protected static IStrategoTerm const25;

  protected static IStrategoTerm constSortNoArgs17;

  protected static IStrategoTerm const24;

  protected static IStrategoTerm constSortNoArgs16;

  protected static IStrategoTerm const23;

  protected static IStrategoTerm constSortNoArgs15;

  protected static IStrategoTerm const22;

  protected static IStrategoTerm constSortNoArgs14;

  protected static IStrategoTerm const21;

  protected static IStrategoTerm constSortNoArgs13;

  protected static IStrategoTerm const20;

  protected static IStrategoTerm constSortNoArgs12;

  protected static IStrategoTerm const19;

  protected static IStrategoTerm constSortNoArgs11;

  protected static IStrategoTerm const18;

  protected static IStrategoTerm constSortNoArgs10;

  protected static IStrategoTerm const17;

  protected static IStrategoTerm constSortNoArgs9;

  protected static IStrategoTerm const16;

  protected static IStrategoTerm constSortNoArgs8;

  protected static IStrategoTerm const15;

  protected static IStrategoTerm constSortNoArgs7;

  protected static IStrategoTerm const14;

  protected static IStrategoTerm constSortNoArgs6;

  protected static IStrategoTerm const13;

  protected static IStrategoTerm constSortNoArgs5;

  protected static IStrategoTerm const12;

  protected static IStrategoTerm constSortNoArgs4;

  protected static IStrategoTerm const11;

  protected static IStrategoTerm constSortNoArgs3;

  protected static IStrategoTerm const10;

  protected static IStrategoTerm constSortNoArgs2;

  protected static IStrategoTerm const9;

  protected static IStrategoTerm constSortNoArgs1;

  protected static IStrategoTerm const8;

  protected static IStrategoTerm constSortNoArgs0;

  protected static IStrategoTerm const7;

  protected static IStrategoTerm const6;

  protected static IStrategoTerm const5;

  protected static IStrategoTerm const4;

  protected static IStrategoTerm const3;

  protected static IStrategoTerm const2;

  protected static IStrategoTerm constSVar0;

  protected static IStrategoTerm const1;

  protected static IStrategoTerm const0;

  protected static IStrategoTerm constNil0;

  public static IStrategoConstructor _consConc_2;

  protected static IStrategoConstructor _consSome_1;

  protected static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consmodule_1;

  public static IStrategoConstructor _consid_1;

  public static IStrategoConstructor _consmodule_3;

  public static IStrategoConstructor _conssorts_1;

  public static IStrategoConstructor _consDR_DUMMY_0;

  public static IStrategoConstructor _consDR_UNDEFINE_1;

  public static IStrategoConstructor _consPlainBody_1;

  public static IStrategoConstructor _consPlainDecHead_3;

  public static IStrategoConstructor _consPlainDec_2;

  public static IStrategoConstructor _consdefinition_1;

  public static IStrategoConstructor _consfile_start_0;

  public static IStrategoConstructor _consstart_0;

  public static IStrategoConstructor _consprod_3;

  public static IStrategoConstructor _consno_attrs_0;

  public static IStrategoConstructor _consattrs_1;

  public static IStrategoConstructor _consterm_1;

  public static IStrategoConstructor _consannotated_2;

  public static IStrategoConstructor _consplaceholder_1;

  public static IStrategoConstructor _consappl_2;

  public static IStrategoConstructor _consfun_1;

  public static IStrategoConstructor _consreal_1;

  public static IStrategoConstructor _consint_1;

  public static IStrategoConstructor _consnegative_1;

  public static IStrategoConstructor _conspositive_1;

  public static IStrategoConstructor _consnatural_1;

  public static IStrategoConstructor _consreal_con_3;

  public static IStrategoConstructor _consconc_grammars_2;

  public static IStrategoConstructor _consempty_grammar_0;

  public static IStrategoConstructor _conslayout_0;

  public static IStrategoConstructor _consvarsym_1;

  public static IStrategoConstructor _conslex_1;

  public static IStrategoConstructor _conscf_1;

  public static IStrategoConstructor _consrenamed_module_2;

  public static IStrategoConstructor _consimp_section_1;

  public static IStrategoConstructor _consimports_1;

  public static IStrategoConstructor _consparameterized_2;

  public static IStrategoConstructor _consunparameterized_1;

  public static IStrategoConstructor _conshiddens_1;

  public static IStrategoConstructor _consexports_1;

  public static IStrategoConstructor _consproduction_2;

  public static IStrategoConstructor _conssymbol_2;

  public static IStrategoConstructor _consrenamings_1;

  public static IStrategoConstructor _consstrategy_2;

  public static IStrategoConstructor _consfunc_2;

  public static IStrategoConstructor _constuple_2;

  public static IStrategoConstructor _consiter_star_sep_2;

  public static IStrategoConstructor _consiter_sep_2;

  public static IStrategoConstructor _consiter_star_1;

  public static IStrategoConstructor _consiter_1;

  public static IStrategoConstructor _consopt_1;

  public static IStrategoConstructor _consempty_0;

  public static IStrategoConstructor _conslifting_1;

  public static IStrategoConstructor _consassoc_3;

  public static IStrategoConstructor _conschain_1;

  public static IStrategoConstructor _consassoc_group_2;

  public static IStrategoConstructor _consprods_group_1;

  public static IStrategoConstructor _conssimple_group_1;

  public static IStrategoConstructor _consnon_transitive_1;

  public static IStrategoConstructor _conswith_arguments_2;

  public static IStrategoConstructor _consdefault_1;

  public static IStrategoConstructor _consassoc_1;

  public static IStrategoConstructor _consbracket_0;

  public static IStrategoConstructor _consassoc_0;

  public static IStrategoConstructor _consnon_assoc_0;

  public static IStrategoConstructor _consright_0;

  public static IStrategoConstructor _consleft_0;

  public static IStrategoConstructor _consunion_2;

  public static IStrategoConstructor _consisect_2;

  public static IStrategoConstructor _consdiff_2;

  public static IStrategoConstructor _conscomp_1;

  public static IStrategoConstructor _conssimple_charclass_1;

  public static IStrategoConstructor _conspresent_1;

  public static IStrategoConstructor _consabsent_0;

  public static IStrategoConstructor _consconc_2;

  public static IStrategoConstructor _consrange_2;

  public static IStrategoConstructor _conslabel_start_0;

  public static IStrategoConstructor _consbot_0;

  public static IStrategoConstructor _conseof_0;

  public static IStrategoConstructor _constop_0;

  public static IStrategoConstructor _consshort_1;

  public static IStrategoConstructor _consnumeric_1;

  public static IStrategoConstructor _consparameterized_sort_2;

  public static IStrategoConstructor _conssort_1;

  public static IStrategoConstructor _conscontext_free_start_symbols_1;

  public static IStrategoConstructor _conslexical_start_symbols_1;

  public static IStrategoConstructor _conskernel_start_symbols_1;

  public static IStrategoConstructor _consprefix_fun_4;

  public static IStrategoConstructor _consci_lit_1;

  public static IStrategoConstructor _conslit_1;

  public static IStrategoConstructor _consquoted_fun_1;

  public static IStrategoConstructor _consunquoted_fun_1;

  public static IStrategoConstructor _conslabel_2;

  public static IStrategoConstructor _consunquoted_1;

  public static IStrategoConstructor _consquoted_1;

  public static IStrategoConstructor _consavoid_0;

  public static IStrategoConstructor _consprefer_0;

  public static IStrategoConstructor _consreject_0;

  public static IStrategoConstructor _consfollow_2;

  public static IStrategoConstructor _conslist_1;

  public static IStrategoConstructor _consalt_2;

  public static IStrategoConstructor _conssingle_1;

  public static IStrategoConstructor _consseq_2;

  public static IStrategoConstructor _conschar_class_1;

  public static IStrategoConstructor _consalias_2;

  public static IStrategoConstructor _consImportWildcard_1;

  public static IStrategoConstructor _consSpecification_1;

  public static IStrategoConstructor _consModule_2;

  public static IStrategoConstructor _consImportTerm_1;

  public static IStrategoConstructor _consAll_1;

  public static IStrategoConstructor _consOne_1;

  public static IStrategoConstructor _consPrimT_3;

  public static IStrategoConstructor _consGuardedLChoice_3;

  public static IStrategoConstructor _consScope_2;

  public static IStrategoConstructor _consBuild_1;

  public static IStrategoConstructor _consMatch_1;

  public static IStrategoConstructor _consId_0;

  public static IStrategoConstructor _consFail_0;

  public static IStrategoConstructor _consParenStrat_1;

  public static IStrategoConstructor _consVarDec_2;

  public static IStrategoConstructor _consExtSDef_3;

  public static IStrategoConstructor _consExtSDefInl_4;

  public static IStrategoConstructor _consSDefT_4;

  public static IStrategoConstructor _consCallDynamic_3;

  public static IStrategoConstructor _consCallT_3;

  public static IStrategoConstructor _consLet_2;

  public static IStrategoConstructor _consSVar_1;

  public static IStrategoConstructor _consOpQ_2;

  public static IStrategoConstructor _consOp_2;

  public static IStrategoConstructor _consStr_1;

  public static IStrategoConstructor _consReal_1;

  public static IStrategoConstructor _consInt_1;

  public static IStrategoConstructor _consWld_0;

  public static IStrategoConstructor _consFunType_2;

  public static IStrategoConstructor _consConstType_1;

  public static IStrategoConstructor _consExtOpDeclInj_1;

  public static IStrategoConstructor _consExtOpDeclQ_2;

  public static IStrategoConstructor _consExtOpDecl_2;

  public static IStrategoConstructor _consOpDeclInj_1;

  public static IStrategoConstructor _consOpDeclQ_2;

  public static IStrategoConstructor _consOpDecl_2;

  public static IStrategoConstructor _consSort_2;

  public static IStrategoConstructor _consSortNoArgs_1;

  public static IStrategoConstructor _consSortVar_1;

  public static IStrategoConstructor _consConstructors_1;

  public static IStrategoConstructor _consSorts_1;

  public static IStrategoConstructor _consStarStar_0;

  public static IStrategoConstructor _consStar_0;

  public static IStrategoConstructor _consSortTuple_1;

  public static IStrategoConstructor _consSortListTl_2;

  public static IStrategoConstructor _consSortList_1;

  public static IStrategoConstructor _consAs_2;

  public static IStrategoConstructor _consExplode_2;

  public static IStrategoConstructor _consListTail_2;

  public static IStrategoConstructor _consList_1;

  public static IStrategoConstructor _consTuple_1;

  public static IStrategoConstructor _consRootApp_1;

  public static IStrategoConstructor _consApp_2;

  public static IStrategoConstructor _consNoAnnoList_1;

  public static IStrategoConstructor _consAnnoList_2;

  public static IStrategoConstructor _consChar_1;

  public static IStrategoConstructor _consBuildDefault_1;

  public static IStrategoConstructor _consBuildDefaultPT_1;

  public static IStrategoConstructor _consVar_1;

  public static IStrategoConstructor _consListVar_1;

  public static IStrategoConstructor _consAssign_2;

  public static IStrategoConstructor _consSwitchCase_2;

  public static IStrategoConstructor _consSwitchChoice_3;

  public static IStrategoConstructor _consSwitchChoiceNoOtherwise_2;

  public static IStrategoConstructor _consIfThen_2;

  public static IStrategoConstructor _consCondChoice_3;

  public static IStrategoConstructor _consRChoice_2;

  public static IStrategoConstructor _consChoice_2;

  public static IStrategoConstructor _consSRule_1;

  public static IStrategoConstructor _consLRule_1;

  public static IStrategoConstructor _consCallNoArgs_1;

  public static IStrategoConstructor _consExplodeCong_2;

  public static IStrategoConstructor _consListCong_2;

  public static IStrategoConstructor _consListCongNoTail_1;

  public static IStrategoConstructor _consTupleCong_2;

  public static IStrategoConstructor _consEmptyTupleCong_0;

  public static IStrategoConstructor _consStrategyCurly_1;

  public static IStrategoConstructor _consAnnoCong_2;

  public static IStrategoConstructor _consCongQ_2;

  public static IStrategoConstructor _consCharCong_1;

  public static IStrategoConstructor _consRealCong_1;

  public static IStrategoConstructor _consIntCong_1;

  public static IStrategoConstructor _consStrCong_1;

  public static IStrategoConstructor _consPrim_2;

  public static IStrategoConstructor _consPrimNoArgs_1;

  public static IStrategoConstructor _consTest_1;

  public static IStrategoConstructor _consWith_1;

  public static IStrategoConstructor _consWhere_1;

  public static IStrategoConstructor _consNot_1;

  public static IStrategoConstructor _consRec_2;

  public static IStrategoConstructor _consLChoice_2;

  public static IStrategoConstructor _consScopeDefault_1;

  public static IStrategoConstructor _consCall_2;

  public static IStrategoConstructor _consDefaultVarDec_1;

  public static IStrategoConstructor _consSDef_3;

  public static IStrategoConstructor _consSDefNoArgs_2;

  public static IStrategoConstructor _consWithClause_1;

  public static IStrategoConstructor _consWhereClause_1;

  public static IStrategoConstructor _consRule_3;

  public static IStrategoConstructor _consRuleNoCond_2;

  public static IStrategoConstructor _consRDefT_4;

  public static IStrategoConstructor _consRDef_3;

  public static IStrategoConstructor _consRDefNoArgs_2;

  public static IStrategoConstructor _consSeq_2;

  public static IStrategoConstructor _consAM_2;

  public static IStrategoConstructor _consBA_2;

  public static IStrategoConstructor _consDynRuleIntersectUnion_4;

  public static IStrategoConstructor _consDynRuleUnion_3;

  public static IStrategoConstructor _consDynRuleIntersect_3;

  public static IStrategoConstructor _consDynRuleIntersectUnionFix_3;

  public static IStrategoConstructor _consDynRuleUnionFix_2;

  public static IStrategoConstructor _consDynRuleIntersectFix_2;

  public static IStrategoConstructor _consRuleNames_1;

  public static IStrategoConstructor _consRDecT_3;

  public static IStrategoConstructor _consRDec_2;

  public static IStrategoConstructor _consRDecNoArgs_1;

  public static IStrategoConstructor _consDynRuleScopeId_1;

  public static IStrategoConstructor _consLabeledDynRuleScopeId_2;

  public static IStrategoConstructor _consDynRuleId_1;

  public static IStrategoConstructor _consAddLabelDynRuleId_2;

  public static IStrategoConstructor _consLabeledDynRuleId_2;

  public static IStrategoConstructor _consSetDynRuleDepends_3;

  public static IStrategoConstructor _consDynRuleAssignAdd_2;

  public static IStrategoConstructor _consDynRuleAssign_2;

  public static IStrategoConstructor _consSetDynRuleMatch_2;

  public static IStrategoConstructor _consAddDynRule_2;

  public static IStrategoConstructor _consSetDynRule_2;

  public static IStrategoConstructor _consUndefineDynRule_2;

  public static IStrategoConstructor _consAddScopeLabel_2;

  public static IStrategoConstructor _consGenDynRules_1;

  public static IStrategoConstructor _consScopeLabels_1;

  public static IStrategoConstructor _consDynRuleScope_2;

  public static IStrategoConstructor _consOverlay_3;

  public static IStrategoConstructor _consOverlayNoArgs_2;

  public static IStrategoConstructor _consImportRenamed_2;

  public static IStrategoConstructor _consImport_1;

  public static IStrategoConstructor _consNoImports_0;

  public static IStrategoConstructor _consImports_1;

  public static IStrategoConstructor _consModule_3;

  public static IStrategoConstructor _consSortAndConstructor_2;

  public static IStrategoConstructor _consConstructor_1;

  public static IStrategoConstructor _consConstructorOnly_1;

  public static IStrategoConstructor _consString_1;

  public static IStrategoConstructor _consListSort_1;

  public static IStrategoConstructor _consSort_1;

  public static IStrategoConstructor _consIndentDef_1;

  public static IStrategoConstructor _consFenceDef_2;

  public static IStrategoConstructor _consNoContinuation_0;

  public static IStrategoConstructor _consBlockCommentDef_3;

  public static IStrategoConstructor _consIndentDefs_1;

  public static IStrategoConstructor _consFenceDefs_1;

  public static IStrategoConstructor _consBlockCommentDefs_1;

  public static IStrategoConstructor _consLineCommentPrefix_1;

  public static IStrategoConstructor _consUnmanagedTablePrefix_1;

  public static IStrategoConstructor _consAliases_1;

  public static IStrategoConstructor _consExtends_1;

  public static IStrategoConstructor _consURL_1;

  public static IStrategoConstructor _consStartSymbols_1;

  public static IStrategoConstructor _consTableProvider_1;

  public static IStrategoConstructor _consTable_1;

  public static IStrategoConstructor _consDescription_1;

  public static IStrategoConstructor _consExtensions_1;

  public static IStrategoConstructor _consLanguageId_1;

  public static IStrategoConstructor _consLanguageName_1;

  public static IStrategoConstructor _consValues_1;

  public static IStrategoConstructor _consLanguage_2;

  public static IStrategoConstructor _consAttribute_1;

  public static IStrategoConstructor _consStrategy_1;

  public static IStrategoConstructor _consOnSave_2;

  public static IStrategoConstructor _consSemanticProvider_1;

  public static IStrategoConstructor _consFolded_0;

  public static IStrategoConstructor _consFoldRuleAll_2;

  public static IStrategoConstructor _consFoldRule_2;

  public static IStrategoConstructor _consFolding_2;

  public static IStrategoConstructor _consOutlineRule_1;

  public static IStrategoConstructor _consOutliner_2;

  public static IStrategoConstructor _consColorDef_2;

  public static IStrategoConstructor _consNoColor_0;

  public static IStrategoConstructor _consColorRGB_3;

  public static IStrategoConstructor _consColorDefault_0;

  public static IStrategoConstructor _consBOLD_ITALIC_0;

  public static IStrategoConstructor _consITALIC_0;

  public static IStrategoConstructor _consBOLD_0;

  public static IStrategoConstructor _consNORMAL_0;

  public static IStrategoConstructor _consTK_UNKNOWN_0;

  public static IStrategoConstructor _consTK_ERROR_0;

  public static IStrategoConstructor _consTK_VAR_0;

  public static IStrategoConstructor _consTK_OPERATOR_0;

  public static IStrategoConstructor _consTK_KEYWORD_0;

  public static IStrategoConstructor _consTK_STRING_0;

  public static IStrategoConstructor _consTK_LAYOUT_0;

  public static IStrategoConstructor _consTK_NUMBER_0;

  public static IStrategoConstructor _consTK_IDENTIFIER_0;

  public static IStrategoConstructor _consLiteral_1;

  public static IStrategoConstructor _consToken_1;

  public static IStrategoConstructor _consAttributeRef_1;

  public static IStrategoConstructor _consAttribute_3;

  public static IStrategoConstructor _consColorRuleNamed_3;

  public static IStrategoConstructor _consColorRuleAllNamed_3;

  public static IStrategoConstructor _consColorRule_2;

  public static IStrategoConstructor _consColorRuleAll_2;

  public static IStrategoConstructor _consColorer_2;

  public static IStrategoConstructor _consOccurrenceRule_2;

  public static IStrategoConstructor _consHoverRule_2;

  public static IStrategoConstructor _consReferenceRule_2;

  public static IStrategoConstructor _consReferenceHoverRule_3;

  public static IStrategoConstructor _consReferences_2;

  public static IStrategoConstructor _consBlank_0;

  public static IStrategoConstructor _consDisable_0;

  public static IStrategoConstructor _consPlaceholder_1;

  public static IStrategoConstructor _consCompletionTrigger_2;

  public static IStrategoConstructor _consCompletionTemplateWithSort_4;

  public static IStrategoConstructor _consCompletionTemplate_3;

  public static IStrategoConstructor _consCompletionKeyword_2;

  public static IStrategoConstructor _consIdentifierLexical_1;

  public static IStrategoConstructor _consCompletionProposer_1;

  public static IStrategoConstructor _consCompletions_2;

  public static IStrategoConstructor _consSource_0;

  public static IStrategoConstructor _consCursor_0;

  public static IStrategoConstructor _consMeta_0;

  public static IStrategoConstructor _consPersistent_0;

  public static IStrategoConstructor _consRealTime_0;

  public static IStrategoConstructor _consOpenEditor_0;

  public static IStrategoConstructor _consBuilderCaption_1;

  public static IStrategoConstructor _consBuilder_3;

  public static IStrategoConstructor _consSemanticObserver_1;

  public static IStrategoConstructor _consBuilders_2;

  public static IStrategoConstructor _consRefactoring_4;

  public static IStrategoConstructor _consPrettyPrint_1;

  public static IStrategoConstructor _consPPTable_1;

  public static IStrategoConstructor _consRefactorings_2;

  public static IStrategoConstructor _consInjectDesugaring_4;

  public static IStrategoConstructor _consPureDesugaring_1;

  public static IStrategoConstructor _consAnalyses_1;

  public static IStrategoConstructor _consDesugarings_1;

  public static IStrategoConstructor _consaliases_1;

  public static IStrategoConstructor _conscontext_free_restrictions_1;

  public static IStrategoConstructor _conslexical_restrictions_1;

  public static IStrategoConstructor _consrestrictions_1;

  public static IStrategoConstructor _conscontext_free_priorities_1;

  public static IStrategoConstructor _conslexical_priorities_1;

  public static IStrategoConstructor _conspriorities_1;

  public static IStrategoConstructor _conslexical_variables_1;

  public static IStrategoConstructor _consvariables_1;

  public static IStrategoConstructor _conscontext_free_syntax_1;

  public static IStrategoConstructor _conslexical_syntax_1;

  public static IStrategoConstructor _conssyntax_1;

  public static IStrategoConstructor _constransformation_elem_1;

  public static IStrategoConstructor _consgrammar_elem_1;

  public static IStrategoConstructor _consTransApp_2;

  public static IStrategoConstructor _consOverlays_1;

  public static IStrategoConstructor _consRules_1;

  public static IStrategoConstructor _consSignature_1;

  public static IStrategoConstructor _consStrategies_1;

  public static IStrategoConstructor _consTransformationDef_2;

  public static IStrategoConstructor _consToModelTerm_1;

  public static IStrategoConstructor _consEmptyCollection_0;

  public static IStrategoConstructor _consLocked_1;

  public static Context init(Context context)
  { 
    synchronized(ext.class)
    { 
      if(isIniting)
        return null;
      try
      { 
        isIniting = true;
        ITermFactory termFactory = context.getFactory();
        if(constantFactory == null)
        { 
          initConstructors(termFactory);
          initConstants(termFactory);
        }
        if(initedContext == null || initedContext.get() != context)
        { 
          org.strategoxt.stratego_lib.Main.init(context);
          context.registerComponent("extraction");
        }
        initedContext = new WeakReference<Context>(context);
        constantFactory = termFactory;
      }
      finally
      { 
        isIniting = false;
      }
      return context;
    }
  }

  public static Context init()
  { 
    return init(new Context());
  }

  public static Strategy getMainStrategy()
  { 
    return null;
  }

  public static void initConstructors(ITermFactory termFactory)
  { 
    _consConc_2 = termFactory.makeConstructor("Conc", 2);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consmodule_1 = termFactory.makeConstructor("module", 1);
    _consid_1 = termFactory.makeConstructor("id", 1);
    _consmodule_3 = termFactory.makeConstructor("module", 3);
    _conssorts_1 = termFactory.makeConstructor("sorts", 1);
    _consDR_DUMMY_0 = termFactory.makeConstructor("DR_DUMMY", 0);
    _consDR_UNDEFINE_1 = termFactory.makeConstructor("DR_UNDEFINE", 1);
    _consPlainBody_1 = termFactory.makeConstructor("PlainBody", 1);
    _consPlainDecHead_3 = termFactory.makeConstructor("PlainDecHead", 3);
    _consPlainDec_2 = termFactory.makeConstructor("PlainDec", 2);
    _consdefinition_1 = termFactory.makeConstructor("definition", 1);
    _consfile_start_0 = termFactory.makeConstructor("file-start", 0);
    _consstart_0 = termFactory.makeConstructor("start", 0);
    _consprod_3 = termFactory.makeConstructor("prod", 3);
    _consno_attrs_0 = termFactory.makeConstructor("no-attrs", 0);
    _consattrs_1 = termFactory.makeConstructor("attrs", 1);
    _consterm_1 = termFactory.makeConstructor("term", 1);
    _consannotated_2 = termFactory.makeConstructor("annotated", 2);
    _consplaceholder_1 = termFactory.makeConstructor("placeholder", 1);
    _consappl_2 = termFactory.makeConstructor("appl", 2);
    _consfun_1 = termFactory.makeConstructor("fun", 1);
    _consreal_1 = termFactory.makeConstructor("real", 1);
    _consint_1 = termFactory.makeConstructor("int", 1);
    _consnegative_1 = termFactory.makeConstructor("negative", 1);
    _conspositive_1 = termFactory.makeConstructor("positive", 1);
    _consnatural_1 = termFactory.makeConstructor("natural", 1);
    _consreal_con_3 = termFactory.makeConstructor("real-con", 3);
    _consconc_grammars_2 = termFactory.makeConstructor("conc-grammars", 2);
    _consempty_grammar_0 = termFactory.makeConstructor("empty-grammar", 0);
    _conslayout_0 = termFactory.makeConstructor("layout", 0);
    _consvarsym_1 = termFactory.makeConstructor("varsym", 1);
    _conslex_1 = termFactory.makeConstructor("lex", 1);
    _conscf_1 = termFactory.makeConstructor("cf", 1);
    _consrenamed_module_2 = termFactory.makeConstructor("renamed-module", 2);
    _consimp_section_1 = termFactory.makeConstructor("imp-section", 1);
    _consimports_1 = termFactory.makeConstructor("imports", 1);
    _consparameterized_2 = termFactory.makeConstructor("parameterized", 2);
    _consunparameterized_1 = termFactory.makeConstructor("unparameterized", 1);
    _conshiddens_1 = termFactory.makeConstructor("hiddens", 1);
    _consexports_1 = termFactory.makeConstructor("exports", 1);
    _consproduction_2 = termFactory.makeConstructor("production", 2);
    _conssymbol_2 = termFactory.makeConstructor("symbol", 2);
    _consrenamings_1 = termFactory.makeConstructor("renamings", 1);
    _consstrategy_2 = termFactory.makeConstructor("strategy", 2);
    _consfunc_2 = termFactory.makeConstructor("func", 2);
    _constuple_2 = termFactory.makeConstructor("tuple", 2);
    _consiter_star_sep_2 = termFactory.makeConstructor("iter-star-sep", 2);
    _consiter_sep_2 = termFactory.makeConstructor("iter-sep", 2);
    _consiter_star_1 = termFactory.makeConstructor("iter-star", 1);
    _consiter_1 = termFactory.makeConstructor("iter", 1);
    _consopt_1 = termFactory.makeConstructor("opt", 1);
    _consempty_0 = termFactory.makeConstructor("empty", 0);
    _conslifting_1 = termFactory.makeConstructor("lifting", 1);
    _consassoc_3 = termFactory.makeConstructor("assoc", 3);
    _conschain_1 = termFactory.makeConstructor("chain", 1);
    _consassoc_group_2 = termFactory.makeConstructor("assoc-group", 2);
    _consprods_group_1 = termFactory.makeConstructor("prods-group", 1);
    _conssimple_group_1 = termFactory.makeConstructor("simple-group", 1);
    _consnon_transitive_1 = termFactory.makeConstructor("non-transitive", 1);
    _conswith_arguments_2 = termFactory.makeConstructor("with-arguments", 2);
    _consdefault_1 = termFactory.makeConstructor("default", 1);
    _consassoc_1 = termFactory.makeConstructor("assoc", 1);
    _consbracket_0 = termFactory.makeConstructor("bracket", 0);
    _consassoc_0 = termFactory.makeConstructor("assoc", 0);
    _consnon_assoc_0 = termFactory.makeConstructor("non-assoc", 0);
    _consright_0 = termFactory.makeConstructor("right", 0);
    _consleft_0 = termFactory.makeConstructor("left", 0);
    _consunion_2 = termFactory.makeConstructor("union", 2);
    _consisect_2 = termFactory.makeConstructor("isect", 2);
    _consdiff_2 = termFactory.makeConstructor("diff", 2);
    _conscomp_1 = termFactory.makeConstructor("comp", 1);
    _conssimple_charclass_1 = termFactory.makeConstructor("simple-charclass", 1);
    _conspresent_1 = termFactory.makeConstructor("present", 1);
    _consabsent_0 = termFactory.makeConstructor("absent", 0);
    _consconc_2 = termFactory.makeConstructor("conc", 2);
    _consrange_2 = termFactory.makeConstructor("range", 2);
    _conslabel_start_0 = termFactory.makeConstructor("label_start", 0);
    _consbot_0 = termFactory.makeConstructor("bot", 0);
    _conseof_0 = termFactory.makeConstructor("eof", 0);
    _constop_0 = termFactory.makeConstructor("top", 0);
    _consshort_1 = termFactory.makeConstructor("short", 1);
    _consnumeric_1 = termFactory.makeConstructor("numeric", 1);
    _consparameterized_sort_2 = termFactory.makeConstructor("parameterized-sort", 2);
    _conssort_1 = termFactory.makeConstructor("sort", 1);
    _conscontext_free_start_symbols_1 = termFactory.makeConstructor("context-free-start-symbols", 1);
    _conslexical_start_symbols_1 = termFactory.makeConstructor("lexical-start-symbols", 1);
    _conskernel_start_symbols_1 = termFactory.makeConstructor("kernel-start-symbols", 1);
    _consprefix_fun_4 = termFactory.makeConstructor("prefix-fun", 4);
    _consci_lit_1 = termFactory.makeConstructor("ci-lit", 1);
    _conslit_1 = termFactory.makeConstructor("lit", 1);
    _consquoted_fun_1 = termFactory.makeConstructor("quoted-fun", 1);
    _consunquoted_fun_1 = termFactory.makeConstructor("unquoted-fun", 1);
    _conslabel_2 = termFactory.makeConstructor("label", 2);
    _consunquoted_1 = termFactory.makeConstructor("unquoted", 1);
    _consquoted_1 = termFactory.makeConstructor("quoted", 1);
    _consavoid_0 = termFactory.makeConstructor("avoid", 0);
    _consprefer_0 = termFactory.makeConstructor("prefer", 0);
    _consreject_0 = termFactory.makeConstructor("reject", 0);
    _consfollow_2 = termFactory.makeConstructor("follow", 2);
    _conslist_1 = termFactory.makeConstructor("list", 1);
    _consalt_2 = termFactory.makeConstructor("alt", 2);
    _conssingle_1 = termFactory.makeConstructor("single", 1);
    _consseq_2 = termFactory.makeConstructor("seq", 2);
    _conschar_class_1 = termFactory.makeConstructor("char-class", 1);
    _consalias_2 = termFactory.makeConstructor("alias", 2);
    _consImportWildcard_1 = termFactory.makeConstructor("ImportWildcard", 1);
    _consSpecification_1 = termFactory.makeConstructor("Specification", 1);
    _consModule_2 = termFactory.makeConstructor("Module", 2);
    _consImportTerm_1 = termFactory.makeConstructor("ImportTerm", 1);
    _consAll_1 = termFactory.makeConstructor("All", 1);
    _consOne_1 = termFactory.makeConstructor("One", 1);
    _consPrimT_3 = termFactory.makeConstructor("PrimT", 3);
    _consGuardedLChoice_3 = termFactory.makeConstructor("GuardedLChoice", 3);
    _consScope_2 = termFactory.makeConstructor("Scope", 2);
    _consBuild_1 = termFactory.makeConstructor("Build", 1);
    _consMatch_1 = termFactory.makeConstructor("Match", 1);
    _consId_0 = termFactory.makeConstructor("Id", 0);
    _consFail_0 = termFactory.makeConstructor("Fail", 0);
    _consParenStrat_1 = termFactory.makeConstructor("ParenStrat", 1);
    _consVarDec_2 = termFactory.makeConstructor("VarDec", 2);
    _consExtSDef_3 = termFactory.makeConstructor("ExtSDef", 3);
    _consExtSDefInl_4 = termFactory.makeConstructor("ExtSDefInl", 4);
    _consSDefT_4 = termFactory.makeConstructor("SDefT", 4);
    _consCallDynamic_3 = termFactory.makeConstructor("CallDynamic", 3);
    _consCallT_3 = termFactory.makeConstructor("CallT", 3);
    _consLet_2 = termFactory.makeConstructor("Let", 2);
    _consSVar_1 = termFactory.makeConstructor("SVar", 1);
    _consOpQ_2 = termFactory.makeConstructor("OpQ", 2);
    _consOp_2 = termFactory.makeConstructor("Op", 2);
    _consStr_1 = termFactory.makeConstructor("Str", 1);
    _consReal_1 = termFactory.makeConstructor("Real", 1);
    _consInt_1 = termFactory.makeConstructor("Int", 1);
    _consWld_0 = termFactory.makeConstructor("Wld", 0);
    _consFunType_2 = termFactory.makeConstructor("FunType", 2);
    _consConstType_1 = termFactory.makeConstructor("ConstType", 1);
    _consExtOpDeclInj_1 = termFactory.makeConstructor("ExtOpDeclInj", 1);
    _consExtOpDeclQ_2 = termFactory.makeConstructor("ExtOpDeclQ", 2);
    _consExtOpDecl_2 = termFactory.makeConstructor("ExtOpDecl", 2);
    _consOpDeclInj_1 = termFactory.makeConstructor("OpDeclInj", 1);
    _consOpDeclQ_2 = termFactory.makeConstructor("OpDeclQ", 2);
    _consOpDecl_2 = termFactory.makeConstructor("OpDecl", 2);
    _consSort_2 = termFactory.makeConstructor("Sort", 2);
    _consSortNoArgs_1 = termFactory.makeConstructor("SortNoArgs", 1);
    _consSortVar_1 = termFactory.makeConstructor("SortVar", 1);
    _consConstructors_1 = termFactory.makeConstructor("Constructors", 1);
    _consSorts_1 = termFactory.makeConstructor("Sorts", 1);
    _consStarStar_0 = termFactory.makeConstructor("StarStar", 0);
    _consStar_0 = termFactory.makeConstructor("Star", 0);
    _consSortTuple_1 = termFactory.makeConstructor("SortTuple", 1);
    _consSortListTl_2 = termFactory.makeConstructor("SortListTl", 2);
    _consSortList_1 = termFactory.makeConstructor("SortList", 1);
    _consAs_2 = termFactory.makeConstructor("As", 2);
    _consExplode_2 = termFactory.makeConstructor("Explode", 2);
    _consListTail_2 = termFactory.makeConstructor("ListTail", 2);
    _consList_1 = termFactory.makeConstructor("List", 1);
    _consTuple_1 = termFactory.makeConstructor("Tuple", 1);
    _consRootApp_1 = termFactory.makeConstructor("RootApp", 1);
    _consApp_2 = termFactory.makeConstructor("App", 2);
    _consNoAnnoList_1 = termFactory.makeConstructor("NoAnnoList", 1);
    _consAnnoList_2 = termFactory.makeConstructor("AnnoList", 2);
    _consChar_1 = termFactory.makeConstructor("Char", 1);
    _consBuildDefault_1 = termFactory.makeConstructor("BuildDefault", 1);
    _consBuildDefaultPT_1 = termFactory.makeConstructor("BuildDefaultPT", 1);
    _consVar_1 = termFactory.makeConstructor("Var", 1);
    _consListVar_1 = termFactory.makeConstructor("ListVar", 1);
    _consAssign_2 = termFactory.makeConstructor("Assign", 2);
    _consSwitchCase_2 = termFactory.makeConstructor("SwitchCase", 2);
    _consSwitchChoice_3 = termFactory.makeConstructor("SwitchChoice", 3);
    _consSwitchChoiceNoOtherwise_2 = termFactory.makeConstructor("SwitchChoiceNoOtherwise", 2);
    _consIfThen_2 = termFactory.makeConstructor("IfThen", 2);
    _consCondChoice_3 = termFactory.makeConstructor("CondChoice", 3);
    _consRChoice_2 = termFactory.makeConstructor("RChoice", 2);
    _consChoice_2 = termFactory.makeConstructor("Choice", 2);
    _consSRule_1 = termFactory.makeConstructor("SRule", 1);
    _consLRule_1 = termFactory.makeConstructor("LRule", 1);
    _consCallNoArgs_1 = termFactory.makeConstructor("CallNoArgs", 1);
    _consExplodeCong_2 = termFactory.makeConstructor("ExplodeCong", 2);
    _consListCong_2 = termFactory.makeConstructor("ListCong", 2);
    _consListCongNoTail_1 = termFactory.makeConstructor("ListCongNoTail", 1);
    _consTupleCong_2 = termFactory.makeConstructor("TupleCong", 2);
    _consEmptyTupleCong_0 = termFactory.makeConstructor("EmptyTupleCong", 0);
    _consStrategyCurly_1 = termFactory.makeConstructor("StrategyCurly", 1);
    _consAnnoCong_2 = termFactory.makeConstructor("AnnoCong", 2);
    _consCongQ_2 = termFactory.makeConstructor("CongQ", 2);
    _consCharCong_1 = termFactory.makeConstructor("CharCong", 1);
    _consRealCong_1 = termFactory.makeConstructor("RealCong", 1);
    _consIntCong_1 = termFactory.makeConstructor("IntCong", 1);
    _consStrCong_1 = termFactory.makeConstructor("StrCong", 1);
    _consPrim_2 = termFactory.makeConstructor("Prim", 2);
    _consPrimNoArgs_1 = termFactory.makeConstructor("PrimNoArgs", 1);
    _consTest_1 = termFactory.makeConstructor("Test", 1);
    _consWith_1 = termFactory.makeConstructor("With", 1);
    _consWhere_1 = termFactory.makeConstructor("Where", 1);
    _consNot_1 = termFactory.makeConstructor("Not", 1);
    _consRec_2 = termFactory.makeConstructor("Rec", 2);
    _consLChoice_2 = termFactory.makeConstructor("LChoice", 2);
    _consScopeDefault_1 = termFactory.makeConstructor("ScopeDefault", 1);
    _consCall_2 = termFactory.makeConstructor("Call", 2);
    _consDefaultVarDec_1 = termFactory.makeConstructor("DefaultVarDec", 1);
    _consSDef_3 = termFactory.makeConstructor("SDef", 3);
    _consSDefNoArgs_2 = termFactory.makeConstructor("SDefNoArgs", 2);
    _consWithClause_1 = termFactory.makeConstructor("WithClause", 1);
    _consWhereClause_1 = termFactory.makeConstructor("WhereClause", 1);
    _consRule_3 = termFactory.makeConstructor("Rule", 3);
    _consRuleNoCond_2 = termFactory.makeConstructor("RuleNoCond", 2);
    _consRDefT_4 = termFactory.makeConstructor("RDefT", 4);
    _consRDef_3 = termFactory.makeConstructor("RDef", 3);
    _consRDefNoArgs_2 = termFactory.makeConstructor("RDefNoArgs", 2);
    _consSeq_2 = termFactory.makeConstructor("Seq", 2);
    _consAM_2 = termFactory.makeConstructor("AM", 2);
    _consBA_2 = termFactory.makeConstructor("BA", 2);
    _consDynRuleIntersectUnion_4 = termFactory.makeConstructor("DynRuleIntersectUnion", 4);
    _consDynRuleUnion_3 = termFactory.makeConstructor("DynRuleUnion", 3);
    _consDynRuleIntersect_3 = termFactory.makeConstructor("DynRuleIntersect", 3);
    _consDynRuleIntersectUnionFix_3 = termFactory.makeConstructor("DynRuleIntersectUnionFix", 3);
    _consDynRuleUnionFix_2 = termFactory.makeConstructor("DynRuleUnionFix", 2);
    _consDynRuleIntersectFix_2 = termFactory.makeConstructor("DynRuleIntersectFix", 2);
    _consRuleNames_1 = termFactory.makeConstructor("RuleNames", 1);
    _consRDecT_3 = termFactory.makeConstructor("RDecT", 3);
    _consRDec_2 = termFactory.makeConstructor("RDec", 2);
    _consRDecNoArgs_1 = termFactory.makeConstructor("RDecNoArgs", 1);
    _consDynRuleScopeId_1 = termFactory.makeConstructor("DynRuleScopeId", 1);
    _consLabeledDynRuleScopeId_2 = termFactory.makeConstructor("LabeledDynRuleScopeId", 2);
    _consDynRuleId_1 = termFactory.makeConstructor("DynRuleId", 1);
    _consAddLabelDynRuleId_2 = termFactory.makeConstructor("AddLabelDynRuleId", 2);
    _consLabeledDynRuleId_2 = termFactory.makeConstructor("LabeledDynRuleId", 2);
    _consSetDynRuleDepends_3 = termFactory.makeConstructor("SetDynRuleDepends", 3);
    _consDynRuleAssignAdd_2 = termFactory.makeConstructor("DynRuleAssignAdd", 2);
    _consDynRuleAssign_2 = termFactory.makeConstructor("DynRuleAssign", 2);
    _consSetDynRuleMatch_2 = termFactory.makeConstructor("SetDynRuleMatch", 2);
    _consAddDynRule_2 = termFactory.makeConstructor("AddDynRule", 2);
    _consSetDynRule_2 = termFactory.makeConstructor("SetDynRule", 2);
    _consUndefineDynRule_2 = termFactory.makeConstructor("UndefineDynRule", 2);
    _consAddScopeLabel_2 = termFactory.makeConstructor("AddScopeLabel", 2);
    _consGenDynRules_1 = termFactory.makeConstructor("GenDynRules", 1);
    _consScopeLabels_1 = termFactory.makeConstructor("ScopeLabels", 1);
    _consDynRuleScope_2 = termFactory.makeConstructor("DynRuleScope", 2);
    _consOverlay_3 = termFactory.makeConstructor("Overlay", 3);
    _consOverlayNoArgs_2 = termFactory.makeConstructor("OverlayNoArgs", 2);
    _consImportRenamed_2 = termFactory.makeConstructor("ImportRenamed", 2);
    _consImport_1 = termFactory.makeConstructor("Import", 1);
    _consNoImports_0 = termFactory.makeConstructor("NoImports", 0);
    _consImports_1 = termFactory.makeConstructor("Imports", 1);
    _consModule_3 = termFactory.makeConstructor("Module", 3);
    _consSortAndConstructor_2 = termFactory.makeConstructor("SortAndConstructor", 2);
    _consConstructor_1 = termFactory.makeConstructor("Constructor", 1);
    _consConstructorOnly_1 = termFactory.makeConstructor("ConstructorOnly", 1);
    _consString_1 = termFactory.makeConstructor("String", 1);
    _consListSort_1 = termFactory.makeConstructor("ListSort", 1);
    _consSort_1 = termFactory.makeConstructor("Sort", 1);
    _consIndentDef_1 = termFactory.makeConstructor("IndentDef", 1);
    _consFenceDef_2 = termFactory.makeConstructor("FenceDef", 2);
    _consNoContinuation_0 = termFactory.makeConstructor("NoContinuation", 0);
    _consBlockCommentDef_3 = termFactory.makeConstructor("BlockCommentDef", 3);
    _consIndentDefs_1 = termFactory.makeConstructor("IndentDefs", 1);
    _consFenceDefs_1 = termFactory.makeConstructor("FenceDefs", 1);
    _consBlockCommentDefs_1 = termFactory.makeConstructor("BlockCommentDefs", 1);
    _consLineCommentPrefix_1 = termFactory.makeConstructor("LineCommentPrefix", 1);
    _consUnmanagedTablePrefix_1 = termFactory.makeConstructor("UnmanagedTablePrefix", 1);
    _consAliases_1 = termFactory.makeConstructor("Aliases", 1);
    _consExtends_1 = termFactory.makeConstructor("Extends", 1);
    _consURL_1 = termFactory.makeConstructor("URL", 1);
    _consStartSymbols_1 = termFactory.makeConstructor("StartSymbols", 1);
    _consTableProvider_1 = termFactory.makeConstructor("TableProvider", 1);
    _consTable_1 = termFactory.makeConstructor("Table", 1);
    _consDescription_1 = termFactory.makeConstructor("Description", 1);
    _consExtensions_1 = termFactory.makeConstructor("Extensions", 1);
    _consLanguageId_1 = termFactory.makeConstructor("LanguageId", 1);
    _consLanguageName_1 = termFactory.makeConstructor("LanguageName", 1);
    _consValues_1 = termFactory.makeConstructor("Values", 1);
    _consLanguage_2 = termFactory.makeConstructor("Language", 2);
    _consAttribute_1 = termFactory.makeConstructor("Attribute", 1);
    _consStrategy_1 = termFactory.makeConstructor("Strategy", 1);
    _consOnSave_2 = termFactory.makeConstructor("OnSave", 2);
    _consSemanticProvider_1 = termFactory.makeConstructor("SemanticProvider", 1);
    _consFolded_0 = termFactory.makeConstructor("Folded", 0);
    _consFoldRuleAll_2 = termFactory.makeConstructor("FoldRuleAll", 2);
    _consFoldRule_2 = termFactory.makeConstructor("FoldRule", 2);
    _consFolding_2 = termFactory.makeConstructor("Folding", 2);
    _consOutlineRule_1 = termFactory.makeConstructor("OutlineRule", 1);
    _consOutliner_2 = termFactory.makeConstructor("Outliner", 2);
    _consColorDef_2 = termFactory.makeConstructor("ColorDef", 2);
    _consNoColor_0 = termFactory.makeConstructor("NoColor", 0);
    _consColorRGB_3 = termFactory.makeConstructor("ColorRGB", 3);
    _consColorDefault_0 = termFactory.makeConstructor("ColorDefault", 0);
    _consBOLD_ITALIC_0 = termFactory.makeConstructor("BOLD_ITALIC", 0);
    _consITALIC_0 = termFactory.makeConstructor("ITALIC", 0);
    _consBOLD_0 = termFactory.makeConstructor("BOLD", 0);
    _consNORMAL_0 = termFactory.makeConstructor("NORMAL", 0);
    _consTK_UNKNOWN_0 = termFactory.makeConstructor("TK_UNKNOWN", 0);
    _consTK_ERROR_0 = termFactory.makeConstructor("TK_ERROR", 0);
    _consTK_VAR_0 = termFactory.makeConstructor("TK_VAR", 0);
    _consTK_OPERATOR_0 = termFactory.makeConstructor("TK_OPERATOR", 0);
    _consTK_KEYWORD_0 = termFactory.makeConstructor("TK_KEYWORD", 0);
    _consTK_STRING_0 = termFactory.makeConstructor("TK_STRING", 0);
    _consTK_LAYOUT_0 = termFactory.makeConstructor("TK_LAYOUT", 0);
    _consTK_NUMBER_0 = termFactory.makeConstructor("TK_NUMBER", 0);
    _consTK_IDENTIFIER_0 = termFactory.makeConstructor("TK_IDENTIFIER", 0);
    _consLiteral_1 = termFactory.makeConstructor("Literal", 1);
    _consToken_1 = termFactory.makeConstructor("Token", 1);
    _consAttributeRef_1 = termFactory.makeConstructor("AttributeRef", 1);
    _consAttribute_3 = termFactory.makeConstructor("Attribute", 3);
    _consColorRuleNamed_3 = termFactory.makeConstructor("ColorRuleNamed", 3);
    _consColorRuleAllNamed_3 = termFactory.makeConstructor("ColorRuleAllNamed", 3);
    _consColorRule_2 = termFactory.makeConstructor("ColorRule", 2);
    _consColorRuleAll_2 = termFactory.makeConstructor("ColorRuleAll", 2);
    _consColorer_2 = termFactory.makeConstructor("Colorer", 2);
    _consOccurrenceRule_2 = termFactory.makeConstructor("OccurrenceRule", 2);
    _consHoverRule_2 = termFactory.makeConstructor("HoverRule", 2);
    _consReferenceRule_2 = termFactory.makeConstructor("ReferenceRule", 2);
    _consReferenceHoverRule_3 = termFactory.makeConstructor("ReferenceHoverRule", 3);
    _consReferences_2 = termFactory.makeConstructor("References", 2);
    _consBlank_0 = termFactory.makeConstructor("Blank", 0);
    _consDisable_0 = termFactory.makeConstructor("Disable", 0);
    _consPlaceholder_1 = termFactory.makeConstructor("Placeholder", 1);
    _consCompletionTrigger_2 = termFactory.makeConstructor("CompletionTrigger", 2);
    _consCompletionTemplateWithSort_4 = termFactory.makeConstructor("CompletionTemplateWithSort", 4);
    _consCompletionTemplate_3 = termFactory.makeConstructor("CompletionTemplate", 3);
    _consCompletionKeyword_2 = termFactory.makeConstructor("CompletionKeyword", 2);
    _consIdentifierLexical_1 = termFactory.makeConstructor("IdentifierLexical", 1);
    _consCompletionProposer_1 = termFactory.makeConstructor("CompletionProposer", 1);
    _consCompletions_2 = termFactory.makeConstructor("Completions", 2);
    _consSource_0 = termFactory.makeConstructor("Source", 0);
    _consCursor_0 = termFactory.makeConstructor("Cursor", 0);
    _consMeta_0 = termFactory.makeConstructor("Meta", 0);
    _consPersistent_0 = termFactory.makeConstructor("Persistent", 0);
    _consRealTime_0 = termFactory.makeConstructor("RealTime", 0);
    _consOpenEditor_0 = termFactory.makeConstructor("OpenEditor", 0);
    _consBuilderCaption_1 = termFactory.makeConstructor("BuilderCaption", 1);
    _consBuilder_3 = termFactory.makeConstructor("Builder", 3);
    _consSemanticObserver_1 = termFactory.makeConstructor("SemanticObserver", 1);
    _consBuilders_2 = termFactory.makeConstructor("Builders", 2);
    _consRefactoring_4 = termFactory.makeConstructor("Refactoring", 4);
    _consPrettyPrint_1 = termFactory.makeConstructor("PrettyPrint", 1);
    _consPPTable_1 = termFactory.makeConstructor("PPTable", 1);
    _consRefactorings_2 = termFactory.makeConstructor("Refactorings", 2);
    _consInjectDesugaring_4 = termFactory.makeConstructor("InjectDesugaring", 4);
    _consPureDesugaring_1 = termFactory.makeConstructor("PureDesugaring", 1);
    _consAnalyses_1 = termFactory.makeConstructor("Analyses", 1);
    _consDesugarings_1 = termFactory.makeConstructor("Desugarings", 1);
    _consaliases_1 = termFactory.makeConstructor("aliases", 1);
    _conscontext_free_restrictions_1 = termFactory.makeConstructor("context-free-restrictions", 1);
    _conslexical_restrictions_1 = termFactory.makeConstructor("lexical-restrictions", 1);
    _consrestrictions_1 = termFactory.makeConstructor("restrictions", 1);
    _conscontext_free_priorities_1 = termFactory.makeConstructor("context-free-priorities", 1);
    _conslexical_priorities_1 = termFactory.makeConstructor("lexical-priorities", 1);
    _conspriorities_1 = termFactory.makeConstructor("priorities", 1);
    _conslexical_variables_1 = termFactory.makeConstructor("lexical-variables", 1);
    _consvariables_1 = termFactory.makeConstructor("variables", 1);
    _conscontext_free_syntax_1 = termFactory.makeConstructor("context-free-syntax", 1);
    _conslexical_syntax_1 = termFactory.makeConstructor("lexical-syntax", 1);
    _conssyntax_1 = termFactory.makeConstructor("syntax", 1);
    _constransformation_elem_1 = termFactory.makeConstructor("transformation-elem", 1);
    _consgrammar_elem_1 = termFactory.makeConstructor("grammar-elem", 1);
    _consTransApp_2 = termFactory.makeConstructor("TransApp", 2);
    _consOverlays_1 = termFactory.makeConstructor("Overlays", 1);
    _consRules_1 = termFactory.makeConstructor("Rules", 1);
    _consSignature_1 = termFactory.makeConstructor("Signature", 1);
    _consStrategies_1 = termFactory.makeConstructor("Strategies", 1);
    _consTransformationDef_2 = termFactory.makeConstructor("TransformationDef", 2);
    _consToModelTerm_1 = termFactory.makeConstructor("ToModelTerm", 1);
    _consEmptyCollection_0 = termFactory.makeConstructor("EmptyCollection", 0);
    _consLocked_1 = termFactory.makeConstructor("Locked", 1);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    initConstants0(termFactory);
    constSortNoArgs280 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const291});
    const292 = termFactory.makeString("Sdf2StrCon");
    constSortNoArgs281 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const292});
    const293 = termFactory.makeString("Sdf2StrChar");
    constSortNoArgs282 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const293});
    const294 = termFactory.makeString("Sdf2RealCon");
    constSortNoArgs283 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const294});
    const295 = termFactory.makeString("RealCon");
    constSortNoArgs284 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const295});
    const296 = termFactory.makeString("Sdf2OptExp");
    constSortNoArgs285 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const296});
    const297 = termFactory.makeString("OptExp");
    constSortNoArgs286 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const297});
    const298 = termFactory.makeString("Sdf2IntCon");
    constSortNoArgs287 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const298});
    const299 = termFactory.makeString("IntCon");
    constSortNoArgs288 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const299});
    const300 = termFactory.makeString("Sdf2NatCon");
    constSortNoArgs289 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const300});
    const301 = termFactory.makeString("Sdf2Lookahead");
    constSortNoArgs290 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const301});
    const302 = termFactory.makeString("Lookahead");
    constSortNoArgs291 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const302});
    const303 = termFactory.makeString("Sdf2Grammar");
    constSortNoArgs292 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const303});
    const304 = termFactory.makeString("Grammar");
    constSortNoArgs293 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const304});
    const305 = termFactory.makeString("Sdf2Symbol");
    constSortNoArgs294 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const305});
    const306 = termFactory.makeString("Sdf2Group");
    constSortNoArgs295 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const306});
    const307 = termFactory.makeString("Group");
    constSortNoArgs296 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const307});
    const308 = termFactory.makeString("Sdf2CharRanges");
    constSortNoArgs297 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const308});
    const309 = termFactory.makeString("Sdf2CharClass");
    constSortNoArgs298 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const309});
    const310 = termFactory.makeString("CharClass");
    constSortNoArgs299 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const310});
    const311 = termFactory.makeString("Sdf2Lookaheads");
    constSortNoArgs300 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const311});
    const312 = termFactory.makeString("Lookaheads");
    constSortNoArgs301 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const312});
    const313 = termFactory.makeString("EditorServiceImport");
    constSortNoArgs302 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const313});
    const314 = termFactory.makeString("EditorServiceImports");
    constSortNoArgs303 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const314});
    const315 = termFactory.makeString("EditorServiceModule");
    constSortNoArgs304 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const315});
    const316 = termFactory.makeString("EditorServiceFileName");
    constSortNoArgs305 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const316});
    const317 = termFactory.makeString("EditorServiceBuilderOption");
    constSortNoArgs306 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const317});
    const318 = termFactory.makeString("BuilderOption");
    constSortNoArgs307 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const318});
    const319 = termFactory.makeString("EditorServiceCompletionAnno");
    constSortNoArgs308 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const319});
    const320 = termFactory.makeString("CompletionAnno");
    constSortNoArgs309 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const320});
    const321 = termFactory.makeString("EditorServiceCompletionPart");
    constSortNoArgs310 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const321});
    const322 = termFactory.makeString("Alt");
    const323 = termFactory.makeString("build: ");
    const324 = termFactory.makeString("Argument of constructor ");
    const325 = termFactory.makeString(" lacks sort annotation, expected: ");
    const326 = termFactory.makeString("Mismatching argument sort for constructor '");
    const327 = termFactory.makeString("'.");
    const328 = termFactory.makeString(" Was ");
    const329 = termFactory.makeString(",");
    const330 = termFactory.makeString(" expected ");
    const331 = termFactory.makeString(".");
    const332 = termFactory.makeString("ToModelTerm");
    const333 = termFactory.makeString("ModelTerm");
    constSortNoArgs311 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const333});
    const334 = termFactory.makeString("Strategies");
    constCons13 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs54, (IStrategoList)extraction.constNil0);
    constSort12 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons13});
    constCons14 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs210, (IStrategoList)extraction.constNil0);
    constSort13 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons14});
    const335 = termFactory.makeString("Signature");
    constCons15 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs211, (IStrategoList)extraction.constNil0);
    constSort14 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons15});
    const336 = termFactory.makeString("Rules");
    constCons16 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs181, (IStrategoList)extraction.constNil0);
    constSort15 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons16});
    const337 = termFactory.makeString("Overlays");
    constCons17 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs182, (IStrategoList)extraction.constNil0);
    constSort16 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons17});
    const338 = termFactory.makeString("TransApp");
    const339 = termFactory.makeString("grammar-elem");
    const340 = termFactory.makeString("SugarDefElem");
    constSortNoArgs312 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const340});
    const341 = termFactory.makeString("transformation-elem");
    const342 = termFactory.makeString("sorts");
    const343 = termFactory.makeString("syntax");
    const344 = termFactory.makeString("lexical-syntax");
    const345 = termFactory.makeString("context-free-syntax");
    const346 = termFactory.makeString("variables");
    const347 = termFactory.makeString("lexical-variables");
    const348 = termFactory.makeString("priorities");
    const349 = termFactory.makeString("lexical-priorities");
    const350 = termFactory.makeString("context-free-priorities");
    const351 = termFactory.makeString("restrictions");
    const352 = termFactory.makeString("lexical-restrictions");
    const353 = termFactory.makeString("context-free-restrictions");
    const354 = termFactory.makeString("aliases");
    const355 = termFactory.makeString("Desugaring");
    constSortNoArgs313 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const355});
    constCons18 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs313, (IStrategoList)extraction.constNil0);
    constSort17 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons18});
    const356 = termFactory.makeString("Desugarings");
    constCons19 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs89, (IStrategoList)extraction.constNil0);
    constSort18 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons19});
    const357 = termFactory.makeString("Analyses");
    const358 = termFactory.makeString("PureDesugaring");
    const359 = termFactory.makeString("InjectDesugaring");
    const360 = termFactory.makeString("Refactorings");
    constCons20 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs144, (IStrategoList)extraction.constNil0);
    constSort19 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons20});
    const361 = termFactory.makeString("PPTable");
    const362 = termFactory.makeString("PrettyPrint");
    constCons21 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs5, (IStrategoList)extraction.constNil0);
    constSort20 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons21});
    const363 = termFactory.makeString("Refactoring");
    constCons22 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs307, (IStrategoList)extraction.constNil0);
    constSort21 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons22});
    const364 = termFactory.makeString("Builders");
    constCons23 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs146, (IStrategoList)extraction.constNil0);
    constSort22 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons23});
    const365 = termFactory.makeString("SemanticObserver");
    const366 = termFactory.makeString("Builder");
    const367 = termFactory.makeString("BuilderCaption");
    const368 = termFactory.makeString("OpenEditor");
    const369 = termFactory.makeString("RealTime");
    const370 = termFactory.makeString("Persistent");
    const371 = termFactory.makeString("Meta");
    const372 = termFactory.makeString("Cursor");
    const373 = termFactory.makeString("Source");
    const374 = termFactory.makeString("Completions");
    constCons24 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs148, (IStrategoList)extraction.constNil0);
    constSort23 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons24});
    const375 = termFactory.makeString("CompletionProposer");
    const376 = termFactory.makeString("IdentifierLexical");
    const377 = termFactory.makeString("CompletionKeyword");
    const378 = termFactory.makeString("CompletionTemplate");
    constCons25 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs92, (IStrategoList)extraction.constNil0);
    constSort24 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons25});
    const379 = termFactory.makeString("CompletionTemplateWithSort");
    const380 = termFactory.makeString("CompletionTrigger");
    const381 = termFactory.makeString("None");
    const382 = termFactory.makeString("Disable");
    const383 = termFactory.makeString("Blank");
    const384 = termFactory.makeString("References");
    constCons26 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs150, (IStrategoList)extraction.constNil0);
    constSort25 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons26});
    const385 = termFactory.makeString("ReferenceHoverRule");
    const386 = termFactory.makeString("HoverRule");
    const387 = termFactory.makeString("OccurrenceRule");
    const388 = termFactory.makeString("Colorer");
    constCons27 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs117, (IStrategoList)extraction.constNil0);
    constSort26 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons27});
    const389 = termFactory.makeString("ColorRuleAll");
    const390 = termFactory.makeString("ColorRuleAllNamed");
    const391 = termFactory.makeString("ColorRuleNamed");
    const392 = termFactory.makeString("AttributeRef");
    const393 = termFactory.makeString("Token");
    const394 = termFactory.makeString("Literal");
    const395 = termFactory.makeString("TK_IDENTIFIER");
    const396 = termFactory.makeString("TK_NUMBER");
    const397 = termFactory.makeString("TK_LAYOUT");
    const398 = termFactory.makeString("TK_STRING");
    const399 = termFactory.makeString("TK_KEYWORD");
    const400 = termFactory.makeString("TK_OPERATOR");
    const401 = termFactory.makeString("TK_VAR");
    const402 = termFactory.makeString("TK_ERROR");
    const403 = termFactory.makeString("TK_UNKNOWN");
    const404 = termFactory.makeString("NORMAL");
    const405 = termFactory.makeString("BOLD");
    const406 = termFactory.makeString("ITALIC");
    const407 = termFactory.makeString("BOLD_ITALIC");
    const408 = termFactory.makeString("ColorDefault");
    const409 = termFactory.makeString("ColorRGB");
    const410 = termFactory.makeString("ColorDef");
    const411 = termFactory.makeString("Outliner");
    constCons28 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs119, (IStrategoList)extraction.constNil0);
    constSort27 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons28});
    const412 = termFactory.makeString("Folding");
    constCons29 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs123, (IStrategoList)extraction.constNil0);
    constSort28 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons29});
    const413 = termFactory.makeString("FoldRule");
    const414 = termFactory.makeString("FoldRuleAll");
    const415 = termFactory.makeString("Folded");
    const416 = termFactory.makeString("SemanticProvider");
    const417 = termFactory.makeString("OnSave");
    const418 = termFactory.makeString("Language");
    constCons30 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, (IStrategoList)extraction.constNil0);
    constSort29 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons30});
    constCons31 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs6, (IStrategoList)extraction.constNil0);
    constSort30 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons31});
    const419 = termFactory.makeString("Values");
    const420 = termFactory.makeString("LanguageName");
    const421 = termFactory.makeString("LanguageId");
    const422 = termFactory.makeString("Extensions");
    const423 = termFactory.makeString("Description");
    const424 = termFactory.makeString("Table");
    const425 = termFactory.makeString("TableProvider");
    constCons32 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs30, (IStrategoList)extraction.constNil0);
    constSort31 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons32});
    const426 = termFactory.makeString("StartSymbols");
    const427 = termFactory.makeString("Extends");
    const428 = termFactory.makeString("UnmanagedTablePrefix");
    const429 = termFactory.makeString("LineCommentPrefix");
    const430 = termFactory.makeString("BlockCommentDefs");
    constCons33 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs127, (IStrategoList)extraction.constNil0);
    constSort32 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons33});
    const431 = termFactory.makeString("FenceDefs");
    constCons34 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs125, (IStrategoList)extraction.constNil0);
    constSort33 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons34});
    const432 = termFactory.makeString("IndentDefs");
    const433 = termFactory.makeString("ListSort");
    const434 = termFactory.makeString("ConstructorOnly");
    const435 = termFactory.makeString("SortAndConstructor");
    constCons35 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs192, (IStrategoList)extraction.constNil0);
    constSort34 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons35});
    const436 = termFactory.makeString("NoImports");
    const437 = termFactory.makeString("ImportRenamed");
    const438 = termFactory.makeString("OverlayNoArgs");
    const439 = termFactory.makeString("DynRuleScope");
    constCons36 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs174, (IStrategoList)extraction.constNil0);
    constSort35 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons36});
    const440 = termFactory.makeString("GenDynRules");
    const441 = termFactory.makeString("AddScopeLabel");
    const442 = termFactory.makeString("UndefineDynRule");
    const443 = termFactory.makeString("SetDynRule");
    const444 = termFactory.makeString("AddDynRule");
    const445 = termFactory.makeString("SetDynRuleMatch");
    const446 = termFactory.makeString("DynRuleAssign");
    const447 = termFactory.makeString("DynRuleAssignAdd");
    const448 = termFactory.makeString("SetDynRuleDepends");
    const449 = termFactory.makeString("LabeledDynRuleId");
    const450 = termFactory.makeString("AddLabelDynRuleId");
    const451 = termFactory.makeString("LabeledDynRuleScopeId");
    const452 = termFactory.makeString("RDecNoArgs");
    const453 = termFactory.makeString("RDec");
    constCons37 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs198, (IStrategoList)extraction.constNil0);
    constSort36 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons37});
    const454 = termFactory.makeString("RDecT");
    const455 = termFactory.makeString("DynRuleIntersectFix");
    const456 = termFactory.makeString("DynRuleUnionFix");
    const457 = termFactory.makeString("DynRuleIntersectUnionFix");
    const458 = termFactory.makeString("DynRuleIntersect");
    const459 = termFactory.makeString("DynRuleUnion");
    const460 = termFactory.makeString("DynRuleIntersectUnion");
    const461 = termFactory.makeString("BA");
    const462 = termFactory.makeString("AM");
    const463 = termFactory.makeString("Seq");
    const464 = termFactory.makeString("RDefNoArgs");
    const465 = termFactory.makeString("RDef");
    const466 = termFactory.makeString("RDefT");
    const467 = termFactory.makeString("RuleNoCond");
    constCons38 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs177, (IStrategoList)extraction.constNil0);
    constSort37 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons38});
    const468 = termFactory.makeString("WhereClause");
    const469 = termFactory.makeString("WithClause");
    const470 = termFactory.makeString("SDefNoArgs");
    const471 = termFactory.makeString("SDef");
    const472 = termFactory.makeString("DefaultVarDec");
    const473 = termFactory.makeString("Call");
    constCons39 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, (IStrategoList)extraction.constNil0);
    constSort38 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons39});
    const474 = termFactory.makeString("ScopeDefault");
    const475 = termFactory.makeString("LChoice");
    const476 = termFactory.makeString("Rec");
    const477 = termFactory.makeString("Not");
    const478 = termFactory.makeString("Where");
    const479 = termFactory.makeString("With");
    const480 = termFactory.makeString("Test");
    const481 = termFactory.makeString("PrimNoArgs");
    const482 = termFactory.makeString("Prim");
    constCons40 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs41, (IStrategoList)extraction.constNil0);
    constSort39 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons40});
    const483 = termFactory.makeString("StrCong");
    const484 = termFactory.makeString("IntCong");
    const485 = termFactory.makeString("RealCong");
    const486 = termFactory.makeString("CharCong");
    const487 = termFactory.makeString("CongQ");
    const488 = termFactory.makeString("AnnoCong");
    const489 = termFactory.makeString("EmptyTupleCong");
    const490 = termFactory.makeString("TupleCong");
    const491 = termFactory.makeString("ListCongNoTail");
    const492 = termFactory.makeString("ListCong");
    const493 = termFactory.makeString("ExplodeCong");
    const494 = termFactory.makeString("CallNoArgs");
    const495 = termFactory.makeString("LRule");
    const496 = termFactory.makeString("SRule");
    const497 = termFactory.makeString("Choice");
    const498 = termFactory.makeString("RChoice");
    const499 = termFactory.makeString("CondChoice");
    const500 = termFactory.makeString("IfThen");
    const501 = termFactory.makeString("SwitchChoiceNoOtherwise");
    constCons41 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs184, (IStrategoList)extraction.constNil0);
    constSort40 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons41});
    const502 = termFactory.makeString("SwitchChoice");
    const503 = termFactory.makeString("Assign");
    const504 = termFactory.makeString("ListVar");
    const505 = termFactory.makeString("BuildDefaultPT");
    const506 = termFactory.makeString("BuildDefault");
    const507 = termFactory.makeString("AnnoList");
    const508 = termFactory.makeString("NoAnnoList");
    const509 = termFactory.makeString("App");
    const510 = termFactory.makeString("RootApp");
    const511 = termFactory.makeString("Tuple");
    const512 = termFactory.makeString("ListTail");
    const513 = termFactory.makeString("Explode");
    const514 = termFactory.makeString("As");
    const515 = termFactory.makeString("SortList");
    const516 = termFactory.makeString("SortListTl");
    const517 = termFactory.makeString("SortTuple");
    const518 = termFactory.makeString("Star");
    const519 = termFactory.makeString("StarStar");
    const520 = termFactory.makeString("Sorts");
    constCons42 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs208, (IStrategoList)extraction.constNil0);
    constSort41 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons42});
    const521 = termFactory.makeString("Constructors");
    const522 = termFactory.makeString("SortVar");
    const523 = termFactory.makeString("SortNoArgs");
    const524 = termFactory.makeString("OpDecl");
    const525 = termFactory.makeString("OpDeclQ");
    const526 = termFactory.makeString("OpDeclInj");
    const527 = termFactory.makeString("ExtOpDecl");
    const528 = termFactory.makeString("ExtOpDeclQ");
    const529 = termFactory.makeString("ExtOpDeclInj");
    constCons43 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs46, (IStrategoList)extraction.constNil0);
    constSort42 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons43});
    const530 = termFactory.makeString("Str");
    const531 = termFactory.makeString("Op");
    const532 = termFactory.makeString("OpQ");
    const533 = termFactory.makeString("Anno");
    const534 = termFactory.makeString("Let");
    const535 = termFactory.makeString("CallT");
    const536 = termFactory.makeString("CallDynamic");
    const537 = termFactory.makeString("SDefT");
    const538 = termFactory.makeString("ExtSDefInl");
    const539 = termFactory.makeString("ExtSDef");
    const540 = termFactory.makeString("VarDec");
    const541 = termFactory.makeString("ParenStrat");
    const542 = termFactory.makeString("Fail");
    const543 = termFactory.makeString("Match");
    const544 = termFactory.makeString("Build");
    constCons44 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs44, (IStrategoList)extraction.constNil0);
    constSort43 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons44});
    const545 = termFactory.makeString("Scope");
    const546 = termFactory.makeString("GuardedLChoice");
    const547 = termFactory.makeString("PrimT");
    const548 = termFactory.makeString("One");
    const549 = termFactory.makeString("All");
    const550 = termFactory.makeString("ImportTerm");
    constCons45 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs193, (IStrategoList)extraction.constNil0);
    constSort44 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons45});
    const551 = termFactory.makeString("Specification");
    const552 = termFactory.makeString("ImportWildcard");
    const553 = termFactory.makeString("alias");
    const554 = termFactory.makeString("char-class");
    const555 = termFactory.makeString("seq");
    const556 = termFactory.makeString("single");
    const557 = termFactory.makeString("alt");
    constCons46 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs291, (IStrategoList)extraction.constNil0);
    constSort45 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons46});
    const558 = termFactory.makeString("list");
    constCons47 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs277, (IStrategoList)extraction.constNil0);
    constSort46 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons47});
    const559 = termFactory.makeString("follow");
    const560 = termFactory.makeString("reject");
    const561 = termFactory.makeString("prefer");
    const562 = termFactory.makeString("avoid");
    const563 = termFactory.makeString("quoted");
    const564 = termFactory.makeString("unquoted");
    const565 = termFactory.makeString("label");
    const566 = termFactory.makeString("unquoted-fun");
    const567 = termFactory.makeString("quoted-fun");
    const568 = termFactory.makeString("lit");
    const569 = termFactory.makeString("ci-lit");
    const570 = termFactory.makeString("prefix-fun");
    const571 = termFactory.makeString("kernel-start-symbols");
    const572 = termFactory.makeString("lexical-start-symbols");
    const573 = termFactory.makeString("context-free-start-symbols");
    const574 = termFactory.makeString("sort");
    const575 = termFactory.makeString("parameterized-sort");
    const576 = termFactory.makeString("numeric");
    const577 = termFactory.makeString("short");
    const578 = termFactory.makeString("top");
    const579 = termFactory.makeString("eof");
    const580 = termFactory.makeString("bot");
    const581 = termFactory.makeString("label_start");
    const582 = termFactory.makeString("range");
    const583 = termFactory.makeString("conc");
    const584 = termFactory.makeString("absent");
    const585 = termFactory.makeString("present");
    const586 = termFactory.makeString("simple-charclass");
    const587 = termFactory.makeString("comp");
    const588 = termFactory.makeString("diff");
    const589 = termFactory.makeString("isect");
    const590 = termFactory.makeString("union");
    const591 = termFactory.makeString("left");
    const592 = termFactory.makeString("right");
    const593 = termFactory.makeString("non-assoc");
    const594 = termFactory.makeString("assoc");
    const595 = termFactory.makeString("bracket");
    constCons48 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs38, (IStrategoList)extraction.constNil0);
    constSort47 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons48});
    const596 = termFactory.makeString("default");
    const597 = termFactory.makeString("with-arguments");
    const598 = termFactory.makeString("non-transitive");
    const599 = termFactory.makeString("simple-group");
    const600 = termFactory.makeString("prods-group");
    const601 = termFactory.makeString("assoc-group");
    constCons49 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs296, (IStrategoList)extraction.constNil0);
    constSort48 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons49});
    const602 = termFactory.makeString("chain");
    const603 = termFactory.makeString("lifting");
    const604 = termFactory.makeString("empty");
    const605 = termFactory.makeString("opt");
    const606 = termFactory.makeString("iter");
    const607 = termFactory.makeString("iter-star");
    const608 = termFactory.makeString("iter-sep");
    const609 = termFactory.makeString("iter-star-sep");
    const610 = termFactory.makeString("tuple");
    const611 = termFactory.makeString("func");
    const612 = termFactory.makeString("strategy");
    constCons50 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs264, (IStrategoList)extraction.constNil0);
    constSort49 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons50});
    const613 = termFactory.makeString("renamings");
    const614 = termFactory.makeString("symbol");
    const615 = termFactory.makeString("production");
    const616 = termFactory.makeString("module");
    constCons51 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs255, (IStrategoList)extraction.constNil0);
    constSort50 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons51});
    const617 = termFactory.makeString("exports");
    const618 = termFactory.makeString("hiddens");
    const619 = termFactory.makeString("unparameterized");
    const620 = termFactory.makeString("parameterized");
    const621 = termFactory.makeString("id");
    const622 = termFactory.makeString("imports");
    const623 = termFactory.makeString("imp-section");
    const624 = termFactory.makeString("renamed-module");
    const625 = termFactory.makeString("cf");
    const626 = termFactory.makeString("lex");
    const627 = termFactory.makeString("varsym");
    const628 = termFactory.makeString("layout");
    const629 = termFactory.makeString("empty-grammar");
    const630 = termFactory.makeString("conc-grammars");
    const631 = termFactory.makeString("real-con");
    const632 = termFactory.makeString("natural");
    const633 = termFactory.makeString("positive");
    const634 = termFactory.makeString("negative");
    const635 = termFactory.makeString("int");
    const636 = termFactory.makeString("real");
    const637 = termFactory.makeString("fun");
    const638 = termFactory.makeString("appl");
    const639 = termFactory.makeString("placeholder");
    const640 = termFactory.makeString("annotated");
    const641 = termFactory.makeString("term");
    constCons52 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs115, (IStrategoList)extraction.constNil0);
    constSort51 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons52});
    const642 = termFactory.makeString("attrs");
    const643 = termFactory.makeString("no-attrs");
    const644 = termFactory.makeString("prod");
    const645 = termFactory.makeString("start");
    const646 = termFactory.makeString("file-start");
    const647 = termFactory.makeString("definition");
    const648 = termFactory.makeString("PlainDecHead");
    constSortNoArgs314 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const648});
    const649 = termFactory.makeString("PlainDec");
    const650 = termFactory.makeString("PlainBody");
    constSortNoArgs315 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const650});
    const651 = termFactory.makeString("ToplevelDeclaration");
    constSortNoArgs316 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const651});
    const652 = termFactory.makeString("AnnoOrSugarMod");
    constSortNoArgs317 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const652});
    constCons53 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs317, (IStrategoList)extraction.constNil0);
    constSort52 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons53});
    const653 = termFactory.makeString("JavaId");
    constSortNoArgs318 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const653});
    constCons54 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs79, (IStrategoList)extraction.constNil0);
    constSort53 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const5, extraction.constCons54});
    constempty_grammar0 = termFactory.makeAppl(ext._consempty_grammar_0, NO_TERMS);
    const654 = termFactory.makeString("sugarj-desugar");
    const655 = termFactory.makeString("changed-tree");
    constSVar1 = termFactory.makeAppl(ext._consSVar_1, new IStrategoTerm[]{extraction.const655});
    const656 = termFactory.makeString("");
  }

  private static void initConstants0(ITermFactory termFactory)
  { 
    constNil0 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    const0 = termFactory.makeString("start-analysis");
    const1 = termFactory.makeString("change-annotations-only");
    constSVar0 = termFactory.makeAppl(ext._consSVar_1, new IStrategoTerm[]{extraction.const1});
    const2 = termFactory.makeString("analysis-data");
    const3 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'sugarj-analyze'");
    const4 = termFactory.makeString("Some");
    const5 = termFactory.makeString("Option");
    const6 = termFactory.makeString("Sort");
    const7 = termFactory.makeString("Strategy");
    constSortNoArgs0 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const7});
    const8 = termFactory.makeString("StrategoKeyword");
    constSortNoArgs1 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const8});
    const9 = termFactory.makeString("StrategoId");
    constSortNoArgs2 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const9});
    const10 = termFactory.makeString("Placeholder");
    constSortNoArgs3 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const10});
    const11 = termFactory.makeString("PlaceholderChar");
    constSortNoArgs4 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const11});
    const12 = termFactory.makeString("SemanticNode");
    constSortNoArgs5 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const12});
    const13 = termFactory.makeString("PropertyValue");
    constSortNoArgs6 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const13});
    const14 = termFactory.makeString("URL");
    constSortNoArgs7 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const14});
    const15 = termFactory.makeString("Id");
    constSortNoArgs8 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const15});
    const16 = termFactory.makeString("IdStar");
    constSortNoArgs9 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const16});
    const17 = termFactory.makeString("Int");
    constSortNoArgs10 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const17});
    const18 = termFactory.makeString("STRING");
    constSortNoArgs11 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const18});
    const19 = termFactory.makeString("StringChar");
    constSortNoArgs12 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const19});
    const20 = termFactory.makeString("BACKSLASH");
    constSortNoArgs13 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const20});
    const21 = termFactory.makeString("SectionName");
    constSortNoArgs14 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const21});
    const22 = termFactory.makeString("FileName");
    constSortNoArgs15 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const22});
    const23 = termFactory.makeString("ModuleName");
    constSortNoArgs16 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const23});
    const24 = termFactory.makeString("Real");
    constSortNoArgs17 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const24});
    const25 = termFactory.makeString("String");
    constSortNoArgs18 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const25});
    const26 = termFactory.makeString("StrChar");
    constSortNoArgs19 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const26});
    const27 = termFactory.makeString("Char");
    constSortNoArgs20 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const27});
    const28 = termFactory.makeString("CharChar");
    constSortNoArgs21 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const28});
    const29 = termFactory.makeString("ModName");
    constSortNoArgs22 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const29});
    const30 = termFactory.makeString("ModNamePart");
    constSortNoArgs23 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const30});
    const31 = termFactory.makeString("LId");
    constSortNoArgs24 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const31});
    const32 = termFactory.makeString("LCID");
    constSortNoArgs25 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const32});
    const33 = termFactory.makeString("UCID");
    constSortNoArgs26 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const33});
    const34 = termFactory.makeString("Keyword");
    constSortNoArgs27 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const34});
    const35 = termFactory.makeString("SingleQuotedStrChar");
    constSortNoArgs28 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const35});
    const36 = termFactory.makeString("SingleQuotedStrCon");
    constSortNoArgs29 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const36});
    constSortNoArgs30 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const6});
    const37 = termFactory.makeString("NumChar");
    constSortNoArgs31 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const37});
    const38 = termFactory.makeString("ShortChar");
    constSortNoArgs32 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const38});
    const39 = termFactory.makeString("ModuleWord");
    constSortNoArgs33 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const39});
    const40 = termFactory.makeString("ModuleId");
    constSortNoArgs34 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const40});
    const41 = termFactory.makeString("Comment");
    constSortNoArgs35 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const41});
    const42 = termFactory.makeString("IdCon");
    constSortNoArgs36 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const42});
    const43 = termFactory.makeString("StrCon");
    constSortNoArgs37 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const43});
    const44 = termFactory.makeString("NatCon");
    constSortNoArgs38 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const44});
    const45 = termFactory.makeString("PlainContent");
    constSortNoArgs39 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const45});
    const46 = termFactory.makeString("has-subsort-of: ");
    const47 = termFactory.makeString("Subsort-Stack");
    constDR_DUMMY0 = termFactory.makeAppl(ext._consDR_DUMMY_0, NO_TERMS);
    constCons0 = (IStrategoTerm)termFactory.makeListCons(extraction.constDR_DUMMY0, (IStrategoList)extraction.constNil0);
    const48 = termFactory.makeString("17962");
    const49 = termFactory.makeString("detected loop: ");
    const50 = termFactory.makeString("StrategyAngle");
    constSortNoArgs40 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const50});
    const51 = termFactory.makeString("Term");
    constSortNoArgs41 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const51});
    const52 = termFactory.makeString("StrategyMid");
    constSortNoArgs42 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const52});
    const53 = termFactory.makeString("LID");
    constSortNoArgs43 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const53});
    const54 = termFactory.makeString("ID");
    constSortNoArgs44 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const54});
    const55 = termFactory.makeString("Type");
    constSortNoArgs45 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const55});
    const56 = termFactory.makeString("ArgType");
    constSortNoArgs46 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const56});
    const57 = termFactory.makeString("ConstType");
    constSortNoArgs47 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const57});
    const58 = termFactory.makeString("RetType");
    constSortNoArgs48 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const58});
    const59 = termFactory.makeString("FunType");
    constSortNoArgs49 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const59});
    const60 = termFactory.makeString("Var");
    constSortNoArgs50 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const60});
    const61 = termFactory.makeString("PreTerm");
    constSortNoArgs51 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const61});
    const62 = termFactory.makeString("Wld");
    constSortNoArgs52 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const62});
    const63 = termFactory.makeString("StrategyDef");
    constSortNoArgs53 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const63});
    const64 = termFactory.makeString("Def");
    constSortNoArgs54 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const64});
    const65 = termFactory.makeString("RuleDef");
    constSortNoArgs55 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const65});
    const66 = termFactory.makeString("List");
    const67 = termFactory.makeString("Alias");
    constSortNoArgs56 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const67});
    constCons1 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs56, (IStrategoList)extraction.constNil0);
    constSort0 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons1});
    const68 = termFactory.makeString("Aliases");
    constSortNoArgs57 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const68});
    const69 = termFactory.makeString("Restriction");
    constSortNoArgs58 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const69});
    constCons2 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs58, (IStrategoList)extraction.constNil0);
    constSort1 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons2});
    const70 = termFactory.makeString("Restrictions");
    constSortNoArgs59 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const70});
    const71 = termFactory.makeString("Character");
    constSortNoArgs60 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const71});
    const72 = termFactory.makeString("CharRange");
    constSortNoArgs61 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const72});
    const73 = termFactory.makeString("CharRanges");
    constSortNoArgs62 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const73});
    const74 = termFactory.makeString("Priority");
    constSortNoArgs63 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const74});
    constCons3 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs63, (IStrategoList)extraction.constNil0);
    constSort2 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons3});
    const75 = termFactory.makeString("Priorities");
    constSortNoArgs64 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const75});
    const76 = termFactory.makeString("Module");
    constSortNoArgs65 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const76});
    constCons4 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs65, (IStrategoList)extraction.constNil0);
    constSort3 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons4});
    const77 = termFactory.makeString("Definition");
    constSortNoArgs66 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const77});
    const78 = termFactory.makeString("Section");
    constSortNoArgs67 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const78});
    constCons5 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs67, (IStrategoList)extraction.constNil0);
    constSort4 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons5});
    const79 = termFactory.makeString("Sections");
    constSortNoArgs68 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const79});
    const80 = termFactory.makeString("Import");
    constSortNoArgs69 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const80});
    constCons6 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs69, (IStrategoList)extraction.constNil0);
    constSort5 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons6});
    const81 = termFactory.makeString("Imports");
    constSortNoArgs70 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const81});
    const82 = termFactory.makeString("Symbol");
    constSortNoArgs71 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const82});
    constCons7 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, (IStrategoList)extraction.constNil0);
    constSort6 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons7});
    const83 = termFactory.makeString("Symbols");
    constSortNoArgs72 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const83});
    const84 = termFactory.makeString("Production");
    constSortNoArgs73 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const84});
    constCons8 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs73, (IStrategoList)extraction.constNil0);
    constSort7 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons8});
    const85 = termFactory.makeString("Productions");
    constSortNoArgs74 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const85});
    const86 = termFactory.makeString("Associativity");
    constSortNoArgs75 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const86});
    const87 = termFactory.makeString("Label");
    constSortNoArgs76 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const87});
    const88 = termFactory.makeString("ATermAttribute");
    constSortNoArgs77 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const88});
    const89 = termFactory.makeString("JavaID");
    constSortNoArgs78 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const89});
    const90 = termFactory.makeString("PlainExtension");
    constSortNoArgs79 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const90});
    const91 = termFactory.makeString("ModelTransformation");
    constSortNoArgs80 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const91});
    constCons9 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs80, (IStrategoList)extraction.constNil0);
    constSort8 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons9});
    const92 = termFactory.makeString("TransformationDef");
    constSortNoArgs81 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const92});
    const93 = termFactory.makeString("StrategoDef");
    constSortNoArgs82 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const93});
    constCons10 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs82, (IStrategoList)extraction.constNil0);
    constSort9 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons10});
    const94 = termFactory.makeString("DirectTransformation");
    constSortNoArgs83 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const94});
    const95 = termFactory.makeString("TransformationExpr");
    constSortNoArgs84 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const95});
    const96 = termFactory.makeString("TransformationAppExpr");
    constSortNoArgs85 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const96});
    const97 = termFactory.makeString("StrategoDecl");
    constSortNoArgs86 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const97});
    const98 = termFactory.makeString("Transformation");
    constSortNoArgs87 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const98});
    const99 = termFactory.makeString("StrategoStrategy");
    constSortNoArgs88 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const99});
    const100 = termFactory.makeString("Analysis");
    constSortNoArgs89 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const100});
    const101 = termFactory.makeString("ReservedName");
    constSortNoArgs90 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const101});
    const102 = termFactory.makeString("StrategoCall");
    constSortNoArgs91 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const102});
    const103 = termFactory.makeString("CompletionPart");
    constSortNoArgs92 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const103});
    const104 = termFactory.makeString("Node");
    constSortNoArgs93 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const104});
    const105 = termFactory.makeString("ColorNode");
    constSortNoArgs94 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const105});
    const106 = termFactory.makeString("Color");
    constSortNoArgs95 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const106});
    const107 = termFactory.makeString("MaybeColor");
    constSortNoArgs96 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const107});
    const108 = termFactory.makeString("NoColor");
    constSortNoArgs97 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const108});
    const109 = termFactory.makeString("AttributeId");
    constSortNoArgs98 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const109});
    const110 = termFactory.makeString("Font");
    constSortNoArgs99 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const110});
    const111 = termFactory.makeString("Constructor");
    constSortNoArgs100 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const111});
    const112 = termFactory.makeString("DynRuleScopeId");
    constSortNoArgs101 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const112});
    constCons11 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs101, (IStrategoList)extraction.constNil0);
    constSort10 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons11});
    const113 = termFactory.makeString("ScopeLabels");
    constSortNoArgs102 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const113});
    constCons12 = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs8, (IStrategoList)extraction.constNil0);
    constSort11 = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const66, extraction.constCons12});
    const114 = termFactory.makeString("RuleNames");
    constSortNoArgs103 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const114});
    const115 = termFactory.makeString("EditorServicePlaceholderChar");
    constSortNoArgs104 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const115});
    const116 = termFactory.makeString("EditorServicePlaceholder");
    constSortNoArgs105 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const116});
    const117 = termFactory.makeString("EditorServiceAttributeId");
    constSortNoArgs106 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const117});
    const118 = termFactory.makeString("EditorServiceMaybeColor");
    constSortNoArgs107 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const118});
    const119 = termFactory.makeString("EditorServiceNoColor");
    constSortNoArgs108 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const119});
    const120 = termFactory.makeString("EditorServiceColor");
    constSortNoArgs109 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const120});
    const121 = termFactory.makeString("EditorServiceFont");
    constSortNoArgs110 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const121});
    const122 = termFactory.makeString("EditorServiceTokenKindName");
    constSortNoArgs111 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const122});
    const123 = termFactory.makeString("TokenKindName");
    constSortNoArgs112 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const123});
    const124 = termFactory.makeString("EditorServiceColorNode");
    constSortNoArgs113 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const124});
    const125 = termFactory.makeString("EditorServiceAttribute");
    constSortNoArgs114 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const125});
    const126 = termFactory.makeString("Attribute");
    constSortNoArgs115 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const126});
    const127 = termFactory.makeString("EditorServiceColorRule");
    constSortNoArgs116 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const127});
    const128 = termFactory.makeString("ColorRule");
    constSortNoArgs117 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const128});
    const129 = termFactory.makeString("EditorServiceOutlineRule");
    constSortNoArgs118 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const129});
    const130 = termFactory.makeString("OutlineRule");
    constSortNoArgs119 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const130});
    const131 = termFactory.makeString("EditorServiceFoldingAnno");
    constSortNoArgs120 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const131});
    const132 = termFactory.makeString("FoldingAnno");
    constSortNoArgs121 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const132});
    const133 = termFactory.makeString("EditorServiceFoldingRule");
    constSortNoArgs122 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const133});
    const134 = termFactory.makeString("FoldingRule");
    constSortNoArgs123 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const134});
    const135 = termFactory.makeString("EditorServiceIndentDef");
    constSortNoArgs124 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const135});
    const136 = termFactory.makeString("IndentDef");
    constSortNoArgs125 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const136});
    const137 = termFactory.makeString("EditorServiceFenceDef");
    constSortNoArgs126 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const137});
    const138 = termFactory.makeString("FenceDef");
    constSortNoArgs127 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const138});
    const139 = termFactory.makeString("EditorServiceNoContinuation");
    constSortNoArgs128 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const139});
    const140 = termFactory.makeString("NoContinuation");
    constSortNoArgs129 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const140});
    const141 = termFactory.makeString("EditorServiceBlockCommentDef");
    constSortNoArgs130 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const141});
    const142 = termFactory.makeString("BlockCommentDef");
    constSortNoArgs131 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const142});
    const143 = termFactory.makeString("EditorServiceLanguageProperty");
    constSortNoArgs132 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const143});
    const144 = termFactory.makeString("LanguageProperty");
    constSortNoArgs133 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const144});
    const145 = termFactory.makeString("EditorServicePropertyValues");
    constSortNoArgs134 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const145});
    const146 = termFactory.makeString("PropertyValues");
    constSortNoArgs135 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const146});
    const147 = termFactory.makeString("EditorServiceURL");
    constSortNoArgs136 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const147});
    const148 = termFactory.makeString("EditorServicePropertyValue");
    constSortNoArgs137 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const148});
    const149 = termFactory.makeString("EditorServiceReservedName");
    constSortNoArgs138 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const149});
    const150 = termFactory.makeString("EditorServiceSection");
    constSortNoArgs139 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const150});
    const151 = termFactory.makeString("EditorServiceOnSaveAnno");
    constSortNoArgs140 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const151});
    const152 = termFactory.makeString("OnSaveAnno");
    constSortNoArgs141 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const152});
    const153 = termFactory.makeString("EditorServiceStrategoCall");
    constSortNoArgs142 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const153});
    const154 = termFactory.makeString("EditorServiceRefactoringRule");
    constSortNoArgs143 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const154});
    const155 = termFactory.makeString("RefactoringRule");
    constSortNoArgs144 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const155});
    const156 = termFactory.makeString("EditorServiceBuilderRule");
    constSortNoArgs145 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const156});
    const157 = termFactory.makeString("BuilderRule");
    constSortNoArgs146 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const157});
    const158 = termFactory.makeString("EditorServiceCompletionRule");
    constSortNoArgs147 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const158});
    const159 = termFactory.makeString("CompletionRule");
    constSortNoArgs148 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const159});
    const160 = termFactory.makeString("EditorServiceReferenceRule");
    constSortNoArgs149 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const160});
    const161 = termFactory.makeString("ReferenceRule");
    constSortNoArgs150 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const161});
    const162 = termFactory.makeString("EditorServiceSemanticNode");
    constSortNoArgs151 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const162});
    const163 = termFactory.makeString("EditorServiceStrategoId");
    constSortNoArgs152 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const163});
    const164 = termFactory.makeString("EditorServiceModuleName");
    constSortNoArgs153 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const164});
    const165 = termFactory.makeString("EditorServiceNode");
    constSortNoArgs154 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const165});
    const166 = termFactory.makeString("EditorServiceConstructorId");
    constSortNoArgs155 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const166});
    const167 = termFactory.makeString("ConstructorId");
    constSortNoArgs156 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const167});
    const168 = termFactory.makeString("EditorServiceConstructor");
    constSortNoArgs157 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const168});
    const169 = termFactory.makeString("EditorServiceString");
    constSortNoArgs158 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const169});
    const170 = termFactory.makeString("EditorServiceSort");
    constSortNoArgs159 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const170});
    const171 = termFactory.makeString("EditorServiceSectionName");
    constSortNoArgs160 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const171});
    const172 = termFactory.makeString("EditorServiceBACKSLASH");
    constSortNoArgs161 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const172});
    const173 = termFactory.makeString("EditorServiceStringChar");
    constSortNoArgs162 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const173});
    const174 = termFactory.makeString("EditorServiceSTRING");
    constSortNoArgs163 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const174});
    const175 = termFactory.makeString("EditorServiceInt");
    constSortNoArgs164 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const175});
    const176 = termFactory.makeString("EditorServiceIdStar");
    constSortNoArgs165 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const176});
    const177 = termFactory.makeString("EditorServiceId");
    constSortNoArgs166 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const177});
    const178 = termFactory.makeString("StrategoRuleNames");
    constSortNoArgs167 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const178});
    const179 = termFactory.makeString("StrategoRuleDec");
    constSortNoArgs168 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const179});
    const180 = termFactory.makeString("RuleDec");
    constSortNoArgs169 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const180});
    const181 = termFactory.makeString("StrategoDynRuleScopeId");
    constSortNoArgs170 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const181});
    const182 = termFactory.makeString("StrategoDynRuleId");
    constSortNoArgs171 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const182});
    const183 = termFactory.makeString("DynRuleId");
    constSortNoArgs172 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const183});
    const184 = termFactory.makeString("StrategoDynRuleDef");
    constSortNoArgs173 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const184});
    const185 = termFactory.makeString("DynRuleDef");
    constSortNoArgs174 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const185});
    const186 = termFactory.makeString("StrategoScopeLabels");
    constSortNoArgs175 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const186});
    const187 = termFactory.makeString("StrategoRuleCond");
    constSortNoArgs176 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const187});
    const188 = termFactory.makeString("RuleCond");
    constSortNoArgs177 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const188});
    const189 = termFactory.makeString("StrategoRule");
    constSortNoArgs178 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const189});
    const190 = termFactory.makeString("Rule");
    constSortNoArgs179 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const190});
    const191 = termFactory.makeString("StrategoRuleDef");
    constSortNoArgs180 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const191});
    const192 = termFactory.makeString("StrategoOverlay");
    constSortNoArgs181 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const192});
    const193 = termFactory.makeString("Overlay");
    constSortNoArgs182 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const193});
    const194 = termFactory.makeString("StrategoSwitchCase");
    constSortNoArgs183 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const194});
    const195 = termFactory.makeString("SwitchCase");
    constSortNoArgs184 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const195});
    const196 = termFactory.makeString("StrategoStrategyCurly");
    constSortNoArgs185 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const196});
    const197 = termFactory.makeString("StrategyCurly");
    constSortNoArgs186 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const197});
    const198 = termFactory.makeString("StrategoStrategyAngle");
    constSortNoArgs187 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const198});
    const199 = termFactory.makeString("StrategoKind");
    constSortNoArgs188 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const199});
    const200 = termFactory.makeString("Kind");
    constSortNoArgs189 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const200});
    const201 = termFactory.makeString("StrategoLID");
    constSortNoArgs190 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const201});
    const202 = termFactory.makeString("StrategoImportModName");
    constSortNoArgs191 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const202});
    const203 = termFactory.makeString("ImportModName");
    constSortNoArgs192 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const203});
    const204 = termFactory.makeString("Decl");
    constSortNoArgs193 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const204});
    const205 = termFactory.makeString("StrategoModule");
    constSortNoArgs194 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const205});
    const206 = termFactory.makeString("StrategoStrategyParen");
    constSortNoArgs195 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const206});
    const207 = termFactory.makeString("StrategyParen");
    constSortNoArgs196 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const207});
    const208 = termFactory.makeString("StrategoTypedid");
    constSortNoArgs197 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const208});
    const209 = termFactory.makeString("Typedid");
    constSortNoArgs198 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const209});
    const210 = termFactory.makeString("StrategoStrategyDef");
    constSortNoArgs199 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const210});
    const211 = termFactory.makeString("StrategoSVar");
    constSortNoArgs200 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const211});
    const212 = termFactory.makeString("SVar");
    constSortNoArgs201 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const212});
    const213 = termFactory.makeString("StrategoType");
    constSortNoArgs202 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const213});
    const214 = termFactory.makeString("StrategoRetType");
    constSortNoArgs203 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const214});
    const215 = termFactory.makeString("StrategoArgType");
    constSortNoArgs204 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const215});
    const216 = termFactory.makeString("StrategoFunType");
    constSortNoArgs205 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const216});
    const217 = termFactory.makeString("StrategoConstType");
    constSortNoArgs206 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const217});
    const218 = termFactory.makeString("StrategoOpdecl");
    constSortNoArgs207 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const218});
    const219 = termFactory.makeString("Opdecl");
    constSortNoArgs208 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const219});
    const220 = termFactory.makeString("StrategoSort");
    constSortNoArgs209 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const220});
    const221 = termFactory.makeString("StrategoSdecl");
    constSortNoArgs210 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const221});
    const222 = termFactory.makeString("Sdecl");
    constSortNoArgs211 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const222});
    const223 = termFactory.makeString("StrategoWld");
    constSortNoArgs212 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const223});
    const224 = termFactory.makeString("StrategoID");
    constSortNoArgs213 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const224});
    const225 = termFactory.makeString("StrategoVar");
    constSortNoArgs214 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const225});
    const226 = termFactory.makeString("StrategoCharChar");
    constSortNoArgs215 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const226});
    const227 = termFactory.makeString("StrategoChar");
    constSortNoArgs216 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const227});
    const228 = termFactory.makeString("StrategoStrChar");
    constSortNoArgs217 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const228});
    const229 = termFactory.makeString("StrategoString");
    constSortNoArgs218 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const229});
    const230 = termFactory.makeString("StrategoReal");
    constSortNoArgs219 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const230});
    const231 = termFactory.makeString("StrategoInt");
    constSortNoArgs220 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const231});
    const232 = termFactory.makeString("StrategoUCID");
    constSortNoArgs221 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const232});
    const233 = termFactory.makeString("StrategoLCID");
    constSortNoArgs222 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const233});
    const234 = termFactory.makeString("StrategoLId");
    constSortNoArgs223 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const234});
    const235 = termFactory.makeString("StrategoModNamePart");
    constSortNoArgs224 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const235});
    const236 = termFactory.makeString("StrategoModName");
    constSortNoArgs225 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const236});
    const237 = termFactory.makeString("StrategoPreTerm");
    constSortNoArgs226 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const237});
    const238 = termFactory.makeString("StrategoTerm");
    constSortNoArgs227 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const238});
    const239 = termFactory.makeString("StrategoStrategyMid");
    constSortNoArgs228 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const239});
    const240 = termFactory.makeString("Sdf2SDF");
    constSortNoArgs229 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const240});
    const241 = termFactory.makeString("SDF");
    constSortNoArgs230 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const241});
    const242 = termFactory.makeString("Sdf2Aliases");
    constSortNoArgs231 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const242});
    const243 = termFactory.makeString("Sdf2Alias");
    constSortNoArgs232 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const243});
    const244 = termFactory.makeString("Sdf2Restrictions");
    constSortNoArgs233 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const244});
    const245 = termFactory.makeString("Sdf2Restriction");
    constSortNoArgs234 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const245});
    const246 = termFactory.makeString("Sdf2Label");
    constSortNoArgs235 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const246});
    const247 = termFactory.makeString("Sdf2FunctionName");
    constSortNoArgs236 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const247});
    const248 = termFactory.makeString("FunctionName");
    constSortNoArgs237 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const248});
    const249 = termFactory.makeString("Sdf2SingleQuotedStrCon");
    constSortNoArgs238 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const249});
    const250 = termFactory.makeString("Sdf2SingleQuotedStrChar");
    constSortNoArgs239 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const250});
    const251 = termFactory.makeString("Sdf2Sort");
    constSortNoArgs240 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const251});
    const252 = termFactory.makeString("Sdf2OptCharRanges");
    constSortNoArgs241 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const252});
    const253 = termFactory.makeString("OptCharRanges");
    constSortNoArgs242 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const253});
    const254 = termFactory.makeString("Sdf2CharRange");
    constSortNoArgs243 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const254});
    const255 = termFactory.makeString("Sdf2Character");
    constSortNoArgs244 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const255});
    const256 = termFactory.makeString("Sdf2ShortChar");
    constSortNoArgs245 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const256});
    const257 = termFactory.makeString("Sdf2NumChar");
    constSortNoArgs246 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const257});
    const258 = termFactory.makeString("Sdf2Priorities");
    constSortNoArgs247 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const258});
    const259 = termFactory.makeString("Sdf2Priority");
    constSortNoArgs248 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const259});
    const260 = termFactory.makeString("Sdf2ArgumentIndicator");
    constSortNoArgs249 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const260});
    const261 = termFactory.makeString("ArgumentIndicator");
    constSortNoArgs250 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const261});
    const262 = termFactory.makeString("Sdf2Associativity");
    constSortNoArgs251 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const262});
    const263 = termFactory.makeString("Sdf2Import");
    constSortNoArgs252 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const263});
    const264 = termFactory.makeString("Sdf2Imports");
    constSortNoArgs253 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const264});
    const265 = termFactory.makeString("Sdf2ImpSection");
    constSortNoArgs254 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const265});
    const266 = termFactory.makeString("ImpSection");
    constSortNoArgs255 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const266});
    const267 = termFactory.makeString("Sdf2ModuleName");
    constSortNoArgs256 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const267});
    const268 = termFactory.makeString("Sdf2Sections");
    constSortNoArgs257 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const268});
    const269 = termFactory.makeString("Sdf2Section");
    constSortNoArgs258 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const269});
    const270 = termFactory.makeString("Sdf2Module");
    constSortNoArgs259 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const270});
    const271 = termFactory.makeString("Sdf2Definition");
    constSortNoArgs260 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const271});
    const272 = termFactory.makeString("Sdf2ModuleId");
    constSortNoArgs261 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const272});
    const273 = termFactory.makeString("Sdf2ModuleWord");
    constSortNoArgs262 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const273});
    const274 = termFactory.makeString("Sdf2Renaming");
    constSortNoArgs263 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const274});
    const275 = termFactory.makeString("Renaming");
    constSortNoArgs264 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const275});
    const276 = termFactory.makeString("Sdf2Renamings");
    constSortNoArgs265 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const276});
    const277 = termFactory.makeString("Renamings");
    constSortNoArgs266 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const277});
    const278 = termFactory.makeString("Sdf2Productions");
    constSortNoArgs267 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const278});
    const279 = termFactory.makeString("Sdf2Production");
    constSortNoArgs268 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const279});
    const280 = termFactory.makeString("Sdf2Attributes");
    constSortNoArgs269 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const280});
    const281 = termFactory.makeString("Attributes");
    constSortNoArgs270 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const281});
    const282 = termFactory.makeString("Sdf2Attribute");
    constSortNoArgs271 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const282});
    const283 = termFactory.makeString("Sdf2ATermAttribute");
    constSortNoArgs272 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const283});
    const284 = termFactory.makeString("Sdf2Symbols");
    constSortNoArgs273 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const284});
    const285 = termFactory.makeString("Sdf2Annotation");
    constSortNoArgs274 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const285});
    const286 = termFactory.makeString("Annotation");
    constSortNoArgs275 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const286});
    const287 = termFactory.makeString("Sdf2ATerm");
    constSortNoArgs276 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const287});
    const288 = termFactory.makeString("ATerm");
    constSortNoArgs277 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const288});
    const289 = termFactory.makeString("Sdf2AFun");
    constSortNoArgs278 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const289});
    const290 = termFactory.makeString("AFun");
    constSortNoArgs279 = termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{extraction.const290});
    const291 = termFactory.makeString("Sdf2IdCon");
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}