//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: AAPL_1Min_2MT0_632331d6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_1Min_2MT0_632331d6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_1Min_632331d6(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.050885 )
		if( Negative_Money_Flow_Sum <= 4.1446e+07 )
			if( Negative_Money_Flow <= 1761.3 )
				if( ema12 <= -0.103136 )
					if( MFI_High <= -36.1671 )
						if( tema <= 227.988 )
							if( ema2 <= 218.143 )
								if( Positive_Money_Flow_Sum <= 1.45829e+07 )
									ret := 0.088398
								if( Positive_Money_Flow_Sum > 1.45829e+07 )
									ret := 0.950000 // buy
							if( ema2 > 218.143 )
								if( Raw_Money_Flow <= 238943 )
									ret := 0.163399
								if( Raw_Money_Flow > 238943 )
									ret := 0.454902
						if( tema > 227.988 )
							if( MFI_Low <= 9.54075 )
								if( ema13 <= -0.726668 )
									ret := -1.000000 // sell
								if( ema13 > -0.726668 )
									ret := -0.196078
							if( MFI_Low > 9.54075 )
								if( ema12 <= -0.198043 )
									ret := 0.800000 // buy
								if( ema12 > -0.198043 )
									ret := 0.166667
					if( MFI_High > -36.1671 )
						if( Negative_Money_Flow_Sum <= 1.93209e+07 )
							if( Positive_Money_Flow_Sum <= 1.95755e+07 )
								if( Positive_Money_Flow_Sum <= 7.6314e+06 )
									ret := 0.061224
								if( Positive_Money_Flow_Sum > 7.6314e+06 )
									ret := -0.563380
							if( Positive_Money_Flow_Sum > 1.95755e+07 )
								if( Negative_Money_Flow_Sum <= 5.76435e+06 )
									ret := -0.300000
								if( Negative_Money_Flow_Sum > 5.76435e+06 )
									ret := 0.566038
						if( Negative_Money_Flow_Sum > 1.93209e+07 )
							if( ema3 <= 207.413 )
								ret := 0.000000
							if( ema3 > 207.413 )
								if( Typical_Price <= 216.375 )
									ret := -1.000000 // sell
								if( Typical_Price > 216.375 )
									ret := -0.545455
				if( ema12 > -0.103136 )
					if( Negative_Money_Flow_Sum <= 2.53001e+06 )
						if( Negative_Money_Flow_Sum <= 2.37252e+06 )
							if( Positive_Money_Flow <= 459207 )
								if( MFI_Low <= 24.8736 )
									ret := 0.171429
								if( MFI_Low > 24.8736 )
									ret := -0.112033
							if( Positive_Money_Flow > 459207 )
								if( MFI_Low <= 45.6956 )
									ret := 0.574468
								if( MFI_Low > 45.6956 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 2.37252e+06 )
							if( Negative_Money_Flow_Sum <= 2.47916e+06 )
								if( MFI <= 24.5315 )
									ret := 1.000000 // buy
								if( MFI > 24.5315 )
									ret := 0.600000
							if( Negative_Money_Flow_Sum > 2.47916e+06 )
								if( Positive_Money_Flow_Sum <= 1.37175e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.37175e+06 )
									ret := 0.750000 // buy
					if( Negative_Money_Flow_Sum > 2.53001e+06 )
						if( MFI_High <= -41.9209 )
							if( MFI <= 19.2096 )
								if( ema13 <= -0.08181 )
									ret := 0.066298
								if( ema13 > -0.08181 )
									ret := -0.833333 // sell
							if( MFI > 19.2096 )
								if( Negative_Money_Flow_Sum <= 4.52963e+06 )
									ret := -0.347032
								if( Negative_Money_Flow_Sum > 4.52963e+06 )
									ret := -0.055276
						if( MFI_High > -41.9209 )
							if( Negative_Money_Flow_Sum <= 1.30415e+07 )
								if( Negative_Money_Flow_Sum <= 9.11802e+06 )
									ret := 0.068182
								if( Negative_Money_Flow_Sum > 9.11802e+06 )
									ret := -0.237500
							if( Negative_Money_Flow_Sum > 1.30415e+07 )
								if( Money_Flow_Ratio <= 15.2716 )
									ret := 0.466667
								if( Money_Flow_Ratio > 15.2716 )
									ret := -0.600000
			if( Negative_Money_Flow > 1761.3 )
				if( ema3 <= 228.014 )
					if( Negative_Money_Flow_Sum <= 1.25924e+07 )
						if( Positive_Money_Flow_Sum <= 6.63938e+06 )
							if( ema13 <= -0.662201 )
								if( Positive_Money_Flow_Sum <= 1.68404e+06 )
									ret := 0.600000
								if( Positive_Money_Flow_Sum > 1.68404e+06 )
									ret := -0.717391 // sell
							if( ema13 > -0.662201 )
								if( Negative_Money_Flow <= 2.44902e+06 )
									ret := 0.263530
								if( Negative_Money_Flow > 2.44902e+06 )
									ret := 0.591549
						if( Positive_Money_Flow_Sum > 6.63938e+06 )
							if( Money_Flow_Ratio <= 3.16181 )
								if( Positive_Money_Flow_Sum <= 9.05077e+06 )
									ret := 0.087838
								if( Positive_Money_Flow_Sum > 9.05077e+06 )
									ret := -0.316092
							if( Money_Flow_Ratio > 3.16181 )
								if( Positive_Money_Flow <= 60818.5 )
									ret := 0.173077
								if( Positive_Money_Flow > 60818.5 )
									ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 1.25924e+07 )
						if( ema13 <= -0.176155 )
							if( MFI_Low <= -0.396129 )
								if( Positive_Money_Flow_Sum <= 4.73394e+06 )
									ret := 0.480000
								if( Positive_Money_Flow_Sum > 4.73394e+06 )
									ret := -0.057143
							if( MFI_Low > -0.396129 )
								if( Negative_Money_Flow <= 4.18388e+06 )
									ret := 0.704050 // buy
								if( Negative_Money_Flow > 4.18388e+06 )
									ret := 0.417582
						if( ema13 > -0.176155 )
							if( Positive_Money_Flow_Sum <= 3.35022e+06 )
								if( Negative_Money_Flow_Sum <= 3.41371e+07 )
									ret := 0.693878
								if( Negative_Money_Flow_Sum > 3.41371e+07 )
									ret := -0.250000
							if( Positive_Money_Flow_Sum > 3.35022e+06 )
								if( Raw_Money_Flow <= 5.07474e+06 )
									ret := 0.047393
								if( Raw_Money_Flow > 5.07474e+06 )
									ret := 0.478261
				if( ema3 > 228.014 )
					if( MFI <= 23.4458 )
						if( tema <= 232.495 )
							if( Negative_Money_Flow <= 123297 )
								if( Negative_Money_Flow_Sum <= 2.11744e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 2.11744e+06 )
									ret := -0.571429
							if( Negative_Money_Flow > 123297 )
								if( Negative_Money_Flow_Sum <= 5.14703e+06 )
									ret := 0.205882
								if( Negative_Money_Flow_Sum > 5.14703e+06 )
									ret := -0.343284
						if( tema > 232.495 )
							if( Positive_Money_Flow_Sum <= 1.65402e+06 )
								if( ema1 <= 234.876 )
									ret := -0.250000
								if( ema1 > 234.876 )
									ret := 0.142857
							if( Positive_Money_Flow_Sum > 1.65402e+06 )
								if( MFI_High <= -64.7508 )
									ret := 0.750000 // buy
								if( MFI_High > -64.7508 )
									ret := 1.000000 // buy
					if( MFI > 23.4458 )
						if( ema12 <= -0.110087 )
							if( Raw_Money_Flow <= 1.77806e+06 )
								if( ema12 <= -0.491503 )
									ret := -0.250000
								if( ema12 > -0.491503 )
									ret := 0.676923
							if( Raw_Money_Flow > 1.77806e+06 )
								if( ema12 <= -0.376013 )
									ret := 1.000000 // buy
								if( ema12 > -0.376013 )
									ret := -0.103448
						if( ema12 > -0.110087 )
							if( Positive_Money_Flow_Sum <= 1.88582e+07 )
								if( Raw_Money_Flow <= 4.1037e+06 )
									ret := 0.160976
								if( Raw_Money_Flow > 4.1037e+06 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 1.88582e+07 )
								if( ema12 <= -0.058377 )
									ret := -1.000000 // sell
								if( ema12 > -0.058377 )
									ret := -0.333333
		if( Negative_Money_Flow_Sum > 4.1446e+07 )
			if( ema3 <= 224.878 )
				if( Positive_Money_Flow_Sum <= 2.0882e+09 )
					if( Positive_Money_Flow <= 1.21275e+08 )
						if( Positive_Money_Flow_Sum <= 6.26979e+08 )
							if( Negative_Money_Flow_Sum <= 6.55993e+07 )
								if( Raw_Money_Flow <= 1.10866e+07 )
									ret := -0.250000
								if( Raw_Money_Flow > 1.10866e+07 )
									ret := 0.459459
							if( Negative_Money_Flow_Sum > 6.55993e+07 )
								if( Positive_Money_Flow_Sum <= 2.10381e+07 )
									ret := 0.335092
								if( Positive_Money_Flow_Sum > 2.10381e+07 )
									ret := 0.108870
						if( Positive_Money_Flow_Sum > 6.26979e+08 )
							if( ema3 <= 186.666 )
								if( ema12 <= -0.142217 )
									ret := 0.512821
								if( ema12 > -0.142217 )
									ret := -0.176471
							if( ema3 > 186.666 )
								if( Negative_Money_Flow <= 1.62165e+08 )
									ret := 0.653846
								if( Negative_Money_Flow > 1.62165e+08 )
									ret := -0.100000
					if( Positive_Money_Flow > 1.21275e+08 )
						if( Raw_Money_Flow <= 2.69859e+08 )
							if( ema3 <= 185.258 )
								if( ema2 <= 183.708 )
									ret := -0.500000
								if( ema2 > 183.708 )
									ret := 0.833333 // buy
							if( ema3 > 185.258 )
								if( Raw_Money_Flow <= 1.70296e+08 )
									ret := -0.393939
								if( Raw_Money_Flow > 1.70296e+08 )
									ret := -0.764706 // sell
						if( Raw_Money_Flow > 2.69859e+08 )
							if( Raw_Money_Flow <= 9.01808e+08 )
								if( tema <= 210.784 )
									ret := 0.000000
								if( tema > 210.784 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 9.01808e+08 )
								ret := -0.428571
				if( Positive_Money_Flow_Sum > 2.0882e+09 )
					if( ema1 <= 209.126 )
						if( Raw_Money_Flow <= 2.26023e+07 )
							if( ema3 <= 207.678 )
								if( Positive_Money_Flow <= 3448.83 )
									ret := -0.647059
								if( Positive_Money_Flow > 3448.83 )
									ret := -1.000000 // sell
							if( ema3 > 207.678 )
								ret := -0.250000
						if( Raw_Money_Flow > 2.26023e+07 )
							if( Negative_Money_Flow <= 2.13053e+08 )
								if( Positive_Money_Flow <= 1.68365e+07 )
									ret := 0.600000
								if( Positive_Money_Flow > 1.68365e+07 )
									ret := -0.250000
							if( Negative_Money_Flow > 2.13053e+08 )
								if( ema3 <= 208.898 )
									ret := -0.750000 // sell
								if( ema3 > 208.898 )
									ret := -1.000000 // sell
					if( ema1 > 209.126 )
						if( Negative_Money_Flow <= 109816 )
							if( tema <= 210.563 )
								ret := 0.200000
							if( tema > 210.563 )
								if( ema1 <= 213.488 )
									ret := -0.866667 // sell
								if( ema1 > 213.488 )
									ret := -0.250000
						if( Negative_Money_Flow > 109816 )
							if( MFI_High <= -4.57786 )
								if( Money_Flow_Ratio <= 2.26501 )
									ret := -0.750000 // sell
								if( Money_Flow_Ratio > 2.26501 )
									ret := 0.000000
							if( MFI_High > -4.57786 )
								if( Negative_Money_Flow <= 7.65776e+07 )
									ret := 0.869565 // buy
								if( Negative_Money_Flow > 7.65776e+07 )
									ret := 0.250000
			if( ema3 > 224.878 )
				if( Negative_Money_Flow <= 2.61983e+07 )
					if( ema12 <= -0.135952 )
						if( MFI <= 5.30075 )
							if( MFI_Low <= -16.8454 )
								if( Negative_Money_Flow <= 403891 )
									ret := -0.250000
								if( Negative_Money_Flow > 403891 )
									ret := 0.500000
							if( MFI_Low > -16.8454 )
								if( ema13 <= -0.672856 )
									ret := 0.400000
								if( ema13 > -0.672856 )
									ret := 1.000000 // buy
						if( MFI > 5.30075 )
							if( Negative_Money_Flow_Sum <= 7.18482e+08 )
								if( Positive_Money_Flow <= 6.418e+07 )
									ret := -0.166667
								if( Positive_Money_Flow > 6.418e+07 )
									ret := 0.826087 // buy
							if( Negative_Money_Flow_Sum > 7.18482e+08 )
								if( Positive_Money_Flow <= 2.6923e+07 )
									ret := 0.285714
								if( Positive_Money_Flow > 2.6923e+07 )
									ret := -0.800000 // sell
					if( ema12 > -0.135952 )
						if( Positive_Money_Flow_Sum <= 1.00887e+08 )
							if( Positive_Money_Flow_Sum <= 5.72403e+07 )
								if( ema3 <= 226.95 )
									ret := -0.079897
								if( ema3 > 226.95 )
									ret := 0.135266
							if( Positive_Money_Flow_Sum > 5.72403e+07 )
								if( MFI_Low <= 28.9921 )
									ret := 0.223950
								if( MFI_Low > 28.9921 )
									ret := -0.211538
						if( Positive_Money_Flow_Sum > 1.00887e+08 )
							if( Negative_Money_Flow <= 2.0454e+07 )
								if( Raw_Money_Flow <= 1.64143e+07 )
									ret := -0.186916
								if( Raw_Money_Flow > 1.64143e+07 )
									ret := 0.035639
							if( Negative_Money_Flow > 2.0454e+07 )
								if( MFI_High <= -55.1643 )
									ret := 1.000000 // buy
								if( MFI_High > -55.1643 )
									ret := -0.472868
				if( Negative_Money_Flow > 2.61983e+07 )
					if( Positive_Money_Flow_Sum <= 1.43381e+08 )
						if( Negative_Money_Flow_Sum <= 2.30663e+08 )
							if( Positive_Money_Flow_Sum <= 5.29418e+07 )
								if( ema12 <= -0.127203 )
									ret := -0.259259
								if( ema12 > -0.127203 )
									ret := 0.454545
							if( Positive_Money_Flow_Sum > 5.29418e+07 )
								if( ema12 <= -0.127919 )
									ret := 0.707317 // buy
								if( ema12 > -0.127919 )
									ret := 0.328767
						if( Negative_Money_Flow_Sum > 2.30663e+08 )
							if( ema12 <= -0.191045 )
								if( Raw_Money_Flow <= 6.58279e+07 )
									ret := 0.390041
								if( Raw_Money_Flow > 6.58279e+07 )
									ret := -0.059701
							if( ema12 > -0.191045 )
								if( Raw_Money_Flow <= 7.14387e+07 )
									ret := -0.275000
								if( Raw_Money_Flow > 7.14387e+07 )
									ret := 0.461538
					if( Positive_Money_Flow_Sum > 1.43381e+08 )
						if( MFI <= 28.4313 )
							if( Money_Flow_Ratio <= 0.226525 )
								if( Raw_Money_Flow <= 7.30435e+07 )
									ret := 0.866667 // buy
								if( Raw_Money_Flow > 7.30435e+07 )
									ret := 0.000000
							if( Money_Flow_Ratio > 0.226525 )
								if( Positive_Money_Flow_Sum <= 2.01182e+08 )
									ret := -0.691176
								if( Positive_Money_Flow_Sum > 2.01182e+08 )
									ret := 0.090909
						if( MFI > 28.4313 )
							if( tema <= 228.065 )
								if( Raw_Money_Flow <= 1.34656e+08 )
									ret := 0.290323
								if( Raw_Money_Flow > 1.34656e+08 )
									ret := -1.000000 // sell
							if( tema > 228.065 )
								if( Negative_Money_Flow <= 4.1524e+07 )
									ret := -0.292453
								if( Negative_Money_Flow > 4.1524e+07 )
									ret := 0.210000
	if( ema12 > -0.050885 )
		if( ema12 <= 0.715958 )
			if( MFI_Low <= 55.971 )
				if( Positive_Money_Flow_Sum <= 2.08887e+08 )
					if( ema12 <= 0.06681 )
						if( Positive_Money_Flow_Sum <= 3.27195e+06 )
							if( Positive_Money_Flow <= 9845.25 )
								if( ema2 <= 223.595 )
									ret := 0.127145
								if( ema2 > 223.595 )
									ret := 0.045599
							if( Positive_Money_Flow > 9845.25 )
								if( Positive_Money_Flow <= 212929 )
									ret := -0.005831
								if( Positive_Money_Flow > 212929 )
									ret := 0.090223
						if( Positive_Money_Flow_Sum > 3.27195e+06 )
							if( MFI_Low <= 13.8159 )
								if( Positive_Money_Flow_Sum <= 5.27224e+06 )
									ret := -0.258015
								if( Positive_Money_Flow_Sum > 5.27224e+06 )
									ret := -0.028390
							if( MFI_Low > 13.8159 )
								if( Positive_Money_Flow_Sum <= 8.48022e+07 )
									ret := -0.008724
								if( Positive_Money_Flow_Sum > 8.48022e+07 )
									ret := 0.055094
					if( ema12 > 0.06681 )
						if( Positive_Money_Flow_Sum <= 1.00145e+07 )
							if( Negative_Money_Flow_Sum <= 5.38591e+06 )
								if( Money_Flow_Ratio <= 0.823775 )
									ret := 0.230453
								if( Money_Flow_Ratio > 0.823775 )
									ret := -0.096552
							if( Negative_Money_Flow_Sum > 5.38591e+06 )
								if( ema13 <= 0.035965 )
									ret := 0.833333 // buy
								if( ema13 > 0.035965 )
									ret := -0.307870
						if( Positive_Money_Flow_Sum > 1.00145e+07 )
							if( Negative_Money_Flow_Sum <= 5.82537e+06 )
								if( ema1 <= 214.47 )
									ret := 0.693182
								if( ema1 > 214.47 )
									ret := 0.129870
							if( Negative_Money_Flow_Sum > 5.82537e+06 )
								if( MFI_High <= -20.8022 )
									ret := 0.098154
								if( MFI_High > -20.8022 )
									ret := -0.033068
				if( Positive_Money_Flow_Sum > 2.08887e+08 )
					if( MFI_Low <= -10.9245 )
						if( ema12 <= -0.003259 )
							ret := -0.500000
						if( ema12 > -0.003259 )
							if( MFI_High <= -71.3742 )
								ret := -1.000000 // sell
							if( MFI_High > -71.3742 )
								ret := -0.750000 // sell
					if( MFI_Low > -10.9245 )
						if( ema2 <= 195.585 )
							if( tema <= 195.649 )
								if( Raw_Money_Flow <= 3.22683e+07 )
									ret := 0.072449
								if( Raw_Money_Flow > 3.22683e+07 )
									ret := -0.097194
							if( tema > 195.649 )
								if( tema <= 195.902 )
									ret := -1.000000 // sell
								if( tema > 195.902 )
									ret := -0.500000
						if( ema2 > 195.585 )
							if( ema13 <= 0.173258 )
								if( Negative_Money_Flow_Sum <= 8.75595e+07 )
									ret := 0.647059
								if( Negative_Money_Flow_Sum > 8.75595e+07 )
									ret := 0.154829
							if( ema13 > 0.173258 )
								if( ema12 <= 0.05951 )
									ret := 0.546012
								if( ema12 > 0.05951 )
									ret := 0.039699
			if( MFI_Low > 55.971 )
				if( Negative_Money_Flow_Sum <= 3.47625e+08 )
					if( ema13 <= 0.763107 )
						if( Negative_Money_Flow_Sum <= 4.10086e+07 )
							if( ema13 <= 0.227042 )
								if( Positive_Money_Flow <= 33870 )
									ret := 0.043668
								if( Positive_Money_Flow > 33870 )
									ret := -0.061468
							if( ema13 > 0.227042 )
								if( Raw_Money_Flow <= 933972 )
									ret := -0.076336
								if( Raw_Money_Flow > 933972 )
									ret := 0.144344
						if( Negative_Money_Flow_Sum > 4.10086e+07 )
							if( Positive_Money_Flow_Sum <= 4.02215e+08 )
								if( ema3 <= 220.699 )
									ret := -0.222053
								if( ema3 > 220.699 )
									ret := -0.057870
							if( Positive_Money_Flow_Sum > 4.02215e+08 )
								if( tema <= 231.901 )
									ret := 0.065297
								if( tema > 231.901 )
									ret := -0.567164
					if( ema13 > 0.763107 )
						if( Raw_Money_Flow <= 1.59845e+08 )
							if( Positive_Money_Flow <= 431453 )
								if( Positive_Money_Flow_Sum <= 6.66236e+06 )
									ret := 0.666667
								if( Positive_Money_Flow_Sum > 6.66236e+06 )
									ret := -0.117647
							if( Positive_Money_Flow > 431453 )
								if( ema2 <= 183.044 )
									ret := 0.600000
								if( ema2 > 183.044 )
									ret := -0.593458
						if( Raw_Money_Flow > 1.59845e+08 )
							if( ema1 <= 201.077 )
								if( ema1 <= 198.461 )
									ret := 0.500000
								if( ema1 > 198.461 )
									ret := -0.250000
							if( ema1 > 201.077 )
								if( Negative_Money_Flow_Sum <= 1.38554e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 1.38554e+08 )
									ret := 0.500000
				if( Negative_Money_Flow_Sum > 3.47625e+08 )
					if( Positive_Money_Flow_Sum <= 2.12151e+09 )
						if( Raw_Money_Flow <= 2.19687e+08 )
							if( ema13 <= -0.003091 )
								if( tema <= 188.016 )
									ret := -0.750000 // sell
								if( tema > 188.016 )
									ret := 0.000000
							if( ema13 > -0.003091 )
								if( ema3 <= 206.905 )
									ret := 0.840426 // buy
								if( ema3 > 206.905 )
									ret := 0.214286
						if( Raw_Money_Flow > 2.19687e+08 )
							if( Money_Flow_Ratio <= 4.07505 )
								ret := 0.000000
							if( Money_Flow_Ratio > 4.07505 )
								ret := -0.800000 // sell
					if( Positive_Money_Flow_Sum > 2.12151e+09 )
						if( ema13 <= -0.133266 )
							ret := -0.857143 // sell
						if( ema13 > -0.133266 )
							if( Positive_Money_Flow <= 2.26611e+07 )
								if( MFI_Low <= 68.2782 )
									ret := -0.016949
								if( MFI_Low > 68.2782 )
									ret := -0.625000
							if( Positive_Money_Flow > 2.26611e+07 )
								if( Negative_Money_Flow <= 33386.3 )
									ret := 0.142857
								if( Negative_Money_Flow > 33386.3 )
									ret := 1.000000 // buy
		if( ema12 > 0.715958 )
			if( Typical_Price <= 219.537 )
				if( MFI_Low <= 8.03491 )
					ret := -1.000000 // sell
				if( MFI_Low > 8.03491 )
					if( ema12 <= 2.48578 )
						if( MFI_Low <= 36.2246 )
							ret := 1.000000 // buy
						if( MFI_Low > 36.2246 )
							if( MFI <= 75.1857 )
								if( MFI <= 72.5828 )
									ret := 0.484375
								if( MFI > 72.5828 )
									ret := -0.529412
							if( MFI > 75.1857 )
								if( Positive_Money_Flow_Sum <= 6.5044e+08 )
									ret := 0.321429
								if( Positive_Money_Flow_Sum > 6.5044e+08 )
									ret := 0.836364 // buy
					if( ema12 > 2.48578 )
						ret := -1.000000 // sell
			if( Typical_Price > 219.537 )
				if( Negative_Money_Flow_Sum <= 1.99935e+08 )
					if( Positive_Money_Flow_Sum <= 1.27228e+08 )
						if( Money_Flow_Ratio <= 5.59899 )
							if( tema <= 233.818 )
								ret := 0.750000 // buy
							if( tema > 233.818 )
								ret := 0.000000
						if( Money_Flow_Ratio > 5.59899 )
							if( Negative_Money_Flow_Sum <= 1.02665e+06 )
								ret := -0.400000
							if( Negative_Money_Flow_Sum > 1.02665e+06 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 1.27228e+08 )
						if( Positive_Money_Flow <= 6.53465e+07 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow > 6.53465e+07 )
							if( Positive_Money_Flow_Sum <= 7.33438e+08 )
								ret := -0.250000
							if( Positive_Money_Flow_Sum > 7.33438e+08 )
								ret := -1.000000 // sell
				if( Negative_Money_Flow_Sum > 1.99935e+08 )
					if( Typical_Price <= 223.287 )
						ret := 1.000000 // buy
					if( Typical_Price > 223.287 )
						ret := -0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_AAPL_1Min_632331d6(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)

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


