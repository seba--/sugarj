package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class change_annotations_only_1_0 extends Strategy 
{ 
  public static change_annotations_only_1_0 instance = new change_annotations_only_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_53)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("change_annotations_only_1_0");
    Fail33:
    { 
      IStrategoTerm z_52 = null;
      IStrategoTerm a_53 = null;
      IStrategoTerm b_53 = null;
      IStrategoTerm c_53 = null;
      IStrategoTerm d_53 = null;
      b_53 = term;
      term = analysis_data_as_list_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail33;
      z_52 = term;
      term = e_53.invoke(context, b_53);
      if(term == null)
        break Fail33;
      a_53 = term;
      c_53 = term;
      term = termFactory.makeTuple(z_52, a_53);
      term = structurally_equal_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail33;
      d_53 = c_53;
      term = analysis_data_as_list_0_0.instance.invoke(context, a_53);
      if(term == null)
        break Fail33;
      term = termFactory.makeTuple(z_52, term);
      IStrategoTerm term11 = term;
      Success8:
      { 
        Fail34:
        { 
          term = equal_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail34;
          { 
            if(true)
              break Fail33;
            if(true)
              break Success8;
          }
        }
        term = term11;
      }
      term = d_53;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}