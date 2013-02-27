package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Ext$Op$Decl$Q_2_0 extends Strategy 
{ 
  public static $Ext$Op$Decl$Q_2_0 instance = new $Ext$Op$Decl$Q_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_16, Strategy a_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDeclQ_2_0");
    Fail116:
    { 
      IStrategoTerm z_109 = null;
      IStrategoTerm x_109 = null;
      IStrategoTerm y_109 = null;
      IStrategoTerm a_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtOpDeclQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail116;
      x_109 = term.getSubterm(0);
      y_109 = term.getSubterm(1);
      IStrategoList annos103 = term.getAnnotations();
      z_109 = annos103;
      term = z_16.invoke(context, x_109);
      if(term == null)
        break Fail116;
      a_110 = term;
      term = a_17.invoke(context, y_109);
      if(term == null)
        break Fail116;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtOpDeclQ_2, new IStrategoTerm[]{a_110, term}), checkListAnnos(termFactory, z_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}