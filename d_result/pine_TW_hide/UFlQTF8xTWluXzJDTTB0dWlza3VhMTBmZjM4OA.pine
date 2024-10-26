//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: PYPL_1Min_2CM0_a10ff388 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_2CM0_a10ff388", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_a10ff388(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 6.22468 )
		if( Negative_Money_Flow_Sum <= 1.20502e+06 )
			if( ad_mf <= 0.194908 )
				if( Positive_Money_Flow_Sum <= 209908 )
					if( Typical_Price <= 62.6235 )
						if( MFI_Low <= 5.57423 )
							if( Raw_Money_Flow <= 45909.5 )
								if( Positive_Money_Flow_Sum <= 127959 )
									ret := -0.283333
								if( Positive_Money_Flow_Sum > 127959 )
									ret := -0.743590 // sell
							if( Raw_Money_Flow > 45909.5 )
								if( Negative_Money_Flow_Sum <= 673179 )
									ret := 0.076923
								if( Negative_Money_Flow_Sum > 673179 )
									ret := 0.750000 // buy
						if( MFI_Low > 5.57423 )
							if( Positive_Money_Flow_Sum <= 122677 )
								if( Positive_Money_Flow_Sum <= 102209 )
									ret := 0.175439
								if( Positive_Money_Flow_Sum > 102209 )
									ret := -0.350515
							if( Positive_Money_Flow_Sum > 122677 )
								if( Positive_Money_Flow_Sum <= 144978 )
									ret := 0.352459
								if( Positive_Money_Flow_Sum > 144978 )
									ret := 0.009132
					if( Typical_Price > 62.6235 )
						if( ad_mf <= -0.140295 )
							if( Raw_Money_Flow <= 72722.9 )
								if( ad_mf <= -347.985 )
									ret := -0.437500
								if( ad_mf > -347.985 )
									ret := 0.033333
							if( Raw_Money_Flow > 72722.9 )
								if( MFI_High <= -50.9149 )
									ret := 0.000000
								if( MFI_High > -50.9149 )
									ret := 0.736842 // buy
						if( ad_mf > -0.140295 )
							if( Positive_Money_Flow_Sum <= 140943 )
								if( Positive_Money_Flow <= 17351.4 )
									ret := 0.283217
								if( Positive_Money_Flow > 17351.4 )
									ret := -0.174419
							if( Positive_Money_Flow_Sum > 140943 )
								if( Negative_Money_Flow_Sum <= 83329.9 )
									ret := 0.058824
								if( Negative_Money_Flow_Sum > 83329.9 )
									ret := 0.383387
				if( Positive_Money_Flow_Sum > 209908 )
					if( Raw_Money_Flow <= 16228.9 )
						if( ad_mf <= -0.108688 )
							if( mf <= 0.551375 )
								if( Typical_Price <= 63.1512 )
									ret := -0.293103
								if( Typical_Price > 63.1512 )
									ret := 0.070111
							if( mf > 0.551375 )
								if( Positive_Money_Flow_Sum <= 1.80012e+06 )
									ret := -0.611111
								if( Positive_Money_Flow_Sum > 1.80012e+06 )
									ret := 0.222222
						if( ad_mf > -0.108688 )
							if( Raw_Money_Flow <= 7741 )
								if( Typical_Price <= 63.525 )
									ret := -0.017857
								if( Typical_Price > 63.525 )
									ret := -0.307692
							if( Raw_Money_Flow > 7741 )
								if( Typical_Price <= 60.4007 )
									ret := -0.142857
								if( Typical_Price > 60.4007 )
									ret := -0.431755
					if( Raw_Money_Flow > 16228.9 )
						if( Negative_Money_Flow_Sum <= 66384.2 )
							if( MFI_Low <= 62.6269 )
								if( mf <= 0.106372 )
									ret := -0.250000
								if( mf > 0.106372 )
									ret := -0.800000 // sell
							if( MFI_Low > 62.6269 )
								if( Typical_Price <= 73.8696 )
									ret := 0.542056
								if( Typical_Price > 73.8696 )
									ret := -0.400000
						if( Negative_Money_Flow_Sum > 66384.2 )
							if( ad <= -695.922 )
								if( Negative_Money_Flow_Sum <= 234824 )
									ret := 0.378378
								if( Negative_Money_Flow_Sum > 234824 )
									ret := 0.049020
							if( ad > -695.922 )
								if( MFI_Low <= 40.3565 )
									ret := 0.047764
								if( MFI_Low > 40.3565 )
									ret := -0.151182
			if( ad_mf > 0.194908 )
				if( MFI_High <= -34.0875 )
					if( mf <= -0.187365 )
						if( Positive_Money_Flow <= 79.5034 )
							if( Positive_Money_Flow_Sum <= 355568 )
								if( Typical_Price <= 62.6344 )
									ret := 0.000000
								if( Typical_Price > 62.6344 )
									ret := 0.349398
							if( Positive_Money_Flow_Sum > 355568 )
								if( MFI_High <= -45.0541 )
									ret := -0.250000
								if( MFI_High > -45.0541 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow > 79.5034 )
							if( Typical_Price <= 59.0417 )
								if( MFI_High <= -53.8932 )
									ret := -0.391304
								if( MFI_High > -53.8932 )
									ret := 0.326087
							if( Typical_Price > 59.0417 )
								if( ad_mf <= 1385 )
									ret := -0.237258
								if( ad_mf > 1385 )
									ret := 0.300000
					if( mf > -0.187365 )
						if( Raw_Money_Flow <= 150664 )
							if( Positive_Money_Flow_Sum <= 268474 )
								if( Negative_Money_Flow_Sum <= 270698 )
									ret := 0.435484
								if( Negative_Money_Flow_Sum > 270698 )
									ret := -0.194030
							if( Positive_Money_Flow_Sum > 268474 )
								if( MFI_High <= -51.0061 )
									ret := 0.888889 // buy
								if( MFI_High > -51.0061 )
									ret := 0.204724
						if( Raw_Money_Flow > 150664 )
							if( Positive_Money_Flow <= 216351 )
								if( mf <= -0.084466 )
									ret := 0.250000
								if( mf > -0.084466 )
									ret := -0.800000 // sell
							if( Positive_Money_Flow > 216351 )
								if( Raw_Money_Flow <= 331942 )
									ret := 0.000000
								if( Raw_Money_Flow > 331942 )
									ret := 0.800000 // buy
				if( MFI_High > -34.0875 )
					if( mf <= 0.655224 )
						if( ad <= 117836 )
							if( Raw_Money_Flow <= 248670 )
								if( Negative_Money_Flow_Sum <= 233419 )
									ret := -0.176402
								if( Negative_Money_Flow_Sum > 233419 )
									ret := -0.296788
							if( Raw_Money_Flow > 248670 )
								if( MFI_High <= 15.6222 )
									ret := -0.011710
								if( MFI_High > 15.6222 )
									ret := -0.397959
						if( ad > 117836 )
							if( ad_mf <= 155883 )
								ret := 1.000000 // buy
							if( ad_mf > 155883 )
								if( Typical_Price <= 65.3696 )
									ret := 0.888889 // buy
								if( Typical_Price > 65.3696 )
									ret := -0.666667
					if( mf > 0.655224 )
						if( Positive_Money_Flow <= 64906.5 )
							if( Typical_Price <= 71.0503 )
								if( Raw_Money_Flow <= 31845 )
									ret := -0.250000
								if( Raw_Money_Flow > 31845 )
									ret := 0.000000
							if( Typical_Price > 71.0503 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow > 64906.5 )
							if( Positive_Money_Flow <= 1.19454e+07 )
								if( ad <= 41355.8 )
									ret := -0.666667
								if( ad > 41355.8 )
									ret := 0.047619
							if( Positive_Money_Flow > 1.19454e+07 )
								if( ad <= 369924 )
									ret := -1.000000 // sell
								if( ad > 369924 )
									ret := -0.750000 // sell
		if( Negative_Money_Flow_Sum > 1.20502e+06 )
			if( Positive_Money_Flow <= 3.10467e+07 )
				if( Negative_Money_Flow_Sum <= 7.65407e+07 )
					if( Negative_Money_Flow_Sum <= 2.09215e+06 )
						if( MFI_High <= -67.8605 )
							if( Raw_Money_Flow <= 35297.9 )
								if( Negative_Money_Flow_Sum <= 1.95013e+06 )
									ret := -0.810811 // sell
								if( Negative_Money_Flow_Sum > 1.95013e+06 )
									ret := 0.166667
							if( Raw_Money_Flow > 35297.9 )
								if( Positive_Money_Flow_Sum <= 172810 )
									ret := 0.666667
								if( Positive_Money_Flow_Sum > 172810 )
									ret := -0.166667
						if( MFI_High > -67.8605 )
							if( ad <= 1615.62 )
								if( Negative_Money_Flow_Sum <= 1.22968e+06 )
									ret := 0.533333
								if( Negative_Money_Flow_Sum > 1.22968e+06 )
									ret := 0.057621
							if( ad > 1615.62 )
								if( Positive_Money_Flow_Sum <= 1.31365e+07 )
									ret := 0.333333
								if( Positive_Money_Flow_Sum > 1.31365e+07 )
									ret := -0.014925
					if( Negative_Money_Flow_Sum > 2.09215e+06 )
						if( Positive_Money_Flow_Sum <= 485727 )
							if( ad <= -295.2 )
								if( Money_Flow_Ratio <= 0.07122 )
									ret := 0.625000
								if( Money_Flow_Ratio > 0.07122 )
									ret := 0.125000
							if( ad > -295.2 )
								if( Typical_Price <= 64.475 )
									ret := -0.108696
								if( Typical_Price > 64.475 )
									ret := -0.438776
						if( Positive_Money_Flow_Sum > 485727 )
							if( Negative_Money_Flow_Sum <= 4.45119e+07 )
								if( Negative_Money_Flow_Sum <= 3.91119e+07 )
									ret := 0.018233
								if( Negative_Money_Flow_Sum > 3.91119e+07 )
									ret := -0.464286
							if( Negative_Money_Flow_Sum > 4.45119e+07 )
								if( Negative_Money_Flow_Sum <= 5.11856e+07 )
									ret := 0.520231
								if( Negative_Money_Flow_Sum > 5.11856e+07 )
									ret := -0.003861
				if( Negative_Money_Flow_Sum > 7.65407e+07 )
					if( MFI <= 26.7378 )
						if( Raw_Money_Flow <= 257481 )
							if( MFI_High <= -59.2226 )
								if( ad_mf <= 700.052 )
									ret := 0.000000
								if( ad_mf > 700.052 )
									ret := -0.416667
							if( MFI_High > -59.2226 )
								if( Typical_Price <= 67.4296 )
									ret := -0.214286
								if( Typical_Price > 67.4296 )
									ret := -0.764706 // sell
						if( Raw_Money_Flow > 257481 )
							if( Negative_Money_Flow_Sum <= 9.02681e+07 )
								if( Positive_Money_Flow <= 6.57235e+06 )
									ret := -0.916667 // sell
								if( Positive_Money_Flow > 6.57235e+06 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 9.02681e+07 )
								if( Raw_Money_Flow <= 1.03905e+06 )
									ret := -0.558140
								if( Raw_Money_Flow > 1.03905e+06 )
									ret := -0.103448
					if( MFI > 26.7378 )
						if( MFI_High <= -38.9212 )
							if( ad_mf <= -197.308 )
								if( Positive_Money_Flow_Sum <= 4.69256e+07 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 4.69256e+07 )
									ret := 1.000000 // buy
							if( ad_mf > -197.308 )
								if( Negative_Money_Flow_Sum <= 1.08039e+08 )
									ret := 0.281250
								if( Negative_Money_Flow_Sum > 1.08039e+08 )
									ret := -0.192308
						if( MFI_High > -38.9212 )
							if( Negative_Money_Flow_Sum <= 9.8899e+07 )
								if( MFI_High <= -35.9499 )
									ret := -0.500000
								if( MFI_High > -35.9499 )
									ret := 0.200000
							if( Negative_Money_Flow_Sum > 9.8899e+07 )
								if( MFI <= 57.3402 )
									ret := -0.875000 // sell
								if( MFI > 57.3402 )
									ret := -0.333333
			if( Positive_Money_Flow > 3.10467e+07 )
				if( Positive_Money_Flow_Sum <= 1.40165e+08 )
					if( Typical_Price <= 69.2845 )
						if( MFI_Low <= 54.897 )
							if( mf <= -0.288557 )
								ret := -0.800000 // sell
							if( mf > -0.288557 )
								if( Positive_Money_Flow_Sum <= 8.94491e+07 )
									ret := -0.100000
								if( Positive_Money_Flow_Sum > 8.94491e+07 )
									ret := 0.333333
						if( MFI_Low > 54.897 )
							if( ad <= 91582.8 )
								if( Positive_Money_Flow <= 6.26785e+07 )
									ret := 0.500000
								if( Positive_Money_Flow > 6.26785e+07 )
									ret := -0.733333 // sell
							if( ad > 91582.8 )
								if( Positive_Money_Flow <= 8.53062e+07 )
									ret := -0.960000 // sell
								if( Positive_Money_Flow > 8.53062e+07 )
									ret := 0.000000
					if( Typical_Price > 69.2845 )
						if( Typical_Price <= 76.4045 )
							ret := -1.000000 // sell
						if( Typical_Price > 76.4045 )
							if( Raw_Money_Flow <= 4.24011e+07 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 4.24011e+07 )
								ret := -0.333333
				if( Positive_Money_Flow_Sum > 1.40165e+08 )
					if( Typical_Price <= 64.315 )
						if( Negative_Money_Flow_Sum <= 2.50613e+07 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 2.50613e+07 )
							ret := 0.500000
					if( Typical_Price > 64.315 )
						if( Typical_Price <= 68.6617 )
							ret := -0.750000 // sell
						if( Typical_Price > 68.6617 )
							ret := 0.000000
	if( Negative_Money_Flow > 6.22468 )
		if( Negative_Money_Flow <= 143118 )
			if( ad_mf <= -19.7849 )
				if( Money_Flow_Ratio <= 4.27496 )
					if( Typical_Price <= 77.3083 )
						if( mf <= 0.469429 )
							if( Money_Flow_Ratio <= 0.188206 )
								if( mf <= -0.66429 )
									ret := -0.200000
								if( mf > -0.66429 )
									ret := 0.601896
							if( Money_Flow_Ratio > 0.188206 )
								if( Positive_Money_Flow_Sum <= 2.1252e+07 )
									ret := 0.362440
								if( Positive_Money_Flow_Sum > 2.1252e+07 )
									ret := -0.013514
						if( mf > 0.469429 )
							if( Typical_Price <= 72.2788 )
								if( Typical_Price <= 64.5483 )
									ret := 0.333333
								if( Typical_Price > 64.5483 )
									ret := -0.500000
							if( Typical_Price > 72.2788 )
								ret := 1.000000 // buy
					if( Typical_Price > 77.3083 )
						if( Raw_Money_Flow <= 66039.3 )
							if( Negative_Money_Flow <= 24403.2 )
								if( Raw_Money_Flow <= 22348.1 )
									ret := -0.200000
								if( Raw_Money_Flow > 22348.1 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow > 24403.2 )
								if( Negative_Money_Flow <= 47788.6 )
									ret := 0.100000
								if( Negative_Money_Flow > 47788.6 )
									ret := -0.583333
						if( Raw_Money_Flow > 66039.3 )
							if( Negative_Money_Flow <= 70101.8 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 70101.8 )
								if( Positive_Money_Flow_Sum <= 254081 )
									ret := 0.400000
								if( Positive_Money_Flow_Sum > 254081 )
									ret := -0.148148
				if( Money_Flow_Ratio > 4.27496 )
					if( ad_mf <= -250.182 )
						if( Positive_Money_Flow_Sum <= 8.44719e+07 )
							if( Raw_Money_Flow <= 198476 )
								if( Negative_Money_Flow_Sum <= 225266 )
									ret := 0.142857
								if( Negative_Money_Flow_Sum > 225266 )
									ret := 0.555556
							if( Raw_Money_Flow > 198476 )
								ret := -0.714286 // sell
						if( Positive_Money_Flow_Sum > 8.44719e+07 )
							if( Money_Flow_Ratio <= 5.92392 )
								ret := 0.200000
							if( Money_Flow_Ratio > 5.92392 )
								if( Typical_Price <= 58.994 )
									ret := 0.500000
								if( Typical_Price > 58.994 )
									ret := 0.941176 // buy
					if( ad_mf > -250.182 )
						ret := 1.000000 // buy
			if( ad_mf > -19.7849 )
				if( ad <= 12.4963 )
					if( Positive_Money_Flow_Sum <= 394640 )
						if( Negative_Money_Flow <= 43873.4 )
							if( Typical_Price <= 63.3186 )
								if( Typical_Price <= 61.855 )
									ret := 0.289941
								if( Typical_Price > 61.855 )
									ret := 0.546053
							if( Typical_Price > 63.3186 )
								if( Positive_Money_Flow_Sum <= 158504 )
									ret := 0.374016
								if( Positive_Money_Flow_Sum > 158504 )
									ret := 0.170792
						if( Negative_Money_Flow > 43873.4 )
							if( Negative_Money_Flow_Sum <= 846086 )
								if( Money_Flow_Ratio <= 0.841227 )
									ret := -0.069930
								if( Money_Flow_Ratio > 0.841227 )
									ret := 0.223140
							if( Negative_Money_Flow_Sum > 846086 )
								if( MFI_Low <= -4.50421 )
									ret := 0.000000
								if( MFI_Low > -4.50421 )
									ret := 0.781250 // buy
					if( Positive_Money_Flow_Sum > 394640 )
						if( Typical_Price <= 61.5568 )
							if( Positive_Money_Flow <= 1458.32 )
								if( Raw_Money_Flow <= 25599.6 )
									ret := -0.068807
								if( Raw_Money_Flow > 25599.6 )
									ret := 0.177778
							if( Positive_Money_Flow > 1458.32 )
								if( MFI_Low <= 54.0724 )
									ret := -0.672727
								if( MFI_Low > 54.0724 )
									ret := 0.285714
						if( Typical_Price > 61.5568 )
							if( MFI <= 93.9055 )
								if( ad_mf <= -0.366933 )
									ret := 0.011811
								if( ad_mf > -0.366933 )
									ret := 0.195771
							if( MFI > 93.9055 )
								if( Typical_Price <= 64.2718 )
									ret := -0.111111
								if( Typical_Price > 64.2718 )
									ret := 0.476190
				if( ad > 12.4963 )
					if( Money_Flow_Ratio <= 0.648384 )
						if( mf <= -0.104422 )
							if( Positive_Money_Flow_Sum <= 195218 )
								if( Typical_Price <= 63.7303 )
									ret := 0.150000
								if( Typical_Price > 63.7303 )
									ret := -0.688889
							if( Positive_Money_Flow_Sum > 195218 )
								if( Typical_Price <= 59.7852 )
									ret := -0.555556
								if( Typical_Price > 59.7852 )
									ret := 0.346154
						if( mf > -0.104422 )
							if( Typical_Price <= 67.7237 )
								if( Money_Flow_Ratio <= 0.624911 )
									ret := 0.520930
								if( Money_Flow_Ratio > 0.624911 )
									ret := -0.333333
							if( Typical_Price > 67.7237 )
								if( MFI_High <= -63.527 )
									ret := -1.000000 // sell
								if( MFI_High > -63.527 )
									ret := 0.132075
					if( Money_Flow_Ratio > 0.648384 )
						if( MFI <= 92.9431 )
							if( Positive_Money_Flow_Sum <= 1.25687e+08 )
								if( Positive_Money_Flow_Sum <= 9.45271e+07 )
									ret := -0.139726
								if( Positive_Money_Flow_Sum > 9.45271e+07 )
									ret := 0.714286 // buy
							if( Positive_Money_Flow_Sum > 1.25687e+08 )
								if( ad_mf <= 819.519 )
									ret := -0.800000 // sell
								if( ad_mf > 819.519 )
									ret := -1.000000 // sell
						if( MFI > 92.9431 )
							if( mf <= -0.172121 )
								ret := -1.000000 // sell
							if( mf > -0.172121 )
								if( Negative_Money_Flow_Sum <= 140873 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 140873 )
									ret := 0.745098 // buy
		if( Negative_Money_Flow > 143118 )
			if( MFI <= 34.457 )
				if( Money_Flow_Ratio <= 0.04043 )
					if( mf <= -0.27116 )
						if( Negative_Money_Flow_Sum <= 2.13751e+07 )
							if( Negative_Money_Flow_Sum <= 1.21808e+07 )
								if( Typical_Price <= 65.9426 )
									ret := 0.600000
								if( Typical_Price > 65.9426 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.21808e+07 )
								if( Raw_Money_Flow <= 1.42755e+07 )
									ret := -0.927273 // sell
								if( Raw_Money_Flow > 1.42755e+07 )
									ret := -0.400000
						if( Negative_Money_Flow_Sum > 2.13751e+07 )
							if( Negative_Money_Flow_Sum <= 3.70339e+07 )
								if( Negative_Money_Flow <= 4.86884e+06 )
									ret := 0.275000
								if( Negative_Money_Flow > 4.86884e+06 )
									ret := -0.818182 // sell
							if( Negative_Money_Flow_Sum > 3.70339e+07 )
								if( mf <= -0.863928 )
									ret := 0.750000 // buy
								if( mf > -0.863928 )
									ret := -0.675676
					if( mf > -0.27116 )
						if( Negative_Money_Flow <= 7.43692e+06 )
							if( ad <= -27460.7 )
								if( ad <= -44275.2 )
									ret := -0.500000
								if( ad > -44275.2 )
									ret := 0.800000 // buy
							if( ad > -27460.7 )
								if( Positive_Money_Flow_Sum <= 151216 )
									ret := 0.200000
								if( Positive_Money_Flow_Sum > 151216 )
									ret := -0.615385
						if( Negative_Money_Flow > 7.43692e+06 )
							if( MFI_Low <= -17.4456 )
								if( ad <= 100794 )
									ret := 0.142857
								if( ad > 100794 )
									ret := 1.000000 // buy
							if( MFI_Low > -17.4456 )
								if( Negative_Money_Flow_Sum <= 1.46445e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 1.46445e+07 )
									ret := 0.625000
				if( Money_Flow_Ratio > 0.04043 )
					if( Negative_Money_Flow_Sum <= 9.23873e+07 )
						if( mf <= 0.184469 )
							if( MFI_High <= -67.06 )
								if( Negative_Money_Flow_Sum <= 7.97226e+07 )
									ret := 0.294248
								if( Negative_Money_Flow_Sum > 7.97226e+07 )
									ret := -0.608696
							if( MFI_High > -67.06 )
								if( Money_Flow_Ratio <= 0.431632 )
									ret := 0.061896
								if( Money_Flow_Ratio > 0.431632 )
									ret := 0.179856
						if( mf > 0.184469 )
							if( Negative_Money_Flow_Sum <= 7.55996e+07 )
								if( Negative_Money_Flow_Sum <= 583205 )
									ret := -0.800000 // sell
								if( Negative_Money_Flow_Sum > 583205 )
									ret := -0.062500
							if( Negative_Money_Flow_Sum > 7.55996e+07 )
								if( ad <= -12465.4 )
									ret := -0.750000 // sell
								if( ad > -12465.4 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 9.23873e+07 )
						if( ad <= -0.955408 )
							if( MFI_High <= -46.1554 )
								if( mf <= -0.662857 )
									ret := -0.444444
								if( mf > -0.662857 )
									ret := 0.792793 // buy
							if( MFI_High > -46.1554 )
								ret := -0.500000
						if( ad > -0.955408 )
							if( Negative_Money_Flow_Sum <= 1.07324e+08 )
								if( ad_mf <= 0.199329 )
									ret := 0.000000
								if( ad_mf > 0.199329 )
									ret := 0.807692 // buy
							if( Negative_Money_Flow_Sum > 1.07324e+08 )
								if( MFI <= 16.268 )
									ret := 0.413793
								if( MFI > 16.268 )
									ret := -0.304348
			if( MFI > 34.457 )
				if( Positive_Money_Flow_Sum <= 3.46069e+07 )
					if( Positive_Money_Flow_Sum <= 3.30112e+07 )
						if( Positive_Money_Flow_Sum <= 1.09948e+06 )
							if( mf <= 0.184966 )
								if( Positive_Money_Flow_Sum <= 1.07965e+06 )
									ret := 0.308197
								if( Positive_Money_Flow_Sum > 1.07965e+06 )
									ret := 1.000000 // buy
							if( mf > 0.184966 )
								if( Positive_Money_Flow_Sum <= 483895 )
									ret := -0.823529 // sell
								if( Positive_Money_Flow_Sum > 483895 )
									ret := 0.025641
						if( Positive_Money_Flow_Sum > 1.09948e+06 )
							if( Negative_Money_Flow <= 853001 )
								if( Money_Flow_Ratio <= 1.25905 )
									ret := -0.043345
								if( Money_Flow_Ratio > 1.25905 )
									ret := 0.044923
							if( Negative_Money_Flow > 853001 )
								if( ad <= -16311.1 )
									ret := -0.003417
								if( ad > -16311.1 )
									ret := 0.074721
					if( Positive_Money_Flow_Sum > 3.30112e+07 )
						if( MFI_Low <= 21.8594 )
							ret := 0.857143 // buy
						if( MFI_Low > 21.8594 )
							if( mf <= 0.336746 )
								if( MFI <= 78.2887 )
									ret := -0.736842 // sell
								if( MFI > 78.2887 )
									ret := -0.166667
							if( mf > 0.336746 )
								if( Negative_Money_Flow <= 1.7157e+06 )
									ret := 0.000000
								if( Negative_Money_Flow > 1.7157e+06 )
									ret := 0.833333 // buy
				if( Positive_Money_Flow_Sum > 3.46069e+07 )
					if( Negative_Money_Flow <= 2.83201e+06 )
						if( Negative_Money_Flow_Sum <= 2.88899e+07 )
							if( MFI_High <= 0.662034 )
								if( Typical_Price <= 66.4499 )
									ret := 0.294118
								if( Typical_Price > 66.4499 )
									ret := 0.741071 // buy
							if( MFI_High > 0.662034 )
								if( Positive_Money_Flow_Sum <= 3.81282e+07 )
									ret := 0.772727 // buy
								if( Positive_Money_Flow_Sum > 3.81282e+07 )
									ret := 0.106195
						if( Negative_Money_Flow_Sum > 2.88899e+07 )
							if( mf <= -0.006477 )
								if( mf <= -0.4306 )
									ret := -0.388889
								if( mf > -0.4306 )
									ret := 0.414894
							if( mf > -0.006477 )
								if( Negative_Money_Flow_Sum <= 5.79784e+07 )
									ret := 0.040816
								if( Negative_Money_Flow_Sum > 5.79784e+07 )
									ret := -0.722222 // sell
					if( Negative_Money_Flow > 2.83201e+06 )
						if( MFI_High <= -2.76873 )
							if( Typical_Price <= 73.5389 )
								if( ad_mf <= -64709.4 )
									ret := 0.200000
								if( ad_mf > -64709.4 )
									ret := -0.249110
							if( Typical_Price > 73.5389 )
								if( MFI <= 62.3006 )
									ret := 0.736842 // buy
								if( MFI > 62.3006 )
									ret := -0.125000
						if( MFI_High > -2.76873 )
							if( Positive_Money_Flow_Sum <= 4.95825e+07 )
								if( Money_Flow_Ratio <= 4.26147 )
									ret := 0.342857
								if( Money_Flow_Ratio > 4.26147 )
									ret := -0.583333
							if( Positive_Money_Flow_Sum > 4.95825e+07 )
								if( Positive_Money_Flow_Sum <= 1.25912e+08 )
									ret := 0.788462 // buy
								if( Positive_Money_Flow_Sum > 1.25912e+08 )
									ret := 0.066667
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_PYPL_1Min_a10ff388(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


