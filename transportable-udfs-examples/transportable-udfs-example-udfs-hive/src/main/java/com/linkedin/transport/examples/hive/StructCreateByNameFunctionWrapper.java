/**
 * Copyright 2018 LinkedIn Corporation. All rights reserved.
 * Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.transport.examples.hive;

import com.google.common.collect.ImmutableList;
import com.linkedin.transport.api.udf.StdUDF;
import com.linkedin.transport.api.udf.TopLevelStdUDF;
import com.linkedin.transport.examples.StructCreateByNameFunction;
import com.linkedin.transport.hive.StdUdfWrapper;
import java.util.List;


public class StructCreateByNameFunctionWrapper extends StdUdfWrapper {
  @Override
  protected List<? extends StdUDF> getStdUdfImplementations() {
    return ImmutableList.of(new StructCreateByNameFunction());
  }

  @Override
  protected Class<? extends TopLevelStdUDF> getTopLevelUdfClass() {
    return StructCreateByNameFunction.class;
  }
}
