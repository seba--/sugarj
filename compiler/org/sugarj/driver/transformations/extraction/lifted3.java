package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted3 extends Strategy 
{ 
  public static final lifted3 instance = new lifted3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2205:
    { 
      IStrategoTerm term6 = term;
      Success926:
      { 
        Fail2206:
        { 
          IStrategoTerm h_51 = null;
          h_51 = term;
          term = get_analysis_data_annotation_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2206;
          term = h_51;
          if(true)
            break Success926;
        }
        term = init_analysis_data_annotation_0_0.instance.invoke(context, term6);
        if(term == null)
          break Fail2205;
      }
      if(true)
        return term;
    }
    return null;
  }
}