//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: ADSK_15Min_2CM0_8fe86e63 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_15Min_2CM0_8fe86e63", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_15Min_8fe86e63(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Typical_Price <= 196.226 )
		if( Money_Flow_Ratio <= 0.099049 )
			if( mf <= -0.539976 )
				if( MFI <= 7.08329 )
					if( mf <= -0.653438 )
						if( mf <= -0.727829 )
							ret := 0.000000
						if( mf > -0.727829 )
							ret := 0.600000
					if( mf > -0.653438 )
						if( Positive_Money_Flow_Sum <= 1.35072e+07 )
							if( Negative_Money_Flow <= 52844.8 )
								ret := 0.000000
							if( Negative_Money_Flow > 52844.8 )
								if( Typical_Price <= 165.566 )
									ret := -0.800000 // sell
								if( Typical_Price > 165.566 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 1.35072e+07 )
							if( Raw_Money_Flow <= 1.25753e+06 )
								ret := 0.333333
							if( Raw_Money_Flow > 1.25753e+06 )
								if( Negative_Money_Flow <= 4.2895e+06 )
									ret := 0.000000
								if( Negative_Money_Flow > 4.2895e+06 )
									ret := -0.250000
				if( MFI > 7.08329 )
					if( MFI_Low <= -12.6877 )
						ret := -1.000000 // sell
					if( MFI_Low > -12.6877 )
						if( mf <= -0.586966 )
							ret := -0.250000
						if( mf > -0.586966 )
							ret := -1.000000 // sell
			if( mf > -0.539976 )
				if( MFI <= 2.01912 )
					if( Negative_Money_Flow_Sum <= 3.17098e+08 )
						if( Raw_Money_Flow <= 3.72064e+07 )
							if( Negative_Money_Flow_Sum <= 2.79401e+08 )
								if( mf <= -0.011356 )
									ret := 0.115942
								if( mf > -0.011356 )
									ret := -0.545455
							if( Negative_Money_Flow_Sum > 2.79401e+08 )
								if( MFI_Low <= -19.8565 )
									ret := 0.571429
								if( MFI_Low > -19.8565 )
									ret := 1.000000 // buy
						if( Raw_Money_Flow > 3.72064e+07 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 3.17098e+08 )
						if( Positive_Money_Flow_Sum <= 4.0929e+06 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 4.0929e+06 )
							if( mf <= -0.442633 )
								ret := -1.000000 // sell
							if( mf > -0.442633 )
								if( Negative_Money_Flow_Sum <= 4.19258e+08 )
									ret := -0.250000
								if( Negative_Money_Flow_Sum > 4.19258e+08 )
									ret := 0.000000
				if( MFI > 2.01912 )
					if( Typical_Price <= 126.712 )
						if( Positive_Money_Flow_Sum <= 8.19183e+06 )
							if( Negative_Money_Flow_Sum <= 8.3849e+07 )
								if( Typical_Price <= 99.9568 )
									ret := -0.800000 // sell
								if( Typical_Price > 99.9568 )
									ret := 0.250000
							if( Negative_Money_Flow_Sum > 8.3849e+07 )
								if( mf <= -0.416856 )
									ret := -0.166667
								if( mf > -0.416856 )
									ret := 0.795455 // buy
						if( Positive_Money_Flow_Sum > 8.19183e+06 )
							if( ad_mf <= -0.310839 )
								if( Raw_Money_Flow <= 3.56457e+07 )
									ret := -0.441176
								if( Raw_Money_Flow > 3.56457e+07 )
									ret := 0.400000
							if( ad_mf > -0.310839 )
								if( Typical_Price <= 115.931 )
									ret := -0.033333
								if( Typical_Price > 115.931 )
									ret := 0.600000
					if( Typical_Price > 126.712 )
						if( Raw_Money_Flow <= 397910 )
							if( Negative_Money_Flow_Sum <= 3.65981e+08 )
								if( mf <= 0.385338 )
									ret := 0.797297 // buy
								if( mf > 0.385338 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 3.65981e+08 )
								if( Negative_Money_Flow_Sum <= 3.70548e+08 )
									ret := 0.888889 // buy
								if( Negative_Money_Flow_Sum > 3.70548e+08 )
									ret := 1.000000 // buy
						if( Raw_Money_Flow > 397910 )
							if( Negative_Money_Flow_Sum <= 8.1569e+07 )
								if( ad <= 7626.22 )
									ret := -0.277778
								if( ad > 7626.22 )
									ret := 0.666667
							if( Negative_Money_Flow_Sum > 8.1569e+07 )
								if( mf <= -0.49188 )
									ret := -0.307692
								if( mf > -0.49188 )
									ret := 0.534799
		if( Money_Flow_Ratio > 0.099049 )
			if( Raw_Money_Flow <= 1.75961e+06 )
				if( Negative_Money_Flow <= 24149.2 )
					if( Positive_Money_Flow_Sum <= 1.64049e+08 )
						if( Negative_Money_Flow_Sum <= 2.09179e+08 )
							if( mf <= 0.187448 )
								if( Negative_Money_Flow_Sum <= 7.65417e+07 )
									ret := 0.205564
								if( Negative_Money_Flow_Sum > 7.65417e+07 )
									ret := 0.028459
							if( mf > 0.187448 )
								if( Negative_Money_Flow_Sum <= 1.23297e+06 )
									ret := 0.885714 // buy
								if( Negative_Money_Flow_Sum > 1.23297e+06 )
									ret := -0.172269
						if( Negative_Money_Flow_Sum > 2.09179e+08 )
							if( Positive_Money_Flow_Sum <= 1.43352e+08 )
								if( Raw_Money_Flow <= 755390 )
									ret := -0.758621 // sell
								if( Raw_Money_Flow > 755390 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 1.43352e+08 )
								ret := 0.166667
					if( Positive_Money_Flow_Sum > 1.64049e+08 )
						if( MFI <= 77.8528 )
							if( Typical_Price <= 191.265 )
								if( Negative_Money_Flow_Sum <= 1.47268e+08 )
									ret := -0.752688 // sell
								if( Negative_Money_Flow_Sum > 1.47268e+08 )
									ret := -0.227273
							if( Typical_Price > 191.265 )
								if( mf <= 0.071319 )
									ret := 0.750000 // buy
								if( mf > 0.071319 )
									ret := -0.200000
						if( MFI > 77.8528 )
							if( Typical_Price <= 108.862 )
								if( Negative_Money_Flow_Sum <= 5.31186e+07 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 5.31186e+07 )
									ret := 1.000000 // buy
							if( Typical_Price > 108.862 )
								if( MFI_Low <= 58.9118 )
									ret := 1.000000 // buy
								if( MFI_Low > 58.9118 )
									ret := -0.109091
				if( Negative_Money_Flow > 24149.2 )
					if( MFI_Low <= 75.4118 )
						if( Money_Flow_Ratio <= 7.5524 )
							if( MFI_Low <= 63.1231 )
								if( Negative_Money_Flow_Sum <= 4.5988e+08 )
									ret := 0.301824
								if( Negative_Money_Flow_Sum > 4.5988e+08 )
									ret := -1.000000 // sell
							if( MFI_Low > 63.1231 )
								if( Positive_Money_Flow_Sum <= 7.84167e+07 )
									ret := 0.823529 // buy
								if( Positive_Money_Flow_Sum > 7.84167e+07 )
									ret := -0.255814
						if( Money_Flow_Ratio > 7.5524 )
							if( Positive_Money_Flow_Sum <= 2.5856e+08 )
								if( MFI <= 89.4332 )
									ret := 0.948718 // buy
								if( MFI > 89.4332 )
									ret := 0.608108
							if( Positive_Money_Flow_Sum > 2.5856e+08 )
								if( Typical_Price <= 159.897 )
									ret := 0.500000
								if( Typical_Price > 159.897 )
									ret := -0.833333 // sell
					if( MFI_Low > 75.4118 )
						if( MFI_Low <= 79.2516 )
							if( Typical_Price <= 130.293 )
								ret := 0.500000
							if( Typical_Price > 130.293 )
								if( ad_mf <= -827.819 )
									ret := -0.750000 // sell
								if( ad_mf > -827.819 )
									ret := -1.000000 // sell
						if( MFI_Low > 79.2516 )
							ret := 1.000000 // buy
			if( Raw_Money_Flow > 1.75961e+06 )
				if( Negative_Money_Flow_Sum <= 3.2345e+08 )
					if( Money_Flow_Ratio <= 2.20365 )
						if( Positive_Money_Flow_Sum <= 2.5598e+08 )
							if( Typical_Price <= 156.252 )
								if( ad_mf <= -428581 )
									ret := 0.578947
								if( ad_mf > -428581 )
									ret := 0.013908
							if( Typical_Price > 156.252 )
								if( Money_Flow_Ratio <= 0.622618 )
									ret := 0.127981
								if( Money_Flow_Ratio > 0.622618 )
									ret := 0.039604
						if( Positive_Money_Flow_Sum > 2.5598e+08 )
							if( Raw_Money_Flow <= 6.24895e+07 )
								if( Negative_Money_Flow_Sum <= 1.74265e+08 )
									ret := 0.954545 // buy
								if( Negative_Money_Flow_Sum > 1.74265e+08 )
									ret := 0.351852
							if( Raw_Money_Flow > 6.24895e+07 )
								if( Typical_Price <= 141.277 )
									ret := -0.600000
								if( Typical_Price > 141.277 )
									ret := -1.000000 // sell
					if( Money_Flow_Ratio > 2.20365 )
						if( Negative_Money_Flow_Sum <= 1.77186e+08 )
							if( Negative_Money_Flow <= 1.15113e+07 )
								if( mf <= -0.003454 )
									ret := 0.229249
								if( mf > -0.003454 )
									ret := 0.090149
							if( Negative_Money_Flow > 1.15113e+07 )
								if( MFI <= 87.4239 )
									ret := -0.160000
								if( MFI > 87.4239 )
									ret := 0.269231
						if( Negative_Money_Flow_Sum > 1.77186e+08 )
							if( MFI <= 83.5026 )
								if( MFI_Low <= 54.2923 )
									ret := 0.750000 // buy
								if( MFI_Low > 54.2923 )
									ret := 1.000000 // buy
							if( MFI > 83.5026 )
								ret := 0.500000
				if( Negative_Money_Flow_Sum > 3.2345e+08 )
					if( MFI_Low <= 10.5114 )
						if( ad <= 23613.8 )
							if( Negative_Money_Flow <= 4.67372e+07 )
								if( Negative_Money_Flow <= 253.069 )
									ret := -0.550000
								if( Negative_Money_Flow > 253.069 )
									ret := -0.886792 // sell
							if( Negative_Money_Flow > 4.67372e+07 )
								if( Negative_Money_Flow <= 5.97933e+07 )
									ret := 0.500000
								if( Negative_Money_Flow > 5.97933e+07 )
									ret := -1.000000 // sell
						if( ad > 23613.8 )
							if( Typical_Price <= 129.409 )
								if( Typical_Price <= 120.124 )
									ret := -0.166667
								if( Typical_Price > 120.124 )
									ret := -1.000000 // sell
							if( Typical_Price > 129.409 )
								if( Positive_Money_Flow <= 1.07832e+07 )
									ret := 0.500000
								if( Positive_Money_Flow > 1.07832e+07 )
									ret := -0.400000
					if( MFI_Low > 10.5114 )
						if( Money_Flow_Ratio <= 0.784966 )
							if( ad <= 104217 )
								ret := 1.000000 // buy
							if( ad > 104217 )
								ret := -0.250000
						if( Money_Flow_Ratio > 0.784966 )
							if( MFI_Low <= 28.4827 )
								if( ad <= 73943.8 )
									ret := -0.250000
								if( ad > 73943.8 )
									ret := 0.000000
							if( MFI_Low > 28.4827 )
								ret := -1.000000 // sell
	if( Typical_Price > 196.226 )
		if( Raw_Money_Flow <= 1.2013e+06 )
			if( Negative_Money_Flow_Sum <= 3.53946e+07 )
				if( Typical_Price <= 222.427 )
					if( Positive_Money_Flow_Sum <= 3.42241e+08 )
						if( Typical_Price <= 202.531 )
							if( mf <= 0.248337 )
								if( Money_Flow_Ratio <= 2.32109 )
									ret := -0.666667
								if( Money_Flow_Ratio > 2.32109 )
									ret := 0.490566
							if( mf > 0.248337 )
								if( MFI_Low <= 55.8756 )
									ret := 0.285714
								if( MFI_Low > 55.8756 )
									ret := -0.857143 // sell
						if( Typical_Price > 202.531 )
							if( mf <= 0.233614 )
								if( MFI_High <= -0.859972 )
									ret := -0.600000
								if( MFI_High > -0.859972 )
									ret := -0.021053
							if( mf > 0.233614 )
								if( Positive_Money_Flow_Sum <= 1.24162e+08 )
									ret := -0.490196
								if( Positive_Money_Flow_Sum > 1.24162e+08 )
									ret := -0.949153 // sell
					if( Positive_Money_Flow_Sum > 3.42241e+08 )
						if( Raw_Money_Flow <= 241526 )
							if( Positive_Money_Flow_Sum <= 6.7815e+08 )
								if( ad_mf <= 0.332826 )
									ret := 0.857143 // buy
								if( ad_mf > 0.332826 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 6.7815e+08 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 241526 )
							if( Positive_Money_Flow <= 378940 )
								ret := -0.250000
							if( Positive_Money_Flow > 378940 )
								ret := -0.500000
				if( Typical_Price > 222.427 )
					if( mf <= 0.287193 )
						if( MFI <= 87.0652 )
							if( MFI_High <= 6.02909 )
								if( Positive_Money_Flow_Sum <= 910440 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 910440 )
									ret := -0.095455
							if( MFI_High > 6.02909 )
								if( mf <= -0.101181 )
									ret := 1.000000 // buy
								if( mf > -0.101181 )
									ret := -0.838710 // sell
						if( MFI > 87.0652 )
							if( Positive_Money_Flow_Sum <= 2.13999e+08 )
								if( Typical_Price <= 251.675 )
									ret := 0.216216
								if( Typical_Price > 251.675 )
									ret := 0.644737
							if( Positive_Money_Flow_Sum > 2.13999e+08 )
								if( Negative_Money_Flow <= 20940.4 )
									ret := -0.583333
								if( Negative_Money_Flow > 20940.4 )
									ret := 0.205882
					if( mf > 0.287193 )
						if( Negative_Money_Flow_Sum <= 1.40565e+06 )
							if( MFI_High <= 15.0017 )
								ret := 0.000000
							if( MFI_High > 15.0017 )
								if( Typical_Price <= 250.353 )
									ret := 1.000000 // buy
								if( Typical_Price > 250.353 )
									ret := 0.500000
						if( Negative_Money_Flow_Sum > 1.40565e+06 )
							if( ad_mf <= -1239.48 )
								ret := 0.500000
							if( ad_mf > -1239.48 )
								if( MFI <= 76.0488 )
									ret := 0.000000
								if( MFI > 76.0488 )
									ret := -0.883333 // sell
			if( Negative_Money_Flow_Sum > 3.53946e+07 )
				if( ad_mf <= -0.212105 )
					if( Positive_Money_Flow_Sum <= 8.53679e+06 )
						if( Money_Flow_Ratio <= 0.005165 )
							ret := 0.000000
						if( Money_Flow_Ratio > 0.005165 )
							if( ad <= -2445.15 )
								ret := -0.500000
							if( ad > -2445.15 )
								if( Negative_Money_Flow <= 821.758 )
									ret := -0.777778 // sell
								if( Negative_Money_Flow > 821.758 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 8.53679e+06 )
						if( Positive_Money_Flow <= 17058.2 )
							if( Positive_Money_Flow_Sum <= 2.94222e+08 )
								if( mf <= -0.3569 )
									ret := 0.080000
								if( mf > -0.3569 )
									ret := 0.500000
							if( Positive_Money_Flow_Sum > 2.94222e+08 )
								if( MFI_High <= -11.6094 )
									ret := 1.000000 // buy
								if( MFI_High > -11.6094 )
									ret := -0.470588
						if( Positive_Money_Flow > 17058.2 )
							if( Positive_Money_Flow_Sum <= 1.25264e+08 )
								if( Positive_Money_Flow_Sum <= 5.17123e+07 )
									ret := 0.042017
								if( Positive_Money_Flow_Sum > 5.17123e+07 )
									ret := 0.503731
							if( Positive_Money_Flow_Sum > 1.25264e+08 )
								if( Negative_Money_Flow_Sum <= 6.30908e+07 )
									ret := 0.530120
								if( Negative_Money_Flow_Sum > 6.30908e+07 )
									ret := -0.217054
				if( ad_mf > -0.212105 )
					if( Negative_Money_Flow_Sum <= 2.6789e+08 )
						if( mf <= -0.10887 )
							if( MFI_High <= -66.7143 )
								if( Negative_Money_Flow_Sum <= 2.02626e+08 )
									ret := -0.183099
								if( Negative_Money_Flow_Sum > 2.02626e+08 )
									ret := -0.690909
							if( MFI_High > -66.7143 )
								if( Typical_Price <= 199.782 )
									ret := -0.710526 // sell
								if( Typical_Price > 199.782 )
									ret := 0.033430
						if( mf > -0.10887 )
							if( Positive_Money_Flow_Sum <= 1.03766e+08 )
								if( Typical_Price <= 238.593 )
									ret := 0.380386
								if( Typical_Price > 238.593 )
									ret := 0.130526
							if( Positive_Money_Flow_Sum > 1.03766e+08 )
								if( Positive_Money_Flow_Sum <= 2.96798e+08 )
									ret := -0.074199
								if( Positive_Money_Flow_Sum > 2.96798e+08 )
									ret := -0.550000
					if( Negative_Money_Flow_Sum > 2.6789e+08 )
						if( Positive_Money_Flow_Sum <= 5.29445e+07 )
							if( Money_Flow_Ratio <= 0.065035 )
								if( Negative_Money_Flow_Sum <= 2.84123e+08 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 2.84123e+08 )
									ret := 0.347826
							if( Money_Flow_Ratio > 0.065035 )
								if( Typical_Price <= 215.788 )
									ret := 0.466667
								if( Typical_Price > 215.788 )
									ret := 0.942029 // buy
						if( Positive_Money_Flow_Sum > 5.29445e+07 )
							if( Positive_Money_Flow_Sum <= 7.18075e+07 )
								if( Negative_Money_Flow_Sum <= 3.01353e+08 )
									ret := -0.923077 // sell
								if( Negative_Money_Flow_Sum > 3.01353e+08 )
									ret := -0.166667
							if( Positive_Money_Flow_Sum > 7.18075e+07 )
								if( Typical_Price <= 226.28 )
									ret := -0.100000
								if( Typical_Price > 226.28 )
									ret := 0.666667
		if( Raw_Money_Flow > 1.2013e+06 )
			if( Money_Flow_Ratio <= 0.078805 )
				if( Positive_Money_Flow_Sum <= 2.03667e+07 )
					if( Typical_Price <= 256.074 )
						if( ad <= -25667.8 )
							if( MFI_Low <= -13.9865 )
								if( Raw_Money_Flow <= 6.66649e+07 )
									ret := 0.387755
								if( Raw_Money_Flow > 6.66649e+07 )
									ret := -0.600000
							if( MFI_Low > -13.9865 )
								ret := -0.666667
						if( ad > -25667.8 )
							if( ad_mf <= 5412.3 )
								if( ad <= -8645.87 )
									ret := -0.328358
								if( ad > -8645.87 )
									ret := -0.743590 // sell
							if( ad_mf > 5412.3 )
								if( Money_Flow_Ratio <= 0.029474 )
									ret := -0.478261
								if( Money_Flow_Ratio > 0.029474 )
									ret := 0.166667
					if( Typical_Price > 256.074 )
						if( Negative_Money_Flow_Sum <= 1.42454e+08 )
							if( Typical_Price <= 280.925 )
								ret := 0.750000 // buy
							if( Typical_Price > 280.925 )
								if( MFI_High <= -75.3408 )
									ret := -0.250000
								if( MFI_High > -75.3408 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 1.42454e+08 )
							if( mf <= -0.450591 )
								ret := 0.000000
							if( mf > -0.450591 )
								if( Typical_Price <= 281.253 )
									ret := -0.823529 // sell
								if( Typical_Price > 281.253 )
									ret := -0.568627
				if( Positive_Money_Flow_Sum > 2.03667e+07 )
					if( Typical_Price <= 286.093 )
						if( Negative_Money_Flow_Sum <= 4.81555e+08 )
							ret := 0.142857
						if( Negative_Money_Flow_Sum > 4.81555e+08 )
							ret := 1.000000 // buy
					if( Typical_Price > 286.093 )
						ret := -0.200000
			if( Money_Flow_Ratio > 0.078805 )
				if( MFI_Low <= 2.71926 )
					if( Negative_Money_Flow_Sum <= 2.43303e+08 )
						if( Negative_Money_Flow_Sum <= 1.84246e+08 )
							if( mf <= 0.229321 )
								if( Positive_Money_Flow <= 6.88146e+06 )
									ret := 0.087500
								if( Positive_Money_Flow > 6.88146e+06 )
									ret := 0.334630
							if( mf > 0.229321 )
								if( Negative_Money_Flow_Sum <= 7.25709e+07 )
									ret := 0.083333
								if( Negative_Money_Flow_Sum > 7.25709e+07 )
									ret := -0.456522
						if( Negative_Money_Flow_Sum > 1.84246e+08 )
							if( ad <= -65551.9 )
								if( Typical_Price <= 224.496 )
									ret := 0.047619
								if( Typical_Price > 224.496 )
									ret := 0.812500 // buy
							if( ad > -65551.9 )
								if( Negative_Money_Flow <= 5.44331e+06 )
									ret := 0.078431
								if( Negative_Money_Flow > 5.44331e+06 )
									ret := -0.346032
					if( Negative_Money_Flow_Sum > 2.43303e+08 )
						if( ad <= 23289.7 )
							if( Positive_Money_Flow_Sum <= 4.08556e+07 )
								if( Negative_Money_Flow_Sum <= 3.13266e+08 )
									ret := 0.200000
								if( Negative_Money_Flow_Sum > 3.13266e+08 )
									ret := -0.333333
							if( Positive_Money_Flow_Sum > 4.08556e+07 )
								if( Typical_Price <= 281.704 )
									ret := 0.560510
								if( Typical_Price > 281.704 )
									ret := 0.066667
						if( ad > 23289.7 )
							if( Negative_Money_Flow_Sum <= 3.43959e+08 )
								if( Raw_Money_Flow <= 1.38278e+07 )
									ret := 0.391304
								if( Raw_Money_Flow > 1.38278e+07 )
									ret := -0.346667
							if( Negative_Money_Flow_Sum > 3.43959e+08 )
								if( Negative_Money_Flow_Sum <= 6.05066e+08 )
									ret := 0.714286 // buy
								if( Negative_Money_Flow_Sum > 6.05066e+08 )
									ret := -0.750000 // sell
				if( MFI_Low > 2.71926 )
					if( Money_Flow_Ratio <= 778 )
						if( Negative_Money_Flow <= 1.02733e+08 )
							if( Negative_Money_Flow_Sum <= 1.91185e+08 )
								if( ad_mf <= 0.107477 )
									ret := 0.030275
								if( ad_mf > 0.107477 )
									ret := -0.019067
							if( Negative_Money_Flow_Sum > 1.91185e+08 )
								if( Positive_Money_Flow <= 3.43571e+07 )
									ret := -0.178862
								if( Positive_Money_Flow > 3.43571e+07 )
									ret := 0.285714
						if( Negative_Money_Flow > 1.02733e+08 )
							if( Negative_Money_Flow <= 1.32339e+08 )
								if( Positive_Money_Flow_Sum <= 9.05449e+07 )
									ret := 0.947368 // buy
								if( Positive_Money_Flow_Sum > 9.05449e+07 )
									ret := 0.254902
							if( Negative_Money_Flow > 1.32339e+08 )
								if( Positive_Money_Flow_Sum <= 1.47254e+08 )
									ret := -0.647059
								if( Positive_Money_Flow_Sum > 1.47254e+08 )
									ret := 0.500000
					if( Money_Flow_Ratio > 778 )
						if( Positive_Money_Flow_Sum <= 3.02194e+08 )
							if( Money_Flow_Ratio <= 2189.07 )
								ret := 1.000000 // buy
							if( Money_Flow_Ratio > 2189.07 )
								ret := 0.500000
						if( Positive_Money_Flow_Sum > 3.02194e+08 )
							if( Typical_Price <= 211.82 )
								ret := 1.000000 // buy
							if( Typical_Price > 211.82 )
								if( mf <= 0.314587 )
									ret := -1.000000 // sell
								if( mf > 0.314587 )
									ret := -0.500000
	
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
float op_operation = decision_tree_0_ADSK_15Min_8fe86e63(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


