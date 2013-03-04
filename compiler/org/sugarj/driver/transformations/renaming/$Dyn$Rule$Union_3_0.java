package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Union_3_0 extends Strategy 
{ 
  public static $Dyn$Rule$Union_3_0 instance = new $Dyn$Rule$Union_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_43, Strategy z_43, Strategy a_44)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleUnion_3_0");
    Fail294:
    { 
      IStrategoTerm i_184 = null;
      IStrategoTerm f_184 = null;
      IStrategoTerm g_184 = null;
      IStrategoTerm h_184 = null;
      IStrategoTerm j_184 = null;
      IStrategoTerm k_184 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleUnion_3 != ((IStrategoAppl)term).getConstructor())
        break Fail294;
      f_184 = term.getSubterm(0);
      g_184 = term.getSubterm(1);
      h_184 = term.getSubterm(2);
      IStrategoList annos241 = term.getAnnotations();
      i_184 = annos241;
      term = y_43.invoke(context, f_184);
      if(term == null)
        break Fail294;
      j_184 = term;
      term = z_43.invoke(context, g_184);
      if(term == null)
        break Fail294;
      k_184 = term;
      term = a_44.invoke(context, h_184);
      if(term == null)
        break Fail294;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleUnion_3, new IStrategoTerm[]{j_184, k_184, term}), checkListAnnos(termFactory, i_184));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}