package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Var_1_0 extends Strategy 
{ 
  public static $List$Var_1_0 instance = new $List$Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListVar_1_0");
    Fail65:
    { 
      IStrategoTerm t_109 = null;
      IStrategoTerm s_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consListVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail65;
      s_109 = term.getSubterm(0);
      IStrategoList annos38 = term.getAnnotations();
      t_109 = annos38;
      term = l_18.invoke(context, s_109);
      if(term == null)
        break Fail65;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consListVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}