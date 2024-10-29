//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: AMD_30Min_2MT0_0e1547c1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_30Min_2MT0_0e1547c1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_30Min_0e1547c1(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Raw_Money_Flow <= 775203 )
		if( ema3 <= 6.8838 )
			if( Positive_Money_Flow <= 22.611 )
				if( tema <= 2.5269 )
					if( ema3 <= 1.90591 )
						if( Negative_Money_Flow <= 409665 )
							if( ema2 <= 1.86775 )
								ret := 0.750000 // buy
							if( ema2 > 1.86775 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow > 409665 )
							ret := 0.250000
					if( ema3 > 1.90591 )
						if( MFI_High <= -43.9777 )
							if( Typical_Price <= 2.20785 )
								if( Positive_Money_Flow_Sum <= 3.2894e+06 )
									ret := -0.935484 // sell
								if( Positive_Money_Flow_Sum > 3.2894e+06 )
									ret := -0.400000
							if( Typical_Price > 2.20785 )
								if( tema <= 2.34937 )
									ret := 0.437500
								if( tema > 2.34937 )
									ret := -0.272727
						if( MFI_High > -43.9777 )
							if( Money_Flow_Ratio <= 5.07987 )
								if( MFI_High <= -2.30512 )
									ret := 0.109756
								if( MFI_High > -2.30512 )
									ret := 0.846154 // buy
							if( Money_Flow_Ratio > 5.07987 )
								ret := -0.375000
				if( tema > 2.5269 )
					if( Positive_Money_Flow_Sum <= 5.37742e+06 )
						if( ema12 <= -0.008078 )
							if( tema <= 2.8479 )
								if( MFI <= 22.1991 )
									ret := -0.133333
								if( MFI > 22.1991 )
									ret := 0.545455
							if( tema > 2.8479 )
								if( ema1 <= 5.71947 )
									ret := 0.948718 // buy
								if( ema1 > 5.71947 )
									ret := 0.666667
						if( ema12 > -0.008078 )
							if( MFI_Low <= 13.5334 )
								if( Money_Flow_Ratio <= 0.007511 )
									ret := 0.692308
								if( Money_Flow_Ratio > 0.007511 )
									ret := -0.602410
							if( MFI_Low > 13.5334 )
								if( Raw_Money_Flow <= 186597 )
									ret := 0.733333 // buy
								if( Raw_Money_Flow > 186597 )
									ret := 0.545455
					if( Positive_Money_Flow_Sum > 5.37742e+06 )
						if( ema3 <= 2.71599 )
							if( Negative_Money_Flow_Sum <= 4.12923e+06 )
								if( ema12 <= 0.010289 )
									ret := 0.250000
								if( ema12 > 0.010289 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 4.12923e+06 )
								ret := 1.000000 // buy
						if( ema3 > 2.71599 )
							if( Negative_Money_Flow_Sum <= 7.36717e+06 )
								if( Negative_Money_Flow <= 112668 )
									ret := 0.388235
								if( Negative_Money_Flow > 112668 )
									ret := -0.360000
							if( Negative_Money_Flow_Sum > 7.36717e+06 )
								if( MFI_Low <= 48.0871 )
									ret := 0.401361
								if( MFI_Low > 48.0871 )
									ret := 0.781513 // buy
			if( Positive_Money_Flow > 22.611 )
				if( Negative_Money_Flow_Sum <= 3.34728e+07 )
					if( Money_Flow_Ratio <= 0.767756 )
						if( Negative_Money_Flow_Sum <= 1.78426e+07 )
							if( Raw_Money_Flow <= 6428.45 )
								if( ema13 <= 0.003642 )
									ret := -0.600000
								if( ema13 > 0.003642 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 6428.45 )
								if( ema3 <= 2.26243 )
									ret := 0.146667
								if( ema3 > 2.26243 )
									ret := -0.455882
						if( Negative_Money_Flow_Sum > 1.78426e+07 )
							if( ema2 <= 3.09992 )
								if( Money_Flow_Ratio <= 0.467216 )
									ret := 0.789474 // buy
								if( Money_Flow_Ratio > 0.467216 )
									ret := 0.363636
							if( ema2 > 3.09992 )
								if( tema <= 5.40859 )
									ret := -0.464789
								if( tema > 5.40859 )
									ret := 0.258065
					if( Money_Flow_Ratio > 0.767756 )
						if( Positive_Money_Flow_Sum <= 2.33006e+07 )
							if( ema3 <= 3.36503 )
								if( ema1 <= 2.69102 )
									ret := 0.168091
								if( ema1 > 2.69102 )
									ret := -0.165414
							if( ema3 > 3.36503 )
								if( MFI_Low <= 33.397 )
									ret := 0.027778
								if( MFI_Low > 33.397 )
									ret := 0.591195
						if( Positive_Money_Flow_Sum > 2.33006e+07 )
							if( ema13 <= 0.050041 )
								if( ema1 <= 4.5978 )
									ret := -0.752475 // sell
								if( ema1 > 4.5978 )
									ret := -0.028571
							if( ema13 > 0.050041 )
								if( Negative_Money_Flow_Sum <= 1.40942e+07 )
									ret := -0.101695
								if( Negative_Money_Flow_Sum > 1.40942e+07 )
									ret := 0.735849 // buy
				if( Negative_Money_Flow_Sum > 3.34728e+07 )
					if( MFI_High <= -62.1222 )
						if( Typical_Price <= 6.16029 )
							ret := 0.333333
						if( Typical_Price > 6.16029 )
							if( ema2 <= 6.77296 )
								ret := -0.882353 // sell
							if( ema2 > 6.77296 )
								ret := 0.200000
					if( MFI_High > -62.1222 )
						if( ema13 <= 0.01601 )
							if( MFI_Low <= 37.6013 )
								if( MFI_Low <= 26.716 )
									ret := 0.446352
								if( MFI_Low > 26.716 )
									ret := 0.941176 // buy
							if( MFI_Low > 37.6013 )
								ret := -0.416667
						if( ema13 > 0.01601 )
							if( MFI_Low <= 8.95455 )
								ret := 1.000000 // buy
							if( MFI_Low > 8.95455 )
								if( ema12 <= 0.013164 )
									ret := -0.571429
								if( ema12 > 0.013164 )
									ret := 0.209302
		if( ema3 > 6.8838 )
			if( Typical_Price <= 7.77078 )
				if( Raw_Money_Flow <= 25016.7 )
					if( Positive_Money_Flow <= 14612.8 )
						if( MFI_High <= -24.3489 )
							if( Raw_Money_Flow <= 11570.3 )
								if( ema2 <= 7.11523 )
									ret := 0.312500
								if( ema2 > 7.11523 )
									ret := 0.066667
							if( Raw_Money_Flow > 11570.3 )
								if( ema12 <= 0.00133 )
									ret := 0.000000
								if( ema12 > 0.00133 )
									ret := -0.533333
						if( MFI_High > -24.3489 )
							if( Raw_Money_Flow <= 13018 )
								if( MFI_High <= -11.3312 )
									ret := 0.894737 // buy
								if( MFI_High > -11.3312 )
									ret := 0.272727
							if( Raw_Money_Flow > 13018 )
								ret := 0.190476
					if( Positive_Money_Flow > 14612.8 )
						ret := 1.000000 // buy
				if( Raw_Money_Flow > 25016.7 )
					if( ema1 <= 7.36627 )
						if( ema1 <= 6.96097 )
							if( Positive_Money_Flow <= 66.7008 )
								if( Negative_Money_Flow_Sum <= 2.65602e+07 )
									ret := 0.357143
								if( Negative_Money_Flow_Sum > 2.65602e+07 )
									ret := -0.454545
							if( Positive_Money_Flow > 66.7008 )
								if( Negative_Money_Flow_Sum <= 5.17096e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 5.17096e+07 )
									ret := -0.818182 // sell
						if( ema1 > 6.96097 )
							if( MFI_Low <= 38.6942 )
								if( ema13 <= -0.011789 )
									ret := 0.400000
								if( ema13 > -0.011789 )
									ret := -0.388889
							if( MFI_Low > 38.6942 )
								if( ema13 <= 0.029299 )
									ret := -0.523810
								if( ema13 > 0.029299 )
									ret := 0.846154 // buy
					if( ema1 > 7.36627 )
						if( Positive_Money_Flow_Sum <= 5.81658e+07 )
							if( Positive_Money_Flow_Sum <= 538511 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 538511 )
								if( Positive_Money_Flow_Sum <= 5.09874e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 5.09874e+06 )
									ret := -0.687500
						if( Positive_Money_Flow_Sum > 5.81658e+07 )
							if( Money_Flow_Ratio <= 0.90647 )
								ret := 0.555556
							if( Money_Flow_Ratio > 0.90647 )
								if( Typical_Price <= 7.68962 )
									ret := 0.066667
								if( Typical_Price > 7.68962 )
									ret := -0.916667 // sell
			if( Typical_Price > 7.77078 )
				if( ema2 <= 9.63584 )
					if( Negative_Money_Flow_Sum <= 1.08004e+06 )
						if( ema13 <= 0.038332 )
							if( ema12 <= -0.000625 )
								ret := -0.076923
							if( ema12 > -0.000625 )
								if( ema2 <= 8.64085 )
									ret := -0.882353 // sell
								if( ema2 > 8.64085 )
									ret := -0.687500
						if( ema13 > 0.038332 )
							if( Money_Flow_Ratio <= 72.4915 )
								ret := 0.142857
							if( Money_Flow_Ratio > 72.4915 )
								ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 1.08004e+06 )
						if( Money_Flow_Ratio <= 0.216924 )
							if( Negative_Money_Flow_Sum <= 2.67829e+07 )
								ret := 0.764706 // buy
							if( Negative_Money_Flow_Sum > 2.67829e+07 )
								if( Money_Flow_Ratio <= 0.131349 )
									ret := -0.125000
								if( Money_Flow_Ratio > 0.131349 )
									ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.216924 )
							if( MFI <= 22.0717 )
								ret := 1.000000 // buy
							if( MFI > 22.0717 )
								if( Negative_Money_Flow_Sum <= 4.45596e+07 )
									ret := 0.542857
								if( Negative_Money_Flow_Sum > 4.45596e+07 )
									ret := 0.240000
				if( ema2 > 9.63584 )
					if( ema12 <= 0.012945 )
						if( Negative_Money_Flow_Sum <= 3.99273e+08 )
							if( MFI <= 0.781201 )
								if( ema2 <= 12.4008 )
									ret := 0.830189 // buy
								if( ema2 > 12.4008 )
									ret := 0.354167
							if( MFI > 0.781201 )
								if( ema1 <= 11.5698 )
									ret := 0.029032
								if( ema1 > 11.5698 )
									ret := 0.193630
						if( Negative_Money_Flow_Sum > 3.99273e+08 )
							if( MFI_Low <= 1.31236 )
								if( tema <= 15.3655 )
									ret := -0.291667
								if( tema > 15.3655 )
									ret := 0.150685
							if( MFI_Low > 1.31236 )
								if( tema <= 12.1024 )
									ret := -0.869565 // sell
								if( tema > 12.1024 )
									ret := -0.013699
					if( ema12 > 0.012945 )
						if( Money_Flow_Ratio <= 0.747536 )
							if( ema2 <= 11.7674 )
								if( Raw_Money_Flow <= 84224.4 )
									ret := -0.264151
								if( Raw_Money_Flow > 84224.4 )
									ret := -0.623529
							if( ema2 > 11.7674 )
								if( Negative_Money_Flow_Sum <= 9.95082e+07 )
									ret := -0.240437
								if( Negative_Money_Flow_Sum > 9.95082e+07 )
									ret := -0.000977
						if( Money_Flow_Ratio > 0.747536 )
							if( MFI_Low <= 52.5024 )
								if( Negative_Money_Flow_Sum <= 2.02628e+06 )
									ret := -0.756303 // sell
								if( Negative_Money_Flow_Sum > 2.02628e+06 )
									ret := 0.046134
							if( MFI_Low > 52.5024 )
								if( ema3 <= 11.7398 )
									ret := 0.287791
								if( ema3 > 11.7398 )
									ret := 0.047641
	if( Raw_Money_Flow > 775203 )
		if( Money_Flow_Ratio <= 3.51092 )
			if( Raw_Money_Flow <= 8.31069e+08 )
				if( Negative_Money_Flow <= 18862.6 )
					if( ema1 <= 3.53199 )
						if( Money_Flow_Ratio <= 0.589883 )
							if( Positive_Money_Flow_Sum <= 2.67926e+06 )
								ret := 0.285714
							if( Positive_Money_Flow_Sum > 2.67926e+06 )
								if( Typical_Price <= 2.7825 )
									ret := -0.373626
								if( Typical_Price > 2.7825 )
									ret := -0.818182 // sell
						if( Money_Flow_Ratio > 0.589883 )
							if( ema3 <= 2.41428 )
								if( Positive_Money_Flow <= 1.02547e+06 )
									ret := 0.179104
								if( Positive_Money_Flow > 1.02547e+06 )
									ret := -0.572581
							if( ema3 > 2.41428 )
								if( ema13 <= 0.013526 )
									ret := 0.329545
								if( ema13 > 0.013526 )
									ret := -0.550000
					if( ema1 > 3.53199 )
						if( Typical_Price <= 6.03437 )
							if( ema1 <= 3.60668 )
								ret := 0.947368 // buy
							if( ema1 > 3.60668 )
								if( Negative_Money_Flow_Sum <= 1.27234e+07 )
									ret := -0.300000
								if( Negative_Money_Flow_Sum > 1.27234e+07 )
									ret := 0.240458
						if( Typical_Price > 6.03437 )
							if( Negative_Money_Flow_Sum <= 1.56604e+08 )
								if( Negative_Money_Flow_Sum <= 1.45619e+08 )
									ret := -0.136639
								if( Negative_Money_Flow_Sum > 1.45619e+08 )
									ret := -0.508571
							if( Negative_Money_Flow_Sum > 1.56604e+08 )
								if( Positive_Money_Flow <= 1.19735e+08 )
									ret := 0.001153
								if( Positive_Money_Flow > 1.19735e+08 )
									ret := -0.071960
				if( Negative_Money_Flow > 18862.6 )
					if( Negative_Money_Flow <= 6.69701e+06 )
						if( Negative_Money_Flow_Sum <= 9.7033e+06 )
							if( MFI_Low <= 11.7233 )
								if( ema13 <= -0.098128 )
									ret := 0.662791
								if( ema13 > -0.098128 )
									ret := -0.038560
							if( MFI_Low > 11.7233 )
								if( MFI_High <= -41.5354 )
									ret := -0.496552
								if( MFI_High > -41.5354 )
									ret := -0.067568
						if( Negative_Money_Flow_Sum > 9.7033e+06 )
							if( Negative_Money_Flow_Sum <= 2.97383e+09 )
								if( MFI_High <= -2.99423 )
									ret := 0.081863
								if( MFI_High > -2.99423 )
									ret := -0.583333
							if( Negative_Money_Flow_Sum > 2.97383e+09 )
								if( ema13 <= -0.396888 )
									ret := -0.209393
								if( ema13 > -0.396888 )
									ret := 0.248731
					if( Negative_Money_Flow > 6.69701e+06 )
						if( ema3 <= 11.6363 )
							if( Money_Flow_Ratio <= 2.37557 )
								if( Negative_Money_Flow_Sum <= 2.10051e+08 )
									ret := -0.027123
								if( Negative_Money_Flow_Sum > 2.10051e+08 )
									ret := 0.192157
							if( Money_Flow_Ratio > 2.37557 )
								if( Positive_Money_Flow_Sum <= 1.00236e+08 )
									ret := -0.333333
								if( Positive_Money_Flow_Sum > 1.00236e+08 )
									ret := 0.621053
						if( ema3 > 11.6363 )
							if( ema3 <= 13.286 )
								if( Money_Flow_Ratio <= 0.046571 )
									ret := 0.003425
								if( Money_Flow_Ratio > 0.046571 )
									ret := -0.237723
							if( ema3 > 13.286 )
								if( Positive_Money_Flow_Sum <= 7.49258e+06 )
									ret := 0.117803
								if( Positive_Money_Flow_Sum > 7.49258e+06 )
									ret := -0.029547
			if( Raw_Money_Flow > 8.31069e+08 )
				if( Money_Flow_Ratio <= 0.008783 )
					if( ema13 <= -1.13452 )
						if( ema1 <= 158.473 )
							if( Negative_Money_Flow <= 9.67003e+08 )
								if( MFI_Low <= -19.3964 )
									ret := -0.454545
								if( MFI_Low > -19.3964 )
									ret := 0.125000
							if( Negative_Money_Flow > 9.67003e+08 )
								if( ema1 <= 117.733 )
									ret := -0.652174
								if( ema1 > 117.733 )
									ret := -0.970588 // sell
						if( ema1 > 158.473 )
							ret := 0.666667
					if( ema13 > -1.13452 )
						if( Money_Flow_Ratio <= 0.007981 )
							if( ema2 <= 97.6689 )
								ret := -0.888889 // sell
							if( ema2 > 97.6689 )
								ret := -0.470588
						if( Money_Flow_Ratio > 0.007981 )
							ret := -1.000000 // sell
				if( Money_Flow_Ratio > 0.008783 )
					if( MFI <= 49.2119 )
						if( Positive_Money_Flow_Sum <= 5.95715e+09 )
							if( ema13 <= -0.796028 )
								if( tema <= 161.909 )
									ret := -0.383077
								if( tema > 161.909 )
									ret := 0.076190
							if( ema13 > -0.796028 )
								if( ema1 <= 87.3582 )
									ret := 0.118343
								if( ema1 > 87.3582 )
									ret := -0.105981
						if( Positive_Money_Flow_Sum > 5.95715e+09 )
							if( ema12 <= -0.403926 )
								if( tema <= 179.45 )
									ret := -1.000000 // sell
								if( tema > 179.45 )
									ret := -0.894737 // sell
							if( ema12 > -0.403926 )
								if( ema13 <= 0.832353 )
									ret := 0.166667
								if( ema13 > 0.832353 )
									ret := -0.777778 // sell
					if( MFI > 49.2119 )
						if( Negative_Money_Flow <= 9.24309e+08 )
							if( Money_Flow_Ratio <= 1.20603 )
								if( Money_Flow_Ratio <= 1.00654 )
									ret := 0.785714 // buy
								if( Money_Flow_Ratio > 1.00654 )
									ret := 0.293103
							if( Money_Flow_Ratio > 1.20603 )
								if( Money_Flow_Ratio <= 1.6497 )
									ret := -0.216374
								if( Money_Flow_Ratio > 1.6497 )
									ret := 0.210046
						if( Negative_Money_Flow > 9.24309e+08 )
							if( ema13 <= 0.120335 )
								if( Negative_Money_Flow <= 1.21777e+09 )
									ret := 0.076923
								if( Negative_Money_Flow > 1.21777e+09 )
									ret := 0.952381 // buy
							if( ema13 > 0.120335 )
								if( Typical_Price <= 167.881 )
									ret := -0.467105
								if( Typical_Price > 167.881 )
									ret := 0.129032
		if( Money_Flow_Ratio > 3.51092 )
			if( Negative_Money_Flow_Sum <= 361838 )
				if( Positive_Money_Flow_Sum <= 4.68722e+08 )
					if( Money_Flow_Ratio <= 45.5938 )
						if( Money_Flow_Ratio <= 21.3762 )
							ret := 0.700000 // buy
						if( Money_Flow_Ratio > 21.3762 )
							if( ema12 <= 0.060104 )
								ret := 0.000000
							if( ema12 > 0.060104 )
								ret := -1.000000 // sell
					if( Money_Flow_Ratio > 45.5938 )
						if( MFI_Low <= 79.8356 )
							if( ema1 <= 3.69685 )
								ret := 0.400000
							if( ema1 > 3.69685 )
								if( ema13 <= 0.024466 )
									ret := 0.666667
								if( ema13 > 0.024466 )
									ret := 0.920792 // buy
						if( MFI_Low > 79.8356 )
							if( Money_Flow_Ratio <= 4000.41 )
								if( ema13 <= 0.096427 )
									ret := 0.607143
								if( ema13 > 0.096427 )
									ret := -0.027027
							if( Money_Flow_Ratio > 4000.41 )
								ret := 0.875000 // buy
				if( Positive_Money_Flow_Sum > 4.68722e+08 )
					ret := -0.500000
			if( Negative_Money_Flow_Sum > 361838 )
				if( Typical_Price <= 117.384 )
					if( MFI_High <= 19.7044 )
						if( Negative_Money_Flow_Sum <= 5.34563e+06 )
							if( Positive_Money_Flow_Sum <= 2.04732e+07 )
								if( ema3 <= 8.10214 )
									ret := 0.129534
								if( ema3 > 8.10214 )
									ret := -0.288462
							if( Positive_Money_Flow_Sum > 2.04732e+07 )
								if( ema13 <= 0.060432 )
									ret := -0.093886
								if( ema13 > 0.060432 )
									ret := 0.136986
						if( Negative_Money_Flow_Sum > 5.34563e+06 )
							if( Raw_Money_Flow <= 2.39778e+08 )
								if( Raw_Money_Flow <= 3.2104e+07 )
									ret := 0.094070
								if( Raw_Money_Flow > 3.2104e+07 )
									ret := -0.033726
							if( Raw_Money_Flow > 2.39778e+08 )
								if( ema3 <= 26.8979 )
									ret := 0.531915
								if( ema3 > 26.8979 )
									ret := 0.111077
					if( MFI_High > 19.7044 )
						if( ema2 <= 40.1333 )
							if( ema3 <= 23.5634 )
								if( ema13 <= 0.242449 )
									ret := 0.258065
								if( ema13 > 0.242449 )
									ret := -0.150000
							if( ema3 > 23.5634 )
								if( tema <= 28.3947 )
									ret := 1.000000 // buy
								if( tema > 28.3947 )
									ret := 0.793103 // buy
						if( ema2 > 40.1333 )
							if( Raw_Money_Flow <= 5.95728e+08 )
								if( Raw_Money_Flow <= 8.90876e+07 )
									ret := 0.250000
								if( Raw_Money_Flow > 8.90876e+07 )
									ret := -0.117647
							if( Raw_Money_Flow > 5.95728e+08 )
								if( ema13 <= 1.64367 )
									ret := 0.000000
								if( ema13 > 1.64367 )
									ret := 0.666667
				if( Typical_Price > 117.384 )
					if( Negative_Money_Flow_Sum <= 1.22157e+09 )
						if( ema3 <= 177.948 )
							if( ema3 <= 116.153 )
								if( Money_Flow_Ratio <= 8.90335 )
									ret := -0.166667
								if( Money_Flow_Ratio > 8.90335 )
									ret := -0.766667 // sell
							if( ema3 > 116.153 )
								if( Typical_Price <= 156.061 )
									ret := -0.039870
								if( Typical_Price > 156.061 )
									ret := -0.169625
						if( ema3 > 177.948 )
							if( MFI_Low <= 78.4675 )
								if( ema3 <= 184.761 )
									ret := -0.463415
								if( ema3 > 184.761 )
									ret := -0.735849 // sell
							if( MFI_Low > 78.4675 )
								ret := 0.071429
					if( Negative_Money_Flow_Sum > 1.22157e+09 )
						if( Positive_Money_Flow_Sum <= 5.77499e+09 )
							if( MFI_High <= 0.325669 )
								if( Negative_Money_Flow_Sum <= 1.32166e+09 )
									ret := 0.928571 // buy
								if( Negative_Money_Flow_Sum > 1.32166e+09 )
									ret := 0.562500
							if( MFI_High > 0.325669 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 5.77499e+09 )
							if( Typical_Price <= 178.879 )
								if( MFI_High <= 3.48429 )
									ret := 0.173333
								if( MFI_High > 3.48429 )
									ret := -0.525000
							if( Typical_Price > 178.879 )
								if( ema1 <= 194.702 )
									ret := 0.791667 // buy
								if( ema1 > 194.702 )
									ret := 0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AMD_30Min_0e1547c1(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)

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


