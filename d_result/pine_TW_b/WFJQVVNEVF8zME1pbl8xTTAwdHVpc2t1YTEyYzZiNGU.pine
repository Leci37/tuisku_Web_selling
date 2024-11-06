//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: XRPUSDT_30Min_1M00_a12c6b4e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_1M00_a12c6b4e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_a12c6b4e(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( MFI <= 68.0165 )
		if( Negative_Money_Flow <= 5.44469e+06 )
			if( Positive_Money_Flow_Sum <= 2.61151e+08 )
				if( MFI_High <= -12.1166 )
					if( Raw_Money_Flow <= 2.9571e+06 )
						if( Positive_Money_Flow_Sum <= 2.89568e+06 )
							if( Negative_Money_Flow_Sum <= 3.7646e+06 )
								if( Money_Flow_Ratio <= 1.13469 )
									ret := 0.273810
								if( Money_Flow_Ratio > 1.13469 )
									ret := 0.094595
							if( Negative_Money_Flow_Sum > 3.7646e+06 )
								if( Money_Flow_Ratio <= 0.513701 )
									ret := 0.070175
								if( Money_Flow_Ratio > 0.513701 )
									ret := -0.238636
						if( Positive_Money_Flow_Sum > 2.89568e+06 )
							if( Raw_Money_Flow <= 473119 )
								if( Negative_Money_Flow_Sum <= 4.39889e+06 )
									ret := -0.098266
								if( Negative_Money_Flow_Sum > 4.39889e+06 )
									ret := 0.204668
							if( Raw_Money_Flow > 473119 )
								if( MFI <= 59.2703 )
									ret := -0.046431
								if( MFI > 59.2703 )
									ret := 0.001302
					if( Raw_Money_Flow > 2.9571e+06 )
						if( MFI_Low <= -13.7469 )
							ret := 0.866667 // buy
						if( MFI_Low > -13.7469 )
							if( Money_Flow_Ratio <= 0.202304 )
								if( Positive_Money_Flow <= 1.33371e+07 )
									ret := -0.182232
								if( Positive_Money_Flow > 1.33371e+07 )
									ret := 0.263158
							if( Money_Flow_Ratio > 0.202304 )
								if( Typical_Price <= 0.599497 )
									ret := 0.066830
								if( Typical_Price > 0.599497 )
									ret := -0.045763
				if( MFI_High > -12.1166 )
					if( Money_Flow_Ratio <= 2.11556 )
						ret := 0.666667
					if( Money_Flow_Ratio > 2.11556 )
						if( Typical_Price <= 0.782981 )
							if( MFI_High <= -12.0028 )
								if( Raw_Money_Flow <= 1.90408e+06 )
									ret := 0.387097
								if( Raw_Money_Flow > 1.90408e+06 )
									ret := -0.101449
							if( MFI_High > -12.0028 )
								if( Money_Flow_Ratio <= 2.12548 )
									ret := 0.384615
								if( Money_Flow_Ratio > 2.12548 )
									ret := 0.545455
						if( Typical_Price > 0.782981 )
							ret := 0.666667
			if( Positive_Money_Flow_Sum > 2.61151e+08 )
				if( MFI_High <= -32.0619 )
					if( MFI_High <= -43.7615 )
						if( Raw_Money_Flow <= 1.01144e+08 )
							if( Negative_Money_Flow_Sum <= 1.62508e+09 )
								if( Negative_Money_Flow_Sum <= 8.66488e+08 )
									ret := -0.259259
								if( Negative_Money_Flow_Sum > 8.66488e+08 )
									ret := 0.800000 // buy
							if( Negative_Money_Flow_Sum > 1.62508e+09 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 1.01144e+08 )
							ret := 0.857143 // buy
					if( MFI_High > -43.7615 )
						if( Positive_Money_Flow <= 3.30043e+07 )
							if( Typical_Price <= 1.14476 )
								ret := 1.000000 // buy
							if( Typical_Price > 1.14476 )
								if( MFI_Low <= 21.6038 )
									ret := -1.000000 // sell
								if( MFI_Low > 21.6038 )
									ret := -0.700000 // sell
						if( Positive_Money_Flow > 3.30043e+07 )
							if( Raw_Money_Flow <= 5.21304e+07 )
								if( Negative_Money_Flow_Sum <= 5.55179e+08 )
									ret := -0.940594 // sell
								if( Negative_Money_Flow_Sum > 5.55179e+08 )
									ret := -0.125000
							if( Raw_Money_Flow > 5.21304e+07 )
								if( MFI <= 46.5269 )
									ret := -0.415842
								if( MFI > 46.5269 )
									ret := -1.000000 // sell
				if( MFI_High > -32.0619 )
					if( Typical_Price <= 1.63986 )
						if( Money_Flow_Ratio <= 1.10324 )
							if( Raw_Money_Flow <= 2.75375e+07 )
								if( MFI <= 50.903 )
									ret := 1.000000 // buy
								if( MFI > 50.903 )
									ret := 0.200000
							if( Raw_Money_Flow > 2.75375e+07 )
								if( Typical_Price <= 1.1283 )
									ret := 0.696970
								if( Typical_Price > 1.1283 )
									ret := -0.077778
						if( Money_Flow_Ratio > 1.10324 )
							if( MFI_Low <= 36.9831 )
								if( Positive_Money_Flow_Sum <= 3.32791e+08 )
									ret := 0.118421
								if( Positive_Money_Flow_Sum > 3.32791e+08 )
									ret := -0.789474 // sell
							if( MFI_Low > 36.9831 )
								if( Money_Flow_Ratio <= 1.76906 )
									ret := 0.110345
								if( Money_Flow_Ratio > 1.76906 )
									ret := -0.254980
					if( Typical_Price > 1.63986 )
						if( Money_Flow_Ratio <= 1.13959 )
							if( MFI_Low <= 29.0878 )
								ret := -0.454545
							if( MFI_Low > 29.0878 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 1.13959 )
							if( Typical_Price <= 1.77233 )
								if( Money_Flow_Ratio <= 1.50211 )
									ret := -0.263158
								if( Money_Flow_Ratio > 1.50211 )
									ret := 0.307692
							if( Typical_Price > 1.77233 )
								ret := -1.000000 // sell
		if( Negative_Money_Flow > 5.44469e+06 )
			if( MFI_High <= -52.2702 )
				if( Typical_Price <= 0.642371 )
					if( MFI <= 21.0001 )
						if( MFI_Low <= -6.49075 )
							if( Typical_Price <= 0.422253 )
								if( Negative_Money_Flow <= 8.03024e+06 )
									ret := -0.285714
								if( Negative_Money_Flow > 8.03024e+06 )
									ret := 0.100000
							if( Typical_Price > 0.422253 )
								if( Positive_Money_Flow_Sum <= 2.07245e+07 )
									ret := 0.656442
								if( Positive_Money_Flow_Sum > 2.07245e+07 )
									ret := 0.296296
						if( MFI_Low > -6.49075 )
							if( MFI_High <= -63.3663 )
								if( Raw_Money_Flow <= 2.75848e+07 )
									ret := -0.069565
								if( Raw_Money_Flow > 2.75848e+07 )
									ret := 0.739130 // buy
							if( MFI_High > -63.3663 )
								if( Negative_Money_Flow <= 1.21902e+07 )
									ret := 0.034483
								if( Negative_Money_Flow > 1.21902e+07 )
									ret := 0.445000
					if( MFI > 21.0001 )
						if( Negative_Money_Flow_Sum <= 2.44531e+08 )
							if( Negative_Money_Flow <= 1.49043e+07 )
								if( Negative_Money_Flow_Sum <= 4.47943e+07 )
									ret := 0.148148
								if( Negative_Money_Flow_Sum > 4.47943e+07 )
									ret := 0.476980
							if( Negative_Money_Flow > 1.49043e+07 )
								if( MFI_Low <= 2.33348 )
									ret := 0.171429
								if( MFI_Low > 2.33348 )
									ret := 0.739336 // buy
						if( Negative_Money_Flow_Sum > 2.44531e+08 )
							if( Negative_Money_Flow_Sum <= 3.2292e+08 )
								if( Typical_Price <= 0.571758 )
									ret := -0.980769 // sell
								if( Typical_Price > 0.571758 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 3.2292e+08 )
								if( Typical_Price <= 0.442124 )
									ret := 0.875000 // buy
								if( Typical_Price > 0.442124 )
									ret := 1.000000 // buy
				if( Typical_Price > 0.642371 )
					if( MFI_High <= -58.4022 )
						if( Positive_Money_Flow_Sum <= 1.38616e+08 )
							if( Positive_Money_Flow_Sum <= 1.27367e+08 )
								if( Positive_Money_Flow_Sum <= 1.87185e+07 )
									ret := -0.129032
								if( Positive_Money_Flow_Sum > 1.87185e+07 )
									ret := 0.098592
							if( Positive_Money_Flow_Sum > 1.27367e+08 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.38616e+08 )
							ret := 1.000000 // buy
					if( MFI_High > -58.4022 )
						if( Negative_Money_Flow_Sum <= 8.70318e+07 )
							if( Typical_Price <= 0.735059 )
								if( Raw_Money_Flow <= 1.19143e+07 )
									ret := -0.523810
								if( Raw_Money_Flow > 1.19143e+07 )
									ret := 0.071429
							if( Typical_Price > 0.735059 )
								if( Negative_Money_Flow <= 1.19204e+07 )
									ret := -0.022472
								if( Negative_Money_Flow > 1.19204e+07 )
									ret := 0.636364
						if( Negative_Money_Flow_Sum > 8.70318e+07 )
							if( MFI <= 26.2749 )
								if( Negative_Money_Flow_Sum <= 4.0568e+08 )
									ret := 0.528190
								if( Negative_Money_Flow_Sum > 4.0568e+08 )
									ret := 0.031250
							if( MFI > 26.2749 )
								if( Raw_Money_Flow <= 5.19687e+07 )
									ret := -0.205128
								if( Raw_Money_Flow > 5.19687e+07 )
									ret := 0.771429 // buy
			if( MFI_High > -52.2702 )
				if( Raw_Money_Flow <= 5.64233e+07 )
					if( Positive_Money_Flow_Sum <= 5.51862e+07 )
						if( Negative_Money_Flow <= 2.23024e+07 )
							if( Money_Flow_Ratio <= 0.408132 )
								if( Money_Flow_Ratio <= 0.397515 )
									ret := 0.011905
								if( Money_Flow_Ratio > 0.397515 )
									ret := -0.295597
							if( Money_Flow_Ratio > 0.408132 )
								if( Negative_Money_Flow_Sum <= 5.20224e+07 )
									ret := 0.101898
								if( Negative_Money_Flow_Sum > 5.20224e+07 )
									ret := 0.220083
						if( Negative_Money_Flow > 2.23024e+07 )
							if( MFI <= 28.5906 )
								if( Negative_Money_Flow <= 2.70942e+07 )
									ret := -0.727273 // sell
								if( Negative_Money_Flow > 2.70942e+07 )
									ret := 0.000000
							if( MFI > 28.5906 )
								if( Raw_Money_Flow <= 3.22599e+07 )
									ret := 0.725191 // buy
								if( Raw_Money_Flow > 3.22599e+07 )
									ret := 0.230769
					if( Positive_Money_Flow_Sum > 5.51862e+07 )
						if( Positive_Money_Flow_Sum <= 4.82421e+08 )
							if( Money_Flow_Ratio <= 0.425563 )
								if( Positive_Money_Flow_Sum <= 1.12214e+08 )
									ret := -0.688525
								if( Positive_Money_Flow_Sum > 1.12214e+08 )
									ret := 0.016949
							if( Money_Flow_Ratio > 0.425563 )
								if( Money_Flow_Ratio <= 0.578924 )
									ret := 0.140333
								if( Money_Flow_Ratio > 0.578924 )
									ret := 0.019537
						if( Positive_Money_Flow_Sum > 4.82421e+08 )
							if( Negative_Money_Flow_Sum <= 7.78945e+08 )
								if( Typical_Price <= 1.70448 )
									ret := 0.765306 // buy
								if( Typical_Price > 1.70448 )
									ret := -0.076923
							if( Negative_Money_Flow_Sum > 7.78945e+08 )
								ret := -0.600000
				if( Raw_Money_Flow > 5.64233e+07 )
					if( Raw_Money_Flow <= 1.43335e+08 )
						if( MFI <= 43.5611 )
							if( Raw_Money_Flow <= 5.87615e+07 )
								ret := -0.187500
							if( Raw_Money_Flow > 5.87615e+07 )
								if( Positive_Money_Flow_Sum <= 6.17868e+08 )
									ret := 0.615970
								if( Positive_Money_Flow_Sum > 6.17868e+08 )
									ret := -0.818182 // sell
						if( MFI > 43.5611 )
							if( Raw_Money_Flow <= 5.94711e+07 )
								if( MFI_Low <= 35.0794 )
									ret := -0.250000
								if( MFI_Low > 35.0794 )
									ret := 0.961538 // buy
							if( Raw_Money_Flow > 5.94711e+07 )
								if( MFI <= 53.0889 )
									ret := -0.250000
								if( MFI > 53.0889 )
									ret := 0.388430
					if( Raw_Money_Flow > 1.43335e+08 )
						if( Typical_Price <= 1.05417 )
							ret := -1.000000 // sell
						if( Typical_Price > 1.05417 )
							ret := 0.181818
	if( MFI > 68.0165 )
		if( Negative_Money_Flow_Sum <= 1.68025e+07 )
			if( MFI_Low <= 76.9128 )
				if( MFI <= 78.9303 )
					if( MFI <= 71.4754 )
						if( Negative_Money_Flow <= 2.84485e+06 )
							if( Positive_Money_Flow_Sum <= 2.27925e+07 )
								if( Raw_Money_Flow <= 4.77858e+06 )
									ret := -0.028274
								if( Raw_Money_Flow > 4.77858e+06 )
									ret := 0.518519
							if( Positive_Money_Flow_Sum > 2.27925e+07 )
								if( MFI_Low <= 48.9383 )
									ret := 0.023121
								if( MFI_Low > 48.9383 )
									ret := -0.246777
						if( Negative_Money_Flow > 2.84485e+06 )
							if( Money_Flow_Ratio <= 2.153 )
								if( Money_Flow_Ratio <= 2.14788 )
									ret := 0.600000
								if( Money_Flow_Ratio > 2.14788 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 2.153 )
								if( Positive_Money_Flow_Sum <= 3.04376e+07 )
									ret := 0.486111
								if( Positive_Money_Flow_Sum > 3.04376e+07 )
									ret := -0.054795
					if( MFI > 71.4754 )
						if( Positive_Money_Flow <= 976272 )
							if( Positive_Money_Flow_Sum <= 3.95763e+07 )
								if( Negative_Money_Flow <= 3.46273e+06 )
									ret := 0.154982
								if( Negative_Money_Flow > 3.46273e+06 )
									ret := 0.550459
							if( Positive_Money_Flow_Sum > 3.95763e+07 )
								if( Positive_Money_Flow_Sum <= 4.80333e+07 )
									ret := -0.366667
								if( Positive_Money_Flow_Sum > 4.80333e+07 )
									ret := 0.338235
						if( Positive_Money_Flow > 976272 )
							if( Typical_Price <= 0.327754 )
								if( Positive_Money_Flow <= 3.54988e+06 )
									ret := -0.171875
								if( Positive_Money_Flow > 3.54988e+06 )
									ret := -0.620000
							if( Typical_Price > 0.327754 )
								if( Positive_Money_Flow <= 2.33841e+06 )
									ret := -0.105079
								if( Positive_Money_Flow > 2.33841e+06 )
									ret := 0.142593
				if( MFI > 78.9303 )
					if( Raw_Money_Flow <= 1.79344e+07 )
						if( Negative_Money_Flow_Sum <= 3.53716e+06 )
							if( Negative_Money_Flow_Sum <= 2.55327e+06 )
								if( Raw_Money_Flow <= 1.60807e+06 )
									ret := 0.143713
								if( Raw_Money_Flow > 1.60807e+06 )
									ret := -0.365854
							if( Negative_Money_Flow_Sum > 2.55327e+06 )
								if( MFI_Low <= 59.8843 )
									ret := 0.692308
								if( MFI_Low > 59.8843 )
									ret := 0.265537
						if( Negative_Money_Flow_Sum > 3.53716e+06 )
							if( MFI_High <= 7.04346 )
								if( Raw_Money_Flow <= 6.37801e+06 )
									ret := -0.165194
								if( Raw_Money_Flow > 6.37801e+06 )
									ret := 0.080997
							if( MFI_High > 7.04346 )
								if( Raw_Money_Flow <= 1.61409e+07 )
									ret := -0.331361
								if( Raw_Money_Flow > 1.61409e+07 )
									ret := -1.000000 // sell
					if( Raw_Money_Flow > 1.79344e+07 )
						if( MFI_Low <= 71.5611 )
							if( Positive_Money_Flow <= 3.41031e+07 )
								if( Positive_Money_Flow_Sum <= 4.46013e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 4.46013e+07 )
									ret := 0.558824
							if( Positive_Money_Flow > 3.41031e+07 )
								if( MFI <= 86.2915 )
									ret := -0.400000
								if( MFI > 86.2915 )
									ret := 0.230769
						if( MFI_Low > 71.5611 )
							if( Typical_Price <= 0.636103 )
								if( MFI_High <= 13.9476 )
									ret := 0.000000
								if( MFI_High > 13.9476 )
									ret := 0.437500
							if( Typical_Price > 0.636103 )
								ret := -0.764706 // sell
			if( MFI_Low > 76.9128 )
				if( Raw_Money_Flow <= 1.26958e+07 )
					ret := 0.500000
				if( Raw_Money_Flow > 1.26958e+07 )
					ret := 1.000000 // buy
		if( Negative_Money_Flow_Sum > 1.68025e+07 )
			if( Negative_Money_Flow_Sum <= 1.00324e+08 )
				if( Positive_Money_Flow <= 7.85312e+06 )
					if( Negative_Money_Flow_Sum <= 8.75066e+07 )
						if( Typical_Price <= 0.309901 )
							if( Raw_Money_Flow <= 4.32182e+06 )
								if( Raw_Money_Flow <= 3.22785e+06 )
									ret := -0.909091 // sell
								if( Raw_Money_Flow > 3.22785e+06 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 4.32182e+06 )
								if( Typical_Price <= 0.233474 )
									ret := 0.100000
								if( Typical_Price > 0.233474 )
									ret := -0.820000 // sell
						if( Typical_Price > 0.309901 )
							if( Positive_Money_Flow <= 5.74571e+06 )
								if( Negative_Money_Flow <= 1.13031e+07 )
									ret := -0.160936
								if( Negative_Money_Flow > 1.13031e+07 )
									ret := 0.079051
							if( Positive_Money_Flow > 5.74571e+06 )
								if( Positive_Money_Flow_Sum <= 7.67996e+07 )
									ret := -0.057143
								if( Positive_Money_Flow_Sum > 7.67996e+07 )
									ret := 0.213166
					if( Negative_Money_Flow_Sum > 8.75066e+07 )
						if( Raw_Money_Flow <= 2.88272e+07 )
							if( Raw_Money_Flow <= 1.61107e+07 )
								ret := -0.227273
							if( Raw_Money_Flow > 1.61107e+07 )
								if( Money_Flow_Ratio <= 2.57252 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 2.57252 )
									ret := -0.538462
						if( Raw_Money_Flow > 2.88272e+07 )
							ret := 0.000000
				if( Positive_Money_Flow > 7.85312e+06 )
					if( Raw_Money_Flow <= 9.63452e+06 )
						if( MFI_Low <= 51.248 )
							if( Positive_Money_Flow_Sum <= 5.85735e+07 )
								ret := 0.181818
							if( Positive_Money_Flow_Sum > 5.85735e+07 )
								if( Negative_Money_Flow_Sum <= 3.50439e+07 )
									ret := -0.946809 // sell
								if( Negative_Money_Flow_Sum > 3.50439e+07 )
									ret := -0.370370
						if( MFI_Low > 51.248 )
							if( MFI <= 74.6907 )
								if( MFI_High <= -5.87993 )
									ret := -0.183673
								if( MFI_High > -5.87993 )
									ret := 0.454545
							if( MFI > 74.6907 )
								if( Negative_Money_Flow_Sum <= 3.15706e+07 )
									ret := -0.618056
								if( Negative_Money_Flow_Sum > 3.15706e+07 )
									ret := -0.093750
					if( Raw_Money_Flow > 9.63452e+06 )
						if( MFI_Low <= 71.7046 )
							if( Typical_Price <= 0.284783 )
								ret := -1.000000 // sell
							if( Typical_Price > 0.284783 )
								if( Positive_Money_Flow <= 1.01143e+08 )
									ret := -0.207042
								if( Positive_Money_Flow > 1.01143e+08 )
									ret := 0.477273
						if( MFI_Low > 71.7046 )
							if( Typical_Price <= 0.581312 )
								ret := -0.363636
							if( Typical_Price > 0.581312 )
								if( Typical_Price <= 0.726496 )
									ret := -0.925926 // sell
								if( Typical_Price > 0.726496 )
									ret := -0.625000
			if( Negative_Money_Flow_Sum > 1.00324e+08 )
				if( Positive_Money_Flow <= 4.90454e+07 )
					if( MFI <= 80.4662 )
						if( Raw_Money_Flow <= 1.20638e+08 )
							if( Positive_Money_Flow_Sum <= 3.97492e+08 )
								if( Negative_Money_Flow_Sum <= 1.01844e+08 )
									ret := 0.650000
								if( Negative_Money_Flow_Sum > 1.01844e+08 )
									ret := 0.025788
							if( Positive_Money_Flow_Sum > 3.97492e+08 )
								if( Money_Flow_Ratio <= 2.98732 )
									ret := 0.527523
								if( Money_Flow_Ratio > 2.98732 )
									ret := 0.090909
						if( Raw_Money_Flow > 1.20638e+08 )
							ret := -0.818182 // sell
					if( MFI > 80.4662 )
						if( Positive_Money_Flow <= 1.74171e+07 )
							ret := -0.250000
						if( Positive_Money_Flow > 1.74171e+07 )
							if( Typical_Price <= 0.797212 )
								ret := -1.000000 // sell
							if( Typical_Price > 0.797212 )
								ret := -0.866667 // sell
				if( Positive_Money_Flow > 4.90454e+07 )
					if( MFI <= 73.2593 )
						if( Negative_Money_Flow_Sum <= 3.33147e+08 )
							if( Money_Flow_Ratio <= 2.32811 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 2.32811 )
								if( Positive_Money_Flow_Sum <= 3.49256e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 3.49256e+08 )
									ret := -0.625000
						if( Negative_Money_Flow_Sum > 3.33147e+08 )
							if( Money_Flow_Ratio <= 2.34583 )
								ret := 0.666667
							if( Money_Flow_Ratio > 2.34583 )
								ret := 0.818182 // buy
					if( MFI > 73.2593 )
						if( Positive_Money_Flow_Sum <= 1.00363e+09 )
							if( Positive_Money_Flow_Sum <= 8.76094e+08 )
								if( Negative_Money_Flow_Sum <= 1.15203e+08 )
									ret := 0.093750
								if( Negative_Money_Flow_Sum > 1.15203e+08 )
									ret := -0.630769
							if( Positive_Money_Flow_Sum > 8.76094e+08 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 1.00363e+09 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_XRPUSDT_30Min_a12c6b4e(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)

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


