package org.sugarj.common.typesmart;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.core.VarScope;
import org.spoofax.interpreter.stratego.CallT;
import org.spoofax.interpreter.stratego.SDefT;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoConstructor;
import org.spoofax.interpreter.terms.IStrategoInt;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoPlaceholder;
import org.spoofax.interpreter.terms.IStrategoReal;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.IStrategoTuple;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.terms.AbstractTermFactory;
import org.strategoxt.lang.StrategoException;

/**
 * @author seba
 *
 */
public class TypeSmartTermFactory extends AbstractTermFactory {
  
  private IContext context;
  private ITermFactory baseFactory;
  
  public static TypeSmartTermFactory registerNewTypeSmartTermFactory(IContext context) {
    TypeSmartTermFactory factory = new TypeSmartTermFactory(context.getFactory(), context);
    context.setFactory(factory);
    return factory;
  }
  
  public TypeSmartTermFactory(ITermFactory baseFactory, IContext context) {
    super(IStrategoTerm.MUTABLE);
    this.baseFactory = baseFactory;
    this.context = context;
  }
    
  @Override
  public IStrategoAppl makeAppl(IStrategoConstructor ctr, IStrategoTerm[] terms, IStrategoList annotations) {
    
    String smartCtrName = "smart-" + ctr.getName();
    smartCtrName = smartCtrName.replace("-", "_") + "_0_" + terms.length;

    try {
      SDefT sdef = context.lookupSVar(smartCtrName);

      // no check defined
      if (sdef == null)
        return baseFactory.makeAppl(ctr, terms, annotations);
      
      if (sdef.getStrategyParams().length != 0)
        throw new StrategoException("A smart constructor is not supposed to have strategy arguments, in : " + sdef.getName());

      if (sdef.getTermParams().length != terms.length)
        throw new StrategoException("Smart constructor " + sdef.getName() + " expects " + sdef.getTermParams().length + " arguments, but actually got " + terms.length + " arguments.");

      CallT smartCall = new CallT(smartCtrName, new Strategy[0], new IStrategoTerm[0]);
      boolean smartOk = smartCall.evaluateWithArgs(context, new Strategy[0], terms);
      
      if (!smartOk)
        throw new StrategoException("Smart constructor failed for: " + baseFactory.makeAppl(ctr, terms, annotations));
      
      IStrategoTerm t = context.current();
      if (!(t instanceof IStrategoAppl))
        throw new StrategoException("Smart constructor should have returned an application term, but was: " + t);
      
      IStrategoAppl appl = (IStrategoAppl) t;
      if (!appl.getConstructor().equals(ctr))
        throw new StrategoException("Smart constructor should have returned an application term with constructor " + ctr + ", but was: " + t);

      return appl;
    } catch (InterpreterException e) {
      e.printStackTrace();
    }
    
    boolean typeSafe = true;
    
    if (typeSafe) 
      return baseFactory.makeAppl(ctr, terms, annotations);
    
    throw new StrategoException("Type-unsafe constructor application " + ctr);
  }

  @Override
  public ITermFactory getFactoryWithStorageType(int arg0) {
    return baseFactory.getFactoryWithStorageType(arg0);
  }

  @Override
  public IStrategoTerm annotateTerm(IStrategoTerm arg0, IStrategoList arg1) {
    return baseFactory.annotateTerm(arg0, arg1);
  }

  @Override
  public IStrategoInt makeInt(int arg0) {
    return baseFactory.makeInt(arg0);
  }

  @Override
  public IStrategoPlaceholder makePlaceholder(IStrategoTerm arg0) {
    return baseFactory.makePlaceholder(arg0);
  }

  @Override
  public IStrategoReal makeReal(double arg0) {
    return baseFactory.makeReal(arg0);
  }

  @Override
  public IStrategoString makeString(String arg0) {
    return baseFactory.makeString(arg0);
  }

  @Override
  public IStrategoString tryMakeUniqueString(String arg0) {
    return baseFactory.makeString(arg0);
  }

  @Override
  public IStrategoList makeList(IStrategoTerm[] arg0, IStrategoList arg1) {
    return baseFactory.makeList(arg0, arg1);
  }

  @Override
  public IStrategoList makeListCons(IStrategoTerm arg0, IStrategoList arg1, IStrategoList arg2) {
    return baseFactory.makeListCons(arg0, arg1, arg2);
  }

  @Override
  public IStrategoTuple makeTuple(IStrategoTerm[] arg0, IStrategoList arg1) {
    return baseFactory.makeTuple(arg0, arg1);
  }

  public ITermFactory getBaseFactory() {
    return baseFactory;
  }
}
