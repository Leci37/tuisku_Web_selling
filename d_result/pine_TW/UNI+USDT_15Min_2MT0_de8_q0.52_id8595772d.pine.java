//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: UNIUSDT_15Min_2MT0_8595772d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_2MT0_8595772d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_8595772d(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.013294 )
		if( Negative_Money_Flow_Sum <= 1.42519e+06 )
			if( Money_Flow_Ratio <= 0.376672 )
				if( Raw_Money_Flow <= 320755 )
					if( Positive_Money_Flow_Sum <= 148489 )
						if( ema2 <= 5.44593 )
							if( ema3 <= 4.3748 )
								if( Negative_Money_Flow_Sum <= 882328 )
									ret := -0.475000
								if( Negative_Money_Flow_Sum > 882328 )
									ret := 0.100000
							if( ema3 > 4.3748 )
								if( Negative_Money_Flow_Sum <= 1.2049e+06 )
									ret := 0.069597
								if( Negative_Money_Flow_Sum > 1.2049e+06 )
									ret := -0.541667
						if( ema2 > 5.44593 )
							if( ema13 <= -0.024939 )
								if( Raw_Money_Flow <= 28524.8 )
									ret := -0.117647
								if( Raw_Money_Flow > 28524.8 )
									ret := 0.315341
							if( ema13 > -0.024939 )
								if( ema13 <= -0.023978 )
									ret := -0.550000
								if( ema13 > -0.023978 )
									ret := 0.111111
					if( Positive_Money_Flow_Sum > 148489 )
						if( ema3 <= 8.1212 )
							if( Negative_Money_Flow_Sum <= 910144 )
								if( ema13 <= -0.02894 )
									ret := -0.224556
								if( ema13 > -0.02894 )
									ret := 0.116667
							if( Negative_Money_Flow_Sum > 910144 )
								if( Negative_Money_Flow_Sum <= 992934 )
									ret := 0.257576
								if( Negative_Money_Flow_Sum > 992934 )
									ret := -0.025875
						if( ema3 > 8.1212 )
							if( Raw_Money_Flow <= 180864 )
								if( Positive_Money_Flow_Sum <= 293098 )
									ret := -0.637681
								if( Positive_Money_Flow_Sum > 293098 )
									ret := -0.214286
							if( Raw_Money_Flow > 180864 )
								if( Positive_Money_Flow_Sum <= 244584 )
									ret := -0.166667
								if( Positive_Money_Flow_Sum > 244584 )
									ret := 0.500000
				if( Raw_Money_Flow > 320755 )
					if( Negative_Money_Flow <= 656960 )
						if( MFI_Low <= -7.79212 )
							if( Negative_Money_Flow_Sum <= 1.06821e+06 )
								if( tema <= 5.3558 )
									ret := 1.000000 // buy
								if( tema > 5.3558 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 1.06821e+06 )
								if( Negative_Money_Flow_Sum <= 1.2862e+06 )
									ret := -0.846154 // sell
								if( Negative_Money_Flow_Sum > 1.2862e+06 )
									ret := -0.333333
						if( MFI_Low > -7.79212 )
							if( Typical_Price <= 4.26164 )
								ret := -0.750000 // sell
							if( Typical_Price > 4.26164 )
								if( Raw_Money_Flow <= 378168 )
									ret := 0.666667
								if( Raw_Money_Flow > 378168 )
									ret := 0.360000
					if( Negative_Money_Flow > 656960 )
						if( Money_Flow_Ratio <= 0.283659 )
							if( MFI <= 11.815 )
								ret := -0.750000 // sell
							if( MFI > 11.815 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.283659 )
							ret := 0.000000
			if( Money_Flow_Ratio > 0.376672 )
				if( Money_Flow_Ratio <= 0.517983 )
					if( Raw_Money_Flow <= 636232 )
						if( Positive_Money_Flow <= 187107 )
							if( Negative_Money_Flow_Sum <= 1.39829e+06 )
								if( Positive_Money_Flow_Sum <= 462046 )
									ret := 0.126195
								if( Positive_Money_Flow_Sum > 462046 )
									ret := 0.236722
							if( Negative_Money_Flow_Sum > 1.39829e+06 )
								if( Positive_Money_Flow <= 9426.64 )
									ret := -0.558140
								if( Positive_Money_Flow > 9426.64 )
									ret := 0.095238
						if( Positive_Money_Flow > 187107 )
							if( Money_Flow_Ratio <= 0.444502 )
								if( Raw_Money_Flow <= 243510 )
									ret := 0.000000
								if( Raw_Money_Flow > 243510 )
									ret := 0.666667
							if( Money_Flow_Ratio > 0.444502 )
								if( Positive_Money_Flow <= 254697 )
									ret := 0.944444 // buy
								if( Positive_Money_Flow > 254697 )
									ret := 0.400000
					if( Raw_Money_Flow > 636232 )
						if( ema12 <= -0.020391 )
							ret := 0.750000 // buy
						if( ema12 > -0.020391 )
							ret := 1.000000 // buy
				if( Money_Flow_Ratio > 0.517983 )
					if( Positive_Money_Flow_Sum <= 1.98573e+06 )
						if( Negative_Money_Flow_Sum <= 1.12266e+06 )
							if( Positive_Money_Flow_Sum <= 371828 )
								if( tema <= 4.26239 )
									ret := 0.909091 // buy
								if( tema > 4.26239 )
									ret := -0.100467
							if( Positive_Money_Flow_Sum > 371828 )
								if( ema1 <= 6.16347 )
									ret := 0.242334
								if( ema1 > 6.16347 )
									ret := 0.060819
						if( Negative_Money_Flow_Sum > 1.12266e+06 )
							if( Positive_Money_Flow_Sum <= 646681 )
								if( ema12 <= -0.017561 )
									ret := -0.750000 // sell
								if( ema12 > -0.017561 )
									ret := -0.181818
							if( Positive_Money_Flow_Sum > 646681 )
								if( Money_Flow_Ratio <= 0.803236 )
									ret := 0.073834
								if( Money_Flow_Ratio > 0.803236 )
									ret := -0.160088
					if( Positive_Money_Flow_Sum > 1.98573e+06 )
						if( Positive_Money_Flow <= 61571.8 )
							if( Typical_Price <= 9.04478 )
								if( Money_Flow_Ratio <= 2.21281 )
									ret := 0.925926 // buy
								if( Money_Flow_Ratio > 2.21281 )
									ret := 0.500000
							if( Typical_Price > 9.04478 )
								ret := -0.166667
						if( Positive_Money_Flow > 61571.8 )
							if( Raw_Money_Flow <= 115533 )
								if( Positive_Money_Flow_Sum <= 2.30045e+06 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 2.30045e+06 )
									ret := 0.200000
							if( Raw_Money_Flow > 115533 )
								if( Positive_Money_Flow_Sum <= 2.46624e+06 )
									ret := 0.736842 // buy
								if( Positive_Money_Flow_Sum > 2.46624e+06 )
									ret := 0.181818
		if( Negative_Money_Flow_Sum > 1.42519e+06 )
			if( ema3 <= 8.31153 )
				if( Negative_Money_Flow_Sum <= 1.52579e+06 )
					if( ema12 <= -0.024593 )
						if( Positive_Money_Flow_Sum <= 512647 )
							if( Negative_Money_Flow <= 219334 )
								if( Raw_Money_Flow <= 112098 )
									ret := 0.040404
								if( Raw_Money_Flow > 112098 )
									ret := 0.611111
							if( Negative_Money_Flow > 219334 )
								if( ema12 <= -0.043459 )
									ret := -0.800000 // sell
								if( ema12 > -0.043459 )
									ret := 0.033333
						if( Positive_Money_Flow_Sum > 512647 )
							if( Raw_Money_Flow <= 70674.1 )
								if( Negative_Money_Flow <= 31376.5 )
									ret := 0.444444
								if( Negative_Money_Flow > 31376.5 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 70674.1 )
								if( Positive_Money_Flow <= 236531 )
									ret := 0.629508
								if( Positive_Money_Flow > 236531 )
									ret := -0.125000
					if( ema12 > -0.024593 )
						if( ema13 <= -0.055149 )
							if( Negative_Money_Flow <= 123392 )
								if( Positive_Money_Flow <= 86661.8 )
									ret := -0.600000
								if( Positive_Money_Flow > 86661.8 )
									ret := 0.000000
							if( Negative_Money_Flow > 123392 )
								ret := -1.000000 // sell
						if( ema13 > -0.055149 )
							if( Raw_Money_Flow <= 197395 )
								if( Raw_Money_Flow <= 166789 )
									ret := 0.237226
								if( Raw_Money_Flow > 166789 )
									ret := 0.689655
							if( Raw_Money_Flow > 197395 )
								if( ema13 <= -0.044274 )
									ret := 0.909091 // buy
								if( ema13 > -0.044274 )
									ret := -0.113636
				if( Negative_Money_Flow_Sum > 1.52579e+06 )
					if( MFI_Low <= 19.5855 )
						if( Negative_Money_Flow_Sum <= 2.47227e+06 )
							if( Negative_Money_Flow_Sum <= 1.80823e+06 )
								if( ema3 <= 6.56621 )
									ret := 0.024221
								if( ema3 > 6.56621 )
									ret := 0.282813
							if( Negative_Money_Flow_Sum > 1.80823e+06 )
								if( ema13 <= -0.059001 )
									ret := 0.357485
								if( ema13 > -0.059001 )
									ret := 0.202152
						if( Negative_Money_Flow_Sum > 2.47227e+06 )
							if( ema1 <= 5.67702 )
								if( MFI_Low <= 8.28475 )
									ret := 0.344020
								if( MFI_Low > 8.28475 )
									ret := 0.066998
							if( ema1 > 5.67702 )
								if( Negative_Money_Flow <= 1180.95 )
									ret := 0.019372
								if( Negative_Money_Flow > 1180.95 )
									ret := 0.160362
					if( MFI_Low > 19.5855 )
						if( Negative_Money_Flow_Sum <= 1.62868e+06 )
							if( Positive_Money_Flow_Sum <= 1.07095e+06 )
								if( MFI_Low <= 20.2231 )
									ret := -1.000000 // sell
								if( MFI_Low > 20.2231 )
									ret := -0.500000
							if( Positive_Money_Flow_Sum > 1.07095e+06 )
								if( ema13 <= -0.074908 )
									ret := 0.363636
								if( ema13 > -0.074908 )
									ret := -0.291925
						if( Negative_Money_Flow_Sum > 1.62868e+06 )
							if( Positive_Money_Flow_Sum <= 4.29925e+06 )
								if( ema13 <= -0.108057 )
									ret := 0.625000
								if( ema13 > -0.108057 )
									ret := 0.143277
							if( Positive_Money_Flow_Sum > 4.29925e+06 )
								if( Raw_Money_Flow <= 1.45237e+06 )
									ret := -0.251553
								if( Raw_Money_Flow > 1.45237e+06 )
									ret := 0.416667
			if( ema3 > 8.31153 )
				if( MFI_Low <= 29.4874 )
					if( Negative_Money_Flow_Sum <= 1.79672e+06 )
						if( ema12 <= -0.061032 )
							ret := -1.000000 // sell
						if( ema12 > -0.061032 )
							if( Negative_Money_Flow_Sum <= 1.45837e+06 )
								if( Negative_Money_Flow_Sum <= 1.44334e+06 )
									ret := 0.210526
								if( Negative_Money_Flow_Sum > 1.44334e+06 )
									ret := -0.692308
							if( Negative_Money_Flow_Sum > 1.45837e+06 )
								if( Positive_Money_Flow_Sum <= 1.43736e+06 )
									ret := 0.521912
								if( Positive_Money_Flow_Sum > 1.43736e+06 )
									ret := -0.312500
					if( Negative_Money_Flow_Sum > 1.79672e+06 )
						if( ema12 <= -0.129648 )
							if( Raw_Money_Flow <= 3.01498e+06 )
								if( Negative_Money_Flow <= 413280 )
									ret := 0.164835
								if( Negative_Money_Flow > 413280 )
									ret := 0.697987
							if( Raw_Money_Flow > 3.01498e+06 )
								if( Negative_Money_Flow_Sum <= 9.38156e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 9.38156e+06 )
									ret := -0.203125
						if( ema12 > -0.129648 )
							if( Negative_Money_Flow_Sum <= 2.38098e+07 )
								if( Negative_Money_Flow <= 395182 )
									ret := -0.049392
								if( Negative_Money_Flow > 395182 )
									ret := 0.137828
							if( Negative_Money_Flow_Sum > 2.38098e+07 )
								if( ema2 <= 14.7579 )
									ret := -0.844444 // sell
								if( ema2 > 14.7579 )
									ret := -0.076923
				if( MFI_Low > 29.4874 )
					if( ema12 <= -0.047431 )
						if( ema3 <= 9.9776 )
							if( Raw_Money_Flow <= 919760 )
								if( Negative_Money_Flow_Sum <= 2.65906e+06 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 2.65906e+06 )
									ret := -0.473684
							if( Raw_Money_Flow > 919760 )
								ret := 1.000000 // buy
						if( ema3 > 9.9776 )
							if( Raw_Money_Flow <= 2.91762e+06 )
								if( ema12 <= -0.059962 )
									ret := 0.983607 // buy
								if( ema12 > -0.059962 )
									ret := 0.705882 // buy
							if( Raw_Money_Flow > 2.91762e+06 )
								ret := 0.000000
					if( ema12 > -0.047431 )
						if( Positive_Money_Flow <= 1.43615e+06 )
							if( Raw_Money_Flow <= 618130 )
								if( Positive_Money_Flow_Sum <= 3.22019e+06 )
									ret := 0.392857
								if( Positive_Money_Flow_Sum > 3.22019e+06 )
									ret := 0.054422
							if( Raw_Money_Flow > 618130 )
								if( MFI_Low <= 36.1066 )
									ret := -0.384615
								if( MFI_Low > 36.1066 )
									ret := 0.428571
						if( Positive_Money_Flow > 1.43615e+06 )
							if( ema12 <= -0.028294 )
								ret := 1.000000 // buy
							if( ema12 > -0.028294 )
								if( MFI_Low <= 35.4061 )
									ret := -0.500000
								if( MFI_Low > 35.4061 )
									ret := 0.857143 // buy
	if( ema12 > -0.013294 )
		if( ema1 <= 7.05775 )
			if( Negative_Money_Flow <= 30074.4 )
				if( Raw_Money_Flow <= 30149.6 )
					if( MFI <= 77.5019 )
						if( ema13 <= -0.001845 )
							if( Positive_Money_Flow_Sum <= 1.19497e+06 )
								if( Money_Flow_Ratio <= 1.26677 )
									ret := -0.046860
								if( Money_Flow_Ratio > 1.26677 )
									ret := -0.167883
							if( Positive_Money_Flow_Sum > 1.19497e+06 )
								if( Positive_Money_Flow_Sum <= 1.59556e+06 )
									ret := 0.650000
								if( Positive_Money_Flow_Sum > 1.59556e+06 )
									ret := -0.166667
						if( ema13 > -0.001845 )
							if( Negative_Money_Flow_Sum <= 522992 )
								if( Positive_Money_Flow_Sum <= 829156 )
									ret := 0.001007
								if( Positive_Money_Flow_Sum > 829156 )
									ret := -0.226027
							if( Negative_Money_Flow_Sum > 522992 )
								if( Raw_Money_Flow <= 26377.1 )
									ret := 0.196891
								if( Raw_Money_Flow > 26377.1 )
									ret := -0.047059
					if( MFI > 77.5019 )
						if( ema13 <= 0.063887 )
							if( ema12 <= 0.011864 )
								if( ema13 <= 0.011793 )
									ret := 0.160173
								if( ema13 > 0.011793 )
									ret := -0.034483
							if( ema12 > 0.011864 )
								if( ema13 <= 0.040518 )
									ret := 0.363128
								if( ema13 > 0.040518 )
									ret := 0.012048
						if( ema13 > 0.063887 )
							if( Typical_Price <= 6.48327 )
								ret := -1.000000 // sell
							if( Typical_Price > 6.48327 )
								ret := -0.200000
				if( Raw_Money_Flow > 30149.6 )
					if( Positive_Money_Flow_Sum <= 1.16947e+06 )
						if( ema12 <= 0.02447 )
							if( ema2 <= 6.08341 )
								if( Negative_Money_Flow_Sum <= 363916 )
									ret := 0.045719
								if( Negative_Money_Flow_Sum > 363916 )
									ret := 0.135096
							if( ema2 > 6.08341 )
								if( ema12 <= 0.002368 )
									ret := -0.025965
								if( ema12 > 0.002368 )
									ret := 0.077413
						if( ema12 > 0.02447 )
							if( Positive_Money_Flow <= 236556 )
								if( tema <= 4.95311 )
									ret := 0.022727
								if( tema > 4.95311 )
									ret := 0.291765
							if( Positive_Money_Flow > 236556 )
								if( Typical_Price <= 6.78 )
									ret := 0.009091
								if( Typical_Price > 6.78 )
									ret := -0.620690
					if( Positive_Money_Flow_Sum > 1.16947e+06 )
						if( ema13 <= 0.065212 )
							if( ema3 <= 4.88945 )
								if( MFI_Low <= 43.8414 )
									ret := -0.007380
								if( MFI_Low > 43.8414 )
									ret := -0.320334
							if( ema3 > 4.88945 )
								if( Positive_Money_Flow <= 1.00363e+06 )
									ret := -0.029622
								if( Positive_Money_Flow > 1.00363e+06 )
									ret := -0.306533
						if( ema13 > 0.065212 )
							if( MFI_Low <= 48.4991 )
								if( Positive_Money_Flow_Sum <= 1.95896e+06 )
									ret := -0.011236
								if( Positive_Money_Flow_Sum > 1.95896e+06 )
									ret := 0.425926
							if( MFI_Low > 48.4991 )
								if( Positive_Money_Flow_Sum <= 9.11531e+06 )
									ret := 0.052946
								if( Positive_Money_Flow_Sum > 9.11531e+06 )
									ret := 0.448980
			if( Negative_Money_Flow > 30074.4 )
				if( Typical_Price <= 6.16216 )
					if( Positive_Money_Flow_Sum <= 2.12399e+06 )
						if( Positive_Money_Flow_Sum <= 1.15862e+06 )
							if( ema12 <= 0.001021 )
								if( MFI_High <= -73.1994 )
									ret := -0.523810
								if( MFI_High > -73.1994 )
									ret := 0.050499
							if( ema12 > 0.001021 )
								if( Raw_Money_Flow <= 243987 )
									ret := 0.117245
								if( Raw_Money_Flow > 243987 )
									ret := 0.520325
						if( Positive_Money_Flow_Sum > 1.15862e+06 )
							if( Typical_Price <= 6.06992 )
								if( Negative_Money_Flow_Sum <= 1.00885e+06 )
									ret := 0.153264
								if( Negative_Money_Flow_Sum > 1.00885e+06 )
									ret := 0.304094
							if( Typical_Price > 6.06992 )
								if( ema13 <= 0.04448 )
									ret := -0.120482
								if( ema13 > 0.04448 )
									ret := 0.285714
					if( Positive_Money_Flow_Sum > 2.12399e+06 )
						if( Positive_Money_Flow_Sum <= 3.20088e+06 )
							if( MFI_High <= -10.5885 )
								if( Negative_Money_Flow <= 523946 )
									ret := -0.391304
								if( Negative_Money_Flow > 523946 )
									ret := 0.301887
							if( MFI_High > -10.5885 )
								if( Positive_Money_Flow_Sum <= 2.15431e+06 )
									ret := -0.485714
								if( Positive_Money_Flow_Sum > 2.15431e+06 )
									ret := 0.070381
						if( Positive_Money_Flow_Sum > 3.20088e+06 )
							if( ema3 <= 4.56804 )
								if( MFI <= 81.5873 )
									ret := 0.961538 // buy
								if( MFI > 81.5873 )
									ret := 0.333333
							if( ema3 > 4.56804 )
								if( Negative_Money_Flow_Sum <= 632933 )
									ret := 0.634146
								if( Negative_Money_Flow_Sum > 632933 )
									ret := 0.093578
				if( Typical_Price > 6.16216 )
					if( MFI_Low <= 16.3933 )
						if( Positive_Money_Flow_Sum <= 6.61434e+06 )
							if( Positive_Money_Flow_Sum <= 854373 )
								if( Raw_Money_Flow <= 639124 )
									ret := 0.080866
								if( Raw_Money_Flow > 639124 )
									ret := 0.809524 // buy
							if( Positive_Money_Flow_Sum > 854373 )
								if( MFI <= 28.0705 )
									ret := 0.675000
								if( MFI > 28.0705 )
									ret := 0.242424
						if( Positive_Money_Flow_Sum > 6.61434e+06 )
							ret := -1.000000 // sell
					if( MFI_Low > 16.3933 )
						if( Positive_Money_Flow_Sum <= 4.51915e+06 )
							if( Raw_Money_Flow <= 236969 )
								if( Raw_Money_Flow <= 50798.9 )
									ret := 0.095890
								if( Raw_Money_Flow > 50798.9 )
									ret := -0.019535
							if( Raw_Money_Flow > 236969 )
								if( ema13 <= 0.007602 )
									ret := 0.304478
								if( ema13 > 0.007602 )
									ret := 0.065089
						if( Positive_Money_Flow_Sum > 4.51915e+06 )
							if( ema12 <= 0.019206 )
								if( Raw_Money_Flow <= 298540 )
									ret := -0.451613
								if( Raw_Money_Flow > 298540 )
									ret := 0.287356
							if( ema12 > 0.019206 )
								if( ema1 <= 6.44109 )
									ret := -0.037975
								if( ema1 > 6.44109 )
									ret := -0.439614
		if( ema1 > 7.05775 )
			if( Positive_Money_Flow <= 3.40214e+06 )
				if( Raw_Money_Flow <= 1.5423e+06 )
					if( Negative_Money_Flow <= 223269 )
						if( ema13 <= 0.03393 )
							if( Positive_Money_Flow_Sum <= 1.02872e+06 )
								if( Positive_Money_Flow <= 436847 )
									ret := -0.031906
								if( Positive_Money_Flow > 436847 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 1.02872e+06 )
								if( MFI_High <= -31.91 )
									ret := -0.193008
								if( MFI_High > -31.91 )
									ret := -0.087397
						if( ema13 > 0.03393 )
							if( Positive_Money_Flow_Sum <= 2.85956e+06 )
								if( Positive_Money_Flow_Sum <= 1.94849e+06 )
									ret := -0.019486
								if( Positive_Money_Flow_Sum > 1.94849e+06 )
									ret := 0.170565
							if( Positive_Money_Flow_Sum > 2.85956e+06 )
								if( Raw_Money_Flow <= 573669 )
									ret := -0.174719
								if( Raw_Money_Flow > 573669 )
									ret := 0.040719
					if( Negative_Money_Flow > 223269 )
						if( Positive_Money_Flow_Sum <= 5.05647e+06 )
							if( Typical_Price <= 12.0769 )
								if( Positive_Money_Flow_Sum <= 3.45242e+06 )
									ret := 0.059949
								if( Positive_Money_Flow_Sum > 3.45242e+06 )
									ret := 0.288201
							if( Typical_Price > 12.0769 )
								if( Negative_Money_Flow <= 243320 )
									ret := 0.428571
								if( Negative_Money_Flow > 243320 )
									ret := -0.206278
						if( Positive_Money_Flow_Sum > 5.05647e+06 )
							if( Negative_Money_Flow_Sum <= 3.80219e+06 )
								if( ema2 <= 10.1959 )
									ret := -0.335793
								if( ema2 > 10.1959 )
									ret := -0.034247
							if( Negative_Money_Flow_Sum > 3.80219e+06 )
								if( Raw_Money_Flow <= 1.27053e+06 )
									ret := 0.047285
								if( Raw_Money_Flow > 1.27053e+06 )
									ret := -0.433333
				if( Raw_Money_Flow > 1.5423e+06 )
					if( Negative_Money_Flow_Sum <= 1.54217e+06 )
						if( Positive_Money_Flow_Sum <= 3.68795e+06 )
							if( Money_Flow_Ratio <= 3.26739 )
								ret := -0.166667
							if( Money_Flow_Ratio > 3.26739 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 3.68795e+06 )
							if( Positive_Money_Flow_Sum <= 1.24997e+07 )
								if( Typical_Price <= 9.80872 )
									ret := 0.836066 // buy
								if( Typical_Price > 9.80872 )
									ret := 0.135135
							if( Positive_Money_Flow_Sum > 1.24997e+07 )
								if( Money_Flow_Ratio <= 27.4936 )
									ret := -0.588235
								if( Money_Flow_Ratio > 27.4936 )
									ret := 0.800000 // buy
					if( Negative_Money_Flow_Sum > 1.54217e+06 )
						if( Negative_Money_Flow_Sum <= 4.31741e+06 )
							if( Positive_Money_Flow_Sum <= 2.70147e+07 )
								if( tema <= 11.1431 )
									ret := -0.232323
								if( tema > 11.1431 )
									ret := -0.838710 // sell
							if( Positive_Money_Flow_Sum > 2.70147e+07 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 4.31741e+06 )
							if( Typical_Price <= 11.7741 )
								if( tema <= 10.6753 )
									ret := 0.387597
								if( tema > 10.6753 )
									ret := -0.280000
							if( Typical_Price > 11.7741 )
								if( Negative_Money_Flow_Sum <= 1.51861e+07 )
									ret := 0.745098 // buy
								if( Negative_Money_Flow_Sum > 1.51861e+07 )
									ret := 0.134146
			if( Positive_Money_Flow > 3.40214e+06 )
				if( MFI <= 86.5479 )
					if( MFI_High <= -37.3704 )
						ret := 0.666667
					if( MFI_High > -37.3704 )
						if( tema <= 12.1861 )
							if( Positive_Money_Flow_Sum <= 2.34285e+07 )
								if( Positive_Money_Flow <= 3.89158e+06 )
									ret := -0.500000
								if( Positive_Money_Flow > 3.89158e+06 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 2.34285e+07 )
								if( Positive_Money_Flow_Sum <= 3.31936e+07 )
									ret := 0.857143 // buy
								if( Positive_Money_Flow_Sum > 3.31936e+07 )
									ret := -0.400000
						if( tema > 12.1861 )
							if( Negative_Money_Flow_Sum <= 7.56599e+06 )
								ret := -0.250000
							if( Negative_Money_Flow_Sum > 7.56599e+06 )
								if( tema <= 12.6701 )
									ret := -1.000000 // sell
								if( tema > 12.6701 )
									ret := -0.833333 // sell
				if( MFI > 86.5479 )
					if( ema3 <= 11.3529 )
						if( tema <= 11.1557 )
							if( Positive_Money_Flow_Sum <= 1.797e+07 )
								if( Positive_Money_Flow <= 4.74558e+06 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow > 4.74558e+06 )
									ret := 0.666667
							if( Positive_Money_Flow_Sum > 1.797e+07 )
								ret := 1.000000 // buy
						if( tema > 11.1557 )
							if( ema12 <= 0.172095 )
								ret := 0.000000
							if( ema12 > 0.172095 )
								ret := -1.000000 // sell
					if( ema3 > 11.3529 )
						if( Raw_Money_Flow <= 4.59979e+06 )
							ret := 1.000000 // buy
						if( Raw_Money_Flow > 4.59979e+06 )
							ret := 0.750000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_UNIUSDT_15Min_8595772d(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, ema2, ema1, ema12, ema3, ema13, tema)

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


