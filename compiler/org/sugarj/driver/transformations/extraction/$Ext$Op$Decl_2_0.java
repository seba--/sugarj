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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_346, Strategy c_346)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDecl_2_0");
    Fail953:
    { 
      IStrategoTerm w_455 = null;
      IStrategoTerm u_455 = null;
      IStrategoTerm v_455 = null;
      IStrategoTerm x_455 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consExtOpDecl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail953;
      u_455 = term.getSubterm(0);
      v_455 = term.getSubterm(1);
      IStrategoList annos196 = term.getAnnotations();
      w_455 = annos196;
      term = b_346.invoke(context, u_455);
      if(term == null)
        break Fail953;
      x_455 = term;
      term = c_346.invoke(context, v_455);
      if(term == null)
        break Fail953;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consExtOpDecl_2, new IStrategoTerm[]{x_455, term}), checkListAnnos(termFactory, w_455));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}