//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: PINS_15Min_2BM0_96812619 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_2BM0_96812619", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_96812619(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= 0.151309 )
		if( Raw_Money_Flow <= 339419 )
			if( Typical_Price <= 17.6331 )
				if( Positive_Money_Flow_Sum <= 98346.6 )
					if( bullPower <= -0.054728 )
						if( Negative_Money_Flow_Sum <= 195797 )
							if( MFI_Low <= 16.3306 )
								ret := -0.272727
							if( MFI_Low > 16.3306 )
								ret := 0.250000
						if( Negative_Money_Flow_Sum > 195797 )
							if( bearPower <= -0.201691 )
								ret := 0.538462
							if( bearPower > -0.201691 )
								ret := 1.000000 // buy
					if( bullPower > -0.054728 )
						if( Money_Flow_Ratio <= 0.589713 )
							ret := -0.666667
						if( Money_Flow_Ratio > 0.589713 )
							ret := 0.545455
				if( Positive_Money_Flow_Sum > 98346.6 )
					if( MFI_High <= -55.4867 )
						if( bullPower <= 0.028208 )
							if( Positive_Money_Flow_Sum <= 1.1971e+07 )
								if( bearPower <= -0.298117 )
									ret := 0.294118
								if( bearPower > -0.298117 )
									ret := 0.864865 // buy
							if( Positive_Money_Flow_Sum > 1.1971e+07 )
								ret := 0.235294
						if( bullPower > 0.028208 )
							if( Money_Flow_Ratio <= 0.220763 )
								ret := 0.000000
							if( Money_Flow_Ratio > 0.220763 )
								ret := 0.300000
					if( MFI_High > -55.4867 )
						if( bbm <= 0.32 )
							if( Negative_Money_Flow_Sum <= 1.61834e+07 )
								if( MFI_High <= -39.7109 )
									ret := -0.678571
								if( MFI_High > -39.7109 )
									ret := -0.328125
							if( Negative_Money_Flow_Sum > 1.61834e+07 )
								if( Raw_Money_Flow <= 37956.6 )
									ret := 0.216049
								if( Raw_Money_Flow > 37956.6 )
									ret := -0.455556
						if( bbm > 0.32 )
							if( bearPower <= -0.362841 )
								ret := -0.400000
							if( bearPower > -0.362841 )
								ret := 0.875000 // buy
			if( Typical_Price > 17.6331 )
				if( bearPower <= -0.099687 )
					if( Money_Flow_Ratio <= 4.58812 )
						if( MFI <= 80.5708 )
							if( bbm <= 0.049924 )
								if( Typical_Price <= 49.6749 )
									ret := 0.419250
								if( Typical_Price > 49.6749 )
									ret := 0.152659
							if( bbm > 0.049924 )
								if( Negative_Money_Flow_Sum <= 4.64703e+07 )
									ret := 0.157805
								if( Negative_Money_Flow_Sum > 4.64703e+07 )
									ret := -0.003177
						if( MFI > 80.5708 )
							if( Typical_Price <= 21.3438 )
								ret := 0.000000
							if( Typical_Price > 21.3438 )
								if( bearPower <= -0.134451 )
									ret := -0.777778 // sell
								if( bearPower > -0.134451 )
									ret := -0.045455
					if( Money_Flow_Ratio > 4.58812 )
						if( bullPower <= -0.09499 )
							if( Raw_Money_Flow <= 78449.9 )
								if( Positive_Money_Flow_Sum <= 6.63901e+07 )
									ret := 0.457565
								if( Positive_Money_Flow_Sum > 6.63901e+07 )
									ret := 0.801170 // buy
							if( Raw_Money_Flow > 78449.9 )
								if( Money_Flow_Ratio <= 9.70943 )
									ret := 0.684211
								if( Money_Flow_Ratio > 9.70943 )
									ret := -0.145455
						if( bullPower > -0.09499 )
							if( bbm <= 0.5577 )
								if( Positive_Money_Flow_Sum <= 2.21773e+07 )
									ret := 0.601449
								if( Positive_Money_Flow_Sum > 2.21773e+07 )
									ret := -0.132948
							if( bbm > 0.5577 )
								ret := -0.687500
				if( bearPower > -0.099687 )
					if( Negative_Money_Flow <= 271.346 )
						if( Negative_Money_Flow_Sum <= 244472 )
							if( MFI_High <= -15.3064 )
								if( Negative_Money_Flow_Sum <= 90433.5 )
									ret := 0.736842 // buy
								if( Negative_Money_Flow_Sum > 90433.5 )
									ret := -0.612546
							if( MFI_High > -15.3064 )
								if( Positive_Money_Flow_Sum <= 1.01864e+08 )
									ret := -0.013619
								if( Positive_Money_Flow_Sum > 1.01864e+08 )
									ret := -0.705882 // sell
						if( Negative_Money_Flow_Sum > 244472 )
							if( Negative_Money_Flow_Sum <= 3.56763e+06 )
								if( Money_Flow_Ratio <= 0.96797 )
									ret := 0.022346
								if( Money_Flow_Ratio > 0.96797 )
									ret := 0.200299
							if( Negative_Money_Flow_Sum > 3.56763e+06 )
								if( bbm <= 0.148985 )
									ret := -0.090648
								if( bbm > 0.148985 )
									ret := 0.179641
					if( Negative_Money_Flow > 271.346 )
						if( Money_Flow_Ratio <= 1.0992 )
							if( Negative_Money_Flow <= 12099.7 )
								if( bearPower <= 0.052621 )
									ret := 0.161924
								if( bearPower > 0.052621 )
									ret := -0.486111
							if( Negative_Money_Flow > 12099.7 )
								if( Money_Flow_Ratio <= 0.381053 )
									ret := 0.074938
								if( Money_Flow_Ratio > 0.381053 )
									ret := -0.061611
						if( Money_Flow_Ratio > 1.0992 )
							if( Typical_Price <= 20.4429 )
								if( Positive_Money_Flow_Sum <= 5.81894e+07 )
									ret := 0.118959
								if( Positive_Money_Flow_Sum > 5.81894e+07 )
									ret := -0.297030
							if( Typical_Price > 20.4429 )
								if( Positive_Money_Flow <= 333.991 )
									ret := 0.227783
								if( Positive_Money_Flow > 333.991 )
									ret := 0.053254
		if( Raw_Money_Flow > 339419 )
			if( Negative_Money_Flow <= 1.18056e+07 )
				if( bearPower <= -0.344946 )
					if( bearPower <= -1.24175 )
						if( Typical_Price <= 25.7025 )
							if( Raw_Money_Flow <= 4.86126e+06 )
								if( Raw_Money_Flow <= 2.62304e+06 )
									ret := 0.461538
								if( Raw_Money_Flow > 2.62304e+06 )
									ret := -0.090909
							if( Raw_Money_Flow > 4.86126e+06 )
								if( MFI_Low <= -7.65868 )
									ret := -0.333333
								if( MFI_Low > -7.65868 )
									ret := -1.000000 // sell
						if( Typical_Price > 25.7025 )
							if( Positive_Money_Flow <= 2.45519e+07 )
								if( Positive_Money_Flow <= 8.67233e+06 )
									ret := 0.321739
								if( Positive_Money_Flow > 8.67233e+06 )
									ret := -0.500000
							if( Positive_Money_Flow > 2.45519e+07 )
								if( Positive_Money_Flow <= 7.77389e+07 )
									ret := 0.627451
								if( Positive_Money_Flow > 7.77389e+07 )
									ret := -0.240000
					if( bearPower > -1.24175 )
						if( Negative_Money_Flow_Sum <= 1.77633e+08 )
							if( MFI <= 16.9104 )
								if( Negative_Money_Flow_Sum <= 9.63709e+07 )
									ret := -0.161220
								if( Negative_Money_Flow_Sum > 9.63709e+07 )
									ret := 0.162679
							if( MFI > 16.9104 )
								if( bbm <= 0.450195 )
									ret := 0.177345
								if( bbm > 0.450195 )
									ret := -0.008345
						if( Negative_Money_Flow_Sum > 1.77633e+08 )
							if( bbm <= 1.03357 )
								if( Positive_Money_Flow_Sum <= 2.08542e+08 )
									ret := -0.279152
								if( Positive_Money_Flow_Sum > 2.08542e+08 )
									ret := 0.237443
							if( bbm > 1.03357 )
								if( Negative_Money_Flow_Sum <= 5.37927e+08 )
									ret := 0.666667
								if( Negative_Money_Flow_Sum > 5.37927e+08 )
									ret := -0.900000 // sell
				if( bearPower > -0.344946 )
					if( Money_Flow_Ratio <= 1.0939 )
						if( Negative_Money_Flow_Sum <= 847355 )
							if( MFI_Low <= 6.65823 )
								ret := 0.600000
							if( MFI_Low > 6.65823 )
								if( Negative_Money_Flow <= 453956 )
									ret := -0.740741 // sell
								if( Negative_Money_Flow > 453956 )
									ret := 0.071429
						if( Negative_Money_Flow_Sum > 847355 )
							if( Raw_Money_Flow <= 6.2918e+06 )
								if( bullPower <= 0.094269 )
									ret := -0.040583
								if( bullPower > 0.094269 )
									ret := 0.120871
							if( Raw_Money_Flow > 6.2918e+06 )
								if( Positive_Money_Flow_Sum <= 8.57696e+07 )
									ret := -0.121869
								if( Positive_Money_Flow_Sum > 8.57696e+07 )
									ret := 0.049892
					if( Money_Flow_Ratio > 1.0939 )
						if( Positive_Money_Flow_Sum <= 1.31136e+07 )
							if( Typical_Price <= 43.3184 )
								if( bearPower <= -0.05983 )
									ret := 0.276553
								if( bearPower > -0.05983 )
									ret := -0.117284
							if( Typical_Price > 43.3184 )
								if( MFI_Low <= 45.1727 )
									ret := -0.653061
								if( MFI_Low > 45.1727 )
									ret := 0.428571
						if( Positive_Money_Flow_Sum > 1.31136e+07 )
							if( Money_Flow_Ratio <= 1.23968 )
								if( Negative_Money_Flow <= 9.76391e+06 )
									ret := 0.163035
								if( Negative_Money_Flow > 9.76391e+06 )
									ret := -0.762712 // sell
							if( Money_Flow_Ratio > 1.23968 )
								if( bullPower <= 0.334991 )
									ret := -0.030806
								if( bullPower > 0.334991 )
									ret := 0.530612
			if( Negative_Money_Flow > 1.18056e+07 )
				if( MFI_Low <= 10.087 )
					if( Negative_Money_Flow <= 1.37433e+07 )
						if( MFI_Low <= -19.6504 )
							if( Positive_Money_Flow_Sum <= 38833 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 38833 )
								ret := -0.428571
						if( MFI_Low > -19.6504 )
							if( Typical_Price <= 25.3342 )
								if( Negative_Money_Flow_Sum <= 9.16998e+07 )
									ret := 0.731707 // buy
								if( Negative_Money_Flow_Sum > 9.16998e+07 )
									ret := 0.075000
							if( Typical_Price > 25.3342 )
								if( MFI_High <= -58.6021 )
									ret := 0.398907
								if( MFI_High > -58.6021 )
									ret := -0.314516
					if( Negative_Money_Flow > 1.37433e+07 )
						if( MFI_Low <= -18.3082 )
							if( Positive_Money_Flow_Sum <= 434726 )
								if( bullPower <= -0.411127 )
									ret := 0.500000
								if( bullPower > -0.411127 )
									ret := -0.202020
							if( Positive_Money_Flow_Sum > 434726 )
								if( Negative_Money_Flow <= 1.88052e+07 )
									ret := 0.679012
								if( Negative_Money_Flow > 1.88052e+07 )
									ret := 0.203091
						if( MFI_Low > -18.3082 )
							if( bullPower <= -1.24641 )
								if( Positive_Money_Flow_Sum <= 1.08532e+08 )
									ret := 0.857143 // buy
								if( Positive_Money_Flow_Sum > 1.08532e+08 )
									ret := -0.440000
							if( bullPower > -1.24641 )
								if( Negative_Money_Flow <= 2.2854e+07 )
									ret := -0.141907
								if( Negative_Money_Flow > 2.2854e+07 )
									ret := -0.009776
				if( MFI_Low > 10.087 )
					if( MFI_Low <= 52.9664 )
						if( Negative_Money_Flow_Sum <= 9.35741e+08 )
							if( bullPower <= 0.201545 )
								if( Positive_Money_Flow <= 514394 )
									ret := 0.182698
								if( Positive_Money_Flow > 514394 )
									ret := 0.828571 // buy
							if( bullPower > 0.201545 )
								if( Negative_Money_Flow_Sum <= 1.15366e+08 )
									ret := -0.219424
								if( Negative_Money_Flow_Sum > 1.15366e+08 )
									ret := 0.137500
						if( Negative_Money_Flow_Sum > 9.35741e+08 )
							if( Typical_Price <= 71.0453 )
								if( bullPower <= 0.267269 )
									ret := -0.923077 // sell
								if( bullPower > 0.267269 )
									ret := -0.666667
							if( Typical_Price > 71.0453 )
								ret := 0.500000
					if( MFI_Low > 52.9664 )
						if( Negative_Money_Flow <= 3.13445e+07 )
							if( MFI <= 74.3334 )
								ret := -0.300000
							if( MFI > 74.3334 )
								if( bbm <= 0.33 )
									ret := 0.294118
								if( bbm > 0.33 )
									ret := -0.071429
						if( Negative_Money_Flow > 3.13445e+07 )
							if( MFI_Low <= 54.1762 )
								ret := -0.333333
							if( MFI_Low > 54.1762 )
								ret := -1.000000 // sell
	if( bbp > 0.151309 )
		if( Negative_Money_Flow_Sum <= 1.14194e+08 )
			if( MFI_High <= -20.1936 )
				if( Raw_Money_Flow <= 23811.4 )
					if( Typical_Price <= 68.5743 )
						if( bbp <= 1.43256 )
							if( bearPower <= 0.016312 )
								ret := 0.625000
							if( bearPower > 0.016312 )
								if( bbm <= 0 )
									ret := -0.337143
								if( bbm > 0 )
									ret := -0.506329
						if( bbp > 1.43256 )
							if( Positive_Money_Flow <= 5120.79 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow > 5120.79 )
								ret := -0.875000 // sell
					if( Typical_Price > 68.5743 )
						if( bbp <= 0.271917 )
							ret := -0.272727
						if( bbp > 0.271917 )
							if( bbp <= 0.368738 )
								ret := 0.545455
							if( bbp > 0.368738 )
								if( MFI_Low <= 12.4848 )
									ret := -0.133333
								if( MFI_Low > 12.4848 )
									ret := 0.000000
				if( Raw_Money_Flow > 23811.4 )
					if( bullPower <= 0.287759 )
						if( bbp <= 0.166225 )
							if( bullPower <= 0.119824 )
								if( Positive_Money_Flow <= 29990 )
									ret := -0.080000
								if( Positive_Money_Flow > 29990 )
									ret := 0.383721
							if( bullPower > 0.119824 )
								if( Positive_Money_Flow_Sum <= 417620 )
									ret := -0.421053
								if( Positive_Money_Flow_Sum > 417620 )
									ret := 0.017483
						if( bbp > 0.166225 )
							if( Positive_Money_Flow <= 1594.8 )
								if( bbm <= 0.113764 )
									ret := -0.154613
								if( bbm > 0.113764 )
									ret := 0.050955
							if( Positive_Money_Flow > 1594.8 )
								if( Positive_Money_Flow <= 21561.9 )
									ret := -0.603774
								if( Positive_Money_Flow > 21561.9 )
									ret := -0.100121
					if( bullPower > 0.287759 )
						if( bearPower <= 0.512156 )
							if( Negative_Money_Flow <= 433.822 )
								if( Positive_Money_Flow_Sum <= 576810 )
									ret := -0.033520
								if( Positive_Money_Flow_Sum > 576810 )
									ret := -0.300627
							if( Negative_Money_Flow > 433.822 )
								if( bbp <= 0.282779 )
									ret := -0.405405
								if( bbp > 0.282779 )
									ret := -0.071586
						if( bearPower > 0.512156 )
							if( MFI <= 54.6977 )
								if( Negative_Money_Flow <= 53201.8 )
									ret := -0.642857
								if( Negative_Money_Flow > 53201.8 )
									ret := -0.214286
							if( MFI > 54.6977 )
								if( Raw_Money_Flow <= 763379 )
									ret := -0.888889 // sell
								if( Raw_Money_Flow > 763379 )
									ret := -1.000000 // sell
			if( MFI_High > -20.1936 )
				if( bullPower <= 1.17578 )
					if( Positive_Money_Flow_Sum <= 1.63582e+07 )
						if( Raw_Money_Flow <= 2.2382e+06 )
							if( bbp <= 0.347022 )
								if( Positive_Money_Flow_Sum <= 7.49915e+06 )
									ret := -0.113520
								if( Positive_Money_Flow_Sum > 7.49915e+06 )
									ret := 0.401235
							if( bbp > 0.347022 )
								if( MFI_High <= -13.6176 )
									ret := -0.446991
								if( MFI_High > -13.6176 )
									ret := -0.145819
						if( Raw_Money_Flow > 2.2382e+06 )
							if( MFI_Low <= 50.9923 )
								if( bearPower <= 0.135204 )
									ret := 0.133333
								if( bearPower > 0.135204 )
									ret := -0.750000 // sell
							if( MFI_Low > 50.9923 )
								if( Positive_Money_Flow <= 1.53344e+07 )
									ret := -0.632727
								if( Positive_Money_Flow > 1.53344e+07 )
									ret := 0.714286 // buy
					if( Positive_Money_Flow_Sum > 1.63582e+07 )
						if( Positive_Money_Flow <= 5.48363e+07 )
							if( Typical_Price <= 26.1381 )
								if( Positive_Money_Flow_Sum <= 4.14749e+07 )
									ret := 0.200849
								if( Positive_Money_Flow_Sum > 4.14749e+07 )
									ret := -0.011399
							if( Typical_Price > 26.1381 )
								if( Raw_Money_Flow <= 37339.7 )
									ret := -0.298720
								if( Raw_Money_Flow > 37339.7 )
									ret := -0.032623
						if( Positive_Money_Flow > 5.48363e+07 )
							if( Negative_Money_Flow_Sum <= 9.10627e+06 )
								if( MFI <= 99.3202 )
									ret := -0.811189 // sell
								if( MFI > 99.3202 )
									ret := 0.033333
							if( Negative_Money_Flow_Sum > 9.10627e+06 )
								if( Typical_Price <= 33.3205 )
									ret := 0.479167
								if( Typical_Price > 33.3205 )
									ret := -0.135802
				if( bullPower > 1.17578 )
					if( Raw_Money_Flow <= 5.22114e+07 )
						if( bbp <= 4.01577 )
							if( Money_Flow_Ratio <= 3.97459 )
								if( bbm <= 0.86 )
									ret := -0.598131
								if( bbm > 0.86 )
									ret := -0.112676
							if( Money_Flow_Ratio > 3.97459 )
								if( MFI_Low <= 78.7638 )
									ret := 0.065041
								if( MFI_Low > 78.7638 )
									ret := -0.395349
						if( bbp > 4.01577 )
							if( Negative_Money_Flow_Sum <= 1.0319e+06 )
								ret := 0.909091 // buy
							if( Negative_Money_Flow_Sum > 1.0319e+06 )
								ret := 1.000000 // buy
					if( Raw_Money_Flow > 5.22114e+07 )
						if( Money_Flow_Ratio <= 436.414 )
							if( MFI_Low <= 73.9222 )
								if( bearPower <= -0.485436 )
									ret := 0.700000 // buy
								if( bearPower > -0.485436 )
									ret := -0.592105
							if( MFI_Low > 73.9222 )
								if( Money_Flow_Ratio <= 344.995 )
									ret := -0.891892 // sell
								if( Money_Flow_Ratio > 344.995 )
									ret := -0.454545
						if( Money_Flow_Ratio > 436.414 )
							ret := 0.250000
		if( Negative_Money_Flow_Sum > 1.14194e+08 )
			if( MFI <= 77.2898 )
				if( Positive_Money_Flow_Sum <= 8.95372e+07 )
					if( Raw_Money_Flow <= 33959.8 )
						if( Money_Flow_Ratio <= 0.103146 )
							if( bearPower <= 0.243538 )
								if( bbp <= 0.26097 )
									ret := -0.722222 // sell
								if( bbp > 0.26097 )
									ret := -0.956522 // sell
							if( bearPower > 0.243538 )
								ret := 0.000000
						if( Money_Flow_Ratio > 0.103146 )
							if( Raw_Money_Flow <= 22578.6 )
								if( Money_Flow_Ratio <= 0.359669 )
									ret := 0.000000
								if( Money_Flow_Ratio > 0.359669 )
									ret := -0.200000
							if( Raw_Money_Flow > 22578.6 )
								ret := -0.700000 // sell
					if( Raw_Money_Flow > 33959.8 )
						if( Positive_Money_Flow <= 1.30961e+07 )
							if( Positive_Money_Flow <= 2.58034e+06 )
								if( Positive_Money_Flow <= 227936 )
									ret := 0.125000
								if( Positive_Money_Flow > 227936 )
									ret := -0.428571
							if( Positive_Money_Flow > 2.58034e+06 )
								if( Negative_Money_Flow_Sum <= 1.82326e+08 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 1.82326e+08 )
									ret := 0.692308
						if( Positive_Money_Flow > 1.30961e+07 )
							if( MFI_Low <= 12.536 )
								ret := -0.733333 // sell
							if( MFI_Low > 12.536 )
								ret := -0.526316
				if( Positive_Money_Flow_Sum > 8.95372e+07 )
					if( bullPower <= 5.98765 )
						if( bearPower <= -0.426532 )
							if( MFI <= 42.9831 )
								ret := -0.785714 // sell
							if( MFI > 42.9831 )
								if( bbp <= 0.565469 )
									ret := -0.888889 // sell
								if( bbp > 0.565469 )
									ret := 0.000000
						if( bearPower > -0.426532 )
							if( Positive_Money_Flow_Sum <= 8.40743e+08 )
								if( bullPower <= 1.17322 )
									ret := 0.134743
								if( bullPower > 1.17322 )
									ret := -0.062295
							if( Positive_Money_Flow_Sum > 8.40743e+08 )
								if( MFI <= 69.7854 )
									ret := -0.033333
								if( MFI > 69.7854 )
									ret := -0.911765 // sell
					if( bullPower > 5.98765 )
						if( MFI_High <= -11.8036 )
							ret := 0.833333 // buy
						if( MFI_High > -11.8036 )
							ret := 1.000000 // buy
			if( MFI > 77.2898 )
				if( Negative_Money_Flow <= 1.64149e+07 )
					if( bbm <= 0.53077 )
						if( Money_Flow_Ratio <= 3.67992 )
							ret := -0.181818
						if( Money_Flow_Ratio > 3.67992 )
							ret := 0.285714
					if( bbm > 0.53077 )
						if( Positive_Money_Flow_Sum <= 6.70676e+08 )
							ret := -0.411765
						if( Positive_Money_Flow_Sum > 6.70676e+08 )
							ret := -0.866667 // sell
				if( Negative_Money_Flow > 1.64149e+07 )
					ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_PINS_15Min_96812619(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


