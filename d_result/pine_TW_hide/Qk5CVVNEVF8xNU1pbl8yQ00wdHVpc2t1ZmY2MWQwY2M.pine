//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: BNBUSDT_15Min_2CM0_ff61d0cc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_15Min_2CM0_ff61d0cc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_15Min_ff61d0cc(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad <= -0.390221 )
		if( Money_Flow_Ratio <= 0.433859 )
			if( Negative_Money_Flow_Sum <= 2.22278e+07 )
				if( mf <= -0.151497 )
					if( ad <= -5244.9 )
						if( Negative_Money_Flow <= 8.68898e+06 )
							if( Positive_Money_Flow_Sum <= 1.7375e+06 )
								if( ad <= -8925.41 )
									ret := -0.875000 // sell
								if( ad > -8925.41 )
									ret := -0.333333
							if( Positive_Money_Flow_Sum > 1.7375e+06 )
								if( Typical_Price <= 411.525 )
									ret := 0.357414
								if( Typical_Price > 411.525 )
									ret := -0.173913
						if( Negative_Money_Flow > 8.68898e+06 )
							if( Negative_Money_Flow_Sum <= 1.96311e+07 )
								if( mf <= -0.19349 )
									ret := -0.920000 // sell
								if( mf > -0.19349 )
									ret := -0.250000
							if( Negative_Money_Flow_Sum > 1.96311e+07 )
								if( Money_Flow_Ratio <= 0.270842 )
									ret := 0.888889 // buy
								if( Money_Flow_Ratio > 0.270842 )
									ret := -0.500000
					if( ad > -5244.9 )
						if( ad_mf <= -249.969 )
							if( Positive_Money_Flow_Sum <= 7.36388e+06 )
								if( Negative_Money_Flow_Sum <= 1.9877e+07 )
									ret := -0.076923
								if( Negative_Money_Flow_Sum > 1.9877e+07 )
									ret := -0.315789
							if( Positive_Money_Flow_Sum > 7.36388e+06 )
								if( MFI_High <= -52.8319 )
									ret := -0.500000
								if( MFI_High > -52.8319 )
									ret := 0.575758
						if( ad_mf > -249.969 )
							if( Negative_Money_Flow_Sum <= 1.83354e+07 )
								if( Raw_Money_Flow <= 779925 )
									ret := 0.280000
								if( Raw_Money_Flow > 779925 )
									ret := 0.842105 // buy
							if( Negative_Money_Flow_Sum > 1.83354e+07 )
								if( ad <= -117.101 )
									ret := -0.250000
								if( ad > -117.101 )
									ret := -0.666667
				if( mf > -0.151497 )
					if( Raw_Money_Flow <= 370637 )
						if( Negative_Money_Flow_Sum <= 7.23518e+06 )
							if( Negative_Money_Flow_Sum <= 5.29503e+06 )
								if( Negative_Money_Flow_Sum <= 2.75314e+06 )
									ret := -0.340000
								if( Negative_Money_Flow_Sum > 2.75314e+06 )
									ret := 0.046154
							if( Negative_Money_Flow_Sum > 5.29503e+06 )
								if( mf <= 0.229871 )
									ret := -0.328947
								if( mf > 0.229871 )
									ret := -0.857143 // sell
						if( Negative_Money_Flow_Sum > 7.23518e+06 )
							if( Raw_Money_Flow <= 332679 )
								if( Positive_Money_Flow_Sum <= 3.60021e+06 )
									ret := 0.105263
								if( Positive_Money_Flow_Sum > 3.60021e+06 )
									ret := 0.583333
							if( Raw_Money_Flow > 332679 )
								if( ad_mf <= -1072.16 )
									ret := -0.500000
								if( ad_mf > -1072.16 )
									ret := -0.055556
					if( Raw_Money_Flow > 370637 )
						if( Typical_Price <= 574.733 )
							if( Positive_Money_Flow_Sum <= 8.5749e+06 )
								if( Negative_Money_Flow_Sum <= 2.1034e+07 )
									ret := 0.189331
								if( Negative_Money_Flow_Sum > 2.1034e+07 )
									ret := -0.194690
							if( Positive_Money_Flow_Sum > 8.5749e+06 )
								if( Typical_Price <= 276.1 )
									ret := 0.125000
								if( Typical_Price > 276.1 )
									ret := 0.884615 // buy
						if( Typical_Price > 574.733 )
							if( Positive_Money_Flow_Sum <= 5.30399e+06 )
								if( Negative_Money_Flow_Sum <= 1.92921e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 1.92921e+07 )
									ret := 0.777778 // buy
							if( Positive_Money_Flow_Sum > 5.30399e+06 )
								if( Positive_Money_Flow_Sum <= 5.8272e+06 )
									ret := -0.769231 // sell
								if( Positive_Money_Flow_Sum > 5.8272e+06 )
									ret := -0.133333
			if( Negative_Money_Flow_Sum > 2.22278e+07 )
				if( Negative_Money_Flow <= 2.42537e+07 )
					if( Negative_Money_Flow_Sum <= 2.39998e+07 )
						if( MFI_High <= -58.836 )
							if( Positive_Money_Flow_Sum <= 2.68829e+06 )
								if( Negative_Money_Flow <= 2.58086e+06 )
									ret := 0.714286 // buy
								if( Negative_Money_Flow > 2.58086e+06 )
									ret := -0.692308
							if( Positive_Money_Flow_Sum > 2.68829e+06 )
								if( Raw_Money_Flow <= 3.79366e+06 )
									ret := 0.724138 // buy
								if( Raw_Money_Flow > 3.79366e+06 )
									ret := 0.085714
						if( MFI_High > -58.836 )
							if( Negative_Money_Flow_Sum <= 2.24664e+07 )
								if( Raw_Money_Flow <= 1.32531e+06 )
									ret := 0.000000
								if( Raw_Money_Flow > 1.32531e+06 )
									ret := 0.833333 // buy
							if( Negative_Money_Flow_Sum > 2.24664e+07 )
								if( Negative_Money_Flow_Sum <= 2.33957e+07 )
									ret := -0.086957
								if( Negative_Money_Flow_Sum > 2.33957e+07 )
									ret := 0.363636
					if( Negative_Money_Flow_Sum > 2.39998e+07 )
						if( Negative_Money_Flow_Sum <= 5.61878e+07 )
							if( Negative_Money_Flow_Sum <= 4.53219e+07 )
								if( Typical_Price <= 202.446 )
									ret := -1.000000 // sell
								if( Typical_Price > 202.446 )
									ret := 0.221878
							if( Negative_Money_Flow_Sum > 4.53219e+07 )
								if( Positive_Money_Flow_Sum <= 3.16595e+06 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 3.16595e+06 )
									ret := -0.205479
						if( Negative_Money_Flow_Sum > 5.61878e+07 )
							if( Positive_Money_Flow_Sum <= 1.03487e+07 )
								if( ad <= -24790.8 )
									ret := -0.272727
								if( ad > -24790.8 )
									ret := 0.718447 // buy
							if( Positive_Money_Flow_Sum > 1.03487e+07 )
								if( Positive_Money_Flow_Sum <= 1.39209e+07 )
									ret := -0.210526
								if( Positive_Money_Flow_Sum > 1.39209e+07 )
									ret := 0.320557
				if( Negative_Money_Flow > 2.42537e+07 )
					if( Raw_Money_Flow <= 2.69435e+07 )
						ret := 1.000000 // buy
					if( Raw_Money_Flow > 2.69435e+07 )
						if( Positive_Money_Flow_Sum <= 3.65976e+07 )
							if( Typical_Price <= 363.38 )
								if( Negative_Money_Flow_Sum <= 4.52191e+07 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 4.52191e+07 )
									ret := 1.000000 // buy
							if( Typical_Price > 363.38 )
								if( MFI_Low <= -11.222 )
									ret := 0.857143 // buy
								if( MFI_Low > -11.222 )
									ret := -0.047619
						if( Positive_Money_Flow_Sum > 3.65976e+07 )
							ret := 1.000000 // buy
		if( Money_Flow_Ratio > 0.433859 )
			if( ad_mf <= -17715.1 )
				if( Money_Flow_Ratio <= 1.78875 )
					if( Negative_Money_Flow_Sum <= 3.57979e+07 )
						if( Negative_Money_Flow <= 7.53236e+06 )
							if( mf <= -0.121951 )
								if( MFI_Low <= 20.5832 )
									ret := 0.333333
								if( MFI_Low > 20.5832 )
									ret := -0.888889 // sell
							if( mf > -0.121951 )
								if( Negative_Money_Flow_Sum <= 2.52576e+07 )
									ret := 0.285714
								if( Negative_Money_Flow_Sum > 2.52576e+07 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow > 7.53236e+06 )
							if( Typical_Price <= 298.182 )
								if( Negative_Money_Flow_Sum <= 3.37515e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 3.37515e+07 )
									ret := 0.750000 // buy
							if( Typical_Price > 298.182 )
								if( Typical_Price <= 309.624 )
									ret := 0.272727
								if( Typical_Price > 309.624 )
									ret := 0.888889 // buy
					if( Negative_Money_Flow_Sum > 3.57979e+07 )
						if( Positive_Money_Flow_Sum <= 3.11709e+07 )
							if( MFI <= 39.5934 )
								if( ad_mf <= -20775.7 )
									ret := 0.000000
								if( ad_mf > -20775.7 )
									ret := -0.875000 // sell
							if( MFI > 39.5934 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 3.11709e+07 )
							if( Negative_Money_Flow_Sum <= 4.03295e+07 )
								if( Money_Flow_Ratio <= 1.20932 )
									ret := 0.250000
								if( Money_Flow_Ratio > 1.20932 )
									ret := -0.888889 // sell
							if( Negative_Money_Flow_Sum > 4.03295e+07 )
								if( Raw_Money_Flow <= 1.24496e+07 )
									ret := 0.549618
								if( Raw_Money_Flow > 1.24496e+07 )
									ret := 0.264901
				if( Money_Flow_Ratio > 1.78875 )
					if( Positive_Money_Flow_Sum <= 1.61016e+08 )
						if( Positive_Money_Flow_Sum <= 3.89493e+07 )
							if( Positive_Money_Flow_Sum <= 2.62995e+07 )
								if( Positive_Money_Flow <= 7.0299e+06 )
									ret := -0.571429
								if( Positive_Money_Flow > 7.0299e+06 )
									ret := 0.500000
							if( Positive_Money_Flow_Sum > 2.62995e+07 )
								if( Negative_Money_Flow_Sum <= 6.42034e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 6.42034e+06 )
									ret := -0.600000
						if( Positive_Money_Flow_Sum > 3.89493e+07 )
							if( Typical_Price <= 311.617 )
								if( MFI <= 80.9038 )
									ret := 0.705882 // buy
								if( MFI > 80.9038 )
									ret := 0.000000
							if( Typical_Price > 311.617 )
								if( MFI_High <= -7.77411 )
									ret := -0.351351
								if( MFI_High > -7.77411 )
									ret := 0.278689
					if( Positive_Money_Flow_Sum > 1.61016e+08 )
						if( Typical_Price <= 530.815 )
							if( MFI <= 67.1433 )
								ret := 0.000000
							if( MFI > 67.1433 )
								ret := -1.000000 // sell
						if( Typical_Price > 530.815 )
							if( Positive_Money_Flow <= 377215 )
								ret := -0.250000
							if( Positive_Money_Flow > 377215 )
								ret := 1.000000 // buy
			if( ad_mf > -17715.1 )
				if( Negative_Money_Flow_Sum <= 6.47645e+07 )
					if( Typical_Price <= 579.817 )
						if( Typical_Price <= 359.651 )
							if( Negative_Money_Flow_Sum <= 1.46714e+07 )
								if( Raw_Money_Flow <= 449397 )
									ret := 0.029412
								if( Raw_Money_Flow > 449397 )
									ret := 0.091430
							if( Negative_Money_Flow_Sum > 1.46714e+07 )
								if( Positive_Money_Flow_Sum <= 1.31733e+07 )
									ret := 0.079017
								if( Positive_Money_Flow_Sum > 1.31733e+07 )
									ret := -0.067684
						if( Typical_Price > 359.651 )
							if( Negative_Money_Flow_Sum <= 1.6957e+07 )
								if( Positive_Money_Flow_Sum <= 9.60504e+06 )
									ret := 0.027356
								if( Positive_Money_Flow_Sum > 9.60504e+06 )
									ret := 0.150489
							if( Negative_Money_Flow_Sum > 1.6957e+07 )
								if( MFI <= 31.4796 )
									ret := -0.160494
								if( MFI > 31.4796 )
									ret := 0.207704
					if( Typical_Price > 579.817 )
						if( Raw_Money_Flow <= 1.92851e+07 )
							if( Positive_Money_Flow_Sum <= 9.89015e+07 )
								if( Positive_Money_Flow_Sum <= 5.95652e+07 )
									ret := 0.008000
								if( Positive_Money_Flow_Sum > 5.95652e+07 )
									ret := -0.339286
							if( Positive_Money_Flow_Sum > 9.89015e+07 )
								if( mf <= 0.194134 )
									ret := 0.743590 // buy
								if( mf > 0.194134 )
									ret := -0.363636
						if( Raw_Money_Flow > 1.92851e+07 )
							if( MFI_Low <= 65.1402 )
								ret := -1.000000 // sell
							if( MFI_Low > 65.1402 )
								ret := -0.750000 // sell
				if( Negative_Money_Flow_Sum > 6.47645e+07 )
					if( mf <= 0.101321 )
						if( mf <= -0.110686 )
							if( mf <= -0.213127 )
								if( Raw_Money_Flow <= 1.30859e+07 )
									ret := 0.619048
								if( Raw_Money_Flow > 1.30859e+07 )
									ret := -1.000000 // sell
							if( mf > -0.213127 )
								if( Negative_Money_Flow_Sum <= 1.67916e+08 )
									ret := -0.654321
								if( Negative_Money_Flow_Sum > 1.67916e+08 )
									ret := 0.500000
						if( mf > -0.110686 )
							if( Positive_Money_Flow_Sum <= 6.85882e+07 )
								if( MFI_High <= -41.1565 )
									ret := -0.382812
								if( MFI_High > -41.1565 )
									ret := 0.194030
							if( Positive_Money_Flow_Sum > 6.85882e+07 )
								if( Money_Flow_Ratio <= 1.50751 )
									ret := 0.306202
								if( Money_Flow_Ratio > 1.50751 )
									ret := -0.486486
					if( mf > 0.101321 )
						if( Negative_Money_Flow <= 5.55033e+06 )
							if( Negative_Money_Flow <= 28469.7 )
								if( Raw_Money_Flow <= 9.08088e+06 )
									ret := 0.454545
								if( Raw_Money_Flow > 9.08088e+06 )
									ret := -0.777778 // sell
							if( Negative_Money_Flow > 28469.7 )
								if( Positive_Money_Flow_Sum <= 3.97377e+07 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 3.97377e+07 )
									ret := -0.924528 // sell
						if( Negative_Money_Flow > 5.55033e+06 )
							if( Typical_Price <= 536.85 )
								if( Typical_Price <= 448.254 )
									ret := -0.045455
								if( Typical_Price > 448.254 )
									ret := 0.687500
							if( Typical_Price > 536.85 )
								if( MFI_Low <= 50.1941 )
									ret := -0.675676
								if( MFI_Low > 50.1941 )
									ret := 0.300000
	if( ad > -0.390221 )
		if( Money_Flow_Ratio <= 0.584591 )
			if( Negative_Money_Flow_Sum <= 2.14874e+07 )
				if( Positive_Money_Flow_Sum <= 8.38233e+06 )
					if( Raw_Money_Flow <= 3.11062e+06 )
						if( Typical_Price <= 572.828 )
							if( Typical_Price <= 251.227 )
								if( Money_Flow_Ratio <= 0.169438 )
									ret := -0.287879
								if( Money_Flow_Ratio > 0.169438 )
									ret := -0.028015
							if( Typical_Price > 251.227 )
								if( Positive_Money_Flow_Sum <= 7.91419e+06 )
									ret := 0.065914
								if( Positive_Money_Flow_Sum > 7.91419e+06 )
									ret := -0.220690
						if( Typical_Price > 572.828 )
							if( Negative_Money_Flow <= 1.86745e+06 )
								if( Typical_Price <= 603.683 )
									ret := -0.055028
								if( Typical_Price > 603.683 )
									ret := -0.338462
							if( Negative_Money_Flow > 1.86745e+06 )
								if( Negative_Money_Flow <= 2.28574e+06 )
									ret := -0.727273 // sell
								if( Negative_Money_Flow > 2.28574e+06 )
									ret := -0.296296
					if( Raw_Money_Flow > 3.11062e+06 )
						if( Positive_Money_Flow_Sum <= 5.55638e+06 )
							if( mf <= -0.139811 )
								if( ad <= 5171.09 )
									ret := -0.650000
								if( ad > 5171.09 )
									ret := 0.000000
							if( mf > -0.139811 )
								if( Negative_Money_Flow_Sum <= 1.40814e+07 )
									ret := -0.092593
								if( Negative_Money_Flow_Sum > 1.40814e+07 )
									ret := 0.342466
						if( Positive_Money_Flow_Sum > 5.55638e+06 )
							if( ad_mf <= 11198.6 )
								if( MFI_Low <= 13.9504 )
									ret := 0.709302 // buy
								if( MFI_Low > 13.9504 )
									ret := -0.142857
							if( ad_mf > 11198.6 )
								if( mf <= 0.114544 )
									ret := 0.000000
								if( mf > 0.114544 )
									ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 8.38233e+06 )
					if( Negative_Money_Flow_Sum <= 1.95112e+07 )
						if( ad_mf <= 8015.97 )
							if( Positive_Money_Flow_Sum <= 1.01011e+07 )
								if( mf <= -0.101202 )
									ret := 0.018182
								if( mf > -0.101202 )
									ret := 0.533333
							if( Positive_Money_Flow_Sum > 1.01011e+07 )
								if( Positive_Money_Flow_Sum <= 1.0872e+07 )
									ret := -0.375000
								if( Positive_Money_Flow_Sum > 1.0872e+07 )
									ret := 0.636364
						if( ad_mf > 8015.97 )
							if( Money_Flow_Ratio <= 0.553904 )
								ret := 0.166667
							if( Money_Flow_Ratio > 0.553904 )
								if( Typical_Price <= 285.345 )
									ret := -0.750000 // sell
								if( Typical_Price > 285.345 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 1.95112e+07 )
						if( Positive_Money_Flow <= 1.48377e+06 )
							if( MFI_Low <= 10.2032 )
								if( Positive_Money_Flow_Sum <= 8.72716e+06 )
									ret := 0.166667
								if( Positive_Money_Flow_Sum > 8.72716e+06 )
									ret := -0.846154 // sell
							if( MFI_Low > 10.2032 )
								if( Negative_Money_Flow <= 232558 )
									ret := 0.459459
								if( Negative_Money_Flow > 232558 )
									ret := 0.000000
						if( Positive_Money_Flow > 1.48377e+06 )
							if( Positive_Money_Flow_Sum <= 8.82225e+06 )
								if( Typical_Price <= 314.723 )
									ret := 0.000000
								if( Typical_Price > 314.723 )
									ret := 0.888889 // buy
							if( Positive_Money_Flow_Sum > 8.82225e+06 )
								if( Positive_Money_Flow_Sum <= 9.17168e+06 )
									ret := -0.916667 // sell
								if( Positive_Money_Flow_Sum > 9.17168e+06 )
									ret := -0.354839
			if( Negative_Money_Flow_Sum > 2.14874e+07 )
				if( Typical_Price <= 310.212 )
					if( ad_mf <= 18809.9 )
						if( mf <= -0.254156 )
							if( Typical_Price <= 307.767 )
								if( Positive_Money_Flow_Sum <= 3.18753e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 3.18753e+06 )
									ret := 0.538462
							if( Typical_Price > 307.767 )
								ret := -0.800000 // sell
						if( mf > -0.254156 )
							if( Negative_Money_Flow <= 4.00488e+06 )
								if( Negative_Money_Flow_Sum <= 6.66355e+07 )
									ret := 0.221599
								if( Negative_Money_Flow_Sum > 6.66355e+07 )
									ret := -0.224719
							if( Negative_Money_Flow > 4.00488e+06 )
								if( Negative_Money_Flow_Sum <= 4.30407e+07 )
									ret := -0.353535
								if( Negative_Money_Flow_Sum > 4.30407e+07 )
									ret := 0.414286
					if( ad_mf > 18809.9 )
						if( Negative_Money_Flow <= 2.06069e+07 )
							if( MFI_High <= -49.7775 )
								if( Money_Flow_Ratio <= 0.380179 )
									ret := 0.622951
								if( Money_Flow_Ratio > 0.380179 )
									ret := -0.357143
							if( MFI_High > -49.7775 )
								if( Positive_Money_Flow <= 7.33384e+06 )
									ret := 0.500000
								if( Positive_Money_Flow > 7.33384e+06 )
									ret := 0.970588 // buy
						if( Negative_Money_Flow > 2.06069e+07 )
							ret := -1.000000 // sell
				if( Typical_Price > 310.212 )
					if( MFI <= 14.8427 )
						if( Typical_Price <= 558.836 )
							if( MFI_Low <= -9.94851 )
								if( ad_mf <= 0.289064 )
									ret := 0.000000
								if( ad_mf > 0.289064 )
									ret := 0.704762 // buy
							if( MFI_Low > -9.94851 )
								if( Typical_Price <= 456.648 )
									ret := 0.157895
								if( Typical_Price > 456.648 )
									ret := 0.621622
						if( Typical_Price > 558.836 )
							if( Typical_Price <= 610.774 )
								if( Negative_Money_Flow <= 1.94068e+07 )
									ret := -0.092308
								if( Negative_Money_Flow > 1.94068e+07 )
									ret := 0.800000 // buy
							if( Typical_Price > 610.774 )
								if( MFI_High <= -70.8713 )
									ret := -1.000000 // sell
								if( MFI_High > -70.8713 )
									ret := -0.500000
					if( MFI > 14.8427 )
						if( Typical_Price <= 629.621 )
							if( mf <= 0.169236 )
								if( Positive_Money_Flow <= 1.77133e+07 )
									ret := 0.024641
								if( Positive_Money_Flow > 1.77133e+07 )
									ret := -0.465116
							if( mf > 0.169236 )
								if( Positive_Money_Flow <= 2.78992e+06 )
									ret := -0.571429
								if( Positive_Money_Flow > 2.78992e+06 )
									ret := 0.066667
						if( Typical_Price > 629.621 )
							if( ad <= 2696.73 )
								if( mf <= -0.233988 )
									ret := -0.142857
								if( mf > -0.233988 )
									ret := 0.464286
							if( ad > 2696.73 )
								if( Typical_Price <= 701.583 )
									ret := 0.863636 // buy
								if( Typical_Price > 701.583 )
									ret := 0.333333
		if( Money_Flow_Ratio > 0.584591 )
			if( Positive_Money_Flow <= 2.11528e+07 )
				if( MFI_High <= -18.9197 )
					if( Positive_Money_Flow_Sum <= 9.73167e+07 )
						if( Negative_Money_Flow_Sum <= 4.28021e+07 )
							if( MFI <= 38.1301 )
								if( Positive_Money_Flow_Sum <= 9.5014e+06 )
									ret := -0.186903
								if( Positive_Money_Flow_Sum > 9.5014e+06 )
									ret := 0.087227
							if( MFI > 38.1301 )
								if( Positive_Money_Flow <= 2.1082e+06 )
									ret := 0.024427
								if( Positive_Money_Flow > 2.1082e+06 )
									ret := -0.043796
						if( Negative_Money_Flow_Sum > 4.28021e+07 )
							if( Raw_Money_Flow <= 8.14949e+06 )
								if( ad <= 860.178 )
									ret := -0.307692
								if( ad > 860.178 )
									ret := 0.248260
							if( Raw_Money_Flow > 8.14949e+06 )
								if( Typical_Price <= 327.274 )
									ret := -0.625000
								if( Typical_Price > 327.274 )
									ret := -0.022801
					if( Positive_Money_Flow_Sum > 9.73167e+07 )
						if( Positive_Money_Flow_Sum <= 1.12818e+08 )
							if( Typical_Price <= 314.394 )
								ret := -0.142857
							if( Typical_Price > 314.394 )
								if( mf <= 0.101121 )
									ret := 0.935484 // buy
								if( mf > 0.101121 )
									ret := 0.214286
						if( Positive_Money_Flow_Sum > 1.12818e+08 )
							if( Negative_Money_Flow_Sum <= 1.20177e+08 )
								if( Negative_Money_Flow_Sum <= 8.84384e+07 )
									ret := 0.222222
								if( Negative_Money_Flow_Sum > 8.84384e+07 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 1.20177e+08 )
								if( Negative_Money_Flow_Sum <= 1.59332e+08 )
									ret := 0.735849 // buy
								if( Negative_Money_Flow_Sum > 1.59332e+08 )
									ret := -0.481481
				if( MFI_High > -18.9197 )
					if( Negative_Money_Flow_Sum <= 5.5181e+07 )
						if( Raw_Money_Flow <= 1.07014e+07 )
							if( Negative_Money_Flow_Sum <= 9.89898e+06 )
								if( Negative_Money_Flow_Sum <= 1.88e+06 )
									ret := 0.068115
								if( Negative_Money_Flow_Sum > 1.88e+06 )
									ret := -0.016729
							if( Negative_Money_Flow_Sum > 9.89898e+06 )
								if( Money_Flow_Ratio <= 2.53597 )
									ret := -0.156263
								if( Money_Flow_Ratio > 2.53597 )
									ret := 0.014400
						if( Raw_Money_Flow > 1.07014e+07 )
							if( Positive_Money_Flow_Sum <= 6.21522e+07 )
								if( Positive_Money_Flow <= 1.59282e+07 )
									ret := 0.470588
								if( Positive_Money_Flow > 1.59282e+07 )
									ret := -0.016129
							if( Positive_Money_Flow_Sum > 6.21522e+07 )
								if( Typical_Price <= 280.813 )
									ret := -0.823529 // sell
								if( Typical_Price > 280.813 )
									ret := 0.072797
					if( Negative_Money_Flow_Sum > 5.5181e+07 )
						if( ad_mf <= 23786.5 )
							if( Positive_Money_Flow <= 5.88524e+06 )
								if( Positive_Money_Flow_Sum <= 1.91299e+08 )
									ret := -0.880952 // sell
								if( Positive_Money_Flow_Sum > 1.91299e+08 )
									ret := -0.500000
							if( Positive_Money_Flow > 5.88524e+06 )
								if( Typical_Price <= 329.564 )
									ret := 0.714286 // buy
								if( Typical_Price > 329.564 )
									ret := -0.756098 // sell
						if( ad_mf > 23786.5 )
							if( Positive_Money_Flow <= 1.80781e+07 )
								ret := -0.333333
							if( Positive_Money_Flow > 1.80781e+07 )
								if( Typical_Price <= 593.946 )
									ret := 1.000000 // buy
								if( Typical_Price > 593.946 )
									ret := 0.500000
			if( Positive_Money_Flow > 2.11528e+07 )
				if( Money_Flow_Ratio <= 21.0455 )
					if( mf <= 0.339437 )
						if( MFI_Low <= 40.5544 )
							if( Negative_Money_Flow_Sum <= 1.93638e+08 )
								if( Typical_Price <= 572.998 )
									ret := 0.973684 // buy
								if( Typical_Price > 572.998 )
									ret := 0.625000
							if( Negative_Money_Flow_Sum > 1.93638e+08 )
								ret := 0.000000
						if( MFI_Low > 40.5544 )
							if( mf <= 0.245351 )
								if( Negative_Money_Flow_Sum <= 3.72142e+07 )
									ret := -0.090909
								if( Negative_Money_Flow_Sum > 3.72142e+07 )
									ret := -0.789474 // sell
							if( mf > 0.245351 )
								if( Positive_Money_Flow_Sum <= 1.8313e+08 )
									ret := 0.687500
								if( Positive_Money_Flow_Sum > 1.8313e+08 )
									ret := -0.714286 // sell
					if( mf > 0.339437 )
						if( ad_mf <= 47540.9 )
							if( ad <= 15742 )
								ret := 0.750000 // buy
							if( ad > 15742 )
								ret := 1.000000 // buy
						if( ad_mf > 47540.9 )
							if( Positive_Money_Flow_Sum <= 8.2398e+07 )
								if( MFI_High <= 3.25444 )
									ret := 0.750000 // buy
								if( MFI_High > 3.25444 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 8.2398e+07 )
								ret := 0.000000
				if( Money_Flow_Ratio > 21.0455 )
					if( ad <= 51378 )
						ret := -0.250000
					if( ad > 51378 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_BNBUSDT_15Min_ff61d0cc(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


