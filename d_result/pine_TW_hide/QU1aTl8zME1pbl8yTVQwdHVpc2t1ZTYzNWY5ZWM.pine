//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: AMZN_30Min_2MT0_e635f9ec Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_30Min_2MT0_e635f9ec", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_30Min_e635f9ec(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Raw_Money_Flow <= 7.46294e+06 )
		if( Negative_Money_Flow_Sum <= 2.36858e+09 )
			if( MFI_Low <= 78.7026 )
				if( Raw_Money_Flow <= 5.57214e+06 )
					if( Positive_Money_Flow <= 55698.9 )
						if( MFI <= 74.9548 )
							if( ema2 <= 117.52 )
								if( Typical_Price <= 100.031 )
									ret := 0.040323
								if( Typical_Price > 100.031 )
									ret := -0.204204
							if( ema2 > 117.52 )
								if( Negative_Money_Flow_Sum <= 1.02487e+07 )
									ret := -0.821429 // sell
								if( Negative_Money_Flow_Sum > 1.02487e+07 )
									ret := 0.081126
						if( MFI > 74.9548 )
							if( Raw_Money_Flow <= 4.04919e+06 )
								if( ema12 <= -0.196529 )
									ret := 0.390244
								if( ema12 > -0.196529 )
									ret := 0.114556
							if( Raw_Money_Flow > 4.04919e+06 )
								if( tema <= 363.141 )
									ret := 0.125000
								if( tema > 363.141 )
									ret := 0.427673
					if( Positive_Money_Flow > 55698.9 )
						if( MFI_High <= 9.96203 )
							if( Negative_Money_Flow <= 2.72996e+06 )
								if( ema13 <= -3.49387 )
									ret := 0.215659
								if( ema13 > -3.49387 )
									ret := -0.000857
							if( Negative_Money_Flow > 2.72996e+06 )
								if( ema2 <= 129.955 )
									ret := -0.500000
								if( ema2 > 129.955 )
									ret := 0.371429
						if( MFI_High > 9.96203 )
							if( Negative_Money_Flow_Sum <= 5.26996e+06 )
								ret := 0.863636 // buy
							if( Negative_Money_Flow_Sum > 5.26996e+06 )
								if( ema3 <= 100.603 )
									ret := 0.300000
								if( ema3 > 100.603 )
									ret := -0.168852
				if( Raw_Money_Flow > 5.57214e+06 )
					if( MFI_Low <= -2.54108 )
						if( Positive_Money_Flow_Sum <= 4.57402e+06 )
							ret := -0.894737 // sell
						if( Positive_Money_Flow_Sum > 4.57402e+06 )
							if( tema <= 1053.1 )
								if( Negative_Money_Flow_Sum <= 3.19181e+08 )
									ret := -0.432432
								if( Negative_Money_Flow_Sum > 3.19181e+08 )
									ret := 0.210526
							if( tema > 1053.1 )
								if( Positive_Money_Flow_Sum <= 1.69782e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.69782e+07 )
									ret := -0.694915
					if( MFI_Low > -2.54108 )
						if( Positive_Money_Flow <= 7.09452e+06 )
							if( MFI <= 34.1614 )
								if( MFI_High <= -58.3793 )
									ret := -0.071429
								if( MFI_High > -58.3793 )
									ret := 0.449612
							if( MFI > 34.1614 )
								if( Negative_Money_Flow <= 4.7108e+06 )
									ret := -0.220390
								if( Negative_Money_Flow > 4.7108e+06 )
									ret := 0.058201
						if( Positive_Money_Flow > 7.09452e+06 )
							if( ema2 <= 1774.08 )
								if( Negative_Money_Flow_Sum <= 5.6479e+08 )
									ret := 0.728814 // buy
								if( Negative_Money_Flow_Sum > 5.6479e+08 )
									ret := 0.058824
							if( ema2 > 1774.08 )
								if( Typical_Price <= 2560.57 )
									ret := -0.529412
								if( Typical_Price > 2560.57 )
									ret := 0.000000
			if( MFI_Low > 78.7026 )
				if( ema13 <= 25.43 )
					if( ema1 <= 716.471 )
						if( Positive_Money_Flow_Sum <= 1.56793e+09 )
							if( ema3 <= 106.249 )
								if( Positive_Money_Flow <= 1.20987e+06 )
									ret := 0.083333
								if( Positive_Money_Flow > 1.20987e+06 )
									ret := -0.818182 // sell
							if( ema3 > 106.249 )
								if( Typical_Price <= 601.145 )
									ret := 0.282828
								if( Typical_Price > 601.145 )
									ret := 0.857143 // buy
						if( Positive_Money_Flow_Sum > 1.56793e+09 )
							if( tema <= 221.9 )
								if( Positive_Money_Flow_Sum <= 1.62618e+09 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.62618e+09 )
									ret := 0.401235
							if( tema > 221.9 )
								ret := 1.000000 // buy
					if( ema1 > 716.471 )
						if( ema1 <= 769.191 )
							if( MFI_Low <= 79.3044 )
								ret := -0.909091 // sell
							if( MFI_Low > 79.3044 )
								ret := -0.363636
						if( ema1 > 769.191 )
							if( tema <= 3291.6 )
								if( Negative_Money_Flow_Sum <= 1.28689e+07 )
									ret := -0.085106
								if( Negative_Money_Flow_Sum > 1.28689e+07 )
									ret := 0.387097
							if( tema > 3291.6 )
								if( Typical_Price <= 3352.15 )
									ret := -0.687500
								if( Typical_Price > 3352.15 )
									ret := -0.363636
				if( ema13 > 25.43 )
					if( Typical_Price <= 2735.26 )
						ret := -1.000000 // sell
					if( Typical_Price > 2735.26 )
						if( ema13 <= 46.8756 )
							ret := -0.437500
						if( ema13 > 46.8756 )
							if( ema3 <= 3241.35 )
								ret := 0.400000
							if( ema3 > 3241.35 )
								ret := 0.777778 // buy
		if( Negative_Money_Flow_Sum > 2.36858e+09 )
			if( Negative_Money_Flow_Sum <= 5.07151e+09 )
				if( MFI_Low <= -8.12651 )
					if( ema12 <= -0.434871 )
						if( ema13 <= -1.47454 )
							if( ema1 <= 1852.12 )
								if( ema12 <= -0.808023 )
									ret := 0.705263 // buy
								if( ema12 > -0.808023 )
									ret := -0.200000
							if( ema1 > 1852.12 )
								if( tema <= 3115.44 )
									ret := -0.028169
								if( tema > 3115.44 )
									ret := 0.277778
						if( ema13 > -1.47454 )
							if( ema2 <= 117.488 )
								ret := 0.333333
							if( ema2 > 117.488 )
								if( MFI_High <= -73.1382 )
									ret := 0.875000 // buy
								if( MFI_High > -73.1382 )
									ret := 1.000000 // buy
					if( ema12 > -0.434871 )
						if( Positive_Money_Flow <= 352825 )
							if( Positive_Money_Flow_Sum <= 1.2153e+08 )
								if( ema2 <= 2304.17 )
									ret := -0.136364
								if( ema2 > 2304.17 )
									ret := -0.526316
							if( Positive_Money_Flow_Sum > 1.2153e+08 )
								if( ema13 <= -0.580936 )
									ret := -0.259259
								if( ema13 > -0.580936 )
									ret := 0.325581
						if( Positive_Money_Flow > 352825 )
							if( MFI_High <= -79.5331 )
								ret := -0.263158
							if( MFI_High > -79.5331 )
								if( Negative_Money_Flow <= 6844.37 )
									ret := 0.285714
								if( Negative_Money_Flow > 6844.37 )
									ret := 0.818182 // buy
				if( MFI_Low > -8.12651 )
					if( ema12 <= -18.8083 )
						if( Positive_Money_Flow_Sum <= 2.89606e+09 )
							if( MFI_Low <= 6.58158 )
								ret := 0.857143 // buy
							if( MFI_Low > 6.58158 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 2.89606e+09 )
							ret := 0.666667
					if( ema12 > -18.8083 )
						if( Negative_Money_Flow <= 6.47159e+06 )
							if( MFI_Low <= -3.97196 )
								if( ema1 <= 3051.48 )
									ret := 0.016260
								if( ema1 > 3051.48 )
									ret := -0.661765
							if( MFI_Low > -3.97196 )
								if( Positive_Money_Flow_Sum <= 6.0342e+08 )
									ret := 0.630769
								if( Positive_Money_Flow_Sum > 6.0342e+08 )
									ret := 0.137222
						if( Negative_Money_Flow > 6.47159e+06 )
							if( ema3 <= 1441.15 )
								ret := 0.000000
							if( ema3 > 1441.15 )
								if( Raw_Money_Flow <= 7.19496e+06 )
									ret := 0.646154
								if( Raw_Money_Flow > 7.19496e+06 )
									ret := 0.263158
			if( Negative_Money_Flow_Sum > 5.07151e+09 )
				if( ema2 <= 2374.57 )
					if( MFI <= 27.92 )
						if( ema13 <= -9.06428 )
							if( Negative_Money_Flow_Sum <= 7.2771e+09 )
								if( Negative_Money_Flow <= 317085 )
									ret := -0.333333
								if( Negative_Money_Flow > 317085 )
									ret := -0.783333 // sell
							if( Negative_Money_Flow_Sum > 7.2771e+09 )
								if( ema12 <= -20.7208 )
									ret := 0.600000
								if( ema12 > -20.7208 )
									ret := -0.310345
						if( ema13 > -9.06428 )
							if( MFI_High <= -75.9012 )
								if( ema1 <= 165.769 )
									ret := 0.000000
								if( ema1 > 165.769 )
									ret := -0.923077 // sell
							if( MFI_High > -75.9012 )
								if( ema13 <= -0.485023 )
									ret := 0.392857
								if( ema13 > -0.485023 )
									ret := -0.170213
					if( MFI > 27.92 )
						if( Negative_Money_Flow_Sum <= 6.03122e+09 )
							if( Money_Flow_Ratio <= 0.401536 )
								ret := 0.714286 // buy
							if( Money_Flow_Ratio > 0.401536 )
								if( Negative_Money_Flow_Sum <= 5.64154e+09 )
									ret := -0.021277
								if( Negative_Money_Flow_Sum > 5.64154e+09 )
									ret := -0.923077 // sell
						if( Negative_Money_Flow_Sum > 6.03122e+09 )
							if( MFI <= 30.1865 )
								ret := -0.083333
							if( MFI > 30.1865 )
								if( Positive_Money_Flow_Sum <= 3.97605e+09 )
									ret := 0.857143 // buy
								if( Positive_Money_Flow_Sum > 3.97605e+09 )
									ret := 0.259259
				if( ema2 > 2374.57 )
					if( ema13 <= -11.5595 )
						if( ema2 <= 2955.15 )
							if( Negative_Money_Flow_Sum <= 5.58077e+09 )
								ret := 0.357143
							if( Negative_Money_Flow_Sum > 5.58077e+09 )
								if( MFI <= 11.8979 )
									ret := -0.904762 // sell
								if( MFI > 11.8979 )
									ret := -0.392157
						if( ema2 > 2955.15 )
							if( ema3 <= 3006.05 )
								ret := 0.800000 // buy
							if( ema3 > 3006.05 )
								if( tema <= 3474.26 )
									ret := -0.098765
								if( tema > 3474.26 )
									ret := 0.297872
					if( ema13 > -11.5595 )
						if( Negative_Money_Flow_Sum <= 6.06413e+09 )
							if( Positive_Money_Flow_Sum <= 1.34189e+09 )
								if( Positive_Money_Flow <= 1.19631e+06 )
									ret := 0.285714
								if( Positive_Money_Flow > 1.19631e+06 )
									ret := -0.586207
							if( Positive_Money_Flow_Sum > 1.34189e+09 )
								if( ema3 <= 3041.64 )
									ret := 0.869565 // buy
								if( ema3 > 3041.64 )
									ret := -0.023810
						if( Negative_Money_Flow_Sum > 6.06413e+09 )
							if( ema3 <= 3175.27 )
								if( Positive_Money_Flow_Sum <= 6.76119e+08 )
									ret := -0.090909
								if( Positive_Money_Flow_Sum > 6.76119e+08 )
									ret := 0.851852 // buy
							if( ema3 > 3175.27 )
								if( Positive_Money_Flow <= 1.18302e+06 )
									ret := 0.205882
								if( Positive_Money_Flow > 1.18302e+06 )
									ret := 0.000000
	if( Raw_Money_Flow > 7.46294e+06 )
		if( Money_Flow_Ratio <= 0.217943 )
			if( Negative_Money_Flow_Sum <= 4.37031e+09 )
				if( Negative_Money_Flow_Sum <= 4.00592e+09 )
					if( Money_Flow_Ratio <= 0.010705 )
						if( Typical_Price <= 3374.06 )
							if( Raw_Money_Flow <= 1.20618e+09 )
								if( Typical_Price <= 158.273 )
									ret := 0.489796
								if( Typical_Price > 158.273 )
									ret := 0.129597
							if( Raw_Money_Flow > 1.20618e+09 )
								if( Money_Flow_Ratio <= 0.007585 )
									ret := 0.962963 // buy
								if( Money_Flow_Ratio > 0.007585 )
									ret := 0.388889
						if( Typical_Price > 3374.06 )
							ret := -0.666667
					if( Money_Flow_Ratio > 0.010705 )
						if( ema13 <= 1.39849 )
							if( ema12 <= -0.022409 )
								if( Positive_Money_Flow_Sum <= 6.87959e+07 )
									ret := -0.173413
								if( Positive_Money_Flow_Sum > 6.87959e+07 )
									ret := -0.020982
							if( ema12 > -0.022409 )
								if( Negative_Money_Flow <= 9.43202e+08 )
									ret := -0.269289
								if( Negative_Money_Flow > 9.43202e+08 )
									ret := -0.631579
						if( ema13 > 1.39849 )
							if( Negative_Money_Flow_Sum <= 3.66793e+09 )
								if( MFI <= 14.9484 )
									ret := 0.110048
								if( MFI > 14.9484 )
									ret := -0.262712
							if( Negative_Money_Flow_Sum > 3.66793e+09 )
								if( Typical_Price <= 2725.33 )
									ret := -0.904762 // sell
								if( Typical_Price > 2725.33 )
									ret := 0.000000
				if( Negative_Money_Flow_Sum > 4.00592e+09 )
					if( ema2 <= 3354.06 )
						if( Raw_Money_Flow <= 7.38101e+07 )
							if( MFI <= 1.37259 )
								ret := 1.000000 // buy
							if( MFI > 1.37259 )
								if( ema2 <= 1715.08 )
									ret := 1.000000 // buy
								if( ema2 > 1715.08 )
									ret := 0.428571
						if( Raw_Money_Flow > 7.38101e+07 )
							if( MFI_Low <= -19.3323 )
								ret := 0.772727 // buy
							if( MFI_Low > -19.3323 )
								if( Money_Flow_Ratio <= 0.018593 )
									ret := -0.459459
								if( Money_Flow_Ratio > 0.018593 )
									ret := 0.139423
					if( ema2 > 3354.06 )
						if( ema12 <= -3.19317 )
							ret := -0.692308
						if( ema12 > -3.19317 )
							ret := 0.000000
			if( Negative_Money_Flow_Sum > 4.37031e+09 )
				if( Positive_Money_Flow_Sum <= 2.10819e+09 )
					if( ema13 <= 7.90673 )
						if( Money_Flow_Ratio <= 0.077725 )
							if( Negative_Money_Flow <= 4.41798e+09 )
								if( Negative_Money_Flow_Sum <= 8.75381e+09 )
									ret := -0.197304
								if( Negative_Money_Flow_Sum > 8.75381e+09 )
									ret := 0.279070
							if( Negative_Money_Flow > 4.41798e+09 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.077725 )
							if( ema1 <= 3097.23 )
								if( Positive_Money_Flow_Sum <= 1.48046e+09 )
									ret := -0.266667
								if( Positive_Money_Flow_Sum > 1.48046e+09 )
									ret := -0.788845 // sell
							if( ema1 > 3097.23 )
								if( Positive_Money_Flow_Sum <= 9.01933e+08 )
									ret := -0.401460
								if( Positive_Money_Flow_Sum > 9.01933e+08 )
									ret := 0.045643
					if( ema13 > 7.90673 )
						if( Negative_Money_Flow_Sum <= 6.58601e+09 )
							if( Money_Flow_Ratio <= 0.109195 )
								ret := 0.400000
							if( Money_Flow_Ratio > 0.109195 )
								ret := 0.923077 // buy
						if( Negative_Money_Flow_Sum > 6.58601e+09 )
							ret := -0.500000
				if( Positive_Money_Flow_Sum > 2.10819e+09 )
					if( tema <= 3060.52 )
						if( ema1 <= 2724.43 )
							if( ema12 <= -20.5222 )
								ret := 0.692308
							if( ema12 > -20.5222 )
								if( Typical_Price <= 2234.97 )
									ret := 0.200000
								if( Typical_Price > 2234.97 )
									ret := -0.916667 // sell
						if( ema1 > 2724.43 )
							if( ema12 <= -27.6915 )
								ret := 0.416667
							if( ema12 > -27.6915 )
								ret := 1.000000 // buy
					if( tema > 3060.52 )
						if( MFI_Low <= -3.97403 )
							ret := 0.230769
						if( MFI_Low > -3.97403 )
							ret := -0.625000
		if( Money_Flow_Ratio > 0.217943 )
			if( ema12 <= -0.1733 )
				if( Money_Flow_Ratio <= 1.29867 )
					if( tema <= 94.9021 )
						if( MFI_High <= -38.3272 )
							if( ema13 <= -1.00587 )
								if( Negative_Money_Flow_Sum <= 2.88268e+09 )
									ret := -0.684211
								if( Negative_Money_Flow_Sum > 2.88268e+09 )
									ret := 0.078947
							if( ema13 > -1.00587 )
								if( MFI_High <= -39.7656 )
									ret := 0.547619
								if( MFI_High > -39.7656 )
									ret := -0.230769
						if( MFI_High > -38.3272 )
							if( ema1 <= 91.6659 )
								if( MFI <= 45.9443 )
									ret := 0.700000 // buy
								if( MFI > 45.9443 )
									ret := 0.000000
							if( ema1 > 91.6659 )
								if( MFI_Low <= 25.8496 )
									ret := 0.300000
								if( MFI_Low > 25.8496 )
									ret := 0.870968 // buy
					if( tema > 94.9021 )
						if( Negative_Money_Flow_Sum <= 1.48371e+10 )
							if( Typical_Price <= 2269.64 )
								if( Negative_Money_Flow <= 4.91061e+08 )
									ret := 0.004016
								if( Negative_Money_Flow > 4.91061e+08 )
									ret := -0.118683
							if( Typical_Price > 2269.64 )
								if( Raw_Money_Flow <= 3.20539e+07 )
									ret := 0.117892
								if( Raw_Money_Flow > 3.20539e+07 )
									ret := -0.131655
						if( Negative_Money_Flow_Sum > 1.48371e+10 )
							if( Negative_Money_Flow_Sum <= 1.81138e+10 )
								if( ema1 <= 2416.98 )
									ret := -0.982456 // sell
								if( ema1 > 2416.98 )
									ret := -0.333333
							if( Negative_Money_Flow_Sum > 1.81138e+10 )
								ret := 0.055556
				if( Money_Flow_Ratio > 1.29867 )
					if( Positive_Money_Flow_Sum <= 1.51742e+09 )
						if( tema <= 2481.01 )
							if( ema2 <= 122.383 )
								if( Positive_Money_Flow_Sum <= 1.5331e+08 )
									ret := -0.897959 // sell
								if( Positive_Money_Flow_Sum > 1.5331e+08 )
									ret := -0.300000
							if( ema2 > 122.383 )
								if( MFI_High <= 3.70704 )
									ret := -0.092541
								if( MFI_High > 3.70704 )
									ret := -0.355263
						if( tema > 2481.01 )
							if( Positive_Money_Flow_Sum <= 1.30926e+08 )
								ret := 0.500000
							if( Positive_Money_Flow_Sum > 1.30926e+08 )
								if( MFI_High <= 2.65411 )
									ret := -0.857143 // sell
								if( MFI_High > 2.65411 )
									ret := -0.290323
					if( Positive_Money_Flow_Sum > 1.51742e+09 )
						if( MFI_Low <= 73.4952 )
							if( MFI_High <= -22.4232 )
								if( ema13 <= -0.307393 )
									ret := -0.489362
								if( ema13 > -0.307393 )
									ret := 0.136364
							if( MFI_High > -22.4232 )
								if( MFI_High <= 12.8692 )
									ret := -0.081177
								if( MFI_High > 12.8692 )
									ret := -0.840000 // sell
						if( MFI_Low > 73.4952 )
							if( ema12 <= -0.316001 )
								if( Raw_Money_Flow <= 3.28545e+07 )
									ret := -0.073826
								if( Raw_Money_Flow > 3.28545e+07 )
									ret := 0.411765
							if( ema12 > -0.316001 )
								if( ema3 <= 1490.14 )
									ret := -0.315789
								if( ema3 > 1490.14 )
									ret := -1.000000 // sell
			if( ema12 > -0.1733 )
				if( ema12 <= 45.183 )
					if( Positive_Money_Flow_Sum <= 2.81833e+08 )
						if( Money_Flow_Ratio <= 4.65296 )
							if( Positive_Money_Flow <= 4.46478e+07 )
								if( Raw_Money_Flow <= 3.53591e+07 )
									ret := -0.062145
								if( Raw_Money_Flow > 3.53591e+07 )
									ret := 0.245312
							if( Positive_Money_Flow > 4.46478e+07 )
								if( Negative_Money_Flow_Sum <= 3.78042e+07 )
									ret := -0.714286 // sell
								if( Negative_Money_Flow_Sum > 3.78042e+07 )
									ret := -0.280822
						if( Money_Flow_Ratio > 4.65296 )
							if( Negative_Money_Flow_Sum <= 1.3384e+07 )
								if( Raw_Money_Flow <= 1.6124e+07 )
									ret := -0.377143
								if( Raw_Money_Flow > 1.6124e+07 )
									ret := 0.377778
							if( Negative_Money_Flow_Sum > 1.3384e+07 )
								if( ema13 <= -0.32922 )
									ret := 0.266667
								if( ema13 > -0.32922 )
									ret := -0.622074
					if( Positive_Money_Flow_Sum > 2.81833e+08 )
						if( Positive_Money_Flow_Sum <= 8.01589e+09 )
							if( ema1 <= 129.012 )
								if( Positive_Money_Flow_Sum <= 1.12443e+09 )
									ret := 0.342432
								if( Positive_Money_Flow_Sum > 1.12443e+09 )
									ret := 0.100236
							if( ema1 > 129.012 )
								if( ema13 <= 0.878342 )
									ret := -0.024658
								if( ema13 > 0.878342 )
									ret := 0.052267
						if( Positive_Money_Flow_Sum > 8.01589e+09 )
							if( ema13 <= 46.2989 )
								if( Negative_Money_Flow <= 5.83851e+08 )
									ret := -0.124341
								if( Negative_Money_Flow > 5.83851e+08 )
									ret := -0.368272
							if( ema13 > 46.2989 )
								if( ema2 <= 2562.76 )
									ret := -0.400000
								if( ema2 > 2562.76 )
									ret := 0.480769
				if( ema12 > 45.183 )
					if( ema2 <= 2871.47 )
						ret := -1.000000 // sell
					if( ema2 > 2871.47 )
						if( Negative_Money_Flow_Sum <= 6.02536e+09 )
							ret := -0.583333
						if( Negative_Money_Flow_Sum > 6.02536e+09 )
							if( Negative_Money_Flow_Sum <= 7.51774e+09 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 7.51774e+09 )
								ret := -0.857143 // sell
	
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
float op_operation = decision_tree_0_AMZN_30Min_e635f9ec(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)

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


