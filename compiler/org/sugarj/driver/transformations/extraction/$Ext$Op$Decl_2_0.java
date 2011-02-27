package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Ext$Op$Decl_2_0 extends Strategy 
{ 
  public static $Ext$Op$Decl_2_0 instance = new $Ext$Op$Decl_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_23, Strategy o_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDecl_2_0");
    Fail130:
    { 
      IStrategoTerm y_123 = null;
      IStrategoTerm w_123 = null;
      IStrategoTerm x_123 = null;
      IStrategoTerm z_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consExtOpDecl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail130;
      w_123 = term.getSubterm(0);
      x_123 = term.getSubterm(1);
      IStrategoList annos104 = term.getAnnotations();
      y_123 = annos104;
      term = n_23.invoke(context, w_123);
      if(term == null)
        break Fail130;
      z_123 = term;
      term = o_23.invoke(context, x_123);
      if(term == null)
        break Fail130;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consExtOpDecl_2, new IStrategoTerm[]{z_123, term}), checkListAnnos(termFactory, y_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}