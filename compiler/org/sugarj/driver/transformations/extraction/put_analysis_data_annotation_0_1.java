package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class put_analysis_data_annotation_0_1 extends Strategy 
{ 
  public static put_analysis_data_annotation_0_1 instance = new put_analysis_data_annotation_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_51)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("put_analysis_data_annotation_0_1");
    Fail20:
    { 
      IStrategoTerm t_51 = null;
      IStrategoTerm u_51 = null;
      IStrategoTerm v_51 = null;
      IStrategoTerm w_51 = null;
      u_51 = term;
      w_51 = term;
      Success6:
      { 
        Fail21:
        { 
          term = get_annotations_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21;
          term = filter_1_0.instance.invoke(context, term, lifted4.instance);
          if(term == null)
            break Fail21;
          if(true)
            break Success6;
        }
        term = extraction.constNil0;
      }
      v_51 = term;
      term = w_51;
      IStrategoList list1;
      list1 = checkListTail(v_51);
      if(list1 == null)
        break Fail20;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(extraction.const2, s_51), list1);
      t_51 = term;
      term = u_51;
      term = termFactory.makeTuple(term, t_51);
      term = set_annotations_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail20;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}