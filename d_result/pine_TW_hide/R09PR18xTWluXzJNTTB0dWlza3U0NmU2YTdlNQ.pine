//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: GOOG_1Min_2MM0_46e6a7e5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GOOG_1Min_2MM0_46e6a7e5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GOOG_1Min_46e6a7e5(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Positive_Money_Flow_Sum <= 1.16109e+06 )
		if( Short_Long_Diff <= -0.369424 )
			if( Negative_Money_Flow_Sum <= 2.99687e+06 )
				if( Short_Long_Diff <= -0.525843 )
					if( MFI <= 7.08422 )
						if( Positive_Money_Flow_Sum <= 124477 )
							ret := 0.857143 // buy
						if( Positive_Money_Flow_Sum > 124477 )
							if( Raw_Money_Flow <= 79108.9 )
								ret := 0.750000 // buy
							if( Raw_Money_Flow > 79108.9 )
								ret := -0.400000
					if( MFI > 7.08422 )
						if( Positive_Money_Flow_Sum <= 1.01409e+06 )
							if( MFI <= 38.3768 )
								if( Short_MA <= 163.906 )
									ret := 0.750000 // buy
								if( Short_MA > 163.906 )
									ret := 0.981481 // buy
							if( MFI > 38.3768 )
								ret := 0.500000
						if( Positive_Money_Flow_Sum > 1.01409e+06 )
							ret := 0.500000
				if( Short_Long_Diff > -0.525843 )
					if( Long_MA <= 157.959 )
						if( MFI_High <= -44.7786 )
							if( MFI <= 20.1209 )
								ret := -0.500000
							if( MFI > 20.1209 )
								ret := -1.000000 // sell
						if( MFI_High > -44.7786 )
							ret := 0.800000 // buy
					if( Long_MA > 157.959 )
						if( MFI_High <= -49.176 )
							if( Money_Flow_Ratio <= 0.138487 )
								if( MFI <= 8.13126 )
									ret := 0.600000
								if( MFI > 8.13126 )
									ret := -0.833333 // sell
							if( Money_Flow_Ratio > 0.138487 )
								if( Long_MA <= 169.091 )
									ret := 0.615385
								if( Long_MA > 169.091 )
									ret := 0.978261 // buy
						if( MFI_High > -49.176 )
							if( Short_MA <= 171.808 )
								if( Positive_Money_Flow_Sum <= 1.07461e+06 )
									ret := 0.666667
								if( Positive_Money_Flow_Sum > 1.07461e+06 )
									ret := -0.250000
							if( Short_MA > 171.808 )
								if( Negative_Money_Flow <= 110299 )
									ret := -0.470588
								if( Negative_Money_Flow > 110299 )
									ret := 0.666667
			if( Negative_Money_Flow_Sum > 2.99687e+06 )
				if( MFI_High <= -63.1932 )
					if( Positive_Money_Flow_Sum <= 54326.2 )
						if( Negative_Money_Flow_Sum <= 6.60723e+07 )
							if( Negative_Money_Flow_Sum <= 1.06854e+07 )
								ret := -0.500000
							if( Negative_Money_Flow_Sum > 1.06854e+07 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 6.60723e+07 )
							ret := 0.142857
					if( Positive_Money_Flow_Sum > 54326.2 )
						if( Negative_Money_Flow <= 329581 )
							if( Positive_Money_Flow <= 82079.7 )
								if( MFI_Low <= -8.43816 )
									ret := -0.600000
								if( MFI_Low > -8.43816 )
									ret := 0.000000
							if( Positive_Money_Flow > 82079.7 )
								if( Positive_Money_Flow_Sum <= 776592 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 776592 )
									ret := 0.444444
						if( Negative_Money_Flow > 329581 )
							if( Positive_Money_Flow_Sum <= 275066 )
								if( Negative_Money_Flow_Sum <= 4.84364e+06 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 4.84364e+06 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 275066 )
								if( Positive_Money_Flow_Sum <= 916236 )
									ret := 0.800000 // buy
								if( Positive_Money_Flow_Sum > 916236 )
									ret := 1.000000 // buy
				if( MFI_High > -63.1932 )
					if( Negative_Money_Flow_Sum <= 3.40192e+06 )
						if( Short_Long_Diff <= -0.385439 )
							ret := 0.000000
						if( Short_Long_Diff > -0.385439 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 3.40192e+06 )
						if( Short_MA <= 163.166 )
							ret := 0.400000
						if( Short_MA > 163.166 )
							ret := -1.000000 // sell
		if( Short_Long_Diff > -0.369424 )
			if( Negative_Money_Flow <= 504.664 )
				if( Long_MA <= 167.968 )
					if( MFI_Low <= 15.3087 )
						if( MFI_Low <= 12.1584 )
							if( Negative_Money_Flow_Sum <= 2.58146e+06 )
								if( Positive_Money_Flow <= 99918.4 )
									ret := 0.009302
								if( Positive_Money_Flow > 99918.4 )
									ret := 0.373418
							if( Negative_Money_Flow_Sum > 2.58146e+06 )
								if( MFI <= 20.7936 )
									ret := -0.063492
								if( MFI > 20.7936 )
									ret := -0.535211
						if( MFI_Low > 12.1584 )
							if( Positive_Money_Flow_Sum <= 905155 )
								if( Short_Long_Diff <= 0.246829 )
									ret := -0.350000
								if( Short_Long_Diff > 0.246829 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 905155 )
								if( Short_MA <= 153.999 )
									ret := -1.000000 // sell
								if( Short_MA > 153.999 )
									ret := 0.206897
					if( MFI_Low > 15.3087 )
						if( MFI_High <= -38.8509 )
							if( Positive_Money_Flow <= 54135.2 )
								if( Negative_Money_Flow_Sum <= 849302 )
									ret := -0.200000
								if( Negative_Money_Flow_Sum > 849302 )
									ret := 0.312500
							if( Positive_Money_Flow > 54135.2 )
								if( MA_Cross <= 50.9106 )
									ret := 0.552885
								if( MA_Cross > 50.9106 )
									ret := -0.500000
						if( MFI_High > -38.8509 )
							if( Raw_Money_Flow <= 534958 )
								if( Positive_Money_Flow_Sum <= 767691 )
									ret := -0.024204
								if( Positive_Money_Flow_Sum > 767691 )
									ret := 0.191441
							if( Raw_Money_Flow > 534958 )
								if( Negative_Money_Flow_Sum <= 1.00476e+06 )
									ret := -0.363636
								if( Negative_Money_Flow_Sum > 1.00476e+06 )
									ret := -0.950000 // sell
				if( Long_MA > 167.968 )
					if( MFI_Low <= 28.8333 )
						if( Raw_Money_Flow <= 219931 )
							if( Negative_Money_Flow_Sum <= 1.55885e+06 )
								if( Negative_Money_Flow_Sum <= 1.26361e+06 )
									ret := 0.007901
								if( Negative_Money_Flow_Sum > 1.26361e+06 )
									ret := 0.280952
							if( Negative_Money_Flow_Sum > 1.55885e+06 )
								if( Negative_Money_Flow_Sum <= 1.67116e+06 )
									ret := -0.571429
								if( Negative_Money_Flow_Sum > 1.67116e+06 )
									ret := -0.084656
						if( Raw_Money_Flow > 219931 )
							if( Positive_Money_Flow <= 378848 )
								if( Short_MA <= 169.845 )
									ret := 0.718750 // buy
								if( Short_MA > 169.845 )
									ret := 0.258503
							if( Positive_Money_Flow > 378848 )
								if( Positive_Money_Flow_Sum <= 780844 )
									ret := -0.875000 // sell
								if( Positive_Money_Flow_Sum > 780844 )
									ret := 0.051282
					if( MFI_Low > 28.8333 )
						if( Positive_Money_Flow_Sum <= 1.104e+06 )
							if( Raw_Money_Flow <= 209308 )
								if( Negative_Money_Flow_Sum <= 754041 )
									ret := -0.061606
								if( Negative_Money_Flow_Sum > 754041 )
									ret := -0.538462
							if( Raw_Money_Flow > 209308 )
								if( MFI_Low <= 43.1108 )
									ret := -0.261538
								if( MFI_Low > 43.1108 )
									ret := -0.662791
						if( Positive_Money_Flow_Sum > 1.104e+06 )
							if( MFI <= 56.6695 )
								if( Raw_Money_Flow <= 260043 )
									ret := 0.000000
								if( Raw_Money_Flow > 260043 )
									ret := -0.625000
							if( MFI > 56.6695 )
								if( MFI_High <= 1.64241 )
									ret := 0.486486
								if( MFI_High > 1.64241 )
									ret := -0.250000
			if( Negative_Money_Flow > 504.664 )
				if( Raw_Money_Flow <= 1.09393e+06 )
					if( Short_MA <= 159.413 )
						if( MFI_High <= -63.001 )
							if( MFI_Low <= -8.38185 )
								if( Typical_Price <= 158.992 )
									ret := 0.263158
								if( Typical_Price > 158.992 )
									ret := -1.000000 // sell
							if( MFI_Low > -8.38185 )
								if( Typical_Price <= 156.98 )
									ret := 0.848485 // buy
								if( Typical_Price > 156.98 )
									ret := 0.366667
						if( MFI_High > -63.001 )
							if( Positive_Money_Flow_Sum <= 177172 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 177172 )
								if( Short_Long_Diff <= 0.012328 )
									ret := 0.402367
								if( Short_Long_Diff > 0.012328 )
									ret := 0.112805
					if( Short_MA > 159.413 )
						if( MFI_High <= -72.5225 )
							if( Short_Long_Diff <= -0.204839 )
								if( Positive_Money_Flow_Sum <= 618070 )
									ret := -0.650000
								if( Positive_Money_Flow_Sum > 618070 )
									ret := 1.000000 // buy
							if( Short_Long_Diff > -0.204839 )
								if( Raw_Money_Flow <= 504003 )
									ret := 0.028571
								if( Raw_Money_Flow > 504003 )
									ret := 0.666667
						if( MFI_High > -72.5225 )
							if( Raw_Money_Flow <= 67743.2 )
								if( Negative_Money_Flow_Sum <= 926119 )
									ret := 0.132640
								if( Negative_Money_Flow_Sum > 926119 )
									ret := 0.339181
							if( Raw_Money_Flow > 67743.2 )
								if( Negative_Money_Flow_Sum <= 7.00678e+06 )
									ret := 0.128049
								if( Negative_Money_Flow_Sum > 7.00678e+06 )
									ret := -0.263158
				if( Raw_Money_Flow > 1.09393e+06 )
					if( Positive_Money_Flow_Sum <= 556321 )
						if( Negative_Money_Flow_Sum <= 5.40115e+06 )
							if( Raw_Money_Flow <= 1.82238e+06 )
								if( Positive_Money_Flow_Sum <= 367434 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 367434 )
									ret := 0.666667
							if( Raw_Money_Flow > 1.82238e+06 )
								if( Short_Long_Diff <= 0.036289 )
									ret := -0.750000 // sell
								if( Short_Long_Diff > 0.036289 )
									ret := 0.250000
						if( Negative_Money_Flow_Sum > 5.40115e+06 )
							if( MFI_High <= -78.0512 )
								if( Short_Long_Diff <= -0.28914 )
									ret := -0.600000
								if( Short_Long_Diff > -0.28914 )
									ret := 0.200000
							if( MFI_High > -78.0512 )
								if( Long_MA <= 165.112 )
									ret := 0.500000
								if( Long_MA > 165.112 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 556321 )
						if( Negative_Money_Flow_Sum <= 4.33882e+06 )
							if( Negative_Money_Flow <= 2.02968e+06 )
								if( MFI_High <= -61.7952 )
									ret := -0.200000
								if( MFI_High > -61.7952 )
									ret := 0.607143
							if( Negative_Money_Flow > 2.02968e+06 )
								if( Negative_Money_Flow <= 2.89468e+06 )
									ret := -0.823529 // sell
								if( Negative_Money_Flow > 2.89468e+06 )
									ret := 0.375000
						if( Negative_Money_Flow_Sum > 4.33882e+06 )
							if( Money_Flow_Ratio <= 0.018654 )
								if( Negative_Money_Flow_Sum <= 7.50698e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 7.50698e+07 )
									ret := 0.285714
							if( Money_Flow_Ratio > 0.018654 )
								if( Typical_Price <= 154.067 )
									ret := 0.000000
								if( Typical_Price > 154.067 )
									ret := 0.882883 // buy
	if( Positive_Money_Flow_Sum > 1.16109e+06 )
		if( Raw_Money_Flow <= 1.88307e+06 )
			if( Short_MA <= 155.216 )
				if( Short_Long_Diff <= -0.024616 )
					if( Raw_Money_Flow <= 38041.5 )
						if( Negative_Money_Flow_Sum <= 867325 )
							ret := 0.500000
						if( Negative_Money_Flow_Sum > 867325 )
							ret := 1.000000 // buy
					if( Raw_Money_Flow > 38041.5 )
						if( Short_MA <= 152.947 )
							if( Money_Flow_Ratio <= 0.357114 )
								if( Typical_Price <= 151.957 )
									ret := -0.750000 // sell
								if( Typical_Price > 151.957 )
									ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.357114 )
								if( MFI <= 32.4972 )
									ret := 1.000000 // buy
								if( MFI > 32.4972 )
									ret := 0.028986
						if( Short_MA > 152.947 )
							if( Money_Flow_Ratio <= 1.03524 )
								if( MFI_Low <= 21.2258 )
									ret := -0.407407
								if( MFI_Low > 21.2258 )
									ret := 0.571429
							if( Money_Flow_Ratio > 1.03524 )
								if( Short_Long_Diff <= -0.089929 )
									ret := -0.909091 // sell
								if( Short_Long_Diff > -0.089929 )
									ret := -0.333333
				if( Short_Long_Diff > -0.024616 )
					if( MFI <= 83.8268 )
						if( Typical_Price <= 149.797 )
							if( Long_MA <= 149.751 )
								if( Negative_Money_Flow_Sum <= 1.00079e+06 )
									ret := -0.250000
								if( Negative_Money_Flow_Sum > 1.00079e+06 )
									ret := 0.043478
							if( Long_MA > 149.751 )
								ret := -0.500000
						if( Typical_Price > 149.797 )
							if( Positive_Money_Flow <= 136203 )
								if( Raw_Money_Flow <= 158495 )
									ret := 0.226667
								if( Raw_Money_Flow > 158495 )
									ret := 0.552239
							if( Positive_Money_Flow > 136203 )
								if( Raw_Money_Flow <= 1.16798e+06 )
									ret := 0.758242 // buy
								if( Raw_Money_Flow > 1.16798e+06 )
									ret := 0.178571
					if( MFI > 83.8268 )
						if( Typical_Price <= 151.962 )
							if( Negative_Money_Flow_Sum <= 414125 )
								ret := -0.250000
							if( Negative_Money_Flow_Sum > 414125 )
								if( MFI_Low <= 79.4537 )
									ret := 0.000000
								if( MFI_Low > 79.4537 )
									ret := 0.142857
						if( Typical_Price > 151.962 )
							ret := -0.600000
			if( Short_MA > 155.216 )
				if( Positive_Money_Flow <= 25721 )
					if( MFI_High <= -56.7711 )
						if( Negative_Money_Flow_Sum <= 5.0046e+06 )
							if( Negative_Money_Flow_Sum <= 4.33297e+06 )
								ret := 0.250000
							if( Negative_Money_Flow_Sum > 4.33297e+06 )
								if( Typical_Price <= 177.928 )
									ret := 1.000000 // buy
								if( Typical_Price > 177.928 )
									ret := 0.750000 // buy
						if( Negative_Money_Flow_Sum > 5.0046e+06 )
							if( Short_Long_Diff <= -0.090798 )
								if( Negative_Money_Flow_Sum <= 6.88143e+06 )
									ret := -0.320755
								if( Negative_Money_Flow_Sum > 6.88143e+06 )
									ret := 0.394958
							if( Short_Long_Diff > -0.090798 )
								if( Raw_Money_Flow <= 346110 )
									ret := 0.032609
								if( Raw_Money_Flow > 346110 )
									ret := -0.290323
					if( MFI_High > -56.7711 )
						if( Money_Flow_Ratio <= 0.46806 )
							if( MFI_Low <= 7.97469 )
								if( Negative_Money_Flow <= 249484 )
									ret := 0.196078
								if( Negative_Money_Flow > 249484 )
									ret := -0.107477
							if( MFI_Low > 7.97469 )
								if( Negative_Money_Flow_Sum <= 2.80496e+06 )
									ret := 0.545455
								if( Negative_Money_Flow_Sum > 2.80496e+06 )
									ret := -0.250923
						if( Money_Flow_Ratio > 0.46806 )
							if( Money_Flow_Ratio <= 0.495183 )
								if( Short_Long_Diff <= -0.122985 )
									ret := -0.217391
								if( Short_Long_Diff > -0.122985 )
									ret := 0.377551
							if( Money_Flow_Ratio > 0.495183 )
								if( Short_Long_Diff <= 0.609372 )
									ret := 0.012951
								if( Short_Long_Diff > 0.609372 )
									ret := 0.603448
				if( Positive_Money_Flow > 25721 )
					if( MFI <= 15.4992 )
						if( Negative_Money_Flow <= 385.173 )
							if( Short_Long_Diff <= -0.23464 )
								if( Long_MA <= 168.478 )
									ret := -0.227273
								if( Long_MA > 168.478 )
									ret := -0.857143 // sell
							if( Short_Long_Diff > -0.23464 )
								if( Short_Long_Diff <= -0.056095 )
									ret := -0.026316
								if( Short_Long_Diff > -0.056095 )
									ret := -0.293413
						if( Negative_Money_Flow > 385.173 )
							if( Negative_Money_Flow_Sum <= 5.3574e+07 )
								if( Long_MA <= 171.677 )
									ret := -0.440000
								if( Long_MA > 171.677 )
									ret := 0.600000
							if( Negative_Money_Flow_Sum > 5.3574e+07 )
								if( Long_MA <= 164.164 )
									ret := -0.500000
								if( Long_MA > 164.164 )
									ret := -1.000000 // sell
					if( MFI > 15.4992 )
						if( Negative_Money_Flow_Sum <= 292841 )
							if( Short_Long_Diff <= 0.354114 )
								if( Short_Long_Diff <= 0.234806 )
									ret := -0.371257
								if( Short_Long_Diff > 0.234806 )
									ret := -0.851852 // sell
							if( Short_Long_Diff > 0.354114 )
								if( Positive_Money_Flow_Sum <= 2.28819e+06 )
									ret := 0.375000
								if( Positive_Money_Flow_Sum > 2.28819e+06 )
									ret := -0.166667
						if( Negative_Money_Flow_Sum > 292841 )
							if( Short_Long_Diff <= 0.122977 )
								if( Positive_Money_Flow_Sum <= 1.72318e+06 )
									ret := 0.083729
								if( Positive_Money_Flow_Sum > 1.72318e+06 )
									ret := -0.019539
							if( Short_Long_Diff > 0.122977 )
								if( Positive_Money_Flow_Sum <= 7.81765e+06 )
									ret := -0.055030
								if( Positive_Money_Flow_Sum > 7.81765e+06 )
									ret := -0.251232
		if( Raw_Money_Flow > 1.88307e+06 )
			if( Negative_Money_Flow_Sum <= 5.67659e+08 )
				if( MFI <= 4.35987 )
					if( Typical_Price <= 162.962 )
						if( Negative_Money_Flow_Sum <= 2.49575e+08 )
							if( Long_MA <= 150.635 )
								ret := -0.500000
							if( Long_MA > 150.635 )
								if( MFI_Low <= -17.5433 )
									ret := -0.850000 // sell
								if( MFI_Low > -17.5433 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 2.49575e+08 )
							ret := -0.250000
					if( Typical_Price > 162.962 )
						if( Positive_Money_Flow <= 97840.1 )
							if( Negative_Money_Flow_Sum <= 5.25322e+08 )
								if( Short_Long_Diff <= 0.00121 )
									ret := -0.020000
								if( Short_Long_Diff > 0.00121 )
									ret := -0.692308
							if( Negative_Money_Flow_Sum > 5.25322e+08 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow > 97840.1 )
							if( Negative_Money_Flow_Sum <= 3.05516e+08 )
								ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 3.05516e+08 )
								ret := -1.000000 // sell
				if( MFI > 4.35987 )
					if( Short_Long_Diff <= -0.748857 )
						if( Raw_Money_Flow <= 2.53042e+07 )
							if( Negative_Money_Flow_Sum <= 9.28642e+07 )
								if( Short_MA <= 180.419 )
									ret := 0.291667
								if( Short_MA > 180.419 )
									ret := -0.812500 // sell
							if( Negative_Money_Flow_Sum > 9.28642e+07 )
								if( Money_Flow_Ratio <= 0.362132 )
									ret := -0.769231 // sell
								if( Money_Flow_Ratio > 0.362132 )
									ret := 0.294118
						if( Raw_Money_Flow > 2.53042e+07 )
							if( Typical_Price <= 172.879 )
								if( Negative_Money_Flow_Sum <= 2.99831e+08 )
									ret := 0.062500
								if( Negative_Money_Flow_Sum > 2.99831e+08 )
									ret := 0.705882 // buy
							if( Typical_Price > 172.879 )
								ret := -1.000000 // sell
					if( Short_Long_Diff > -0.748857 )
						if( Short_Long_Diff <= -0.489337 )
							if( MFI <= 20.9487 )
								if( Negative_Money_Flow <= 1.15899e+07 )
									ret := 0.558685
								if( Negative_Money_Flow > 1.15899e+07 )
									ret := 0.127273
							if( MFI > 20.9487 )
								if( MFI_Low <= 6.79585 )
									ret := -0.278261
								if( MFI_Low > 6.79585 )
									ret := 0.314410
						if( Short_Long_Diff > -0.489337 )
							if( Typical_Price <= 183.636 )
								if( Raw_Money_Flow <= 3.41914e+08 )
									ret := 0.053577
								if( Raw_Money_Flow > 3.41914e+08 )
									ret := -0.363636
							if( Typical_Price > 183.636 )
								if( MFI_High <= 16.3857 )
									ret := -0.021230
								if( MFI_High > 16.3857 )
									ret := 0.828571 // buy
			if( Negative_Money_Flow_Sum > 5.67659e+08 )
				if( Raw_Money_Flow <= 8.81884e+06 )
					if( Short_MA <= 164.548 )
						if( Negative_Money_Flow <= 406881 )
							ret := 0.000000
						if( Negative_Money_Flow > 406881 )
							if( MFI <= 10.753 )
								if( Money_Flow_Ratio <= 0.060816 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.060816 )
									ret := 0.500000
							if( MFI > 10.753 )
								ret := 1.000000 // buy
					if( Short_MA > 164.548 )
						if( Positive_Money_Flow <= 764899 )
							if( Positive_Money_Flow_Sum <= 5.88689e+07 )
								ret := -0.833333 // sell
							if( Positive_Money_Flow_Sum > 5.88689e+07 )
								if( Negative_Money_Flow <= 3.29153e+06 )
									ret := 0.400000
								if( Negative_Money_Flow > 3.29153e+06 )
									ret := -0.142857
						if( Positive_Money_Flow > 764899 )
							if( Typical_Price <= 179.476 )
								if( Raw_Money_Flow <= 2.69404e+06 )
									ret := -0.500000
								if( Raw_Money_Flow > 2.69404e+06 )
									ret := -0.950000 // sell
							if( Typical_Price > 179.476 )
								ret := 0.000000
				if( Raw_Money_Flow > 8.81884e+06 )
					if( MA_Cross <= 11.4367 )
						if( Positive_Money_Flow_Sum <= 4.27398e+08 )
							if( Long_MA <= 173.81 )
								if( Negative_Money_Flow_Sum <= 9.90668e+08 )
									ret := 0.887755 // buy
								if( Negative_Money_Flow_Sum > 9.90668e+08 )
									ret := 0.111111
							if( Long_MA > 173.81 )
								if( Short_Long_Diff <= 0.013193 )
									ret := 0.606061
								if( Short_Long_Diff > 0.013193 )
									ret := -0.083333
						if( Positive_Money_Flow_Sum > 4.27398e+08 )
							if( MFI_High <= -36.7934 )
								if( Short_Long_Diff <= -0.193414 )
									ret := -0.888889 // sell
								if( Short_Long_Diff > -0.193414 )
									ret := -0.200000
							if( MFI_High > -36.7934 )
								if( Positive_Money_Flow_Sum <= 6.60702e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 6.60702e+08 )
									ret := -0.166667
					if( MA_Cross > 11.4367 )
						ret := -0.666667
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_MA_Cross_SMA 
//@version=5
//indicator title="MA Cross", overlay=true)

shortlen = input.int(9, title="Short MA Length", minval=1)
longlen = input.int(21, title="Long MA Length", minval=1)

// Calculate the short and long simple moving averages (SMA)
Short_MA = ta.sma(close, shortlen)
Long_MA = ta.sma(close, longlen)

// Calculate the difference between short MA and long MA
Short_Long_Diff = Short_MA - Long_MA

// Identify crossover points where short MA crosses above or below the long MA
MA_Cross = ta.valuewhen(ta.crossover(Short_MA, Long_MA), Short_MA, 0)

// Plot the results
plot(Short_MA, color=color.orange, title="Short MA")
plot(Long_MA, color=color.green, title="Long MA")
plotshape(na(MA_Cross) ? na : MA_Cross, style=shape.cross, location=location.absolute, color=color.blue, title="Cross")


//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_GOOG_1Min_46e6a7e5(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


