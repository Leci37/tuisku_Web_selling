//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: NVDA_30Min_2CM0_8f1702d9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_2CM0_8f1702d9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_8f1702d9(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Negative_Money_Flow <= 9.66276e+07 )
		if( Negative_Money_Flow_Sum <= 3.64462e+09 )
			if( Money_Flow_Ratio <= 164.882 )
				if( Negative_Money_Flow_Sum <= 2.93311e+09 )
					if( ad <= 1259.42 )
						if( MFI <= 45.9119 )
							if( MFI_High <= -35.2613 )
								if( mf <= 0.348206 )
									ret := 0.083570
								if( mf > 0.348206 )
									ret := -0.168050
							if( MFI_High > -35.2613 )
								if( MFI_High <= -35.151 )
									ret := 0.660377
								if( MFI_High > -35.151 )
									ret := 0.194274
						if( MFI > 45.9119 )
							if( MFI_High <= -0.852095 )
								if( Raw_Money_Flow <= 1.58328e+06 )
									ret := 0.053377
								if( Raw_Money_Flow > 1.58328e+06 )
									ret := -0.039243
							if( MFI_High > -0.852095 )
								if( Negative_Money_Flow_Sum <= 5.59987e+07 )
									ret := -0.005570
								if( Negative_Money_Flow_Sum > 5.59987e+07 )
									ret := 0.128922
					if( ad > 1259.42 )
						if( Negative_Money_Flow_Sum <= 2.5375e+09 )
							if( ad_mf <= 2.55764e+07 )
								if( Positive_Money_Flow <= 3.53848e+08 )
									ret := -0.039380
								if( Positive_Money_Flow > 3.53848e+08 )
									ret := 0.031029
							if( ad_mf > 2.55764e+07 )
								if( mf <= 0.2756 )
									ret := 0.111111
								if( mf > 0.2756 )
									ret := -0.833333 // sell
						if( Negative_Money_Flow_Sum > 2.5375e+09 )
							if( Positive_Money_Flow_Sum <= 3.44658e+09 )
								if( Positive_Money_Flow <= 9.69487e+07 )
									ret := 0.365957
								if( Positive_Money_Flow > 9.69487e+07 )
									ret := -0.389535
							if( Positive_Money_Flow_Sum > 3.44658e+09 )
								if( Positive_Money_Flow <= 1.84584e+09 )
									ret := 0.350806
								if( Positive_Money_Flow > 1.84584e+09 )
									ret := 0.773585 // buy
				if( Negative_Money_Flow_Sum > 2.93311e+09 )
					if( Money_Flow_Ratio <= 2.52411 )
						if( Typical_Price <= 277.488 )
							if( ad_mf <= 653957 )
								if( MFI <= 10.7416 )
									ret := -0.622951
								if( MFI > 10.7416 )
									ret := -0.165021
							if( ad_mf > 653957 )
								if( Raw_Money_Flow <= 3.60245e+08 )
									ret := -0.195122
								if( Raw_Money_Flow > 3.60245e+08 )
									ret := -0.776699 // sell
						if( Typical_Price > 277.488 )
							if( ad <= 678884 )
								if( ad_mf <= -1929.5 )
									ret := -0.149091
								if( ad_mf > -1929.5 )
									ret := 0.139410
							if( ad > 678884 )
								if( Raw_Money_Flow <= 6.01813e+08 )
									ret := -0.685714
								if( Raw_Money_Flow > 6.01813e+08 )
									ret := -0.166667
					if( Money_Flow_Ratio > 2.52411 )
						if( Typical_Price <= 253.035 )
							if( MFI_High <= 0.789115 )
								if( Positive_Money_Flow <= 6.37012e+07 )
									ret := -0.727273 // sell
								if( Positive_Money_Flow > 6.37012e+07 )
									ret := -0.250000
							if( MFI_High > 0.789115 )
								ret := 0.315789
						if( Typical_Price > 253.035 )
							if( Positive_Money_Flow <= 5.17711e+07 )
								if( mf <= 0.272931 )
									ret := -0.424242
								if( mf > 0.272931 )
									ret := 0.225806
							if( Positive_Money_Flow > 5.17711e+07 )
								if( Positive_Money_Flow_Sum <= 2.61146e+10 )
									ret := 0.651899
								if( Positive_Money_Flow_Sum > 2.61146e+10 )
									ret := -0.058824
			if( Money_Flow_Ratio > 164.882 )
				if( MFI_Low <= 78.8403 )
					if( Raw_Money_Flow <= 3.96993e+06 )
						ret := 0.076923
					if( Raw_Money_Flow > 3.96993e+06 )
						if( Positive_Money_Flow_Sum <= 2.17947e+09 )
							if( Raw_Money_Flow <= 1.07234e+08 )
								if( Positive_Money_Flow_Sum <= 1.52132e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.52132e+08 )
									ret := 0.629630
							if( Raw_Money_Flow > 1.07234e+08 )
								if( MFI_High <= 17.7956 )
									ret := -0.818182 // sell
								if( MFI_High > 17.7956 )
									ret := 0.750000 // buy
						if( Positive_Money_Flow_Sum > 2.17947e+09 )
							ret := 1.000000 // buy
				if( MFI_Low > 78.8403 )
					if( Money_Flow_Ratio <= 1821.1 )
						if( Negative_Money_Flow_Sum <= 2.48656e+07 )
							if( Negative_Money_Flow <= 190299 )
								if( MFI_Low <= 79.0611 )
									ret := -0.809524 // sell
								if( MFI_Low > 79.0611 )
									ret := 0.100000
							if( Negative_Money_Flow > 190299 )
								if( Positive_Money_Flow_Sum <= 1.30755e+09 )
									ret := 0.657143
								if( Positive_Money_Flow_Sum > 1.30755e+09 )
									ret := 0.048193
						if( Negative_Money_Flow_Sum > 2.48656e+07 )
							if( MFI_High <= 19.3665 )
								if( ad_mf <= 579215 )
									ret := 1.000000 // buy
								if( ad_mf > 579215 )
									ret := 0.777778 // buy
							if( MFI_High > 19.3665 )
								if( Positive_Money_Flow_Sum <= 8.59977e+09 )
									ret := 0.550000
								if( Positive_Money_Flow_Sum > 8.59977e+09 )
									ret := -0.064516
					if( Money_Flow_Ratio > 1821.1 )
						if( MFI_High <= 19.9422 )
							ret := -0.700000 // sell
						if( MFI_High > 19.9422 )
							ret := 0.062500
		if( Negative_Money_Flow_Sum > 3.64462e+09 )
			if( Positive_Money_Flow <= 8.32444e+08 )
				if( Positive_Money_Flow_Sum <= 2.83187e+09 )
					if( Positive_Money_Flow <= 1.26934e+07 )
						if( Raw_Money_Flow <= 5.81988e+06 )
							if( ad_mf <= 3902.15 )
								if( MFI_High <= -79.3858 )
									ret := -0.882353 // sell
								if( MFI_High > -79.3858 )
									ret := -0.210983
							if( ad_mf > 3902.15 )
								if( Negative_Money_Flow <= 16183.7 )
									ret := -0.351351
								if( Negative_Money_Flow > 16183.7 )
									ret := -0.662651
						if( Raw_Money_Flow > 5.81988e+06 )
							if( MFI <= 27.8458 )
								if( Negative_Money_Flow_Sum <= 5.84629e+09 )
									ret := 0.200000
								if( Negative_Money_Flow_Sum > 5.84629e+09 )
									ret := -0.002740
							if( MFI > 27.8458 )
								if( mf <= -0.034607 )
									ret := -0.570093
								if( mf > -0.034607 )
									ret := 0.239437
					if( Positive_Money_Flow > 1.26934e+07 )
						if( ad <= -98.377 )
							if( MFI <= 15.3581 )
								if( MFI_High <= -76.8024 )
									ret := -1.000000 // sell
								if( MFI_High > -76.8024 )
									ret := -0.493506
							if( MFI > 15.3581 )
								if( MFI <= 28.1209 )
									ret := 0.300813
								if( MFI > 28.1209 )
									ret := -0.357143
						if( ad > -98.377 )
							if( MFI_High <= -40.7634 )
								if( Negative_Money_Flow <= 21265.5 )
									ret := 0.201695
								if( Negative_Money_Flow > 21265.5 )
									ret := 0.823529 // buy
							if( MFI_High > -40.7634 )
								ret := -0.692308
				if( Positive_Money_Flow_Sum > 2.83187e+09 )
					if( Negative_Money_Flow_Sum <= 7.77415e+09 )
						if( Typical_Price <= 251.217 )
							if( Positive_Money_Flow_Sum <= 5.12249e+09 )
								if( Positive_Money_Flow <= 5.72673e+07 )
									ret := 0.320000
								if( Positive_Money_Flow > 5.72673e+07 )
									ret := -0.157609
							if( Positive_Money_Flow_Sum > 5.12249e+09 )
								if( MFI_Low <= 59.5654 )
									ret := -0.250000
								if( MFI_Low > 59.5654 )
									ret := 0.592593
						if( Typical_Price > 251.217 )
							if( Positive_Money_Flow_Sum <= 3.56064e+09 )
								if( ad_mf <= 1.25149e+06 )
									ret := 0.377593
								if( ad_mf > 1.25149e+06 )
									ret := 0.777778 // buy
							if( Positive_Money_Flow_Sum > 3.56064e+09 )
								if( Positive_Money_Flow <= 1.94647e+08 )
									ret := 0.079009
								if( Positive_Money_Flow > 1.94647e+08 )
									ret := 0.363322
					if( Negative_Money_Flow_Sum > 7.77415e+09 )
						if( MFI_Low <= 44.7709 )
							if( Positive_Money_Flow_Sum <= 5.3734e+09 )
								if( MFI_Low <= 1.91216 )
									ret := 0.656716
								if( MFI_Low > 1.91216 )
									ret := 0.103448
							if( Positive_Money_Flow_Sum > 5.3734e+09 )
								if( Positive_Money_Flow_Sum <= 1.40127e+10 )
									ret := 0.550706
								if( Positive_Money_Flow_Sum > 1.40127e+10 )
									ret := 0.179487
						if( MFI_Low > 44.7709 )
							if( ad_mf <= 87504.5 )
								if( Positive_Money_Flow_Sum <= 2.02048e+10 )
									ret := 0.142857
								if( Positive_Money_Flow_Sum > 2.02048e+10 )
									ret := 0.000000
							if( ad_mf > 87504.5 )
								if( ad_mf <= 232513 )
									ret := -0.761905 // sell
								if( ad_mf > 232513 )
									ret := -0.266667
			if( Positive_Money_Flow > 8.32444e+08 )
				if( MFI_High <= -27.8576 )
					if( Positive_Money_Flow_Sum <= 3.34819e+09 )
						if( Money_Flow_Ratio <= 0.206552 )
							if( Typical_Price <= 305.907 )
								ret := -0.142857
							if( Typical_Price > 305.907 )
								if( mf <= -0.316233 )
									ret := 0.272727
								if( mf > -0.316233 )
									ret := 0.900000 // buy
						if( Money_Flow_Ratio > 0.206552 )
							if( ad <= 688649 )
								if( MFI_Low <= -0.124106 )
									ret := -0.230769
								if( MFI_Low > -0.124106 )
									ret := -0.872549 // sell
							if( ad > 688649 )
								if( Negative_Money_Flow_Sum <= 9.50897e+09 )
									ret := -0.609524
								if( Negative_Money_Flow_Sum > 9.50897e+09 )
									ret := 0.111111
					if( Positive_Money_Flow_Sum > 3.34819e+09 )
						if( mf <= -0.082543 )
							if( MFI <= 25.2611 )
								if( MFI_Low <= -3.25392 )
									ret := -0.647059
								if( MFI_Low > -3.25392 )
									ret := 0.448980
							if( MFI > 25.2611 )
								if( ad_mf <= -1.83661e+07 )
									ret := 0.583333
								if( ad_mf > -1.83661e+07 )
									ret := -0.172911
						if( mf > -0.082543 )
							if( Money_Flow_Ratio <= 0.738994 )
								if( Positive_Money_Flow_Sum <= 5.87559e+09 )
									ret := 0.248485
								if( Positive_Money_Flow_Sum > 5.87559e+09 )
									ret := -0.296460
							if( Money_Flow_Ratio > 0.738994 )
								if( ad <= 1.76035e+06 )
									ret := -0.618357
								if( ad > 1.76035e+06 )
									ret := -0.202312
				if( MFI_High > -27.8576 )
					if( mf <= 0.086327 )
						if( MFI <= 60.2513 )
							if( Raw_Money_Flow <= 1.25523e+09 )
								if( Positive_Money_Flow_Sum <= 9.00269e+09 )
									ret := 0.278689
								if( Positive_Money_Flow_Sum > 9.00269e+09 )
									ret := -0.400000
							if( Raw_Money_Flow > 1.25523e+09 )
								if( Negative_Money_Flow_Sum <= 1.29158e+10 )
									ret := 0.232143
								if( Negative_Money_Flow_Sum > 1.29158e+10 )
									ret := -0.794872 // sell
						if( MFI > 60.2513 )
							if( Money_Flow_Ratio <= 1.85858 )
								if( Positive_Money_Flow_Sum <= 1.31761e+10 )
									ret := -0.857143 // sell
								if( Positive_Money_Flow_Sum > 1.31761e+10 )
									ret := -0.100000
							if( Money_Flow_Ratio > 1.85858 )
								if( Money_Flow_Ratio <= 2.50088 )
									ret := 0.181818
								if( Money_Flow_Ratio > 2.50088 )
									ret := -0.366667
					if( mf > 0.086327 )
						if( Positive_Money_Flow_Sum <= 3.30153e+10 )
							if( Positive_Money_Flow <= 1.19137e+09 )
								if( Raw_Money_Flow <= 9.99124e+08 )
									ret := 0.720430 // buy
								if( Raw_Money_Flow > 9.99124e+08 )
									ret := 0.486842
							if( Positive_Money_Flow > 1.19137e+09 )
								if( Positive_Money_Flow_Sum <= 9.51827e+09 )
									ret := 0.666667
								if( Positive_Money_Flow_Sum > 9.51827e+09 )
									ret := 0.155668
						if( Positive_Money_Flow_Sum > 3.30153e+10 )
							if( Money_Flow_Ratio <= 9.25194 )
								if( Money_Flow_Ratio <= 7.94276 )
									ret := 0.904762 // buy
								if( Money_Flow_Ratio > 7.94276 )
									ret := 0.533333
							if( Money_Flow_Ratio > 9.25194 )
								ret := 1.000000 // buy
	if( Negative_Money_Flow > 9.66276e+07 )
		if( mf <= 0.243121 )
			if( Positive_Money_Flow_Sum <= 4.90879e+08 )
				if( Raw_Money_Flow <= 6.34601e+08 )
					if( Positive_Money_Flow_Sum <= 1.46451e+07 )
						if( mf <= -0.164526 )
							if( Raw_Money_Flow <= 1.29524e+08 )
								if( ad <= -63434.2 )
									ret := -0.890909 // sell
								if( ad > -63434.2 )
									ret := -0.428571
							if( Raw_Money_Flow > 1.29524e+08 )
								if( Raw_Money_Flow <= 2.66084e+08 )
									ret := 0.045226
								if( Raw_Money_Flow > 2.66084e+08 )
									ret := -0.276873
						if( mf > -0.164526 )
							if( mf <= 0.167708 )
								if( Raw_Money_Flow <= 3.29584e+08 )
									ret := -0.083636
								if( Raw_Money_Flow > 3.29584e+08 )
									ret := 0.271429
							if( mf > 0.167708 )
								if( MFI_High <= -78.8179 )
									ret := 0.100000
								if( MFI_High > -78.8179 )
									ret := 0.558140
					if( Positive_Money_Flow_Sum > 1.46451e+07 )
						if( MFI <= 21.2081 )
							if( mf <= -0.160367 )
								if( Positive_Money_Flow_Sum <= 2.38014e+08 )
									ret := 0.053706
								if( Positive_Money_Flow_Sum > 2.38014e+08 )
									ret := 0.419142
							if( mf > -0.160367 )
								if( MFI_High <= -69.6055 )
									ret := 0.285326
								if( MFI_High > -69.6055 )
									ret := 0.527132
						if( MFI > 21.2081 )
							if( Positive_Money_Flow_Sum <= 1.61674e+08 )
								if( Negative_Money_Flow_Sum <= 1.50795e+08 )
									ret := 0.157895
								if( Negative_Money_Flow_Sum > 1.50795e+08 )
									ret := -0.772727 // sell
							if( Positive_Money_Flow_Sum > 1.61674e+08 )
								if( Raw_Money_Flow <= 1.17157e+08 )
									ret := -0.368932
								if( Raw_Money_Flow > 1.17157e+08 )
									ret := 0.038335
				if( Raw_Money_Flow > 6.34601e+08 )
					if( Raw_Money_Flow <= 4.93815e+09 )
						if( mf <= -0.167305 )
							if( MFI_Low <= -11.6928 )
								if( MFI_High <= -79.169 )
									ret := 0.226190
								if( MFI_High > -79.169 )
									ret := -0.329412
							if( MFI_Low > -11.6928 )
								if( Typical_Price <= 415.495 )
									ret := 0.130435
								if( Typical_Price > 415.495 )
									ret := 0.812500 // buy
						if( mf > -0.167305 )
							if( Positive_Money_Flow_Sum <= 6.76393e+07 )
								if( Raw_Money_Flow <= 1.47366e+09 )
									ret := -0.128514
								if( Raw_Money_Flow > 1.47366e+09 )
									ret := -0.750000 // sell
							if( Positive_Money_Flow_Sum > 6.76393e+07 )
								if( Positive_Money_Flow_Sum <= 1.15884e+08 )
									ret := 0.495652
								if( Positive_Money_Flow_Sum > 1.15884e+08 )
									ret := 0.100671
					if( Raw_Money_Flow > 4.93815e+09 )
						if( Raw_Money_Flow <= 5.02234e+09 )
							ret := 1.000000 // buy
						if( Raw_Money_Flow > 5.02234e+09 )
							if( Typical_Price <= 598.683 )
								ret := 0.285714
							if( Typical_Price > 598.683 )
								ret := 0.750000 // buy
			if( Positive_Money_Flow_Sum > 4.90879e+08 )
				if( Money_Flow_Ratio <= 0.434936 )
					if( MFI_High <= -65.4167 )
						if( Positive_Money_Flow_Sum <= 6.17086e+08 )
							if( ad_mf <= 1.3667e+06 )
								if( ad <= 311851 )
									ret := -0.638889
								if( ad > 311851 )
									ret := 0.222222
							if( ad_mf > 1.3667e+06 )
								if( Money_Flow_Ratio <= 0.062371 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.062371 )
									ret := -0.777778 // sell
						if( Positive_Money_Flow_Sum > 6.17086e+08 )
							if( ad_mf <= -4.29461e+07 )
								ret := -1.000000 // sell
							if( ad_mf > -4.29461e+07 )
								if( mf <= -0.031513 )
									ret := 0.075000
								if( mf > -0.031513 )
									ret := -0.469388
					if( MFI_High > -65.4167 )
						if( Raw_Money_Flow <= 7.37389e+09 )
							if( Typical_Price <= 902.16 )
								if( ad <= 4.25896e+06 )
									ret := -0.314625
								if( ad > 4.25896e+06 )
									ret := -0.769231 // sell
							if( Typical_Price > 902.16 )
								if( Raw_Money_Flow <= 3.31763e+09 )
									ret := 0.517857
								if( Raw_Money_Flow > 3.31763e+09 )
									ret := -0.615385
						if( Raw_Money_Flow > 7.37389e+09 )
							ret := 1.000000 // buy
				if( Money_Flow_Ratio > 0.434936 )
					if( MFI_High <= -16.9605 )
						if( Negative_Money_Flow_Sum <= 2.36829e+10 )
							if( mf <= -0.462799 )
								if( MFI <= 43.1696 )
									ret := -0.125000
								if( MFI > 43.1696 )
									ret := 0.821429 // buy
							if( mf > -0.462799 )
								if( MFI_High <= -21.3146 )
									ret := -0.049949
								if( MFI_High > -21.3146 )
									ret := -0.350503
						if( Negative_Money_Flow_Sum > 2.36829e+10 )
							if( Typical_Price <= 325.128 )
								ret := 0.000000
							if( Typical_Price > 325.128 )
								if( Positive_Money_Flow <= 3.51223e+08 )
									ret := -0.611111
								if( Positive_Money_Flow > 3.51223e+08 )
									ret := -1.000000 // sell
					if( MFI_High > -16.9605 )
						if( MFI_High <= -12.9983 )
							if( ad <= 1.33193e+06 )
								if( Raw_Money_Flow <= 2.17012e+08 )
									ret := -0.163043
								if( Raw_Money_Flow > 2.17012e+08 )
									ret := 0.270142
							if( ad > 1.33193e+06 )
								if( Positive_Money_Flow_Sum <= 1.87586e+09 )
									ret := 0.933333 // buy
								if( Positive_Money_Flow_Sum > 1.87586e+09 )
									ret := 1.000000 // buy
						if( MFI_High > -12.9983 )
							if( Positive_Money_Flow_Sum <= 1.40785e+09 )
								if( Negative_Money_Flow <= 1.31738e+08 )
									ret := -0.009009
								if( Negative_Money_Flow > 1.31738e+08 )
									ret := -0.357595
							if( Positive_Money_Flow_Sum > 1.40785e+09 )
								if( Negative_Money_Flow_Sum <= 1.0915e+09 )
									ret := 0.220421
								if( Negative_Money_Flow_Sum > 1.0915e+09 )
									ret := -0.070552
		if( mf > 0.243121 )
			if( Negative_Money_Flow <= 5.92933e+08 )
				if( Negative_Money_Flow_Sum <= 4.53999e+08 )
					if( MFI_High <= -2.69877 )
						if( Raw_Money_Flow <= 1.77277e+08 )
							if( mf <= 0.252569 )
								ret := 0.545455
							if( mf > 0.252569 )
								if( MFI_High <= -49.08 )
									ret := -0.588235
								if( MFI_High > -49.08 )
									ret := -0.165289
						if( Raw_Money_Flow > 1.77277e+08 )
							if( MFI_Low <= 47.9975 )
								if( Negative_Money_Flow_Sum <= 2.35229e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 2.35229e+08 )
									ret := 0.583333
							if( MFI_Low > 47.9975 )
								if( Raw_Money_Flow <= 1.96078e+08 )
									ret := 0.000000
								if( Raw_Money_Flow > 1.96078e+08 )
									ret := -0.758621 // sell
					if( MFI_High > -2.69877 )
						if( MFI_High <= 2.16194 )
							if( ad_mf <= -306928 )
								if( MFI <= 80.4104 )
									ret := 0.857143 // buy
								if( MFI > 80.4104 )
									ret := 1.000000 // buy
							if( ad_mf > -306928 )
								if( Negative_Money_Flow <= 2.63884e+08 )
									ret := 0.354839
								if( Negative_Money_Flow > 2.63884e+08 )
									ret := 1.000000 // buy
						if( MFI_High > 2.16194 )
							if( Negative_Money_Flow_Sum <= 1.87378e+08 )
								if( Typical_Price <= 148.466 )
									ret := 0.380952
								if( Typical_Price > 148.466 )
									ret := -0.631579
							if( Negative_Money_Flow_Sum > 1.87378e+08 )
								if( ad <= -91153.5 )
									ret := 0.190000
								if( ad > -91153.5 )
									ret := 0.580247
				if( Negative_Money_Flow_Sum > 4.53999e+08 )
					if( Typical_Price <= 511.094 )
						if( Negative_Money_Flow_Sum <= 1.22509e+09 )
							if( Positive_Money_Flow_Sum <= 3.48222e+09 )
								if( Money_Flow_Ratio <= 2.37347 )
									ret := -0.397222
								if( Money_Flow_Ratio > 2.37347 )
									ret := 0.145000
							if( Positive_Money_Flow_Sum > 3.48222e+09 )
								if( Positive_Money_Flow_Sum <= 5.47397e+09 )
									ret := -0.794393 // sell
								if( Positive_Money_Flow_Sum > 5.47397e+09 )
									ret := -0.181818
						if( Negative_Money_Flow_Sum > 1.22509e+09 )
							if( Money_Flow_Ratio <= 8.66848 )
								if( mf <= 0.404242 )
									ret := -0.018987
								if( mf > 0.404242 )
									ret := 0.619048
							if( Money_Flow_Ratio > 8.66848 )
								ret := -0.875000 // sell
					if( Typical_Price > 511.094 )
						if( ad_mf <= -57852.4 )
							if( Typical_Price <= 902.933 )
								if( MFI_High <= -35.9767 )
									ret := 0.772727 // buy
								if( MFI_High > -35.9767 )
									ret := 0.012346
							if( Typical_Price > 902.933 )
								ret := -0.588235
						if( ad_mf > -57852.4 )
							if( MFI_Low <= 55.8595 )
								if( Money_Flow_Ratio <= 1.95213 )
									ret := 0.351852
								if( Money_Flow_Ratio > 1.95213 )
									ret := 0.787879 // buy
							if( MFI_Low > 55.8595 )
								if( MFI <= 79.9912 )
									ret := -0.600000
								if( MFI > 79.9912 )
									ret := 0.470588
			if( Negative_Money_Flow > 5.92933e+08 )
				if( Negative_Money_Flow_Sum <= 2.38421e+09 )
					if( MFI <= 89.5925 )
						if( ad_mf <= 995490 )
							if( Positive_Money_Flow_Sum <= 1.84982e+09 )
								if( MFI <= 3.85295 )
									ret := 0.965517 // buy
								if( MFI > 3.85295 )
									ret := 0.772727 // buy
							if( Positive_Money_Flow_Sum > 1.84982e+09 )
								if( Negative_Money_Flow <= 6.68744e+08 )
									ret := 0.074074
								if( Negative_Money_Flow > 6.68744e+08 )
									ret := 0.590000
						if( ad_mf > 995490 )
							if( Raw_Money_Flow <= 1.79136e+09 )
								if( Money_Flow_Ratio <= 0.026529 )
									ret := -0.625000
								if( Money_Flow_Ratio > 0.026529 )
									ret := 0.258621
							if( Raw_Money_Flow > 1.79136e+09 )
								ret := 0.928571 // buy
					if( MFI > 89.5925 )
						ret := -0.071429
				if( Negative_Money_Flow_Sum > 2.38421e+09 )
					if( MFI <= 17.7925 )
						if( Negative_Money_Flow <= 7.84195e+09 )
							if( Typical_Price <= 416.363 )
								ret := -0.588235
							if( Typical_Price > 416.363 )
								ret := 0.333333
						if( Negative_Money_Flow > 7.84195e+09 )
							ret := -0.826087 // sell
					if( MFI > 17.7925 )
						if( Negative_Money_Flow_Sum <= 8.45366e+09 )
							if( Typical_Price <= 457.102 )
								if( ad_mf <= -5.02309e+06 )
									ret := -0.615385
								if( ad_mf > -5.02309e+06 )
									ret := 0.331551
							if( Typical_Price > 457.102 )
								if( ad_mf <= 42404.8 )
									ret := -0.253521
								if( ad_mf > 42404.8 )
									ret := 0.031250
						if( Negative_Money_Flow_Sum > 8.45366e+09 )
							if( mf <= 0.327039 )
								if( Money_Flow_Ratio <= 0.867968 )
									ret := -0.555556
								if( Money_Flow_Ratio > 0.867968 )
									ret := 0.421053
							if( mf > 0.327039 )
								if( MFI_High <= -11.0723 )
									ret := 0.878788 // buy
								if( MFI_High > -11.0723 )
									ret := 0.454545
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_NVDA_30Min_8f1702d9(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


