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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_23, Strategy p_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDecl_2_0");
    Fail143:
    { 
      IStrategoTerm n_124 = null;
      IStrategoTerm g_124 = null;
      IStrategoTerm j_124 = null;
      IStrategoTerm o_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consExtOpDecl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail143;
      g_124 = term.getSubterm(0);
      j_124 = term.getSubterm(1);
      IStrategoList annos113 = term.getAnnotations();
      n_124 = annos113;
      term = o_23.invoke(context, g_124);
      if(term == null)
        break Fail143;
      o_124 = term;
      term = p_23.invoke(context, j_124);
      if(term == null)
        break Fail143;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consExtOpDecl_2, new IStrategoTerm[]{o_124, term}), checkListAnnos(termFactory, n_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}