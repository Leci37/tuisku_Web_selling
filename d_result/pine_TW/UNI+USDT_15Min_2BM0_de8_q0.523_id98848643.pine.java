//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: UNIUSDT_15Min_2BM0_98848643 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_2BM0_98848643", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_98848643(bbp, bullPower, BBPower_Color, bearPower, bbm, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.04668 )
		if( bbm <= 0.262265 )
			if( Typical_Price <= 7.46235 )
				if( Negative_Money_Flow_Sum <= 1.42519e+06 )
					if( Raw_Money_Flow <= 320456 )
						if( bullPower <= -0.010777 )
							if( Raw_Money_Flow <= 296808 )
								if( Negative_Money_Flow <= 97293.7 )
									ret := 0.081074
								if( Negative_Money_Flow > 97293.7 )
									ret := -0.025238
							if( Raw_Money_Flow > 296808 )
								if( bbp <= -0.144945 )
									ret := -0.026316
								if( bbp > -0.144945 )
									ret := -0.582090
						if( bullPower > -0.010777 )
							if( Raw_Money_Flow <= 68627 )
								if( Negative_Money_Flow_Sum <= 939791 )
									ret := 0.092199
								if( Negative_Money_Flow_Sum > 939791 )
									ret := -0.271429
							if( Raw_Money_Flow > 68627 )
								if( Typical_Price <= 6.17107 )
									ret := 0.264947
								if( Typical_Price > 6.17107 )
									ret := 0.091241
					if( Raw_Money_Flow > 320456 )
						if( MFI_Low <= -7.78266 )
							if( Positive_Money_Flow_Sum <= 138101 )
								if( Typical_Price <= 4.58079 )
									ret := -0.800000 // sell
								if( Typical_Price > 4.58079 )
									ret := 0.066667
							if( Positive_Money_Flow_Sum > 138101 )
								if( Typical_Price <= 5.88776 )
									ret := -0.750000 // sell
								if( Typical_Price > 5.88776 )
									ret := -1.000000 // sell
						if( MFI_Low > -7.78266 )
							if( Money_Flow_Ratio <= 0.441067 )
								if( Money_Flow_Ratio <= 0.357668 )
									ret := 0.331395
								if( Money_Flow_Ratio > 0.357668 )
									ret := 0.733333 // buy
							if( Money_Flow_Ratio > 0.441067 )
								if( Negative_Money_Flow_Sum <= 1.38264e+06 )
									ret := 0.229091
								if( Negative_Money_Flow_Sum > 1.38264e+06 )
									ret := -0.687500
				if( Negative_Money_Flow_Sum > 1.42519e+06 )
					if( MFI_High <= -40.402 )
						if( Negative_Money_Flow <= 1.24388e+06 )
							if( Positive_Money_Flow <= 80565.3 )
								if( Positive_Money_Flow_Sum <= 1.67894e+06 )
									ret := 0.214045
								if( Positive_Money_Flow_Sum > 1.67894e+06 )
									ret := 0.401392
							if( Positive_Money_Flow > 80565.3 )
								if( Negative_Money_Flow_Sum <= 2.08583e+06 )
									ret := 0.323475
								if( Negative_Money_Flow_Sum > 2.08583e+06 )
									ret := 0.085608
						if( Negative_Money_Flow > 1.24388e+06 )
							if( Positive_Money_Flow_Sum <= 660404 )
								if( MFI_Low <= -2.77958 )
									ret := -0.357143
								if( MFI_Low > -2.77958 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 660404 )
								if( Positive_Money_Flow_Sum <= 4.4906e+06 )
									ret := 0.218391
								if( Positive_Money_Flow_Sum > 4.4906e+06 )
									ret := -0.888889 // sell
					if( MFI_High > -40.402 )
						if( Negative_Money_Flow_Sum <= 1.52605e+06 )
							if( Positive_Money_Flow <= 144565 )
								if( Raw_Money_Flow <= 496502 )
									ret := 0.141791
								if( Raw_Money_Flow > 496502 )
									ret := 0.928571 // buy
							if( Positive_Money_Flow > 144565 )
								if( Raw_Money_Flow <= 239504 )
									ret := 0.909091 // buy
								if( Raw_Money_Flow > 239504 )
									ret := 0.142857
						if( Negative_Money_Flow_Sum > 1.52605e+06 )
							if( Positive_Money_Flow_Sum <= 1.13411e+06 )
								if( MFI_High <= -39.8337 )
									ret := -0.947368 // sell
								if( MFI_High > -39.8337 )
									ret := -0.333333
							if( Positive_Money_Flow_Sum > 1.13411e+06 )
								if( Typical_Price <= 6.43217 )
									ret := -0.025490
								if( Typical_Price > 6.43217 )
									ret := 0.141399
			if( Typical_Price > 7.46235 )
				if( Raw_Money_Flow <= 1.36913e+06 )
					if( Negative_Money_Flow_Sum <= 1.38509e+07 )
						if( Negative_Money_Flow <= 330681 )
							if( Positive_Money_Flow <= 86666.9 )
								if( MFI_High <= -18.0682 )
									ret := -0.027575
								if( MFI_High > -18.0682 )
									ret := -0.474576
							if( Positive_Money_Flow > 86666.9 )
								if( Negative_Money_Flow_Sum <= 5.5678e+06 )
									ret := 0.193416
								if( Negative_Money_Flow_Sum > 5.5678e+06 )
									ret := -0.114901
						if( Negative_Money_Flow > 330681 )
							if( bbm <= 0.190654 )
								if( Negative_Money_Flow_Sum <= 1.86972e+06 )
									ret := 0.371134
								if( Negative_Money_Flow_Sum > 1.86972e+06 )
									ret := 0.102871
							if( bbm > 0.190654 )
								if( Money_Flow_Ratio <= 0.564964 )
									ret := 0.698413
								if( Money_Flow_Ratio > 0.564964 )
									ret := 0.131579
					if( Negative_Money_Flow_Sum > 1.38509e+07 )
						if( Negative_Money_Flow_Sum <= 2.45011e+07 )
							if( bearPower <= -0.155561 )
								if( Negative_Money_Flow <= 27205 )
									ret := 0.733333 // buy
								if( Negative_Money_Flow > 27205 )
									ret := 0.980392 // buy
							if( bearPower > -0.155561 )
								if( Negative_Money_Flow <= 1.06926e+06 )
									ret := 0.701754 // buy
								if( Negative_Money_Flow > 1.06926e+06 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 2.45011e+07 )
							if( bearPower <= -0.233069 )
								ret := 1.000000 // buy
							if( bearPower > -0.233069 )
								if( bullPower <= -0.023948 )
									ret := -0.285714
								if( bullPower > -0.023948 )
									ret := -0.937500 // sell
				if( Raw_Money_Flow > 1.36913e+06 )
					if( Money_Flow_Ratio <= 0.962784 )
						if( bbp <= -0.393981 )
							if( Negative_Money_Flow <= 3.08541e+06 )
								if( Negative_Money_Flow_Sum <= 1.97038e+07 )
									ret := -0.083333
								if( Negative_Money_Flow_Sum > 1.97038e+07 )
									ret := 0.645833
							if( Negative_Money_Flow > 3.08541e+06 )
								if( Typical_Price <= 10.7019 )
									ret := -0.954545 // sell
								if( Typical_Price > 10.7019 )
									ret := 0.000000
						if( bbp > -0.393981 )
							if( Negative_Money_Flow_Sum <= 8.60588e+06 )
								if( MFI <= 40.3011 )
									ret := -0.236842
								if( MFI > 40.3011 )
									ret := 0.600000
							if( Negative_Money_Flow_Sum > 8.60588e+06 )
								if( MFI <= 29.127 )
									ret := -0.310345
								if( MFI > 29.127 )
									ret := -0.782258 // sell
					if( Money_Flow_Ratio > 0.962784 )
						if( Positive_Money_Flow_Sum <= 1.7651e+07 )
							if( Negative_Money_Flow_Sum <= 6.85945e+06 )
								if( Money_Flow_Ratio <= 1.56699 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 1.56699 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 6.85945e+06 )
								if( Negative_Money_Flow_Sum <= 8.51667e+06 )
									ret := -0.875000 // sell
								if( Negative_Money_Flow_Sum > 8.51667e+06 )
									ret := 0.444444
						if( Positive_Money_Flow_Sum > 1.7651e+07 )
							ret := 1.000000 // buy
		if( bbm > 0.262265 )
			if( Raw_Money_Flow <= 5.2575e+06 )
				if( bbp <= -0.221458 )
					if( Negative_Money_Flow <= 9181.11 )
						if( Positive_Money_Flow <= 2.56586e+06 )
							if( bearPower <= -0.323769 )
								if( bearPower <= -0.474779 )
									ret := 1.000000 // buy
								if( bearPower > -0.474779 )
									ret := 0.642857
							if( bearPower > -0.323769 )
								ret := -0.142857
						if( Positive_Money_Flow > 2.56586e+06 )
							if( bearPower <= -0.473377 )
								ret := -0.857143 // sell
							if( bearPower > -0.473377 )
								ret := 0.200000
					if( Negative_Money_Flow > 9181.11 )
						if( MFI_High <= -70.2337 )
							if( Money_Flow_Ratio <= 0.09519 )
								ret := 0.571429
							if( Money_Flow_Ratio > 0.09519 )
								ret := -1.000000 // sell
						if( MFI_High > -70.2337 )
							if( Typical_Price <= 13.4829 )
								if( bullPower <= -0.089782 )
									ret := 0.935897 // buy
								if( bullPower > -0.089782 )
									ret := 0.818182 // buy
							if( Typical_Price > 13.4829 )
								if( bullPower <= -0.070142 )
									ret := 0.909091 // buy
								if( bullPower > -0.070142 )
									ret := -0.066667
				if( bbp > -0.221458 )
					if( Negative_Money_Flow <= 3.22915e+06 )
						if( Negative_Money_Flow_Sum <= 3.56095e+06 )
							if( bullPower <= 0.034489 )
								ret := -0.400000
							if( bullPower > 0.034489 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 3.56095e+06 )
							if( Raw_Money_Flow <= 2.27787e+06 )
								if( bbp <= -0.065261 )
									ret := 0.409091
								if( bbp > -0.065261 )
									ret := -0.800000 // sell
							if( Raw_Money_Flow > 2.27787e+06 )
								ret := -0.857143 // sell
					if( Negative_Money_Flow > 3.22915e+06 )
						ret := 1.000000 // buy
			if( Raw_Money_Flow > 5.2575e+06 )
				if( bbm <= 1.15808 )
					if( bbp <= -0.397133 )
						if( bullPower <= -0.340174 )
							ret := 0.428571
						if( bullPower > -0.340174 )
							if( Typical_Price <= 12.26 )
								if( Negative_Money_Flow <= 5.63338e+06 )
									ret := -0.428571
								if( Negative_Money_Flow > 5.63338e+06 )
									ret := -0.900000 // sell
							if( Typical_Price > 12.26 )
								ret := 0.000000
					if( bbp > -0.397133 )
						ret := 0.750000 // buy
				if( bbm > 1.15808 )
					ret := 0.800000 // buy
	if( bbp > -0.04668 )
		if( Typical_Price <= 7.06471 )
			if( bbm <= 0.021162 )
				if( Money_Flow_Ratio <= 18.229 )
					if( Raw_Money_Flow <= 19792.7 )
						if( Negative_Money_Flow_Sum <= 72205.4 )
							if( Negative_Money_Flow_Sum <= 69839.2 )
								if( Typical_Price <= 4.56417 )
									ret := 0.123853
								if( Typical_Price > 4.56417 )
									ret := -0.004255
							if( Negative_Money_Flow_Sum > 69839.2 )
								if( Positive_Money_Flow_Sum <= 99401 )
									ret := 0.066667
								if( Positive_Money_Flow_Sum > 99401 )
									ret := 0.517241
						if( Negative_Money_Flow_Sum > 72205.4 )
							if( Positive_Money_Flow_Sum <= 508411 )
								if( bbm <= 0.01601 )
									ret := -0.032040
								if( bbm > 0.01601 )
									ret := -0.146309
							if( Positive_Money_Flow_Sum > 508411 )
								if( Money_Flow_Ratio <= 2.1937 )
									ret := 0.133758
								if( Money_Flow_Ratio > 2.1937 )
									ret := -0.035176
					if( Raw_Money_Flow > 19792.7 )
						if( Negative_Money_Flow_Sum <= 139106 )
							if( Negative_Money_Flow <= 274.334 )
								if( bbp <= 0.032145 )
									ret := -0.037946
								if( bbp > 0.032145 )
									ret := 0.153179
							if( Negative_Money_Flow > 274.334 )
								if( Negative_Money_Flow <= 17186.2 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 17186.2 )
									ret := 0.175202
						if( Negative_Money_Flow_Sum > 139106 )
							if( Positive_Money_Flow_Sum <= 2.11915e+06 )
								if( Positive_Money_Flow_Sum <= 540954 )
									ret := 0.028447
								if( Positive_Money_Flow_Sum > 540954 )
									ret := -0.021665
							if( Positive_Money_Flow_Sum > 2.11915e+06 )
								if( Positive_Money_Flow_Sum <= 3.5929e+06 )
									ret := -0.294118
								if( Positive_Money_Flow_Sum > 3.5929e+06 )
									ret := 0.205882
				if( Money_Flow_Ratio > 18.229 )
					if( Negative_Money_Flow_Sum <= 15081.6 )
						ret := 0.200000
					if( Negative_Money_Flow_Sum > 15081.6 )
						if( Positive_Money_Flow <= 51670.9 )
							if( Typical_Price <= 5.40366 )
								ret := 0.200000
							if( Typical_Price > 5.40366 )
								if( Typical_Price <= 6.03049 )
									ret := 1.000000 // buy
								if( Typical_Price > 6.03049 )
									ret := 0.750000 // buy
						if( Positive_Money_Flow > 51670.9 )
							ret := 1.000000 // buy
			if( bbm > 0.021162 )
				if( Positive_Money_Flow_Sum <= 2.05899e+06 )
					if( Negative_Money_Flow <= 250964 )
						if( Typical_Price <= 6.16123 )
							if( Negative_Money_Flow_Sum <= 3.94291e+06 )
								if( bearPower <= 0.012736 )
									ret := 0.088491
								if( bearPower > 0.012736 )
									ret := 0.155535
							if( Negative_Money_Flow_Sum > 3.94291e+06 )
								if( MFI_Low <= 10.3657 )
									ret := 0.709677 // buy
								if( MFI_Low > 10.3657 )
									ret := -1.000000 // sell
						if( Typical_Price > 6.16123 )
							if( bbp <= 0.028081 )
								if( MFI_High <= -34.6519 )
									ret := 0.080849
								if( MFI_High > -34.6519 )
									ret := -0.042337
							if( bbp > 0.028081 )
								if( Raw_Money_Flow <= 92497.1 )
									ret := 0.169527
								if( Raw_Money_Flow > 92497.1 )
									ret := 0.034024
					if( Negative_Money_Flow > 250964 )
						if( bbm <= 0.100496 )
							if( Typical_Price <= 4.91902 )
								if( bbm <= 0.049257 )
									ret := 0.166667
								if( bbm > 0.049257 )
									ret := 0.760000 // buy
							if( Typical_Price > 4.91902 )
								if( Raw_Money_Flow <= 650550 )
									ret := 0.131653
								if( Raw_Money_Flow > 650550 )
									ret := 0.514286
						if( bbm > 0.100496 )
							if( bearPower <= -0.00735 )
								if( Typical_Price <= 4.56433 )
									ret := 0.000000
								if( Typical_Price > 4.56433 )
									ret := 0.755556 // buy
							if( bearPower > -0.00735 )
								ret := -0.500000
				if( Positive_Money_Flow_Sum > 2.05899e+06 )
					if( bbp <= 0.21309 )
						if( Negative_Money_Flow_Sum <= 477325 )
							if( Money_Flow_Ratio <= 10.4526 )
								if( Raw_Money_Flow <= 99195.8 )
									ret := -0.742268 // sell
								if( Raw_Money_Flow > 99195.8 )
									ret := -0.195572
							if( Money_Flow_Ratio > 10.4526 )
								if( Negative_Money_Flow_Sum <= 239916 )
									ret := 0.188034
								if( Negative_Money_Flow_Sum > 239916 )
									ret := -0.448980
						if( Negative_Money_Flow_Sum > 477325 )
							if( Positive_Money_Flow_Sum <= 1.12255e+07 )
								if( bbp <= -0.000168 )
									ret := 0.080495
								if( bbp > -0.000168 )
									ret := -0.044032
							if( Positive_Money_Flow_Sum > 1.12255e+07 )
								if( Negative_Money_Flow <= 603771 )
									ret := 0.864865 // buy
								if( Negative_Money_Flow > 603771 )
									ret := -0.307692
					if( bbp > 0.21309 )
						if( Positive_Money_Flow_Sum <= 3.22649e+06 )
							if( Positive_Money_Flow_Sum <= 2.98672e+06 )
								if( Raw_Money_Flow <= 868986 )
									ret := 0.113095
								if( Raw_Money_Flow > 868986 )
									ret := -0.555556
							if( Positive_Money_Flow_Sum > 2.98672e+06 )
								if( MFI_High <= -4.4387 )
									ret := -1.000000 // sell
								if( MFI_High > -4.4387 )
									ret := -0.285714
						if( Positive_Money_Flow_Sum > 3.22649e+06 )
							if( Positive_Money_Flow_Sum <= 5.09707e+06 )
								if( bullPower <= 0.196353 )
									ret := 0.601626
								if( bullPower > 0.196353 )
									ret := 0.186047
							if( Positive_Money_Flow_Sum > 5.09707e+06 )
								if( Typical_Price <= 5.16919 )
									ret := 0.559524
								if( Typical_Price > 5.16919 )
									ret := -0.107595
		if( Typical_Price > 7.06471 )
			if( Positive_Money_Flow <= 3.40214e+06 )
				if( Positive_Money_Flow_Sum <= 2.58889e+07 )
					if( Positive_Money_Flow_Sum <= 1.49264e+07 )
						if( Positive_Money_Flow <= 1.57455e+06 )
							if( MFI <= 37.4879 )
								if( bbm <= 0.032854 )
									ret := 0.131406
								if( bbm > 0.032854 )
									ret := 0.004844
							if( MFI > 37.4879 )
								if( MFI_Low <= 44.3175 )
									ret := -0.058010
								if( MFI_Low > 44.3175 )
									ret := 0.000000
						if( Positive_Money_Flow > 1.57455e+06 )
							if( Negative_Money_Flow_Sum <= 1.63032e+06 )
								if( Typical_Price <= 9.68304 )
									ret := 0.697987
								if( Typical_Price > 9.68304 )
									ret := 0.095238
							if( Negative_Money_Flow_Sum > 1.63032e+06 )
								if( Positive_Money_Flow_Sum <= 1.02161e+07 )
									ret := -0.280303
								if( Positive_Money_Flow_Sum > 1.02161e+07 )
									ret := 0.268657
					if( Positive_Money_Flow_Sum > 1.49264e+07 )
						if( MFI <= 86.9918 )
							if( MFI_Low <= 28.9007 )
								if( MFI <= 46.4699 )
									ret := -1.000000 // sell
								if( MFI > 46.4699 )
									ret := -0.750000 // sell
							if( MFI_Low > 28.9007 )
								if( Negative_Money_Flow_Sum <= 1.51712e+07 )
									ret := -0.165775
								if( Negative_Money_Flow_Sum > 1.51712e+07 )
									ret := 0.781250 // buy
						if( MFI > 86.9918 )
							if( bbm <= 0.092951 )
								ret := 0.000000
							if( bbm > 0.092951 )
								if( Negative_Money_Flow_Sum <= 1.4642e+06 )
									ret := -0.555556
								if( Negative_Money_Flow_Sum > 1.4642e+06 )
									ret := -0.975000 // sell
				if( Positive_Money_Flow_Sum > 2.58889e+07 )
					if( Typical_Price <= 12.6741 )
						if( Positive_Money_Flow_Sum <= 3.221e+07 )
							if( Raw_Money_Flow <= 1.47685e+06 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 1.47685e+06 )
								if( bbm <= 0.215246 )
									ret := 1.000000 // buy
								if( bbm > 0.215246 )
									ret := 0.777778 // buy
						if( Positive_Money_Flow_Sum > 3.221e+07 )
							if( Typical_Price <= 11.7824 )
								if( Raw_Money_Flow <= 1.65871e+06 )
									ret := 0.363636
								if( Raw_Money_Flow > 1.65871e+06 )
									ret := -0.804348 // sell
							if( Typical_Price > 11.7824 )
								if( Typical_Price <= 12.422 )
									ret := 0.733333 // buy
								if( Typical_Price > 12.422 )
									ret := -0.777778 // sell
					if( Typical_Price > 12.6741 )
						if( Typical_Price <= 15.846 )
							if( MFI_High <= -39.7023 )
								ret := 0.000000
							if( MFI_High > -39.7023 )
								if( bullPower <= 0.610882 )
									ret := 0.939394 // buy
								if( bullPower > 0.610882 )
									ret := 0.250000
						if( Typical_Price > 15.846 )
							ret := -0.833333 // sell
			if( Positive_Money_Flow > 3.40214e+06 )
				if( Money_Flow_Ratio <= 6.51457 )
					if( BBPower_Color <= 0.5 )
						if( Typical_Price <= 11.3793 )
							ret := 0.750000 // buy
						if( Typical_Price > 11.3793 )
							ret := 1.000000 // buy
					if( BBPower_Color > 0.5 )
						if( bearPower <= -0.044412 )
							if( bbp <= 0.122835 )
								ret := -1.000000 // sell
							if( bbp > 0.122835 )
								if( Typical_Price <= 12.1988 )
									ret := 1.000000 // buy
								if( Typical_Price > 12.1988 )
									ret := -0.666667
						if( bearPower > -0.044412 )
							if( Positive_Money_Flow_Sum <= 7.38e+06 )
								ret := 0.250000
							if( Positive_Money_Flow_Sum > 7.38e+06 )
								if( Raw_Money_Flow <= 3.92186e+06 )
									ret := -0.565217
								if( Raw_Money_Flow > 3.92186e+06 )
									ret := -0.870130 // sell
				if( Money_Flow_Ratio > 6.51457 )
					if( Typical_Price <= 12.2638 )
						if( Positive_Money_Flow <= 4.37406e+06 )
							if( bearPower <= 0.153104 )
								ret := -0.166667
							if( bearPower > 0.153104 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow > 4.37406e+06 )
							if( Typical_Price <= 11.2797 )
								ret := 1.000000 // buy
							if( Typical_Price > 11.2797 )
								if( bbm <= 0.608084 )
									ret := 0.000000
								if( bbm > 0.608084 )
									ret := -1.000000 // sell
					if( Typical_Price > 12.2638 )
						if( bearPower <= 0.193726 )
							ret := 1.000000 // buy
						if( bearPower > 0.193726 )
							ret := 0.750000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_UNIUSDT_15Min_98848643(bbp, bullPower, BBPower_Color, bearPower, bbm, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


