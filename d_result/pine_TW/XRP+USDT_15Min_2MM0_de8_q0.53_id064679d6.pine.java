//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: XRPUSDT_15Min_2MM0_064679d6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_15Min_2MM0_064679d6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_15Min_064679d6(MA_Cross, Long_MA, Short_Long_Diff, Short_MA, Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 7.87331e+06 )
		if( Short_Long_Diff <= -0.003338 )
			if( Long_MA <= 0.611444 )
				if( Positive_Money_Flow_Sum <= 4.69454e+07 )
					if( Positive_Money_Flow_Sum <= 2.13363e+07 )
						if( Negative_Money_Flow_Sum <= 4.80622e+07 )
							if( Positive_Money_Flow_Sum <= 1.94959e+07 )
								if( Typical_Price <= 0.34015 )
									ret := 0.335714
								if( Typical_Price > 0.34015 )
									ret := 0.132671
							if( Positive_Money_Flow_Sum > 1.94959e+07 )
								if( Short_Long_Diff <= -0.006808 )
									ret := 0.625000
								if( Short_Long_Diff > -0.006808 )
									ret := -0.276074
						if( Negative_Money_Flow_Sum > 4.80622e+07 )
							if( Short_MA <= 0.582703 )
								if( Short_Long_Diff <= -0.010084 )
									ret := 0.203883
								if( Short_Long_Diff > -0.010084 )
									ret := 0.545139
							if( Short_MA > 0.582703 )
								if( MFI_Low <= -1.2363 )
									ret := -0.826087 // sell
								if( MFI_Low > -1.2363 )
									ret := 0.072464
					if( Positive_Money_Flow_Sum > 2.13363e+07 )
						if( MFI_High <= -55.8211 )
							if( Short_MA <= 0.500256 )
								if( Short_MA <= 0.471625 )
									ret := 0.250000
								if( Short_MA > 0.471625 )
									ret := 0.923077 // buy
							if( Short_MA > 0.500256 )
								if( Raw_Money_Flow <= 1.27748e+07 )
									ret := -0.617647
								if( Raw_Money_Flow > 1.27748e+07 )
									ret := 0.800000 // buy
						if( MFI_High > -55.8211 )
							if( Raw_Money_Flow <= 5.6931e+06 )
								if( Positive_Money_Flow <= 693352 )
									ret := 0.640845
								if( Positive_Money_Flow > 693352 )
									ret := 0.397661
							if( Raw_Money_Flow > 5.6931e+06 )
								if( Positive_Money_Flow <= 1.33768e+07 )
									ret := 0.010101
								if( Positive_Money_Flow > 1.33768e+07 )
									ret := 0.869565 // buy
				if( Positive_Money_Flow_Sum > 4.69454e+07 )
					if( MFI_Low <= 17.9135 )
						if( Short_Long_Diff <= -0.017157 )
							if( MFI <= 37.2038 )
								if( Positive_Money_Flow <= 7.75659e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 7.75659e+06 )
									ret := 0.740741 // buy
							if( MFI > 37.2038 )
								ret := 0.166667
						if( Short_Long_Diff > -0.017157 )
							if( Long_MA <= 0.593238 )
								if( Positive_Money_Flow <= 642935 )
									ret := 0.500000
								if( Positive_Money_Flow > 642935 )
									ret := -0.666667
							if( Long_MA > 0.593238 )
								if( Negative_Money_Flow_Sum <= 1.00543e+08 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 1.00543e+08 )
									ret := 1.000000 // buy
					if( MFI_Low > 17.9135 )
						if( Positive_Money_Flow_Sum <= 1.67888e+08 )
							if( Negative_Money_Flow <= 16718.8 )
								if( Short_MA <= 0.569028 )
									ret := -0.691729
								if( Short_MA > 0.569028 )
									ret := -0.062500
							if( Negative_Money_Flow > 16718.8 )
								if( Positive_Money_Flow_Sum <= 9.89402e+07 )
									ret := 0.272727
								if( Positive_Money_Flow_Sum > 9.89402e+07 )
									ret := -0.866667 // sell
						if( Positive_Money_Flow_Sum > 1.67888e+08 )
							ret := 1.000000 // buy
			if( Long_MA > 0.611444 )
				if( MFI_Low <= -2.53468 )
					if( Short_MA <= 0.633947 )
						if( MFI_High <= -68.5385 )
							if( Raw_Money_Flow <= 3.66348e+06 )
								if( Negative_Money_Flow <= 2.61338e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 2.61338e+06 )
									ret := 0.000000
							if( Raw_Money_Flow > 3.66348e+06 )
								if( Negative_Money_Flow_Sum <= 8.49066e+07 )
									ret := 0.722222 // buy
								if( Negative_Money_Flow_Sum > 8.49066e+07 )
									ret := -0.750000 // sell
						if( MFI_High > -68.5385 )
							if( Positive_Money_Flow <= 1.97426e+06 )
								if( Negative_Money_Flow <= 6.34756e+06 )
									ret := -0.807692 // sell
								if( Negative_Money_Flow > 6.34756e+06 )
									ret := -0.100000
							if( Positive_Money_Flow > 1.97426e+06 )
								if( Negative_Money_Flow_Sum <= 7.6643e+07 )
									ret := 0.176471
								if( Negative_Money_Flow_Sum > 7.6643e+07 )
									ret := -1.000000 // sell
					if( Short_MA > 0.633947 )
						if( Positive_Money_Flow_Sum <= 5.52697e+06 )
							if( Short_MA <= 0.661639 )
								if( Long_MA <= 0.65446 )
									ret := -0.500000
								if( Long_MA > 0.65446 )
									ret := -1.000000 // sell
							if( Short_MA > 0.661639 )
								if( Short_Long_Diff <= -0.003618 )
									ret := 0.000000
								if( Short_Long_Diff > -0.003618 )
									ret := 0.250000
						if( Positive_Money_Flow_Sum > 5.52697e+06 )
							if( Long_MA <= 0.654743 )
								ret := 1.000000 // buy
							if( Long_MA > 0.654743 )
								if( Raw_Money_Flow <= 4.83884e+06 )
									ret := 0.000000
								if( Raw_Money_Flow > 4.83884e+06 )
									ret := 1.000000 // buy
				if( MFI_Low > -2.53468 )
					if( Short_Long_Diff <= -0.018 )
						if( Raw_Money_Flow <= 1.81519e+07 )
							if( MFI <= 45.9084 )
								if( Negative_Money_Flow_Sum <= 1.39159e+08 )
									ret := 0.333333
								if( Negative_Money_Flow_Sum > 1.39159e+08 )
									ret := 0.969697 // buy
							if( MFI > 45.9084 )
								ret := 0.000000
						if( Raw_Money_Flow > 1.81519e+07 )
							ret := -0.500000
					if( Short_Long_Diff > -0.018 )
						if( Positive_Money_Flow_Sum <= 6.31835e+07 )
							if( Negative_Money_Flow_Sum <= 2.5725e+07 )
								if( Money_Flow_Ratio <= 0.41479 )
									ret := 0.160000
								if( Money_Flow_Ratio > 0.41479 )
									ret := -0.253333
							if( Negative_Money_Flow_Sum > 2.5725e+07 )
								if( MFI_High <= -49.2228 )
									ret := 0.077844
								if( MFI_High > -49.2228 )
									ret := 0.242531
						if( Positive_Money_Flow_Sum > 6.31835e+07 )
							if( Positive_Money_Flow_Sum <= 8.49108e+07 )
								if( Positive_Money_Flow <= 6.86994e+06 )
									ret := -0.900000 // sell
								if( Positive_Money_Flow > 6.86994e+06 )
									ret := -0.360000
							if( Positive_Money_Flow_Sum > 8.49108e+07 )
								if( MFI_High <= -31.7082 )
									ret := 0.714286 // buy
								if( MFI_High > -31.7082 )
									ret := -1.000000 // sell
		if( Short_Long_Diff > -0.003338 )
			if( Typical_Price <= 0.519816 )
				if( Negative_Money_Flow <= 1.28665e+06 )
					if( Positive_Money_Flow_Sum <= 1.2011e+07 )
						if( Typical_Price <= 0.376896 )
							if( Positive_Money_Flow_Sum <= 8.41052e+06 )
								if( Positive_Money_Flow <= 848975 )
									ret := 0.081280
								if( Positive_Money_Flow > 848975 )
									ret := -0.085756
							if( Positive_Money_Flow_Sum > 8.41052e+06 )
								if( Positive_Money_Flow <= 3.64551e+06 )
									ret := 0.181478
								if( Positive_Money_Flow > 3.64551e+06 )
									ret := -0.692308
						if( Typical_Price > 0.376896 )
							if( Negative_Money_Flow_Sum <= 1.55333e+07 )
								if( MFI_Low <= -1.77224 )
									ret := -0.279693
								if( MFI_Low > -1.77224 )
									ret := -0.007626
							if( Negative_Money_Flow_Sum > 1.55333e+07 )
								if( Long_MA <= 0.456107 )
									ret := 0.213166
								if( Long_MA > 0.456107 )
									ret := 0.031224
					if( Positive_Money_Flow_Sum > 1.2011e+07 )
						if( Raw_Money_Flow <= 1.18343e+06 )
							if( Short_MA <= 0.363826 )
								if( Short_MA <= 0.353494 )
									ret := 0.183150
								if( Short_MA > 0.353494 )
									ret := 0.627907
							if( Short_MA > 0.363826 )
								if( Long_MA <= 0.361605 )
									ret := -0.666667
								if( Long_MA > 0.361605 )
									ret := 0.145323
						if( Raw_Money_Flow > 1.18343e+06 )
							if( Short_Long_Diff <= 0.003163 )
								if( Money_Flow_Ratio <= 5.77096 )
									ret := 0.083090
								if( Money_Flow_Ratio > 5.77096 )
									ret := 0.353982
							if( Short_Long_Diff > 0.003163 )
								if( Positive_Money_Flow_Sum <= 2.67453e+07 )
									ret := -0.225251
								if( Positive_Money_Flow_Sum > 2.67453e+07 )
									ret := 0.061242
				if( Negative_Money_Flow > 1.28665e+06 )
					if( Negative_Money_Flow <= 2.6608e+06 )
						if( Negative_Money_Flow_Sum <= 1.97347e+07 )
							if( Negative_Money_Flow <= 1.69527e+06 )
								if( Short_MA <= 0.470781 )
									ret := 0.193798
								if( Short_MA > 0.470781 )
									ret := 0.049269
							if( Negative_Money_Flow > 1.69527e+06 )
								if( Money_Flow_Ratio <= 0.221145 )
									ret := -0.426357
								if( Money_Flow_Ratio > 0.221145 )
									ret := 0.029124
						if( Negative_Money_Flow_Sum > 1.97347e+07 )
							if( Typical_Price <= 0.471981 )
								if( Raw_Money_Flow <= 1.7509e+06 )
									ret := 0.159236
								if( Raw_Money_Flow > 1.7509e+06 )
									ret := 0.461717
							if( Typical_Price > 0.471981 )
								if( Positive_Money_Flow_Sum <= 2.49405e+07 )
									ret := 0.219512
								if( Positive_Money_Flow_Sum > 2.49405e+07 )
									ret := -0.212500
					if( Negative_Money_Flow > 2.6608e+06 )
						if( Negative_Money_Flow_Sum <= 2.09702e+07 )
							if( Positive_Money_Flow_Sum <= 6.07689e+07 )
								if( Raw_Money_Flow <= 2.89715e+06 )
									ret := 0.140816
								if( Raw_Money_Flow > 2.89715e+06 )
									ret := 0.297227
							if( Positive_Money_Flow_Sum > 6.07689e+07 )
								if( Negative_Money_Flow <= 4.14591e+06 )
									ret := 0.800000 // buy
								if( Negative_Money_Flow > 4.14591e+06 )
									ret := -0.650000
						if( Negative_Money_Flow_Sum > 2.09702e+07 )
							if( Positive_Money_Flow_Sum <= 7.06143e+06 )
								if( Negative_Money_Flow_Sum <= 2.58295e+07 )
									ret := -0.304762
								if( Negative_Money_Flow_Sum > 2.58295e+07 )
									ret := 0.173077
							if( Positive_Money_Flow_Sum > 7.06143e+06 )
								if( Positive_Money_Flow_Sum <= 2.14114e+07 )
									ret := 0.255776
								if( Positive_Money_Flow_Sum > 2.14114e+07 )
									ret := 0.023564
			if( Typical_Price > 0.519816 )
				if( Positive_Money_Flow_Sum <= 7.96312e+07 )
					if( Typical_Price <= 0.622705 )
						if( Short_Long_Diff <= -0.002632 )
							if( Positive_Money_Flow_Sum <= 1.09392e+07 )
								if( Raw_Money_Flow <= 5.05774e+06 )
									ret := 0.072222
								if( Raw_Money_Flow > 5.05774e+06 )
									ret := -0.769231 // sell
							if( Positive_Money_Flow_Sum > 1.09392e+07 )
								if( Money_Flow_Ratio <= 0.722996 )
									ret := 0.340314
								if( Money_Flow_Ratio > 0.722996 )
									ret := 0.077720
						if( Short_Long_Diff > -0.002632 )
							if( Negative_Money_Flow_Sum <= 6.31321e+06 )
								if( Raw_Money_Flow <= 1.2297e+07 )
									ret := -0.045260
								if( Raw_Money_Flow > 1.2297e+07 )
									ret := -0.757576 // sell
							if( Negative_Money_Flow_Sum > 6.31321e+06 )
								if( Money_Flow_Ratio <= 1.15507 )
									ret := -0.005385
								if( Money_Flow_Ratio > 1.15507 )
									ret := 0.052444
					if( Typical_Price > 0.622705 )
						if( Positive_Money_Flow_Sum <= 5.37308e+07 )
							if( Negative_Money_Flow <= 33972.2 )
								if( Raw_Money_Flow <= 7.83741e+06 )
									ret := -0.110075
								if( Raw_Money_Flow > 7.83741e+06 )
									ret := 0.187500
							if( Negative_Money_Flow > 33972.2 )
								if( Positive_Money_Flow_Sum <= 1.11091e+07 )
									ret := -0.143524
								if( Positive_Money_Flow_Sum > 1.11091e+07 )
									ret := 0.031876
						if( Positive_Money_Flow_Sum > 5.37308e+07 )
							if( Negative_Money_Flow_Sum <= 4.13822e+07 )
								if( MFI_High <= -14.9894 )
									ret := 0.452381
								if( MFI_High > -14.9894 )
									ret := -0.278884
							if( Negative_Money_Flow_Sum > 4.13822e+07 )
								if( Positive_Money_Flow_Sum <= 6.26707e+07 )
									ret := -0.848485 // sell
								if( Positive_Money_Flow_Sum > 6.26707e+07 )
									ret := -0.372549
				if( Positive_Money_Flow_Sum > 7.96312e+07 )
					if( MFI <= 61.3377 )
						if( Positive_Money_Flow_Sum <= 1.9069e+08 )
							if( Negative_Money_Flow_Sum <= 5.95896e+07 )
								if( Short_Long_Diff <= 0.002525 )
									ret := 0.000000
								if( Short_Long_Diff > 0.002525 )
									ret := -0.842105 // sell
							if( Negative_Money_Flow_Sum > 5.95896e+07 )
								if( Raw_Money_Flow <= 5.01771e+06 )
									ret := -0.750000 // sell
								if( Raw_Money_Flow > 5.01771e+06 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.9069e+08 )
							ret := 0.000000
					if( MFI > 61.3377 )
						if( Raw_Money_Flow <= 5.99538e+06 )
							if( Short_Long_Diff <= 0.010901 )
								if( Positive_Money_Flow <= 4.88307e+06 )
									ret := 0.517241
								if( Positive_Money_Flow > 4.88307e+06 )
									ret := -0.375000
							if( Short_Long_Diff > 0.010901 )
								if( Positive_Money_Flow_Sum <= 9.01683e+07 )
									ret := -0.892857 // sell
								if( Positive_Money_Flow_Sum > 9.01683e+07 )
									ret := -0.088889
						if( Raw_Money_Flow > 5.99538e+06 )
							if( MFI_High <= -11.4889 )
								if( Positive_Money_Flow_Sum <= 8.75679e+07 )
									ret := 0.933333 // buy
								if( Positive_Money_Flow_Sum > 8.75679e+07 )
									ret := -0.466667
							if( MFI_High > -11.4889 )
								if( Raw_Money_Flow <= 1.13728e+08 )
									ret := -0.484848
								if( Raw_Money_Flow > 1.13728e+08 )
									ret := 0.714286 // buy
	if( Negative_Money_Flow > 7.87331e+06 )
		if( Positive_Money_Flow_Sum <= 5.35238e+07 )
			if( Short_Long_Diff <= -0.001171 )
				if( Negative_Money_Flow_Sum <= 5.60373e+07 )
					if( MFI <= 26.2472 )
						if( Negative_Money_Flow_Sum <= 4.4814e+07 )
							if( MFI <= 12.7783 )
								if( Positive_Money_Flow_Sum <= 2.18329e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 2.18329e+06 )
									ret := 0.849057 // buy
							if( MFI > 12.7783 )
								if( Negative_Money_Flow_Sum <= 2.41877e+07 )
									ret := -0.238095
								if( Negative_Money_Flow_Sum > 2.41877e+07 )
									ret := 0.507812
						if( Negative_Money_Flow_Sum > 4.4814e+07 )
							if( Positive_Money_Flow_Sum <= 1.56697e+07 )
								if( MFI_High <= -59.1253 )
									ret := -0.061728
								if( MFI_High > -59.1253 )
									ret := 0.520000
							if( Positive_Money_Flow_Sum > 1.56697e+07 )
								if( Raw_Money_Flow <= 1.28966e+07 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 1.28966e+07 )
									ret := -0.714286 // sell
					if( MFI > 26.2472 )
						if( Long_MA <= 0.693909 )
							if( Negative_Money_Flow_Sum <= 5.37079e+07 )
								if( Positive_Money_Flow_Sum <= 1.09279e+07 )
									ret := -0.400000
								if( Positive_Money_Flow_Sum > 1.09279e+07 )
									ret := 0.710345 // buy
							if( Negative_Money_Flow_Sum > 5.37079e+07 )
								if( Negative_Money_Flow <= 9.79007e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 9.79007e+06 )
									ret := -0.250000
						if( Long_MA > 0.693909 )
							if( Negative_Money_Flow_Sum <= 5.32026e+07 )
								ret := 0.250000
							if( Negative_Money_Flow_Sum > 5.32026e+07 )
								ret := -0.800000 // sell
				if( Negative_Money_Flow_Sum > 5.60373e+07 )
					if( Raw_Money_Flow <= 1.05492e+07 )
						if( Short_Long_Diff <= -0.007534 )
							if( Typical_Price <= 0.505885 )
								if( Short_Long_Diff <= -0.011675 )
									ret := -0.916667 // sell
								if( Short_Long_Diff > -0.011675 )
									ret := 0.000000
							if( Typical_Price > 0.505885 )
								if( Positive_Money_Flow_Sum <= 2.28252e+07 )
									ret := -0.137931
								if( Positive_Money_Flow_Sum > 2.28252e+07 )
									ret := 0.920000 // buy
						if( Short_Long_Diff > -0.007534 )
							if( Short_Long_Diff <= -0.003742 )
								if( Negative_Money_Flow_Sum <= 8.30706e+07 )
									ret := 0.897436 // buy
								if( Negative_Money_Flow_Sum > 8.30706e+07 )
									ret := 0.333333
							if( Short_Long_Diff > -0.003742 )
								if( MFI <= 32.428 )
									ret := 0.307692
								if( MFI > 32.428 )
									ret := 0.833333 // buy
					if( Raw_Money_Flow > 1.05492e+07 )
						if( Long_MA <= 0.758969 )
							if( Long_MA <= 0.530654 )
								if( Typical_Price <= 0.490533 )
									ret := 0.793651 // buy
								if( Typical_Price > 0.490533 )
									ret := -0.041667
							if( Long_MA > 0.530654 )
								if( Short_Long_Diff <= -0.002034 )
									ret := 0.863436 // buy
								if( Short_Long_Diff > -0.002034 )
									ret := 0.300000
						if( Long_MA > 0.758969 )
							if( MFI <= 21.0236 )
								ret := 0.666667
							if( MFI > 21.0236 )
								ret := -1.000000 // sell
			if( Short_Long_Diff > -0.001171 )
				if( Money_Flow_Ratio <= 0.621888 )
					if( Typical_Price <= 0.5326 )
						if( Negative_Money_Flow_Sum <= 1.84276e+07 )
							if( MFI <= 35.6003 )
								if( Money_Flow_Ratio <= 0.402295 )
									ret := -0.571429
								if( Money_Flow_Ratio > 0.402295 )
									ret := 0.500000
							if( MFI > 35.6003 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.84276e+07 )
							if( Short_Long_Diff <= -0.0011 )
								ret := -0.571429
							if( Short_Long_Diff > -0.0011 )
								if( MFI_High <= -43.501 )
									ret := 0.600000
								if( MFI_High > -43.501 )
									ret := -0.333333
					if( Typical_Price > 0.5326 )
						if( Negative_Money_Flow_Sum <= 9.65539e+07 )
							if( Positive_Money_Flow_Sum <= 9.92347e+06 )
								if( Negative_Money_Flow_Sum <= 3.06302e+07 )
									ret := 0.647059
								if( Negative_Money_Flow_Sum > 3.06302e+07 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 9.92347e+06 )
								if( MFI <= 36.0161 )
									ret := -0.694915
								if( MFI > 36.0161 )
									ret := 0.500000
						if( Negative_Money_Flow_Sum > 9.65539e+07 )
							ret := 1.000000 // buy
				if( Money_Flow_Ratio > 0.621888 )
					if( Money_Flow_Ratio <= 2.40381 )
						if( Raw_Money_Flow <= 9.77739e+06 )
							if( MFI <= 60.5708 )
								if( MFI <= 40.2596 )
									ret := 0.782609 // buy
								if( MFI > 40.2596 )
									ret := 0.000000
							if( MFI > 60.5708 )
								if( Positive_Money_Flow_Sum <= 3.52212e+07 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 3.52212e+07 )
									ret := 1.000000 // buy
						if( Raw_Money_Flow > 9.77739e+06 )
							if( Short_Long_Diff <= 0.005883 )
								if( Short_MA <= 0.473683 )
									ret := 0.272727
								if( Short_MA > 0.473683 )
									ret := 0.867470 // buy
							if( Short_Long_Diff > 0.005883 )
								ret := 0.000000
					if( Money_Flow_Ratio > 2.40381 )
						if( Positive_Money_Flow_Sum <= 4.89866e+07 )
							ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 4.89866e+07 )
							ret := -1.000000 // sell
		if( Positive_Money_Flow_Sum > 5.35238e+07 )
			if( Short_Long_Diff <= -0.010845 )
				if( Long_MA <= 0.496388 )
					if( MFI_High <= -33.1135 )
						ret := -1.000000 // sell
					if( MFI_High > -33.1135 )
						ret := 1.000000 // buy
				if( Long_MA > 0.496388 )
					if( Negative_Money_Flow_Sum <= 1.43708e+08 )
						if( Negative_Money_Flow_Sum <= 1.38675e+08 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 1.38675e+08 )
							ret := 0.250000
					if( Negative_Money_Flow_Sum > 1.43708e+08 )
						ret := 1.000000 // buy
			if( Short_Long_Diff > -0.010845 )
				if( Money_Flow_Ratio <= 2.85444 )
					if( MFI_Low <= 11.2535 )
						ret := 1.000000 // buy
					if( MFI_Low > 11.2535 )
						if( MFI <= 38.1514 )
							if( Raw_Money_Flow <= 2.25298e+07 )
								if( Positive_Money_Flow_Sum <= 6.72241e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 6.72241e+07 )
									ret := -0.250000
							if( Raw_Money_Flow > 2.25298e+07 )
								ret := 0.000000
						if( MFI > 38.1514 )
							if( Positive_Money_Flow_Sum <= 7.58914e+07 )
								if( Short_MA <= 0.536657 )
									ret := -0.451613
								if( Short_MA > 0.536657 )
									ret := 0.292929
							if( Positive_Money_Flow_Sum > 7.58914e+07 )
								if( Positive_Money_Flow_Sum <= 8.55627e+07 )
									ret := -0.976190 // sell
								if( Positive_Money_Flow_Sum > 8.55627e+07 )
									ret := -0.105263
				if( Money_Flow_Ratio > 2.85444 )
					if( Negative_Money_Flow <= 1.00013e+07 )
						if( Long_MA <= 0.469036 )
							if( Negative_Money_Flow_Sum <= 3.675e+07 )
								ret := 0.250000
							if( Negative_Money_Flow_Sum > 3.675e+07 )
								ret := 1.000000 // buy
						if( Long_MA > 0.469036 )
							if( Negative_Money_Flow <= 9.20315e+06 )
								if( Negative_Money_Flow <= 8.4398e+06 )
									ret := -0.600000
								if( Negative_Money_Flow > 8.4398e+06 )
									ret := 0.500000
							if( Negative_Money_Flow > 9.20315e+06 )
								if( MFI_High <= -0.495996 )
									ret := -1.000000 // sell
								if( MFI_High > -0.495996 )
									ret := -0.666667
					if( Negative_Money_Flow > 1.00013e+07 )
						if( Short_Long_Diff <= 0.005685 )
							ret := -0.750000 // sell
						if( Short_Long_Diff > 0.005685 )
							if( Money_Flow_Ratio <= 6.08315 )
								if( Negative_Money_Flow_Sum <= 1.17267e+08 )
									ret := 0.796875 // buy
								if( Negative_Money_Flow_Sum > 1.17267e+08 )
									ret := 0.142857
							if( Money_Flow_Ratio > 6.08315 )
								ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_MA_Cross_SMA 
//@version=5
//indicator title="MA Cross", overlay=true)

shortlen = input.int(9, title="Short MA Length", minval=1)
longlen = input.int(21, title="Long MA Length", minval=1)

// Calculate the short and long simple moving averages (SMA)
Short_MA = ta.sma(close, shortlen)
Long_MA = ta.sma(close, longlen)

// Calculate the difference between short MA and long MA
Short_Long_Diff = Short_MA - Long_MA

// Identify crossover points where short MA crosses above or below the long MA
MA_Cross = ta.valuewhen(ta.crossover(Short_MA, Long_MA), Short_MA, 0)

// Plot the results
plot(Short_MA, color=color.orange, title="Short MA")
plot(Long_MA, color=color.green, title="Long MA")
plotshape(na(MA_Cross) ? na : MA_Cross, style=shape.cross, location=location.absolute, color=color.blue, title="Cross")


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
float op_operation = decision_tree_0_XRPUSDT_15Min_064679d6(MA_Cross, Long_MA, Short_Long_Diff, Short_MA, Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)

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


