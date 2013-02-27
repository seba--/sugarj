package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class rename_rule_0_2 extends Strategy 
{ 
  public static rename_rule_0_2 instance = new rename_rule_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_18, IStrategoTerm ref_s_18)
  { 
    TermReference r_18 = new TermReference(ref_r_18);
    TermReference s_18 = new TermReference(ref_s_18);
    context.push("rename_rule_0_2");
    Fail4:
    { 
      IStrategoTerm term0 = term;
      Success0:
      { 
        Fail5:
        { 
          lifted6 lifted60 = new lifted6();
          lifted60.r_18 = r_18;
          lifted60.s_18 = s_18;
          term = $R$Def$No$Args_2_0.instance.invoke(context, term, lifted60, _Id.instance);
          if(term == null)
            break Fail5;
          if(true)
            break Success0;
        }
        term = term0;
        IStrategoTerm term1 = term;
        Success1:
        { 
          Fail6:
          { 
            lifted8 lifted80 = new lifted8();
            lifted80.r_18 = r_18;
            lifted80.s_18 = s_18;
            term = $R$Def_3_0.instance.invoke(context, term, lifted80, _Id.instance, _Id.instance);
            if(term == null)
              break Fail6;
            if(true)
              break Success1;
          }
          term = term1;
          IStrategoTerm term2 = term;
          Success2:
          { 
            Fail7:
            { 
              lifted11 lifted111 = new lifted11();
              lifted111.r_18 = r_18;
              lifted111.s_18 = s_18;
              term = $R$Def$T_4_0.instance.invoke(context, term, lifted111, _Id.instance, _Id.instance, _Id.instance);
              if(term == null)
                break Fail7;
              if(true)
                break Success2;
            }
            term = term2;
            IStrategoTerm term3 = term;
            Success3:
            { 
              Fail8:
              { 
                lifted15 lifted150 = new lifted15();
                lifted150.r_18 = r_18;
                lifted150.s_18 = s_18;
                term = $S$Def$No$Args_2_0.instance.invoke(context, term, lifted150, _Id.instance);
                if(term == null)
                  break Fail8;
                if(true)
                  break Success3;
              }
              term = term3;
              lifted17 lifted170 = new lifted17();
              lifted170.r_18 = r_18;
              lifted170.s_18 = s_18;
              term = $S$Def_3_0.instance.invoke(context, term, lifted170, _Id.instance, _Id.instance);
              if(term == null)
                break Fail4;
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}