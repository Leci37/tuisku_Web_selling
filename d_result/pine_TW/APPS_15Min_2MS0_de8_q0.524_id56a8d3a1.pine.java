//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: APPS_15Min_2MS0_56a8d3a1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_15Min_2MS0_56a8d3a1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_15Min_56a8d3a1(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 22.598 )
		if( Negative_Money_Flow <= 10.5921 )
			if( Typical_Price <= 73.8182 )
				if( Raw_Money_Flow <= 172894 )
					if( rsi1 <= 48.162 )
						if( Positive_Money_Flow <= 4385.2 )
							if( d_k <= 8.39647 )
								if( MFI_High <= -65.3639 )
									ret := -0.021505
								if( MFI_High > -65.3639 )
									ret := 0.260131
							if( d_k > 8.39647 )
								if( Money_Flow_Ratio <= 0.510917 )
									ret := 0.090909
								if( Money_Flow_Ratio > 0.510917 )
									ret := -0.232000
						if( Positive_Money_Flow > 4385.2 )
							if( Positive_Money_Flow_Sum <= 2.04551e+07 )
								if( rsi1 <= 38.5087 )
									ret := 0.032508
								if( rsi1 > 38.5087 )
									ret := -0.128131
							if( Positive_Money_Flow_Sum > 2.04551e+07 )
								if( Money_Flow_Ratio <= 1.46033 )
									ret := -0.048780
								if( Money_Flow_Ratio > 1.46033 )
									ret := 0.625000
					if( rsi1 > 48.162 )
						if( MFI_High <= -38.7428 )
							if( Positive_Money_Flow_Sum <= 89493.9 )
								if( Positive_Money_Flow_Sum <= 38633.8 )
									ret := -0.379310
								if( Positive_Money_Flow_Sum > 38633.8 )
									ret := -0.836735 // sell
							if( Positive_Money_Flow_Sum > 89493.9 )
								if( rsi1 <= 50.5177 )
									ret := -0.434783
								if( rsi1 > 50.5177 )
									ret := -0.122905
						if( MFI_High > -38.7428 )
							if( MFI_High <= -37.4149 )
								if( Positive_Money_Flow_Sum <= 5.47789e+06 )
									ret := 0.250000
								if( Positive_Money_Flow_Sum > 5.47789e+06 )
									ret := 0.687500
							if( MFI_High > -37.4149 )
								if( Typical_Price <= 60.2522 )
									ret := -0.191312
								if( Typical_Price > 60.2522 )
									ret := 0.322034
				if( Raw_Money_Flow > 172894 )
					if( d <= 38.2763 )
						if( MFI_Low <= 50.1591 )
							if( Negative_Money_Flow_Sum <= 1.31741e+08 )
								if( d <= 17.8143 )
									ret := 0.101241
								if( d > 17.8143 )
									ret := -0.008092
							if( Negative_Money_Flow_Sum > 1.31741e+08 )
								if( Negative_Money_Flow_Sum <= 1.63079e+08 )
									ret := -0.956522 // sell
								if( Negative_Money_Flow_Sum > 1.63079e+08 )
									ret := -0.351351
						if( MFI_Low > 50.1591 )
							if( smoothD_d <= 0.349271 )
								if( MFI_Low <= 62.3229 )
									ret := 0.157895
								if( MFI_Low > 62.3229 )
									ret := -0.466667
							if( smoothD_d > 0.349271 )
								if( Typical_Price <= 3.57667 )
									ret := -0.081081
								if( Typical_Price > 3.57667 )
									ret := 0.439437
					if( d > 38.2763 )
						if( d_k <= 19.1419 )
							ret := -0.866667 // sell
						if( d_k > 19.1419 )
							if( smoothK_k <= 16.817 )
								if( MFI <= 29.709 )
									ret := -0.600000
								if( MFI > 29.709 )
									ret := 0.193548
							if( smoothK_k > 16.817 )
								if( d_k <= 21.7766 )
									ret := 0.090909
								if( d_k > 21.7766 )
									ret := -0.500000
			if( Typical_Price > 73.8182 )
				if( Raw_Money_Flow <= 492568 )
					if( Money_Flow_Ratio <= 3.21627 )
						if( MFI_Low <= -14.8719 )
							ret := 0.500000
						if( MFI_Low > -14.8719 )
							if( Negative_Money_Flow_Sum <= 1.73049e+07 )
								if( Positive_Money_Flow_Sum <= 1.07853e+06 )
									ret := 0.388889
								if( Positive_Money_Flow_Sum > 1.07853e+06 )
									ret := 0.047619
							if( Negative_Money_Flow_Sum > 1.73049e+07 )
								if( k <= 5.43868 )
									ret := -0.250000
								if( k > 5.43868 )
									ret := -0.018519
					if( Money_Flow_Ratio > 3.21627 )
						ret := -0.466667
				if( Raw_Money_Flow > 492568 )
					if( rsi1 <= 25.4131 )
						if( MFI_High <= -55.6816 )
							if( Typical_Price <= 83.622 )
								ret := -1.000000 // sell
							if( Typical_Price > 83.622 )
								ret := -0.800000 // sell
						if( MFI_High > -55.6816 )
							ret := 0.000000
					if( rsi1 > 25.4131 )
						if( MFI_Low <= -0.489648 )
							ret := 0.733333 // buy
						if( MFI_Low > -0.489648 )
							if( k <= 9.90226 )
								if( Typical_Price <= 75.7067 )
									ret := 0.500000
								if( Typical_Price > 75.7067 )
									ret := -0.110092
							if( k > 9.90226 )
								if( Money_Flow_Ratio <= 2.82695 )
									ret := -0.390805
								if( Money_Flow_Ratio > 2.82695 )
									ret := -0.913043 // sell
		if( Negative_Money_Flow > 10.5921 )
			if( Negative_Money_Flow <= 43827.6 )
				if( Money_Flow_Ratio <= 4.74757 )
					if( rsi1 <= 51.9285 )
						if( Typical_Price <= 1.22997 )
							if( MFI_Low <= 15.6718 )
								if( Positive_Money_Flow_Sum <= 15876 )
									ret := 0.444882
								if( Positive_Money_Flow_Sum > 15876 )
									ret := 0.751196 // buy
							if( MFI_Low > 15.6718 )
								if( Negative_Money_Flow <= 26280.8 )
									ret := 0.342007
								if( Negative_Money_Flow > 26280.8 )
									ret := -0.529412
						if( Typical_Price > 1.22997 )
							if( smoothK_k <= 0.76451 )
								if( MFI <= 17.2285 )
									ret := -0.047414
								if( MFI > 17.2285 )
									ret := 0.211045
							if( smoothK_k > 0.76451 )
								if( Raw_Money_Flow <= 3293.04 )
									ret := 0.474898
								if( Raw_Money_Flow > 3293.04 )
									ret := 0.295637
					if( rsi1 > 51.9285 )
						if( MFI <= 49.8947 )
							if( smoothD_d <= 6.02364 )
								if( Negative_Money_Flow <= 6946.59 )
									ret := 0.625000
								if( Negative_Money_Flow > 6946.59 )
									ret := 0.125000
							if( smoothD_d > 6.02364 )
								if( Negative_Money_Flow <= 4191.08 )
									ret := -0.166667
								if( Negative_Money_Flow > 4191.08 )
									ret := -0.650000
						if( MFI > 49.8947 )
							if( rsi1 <= 68.9992 )
								if( Negative_Money_Flow_Sum <= 559459 )
									ret := -0.105590
								if( Negative_Money_Flow_Sum > 559459 )
									ret := 0.604839
							if( rsi1 > 68.9992 )
								if( MFI_High <= -13.7408 )
									ret := -0.900000 // sell
								if( MFI_High > -13.7408 )
									ret := -0.400000
				if( Money_Flow_Ratio > 4.74757 )
					if( d <= 21.1561 )
						if( Raw_Money_Flow <= 2632.68 )
							if( Negative_Money_Flow_Sum <= 27894.8 )
								if( k <= 12.2444 )
									ret := 1.000000 // buy
								if( k > 12.2444 )
									ret := 0.461538
							if( Negative_Money_Flow_Sum > 27894.8 )
								if( Typical_Price <= 1.56447 )
									ret := -0.823529 // sell
								if( Typical_Price > 1.56447 )
									ret := 0.277778
						if( Raw_Money_Flow > 2632.68 )
							if( Typical_Price <= 2.56009 )
								if( MFI_High <= 5.89568 )
									ret := -0.666667
								if( MFI_High > 5.89568 )
									ret := -1.000000 // sell
							if( Typical_Price > 2.56009 )
								if( d_k <= 8.39932 )
									ret := -0.370787
								if( d_k > 8.39932 )
									ret := 0.416667
					if( d > 21.1561 )
						if( d_k <= 15.9282 )
							if( smoothK_k <= 11.2611 )
								ret := 1.000000 // buy
							if( smoothK_k > 11.2611 )
								if( rsi1 <= 40.4862 )
									ret := -0.555556
								if( rsi1 > 40.4862 )
									ret := 0.703704 // buy
						if( d_k > 15.9282 )
							if( Negative_Money_Flow <= 10483.7 )
								if( rsi1 <= 50.4579 )
									ret := 0.700000 // buy
								if( rsi1 > 50.4579 )
									ret := -0.076923
							if( Negative_Money_Flow > 10483.7 )
								if( d_k <= 20.7407 )
									ret := -0.666667
								if( d_k > 20.7407 )
									ret := -0.181818
			if( Negative_Money_Flow > 43827.6 )
				if( Negative_Money_Flow_Sum <= 3.59346e+08 )
					if( smoothD_d <= -2.10547 )
						if( Typical_Price <= 10.2633 )
							if( smoothK_k <= -1.8095 )
								if( Negative_Money_Flow <= 399021 )
									ret := -0.095745
								if( Negative_Money_Flow > 399021 )
									ret := 0.250000
							if( smoothK_k > -1.8095 )
								ret := 0.769231 // buy
						if( Typical_Price > 10.2633 )
							if( MFI_Low <= 21.3591 )
								if( smoothK_k <= -2.84616 )
									ret := -0.192308
								if( smoothK_k > -2.84616 )
									ret := -0.546099
							if( MFI_Low > 21.3591 )
								if( Money_Flow_Ratio <= 0.776162 )
									ret := 0.700000 // buy
								if( Money_Flow_Ratio > 0.776162 )
									ret := 0.055556
					if( smoothD_d > -2.10547 )
						if( Money_Flow_Ratio <= 0.025381 )
							if( Positive_Money_Flow <= 39.5189 )
								if( Negative_Money_Flow_Sum <= 1.12167e+06 )
									ret := -0.722222 // sell
								if( Negative_Money_Flow_Sum > 1.12167e+06 )
									ret := -0.011290
							if( Positive_Money_Flow > 39.5189 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.025381 )
							if( k <= 12.7433 )
								if( Money_Flow_Ratio <= 0.180869 )
									ret := 0.337031
								if( Money_Flow_Ratio > 0.180869 )
									ret := 0.113542
							if( k > 12.7433 )
								if( rsi1 <= 34.6324 )
									ret := 0.180398
								if( rsi1 > 34.6324 )
									ret := -0.017568
				if( Negative_Money_Flow_Sum > 3.59346e+08 )
					if( smoothD_d <= 7.7198 )
						ret := -1.000000 // sell
					if( smoothD_d > 7.7198 )
						if( Positive_Money_Flow_Sum <= 9.31502e+07 )
							ret := -0.909091 // sell
						if( Positive_Money_Flow_Sum > 9.31502e+07 )
							ret := -1.000000 // sell
	if( k > 22.598 )
		if( Positive_Money_Flow_Sum <= 6.79643e+07 )
			if( MFI_High <= -13.3388 )
				if( Negative_Money_Flow <= 73.1901 )
					if( Money_Flow_Ratio <= 0.521781 )
						if( Raw_Money_Flow <= 37240.8 )
							if( Raw_Money_Flow <= 377.64 )
								if( Positive_Money_Flow_Sum <= 51974.6 )
									ret := -0.707447 // sell
								if( Positive_Money_Flow_Sum > 51974.6 )
									ret := -0.160714
							if( Raw_Money_Flow > 377.64 )
								if( Positive_Money_Flow <= 192.722 )
									ret := 0.085174
								if( Positive_Money_Flow > 192.722 )
									ret := -0.318678
						if( Raw_Money_Flow > 37240.8 )
							if( Positive_Money_Flow <= 8.56082e+06 )
								if( Positive_Money_Flow_Sum <= 304666 )
									ret := -0.261122
								if( Positive_Money_Flow_Sum > 304666 )
									ret := -0.082343
							if( Positive_Money_Flow > 8.56082e+06 )
								if( Negative_Money_Flow_Sum <= 3.69539e+07 )
									ret := 0.320000
								if( Negative_Money_Flow_Sum > 3.69539e+07 )
									ret := -0.615894
					if( Money_Flow_Ratio > 0.521781 )
						if( MFI_High <= -14.061 )
							if( rsi1 <= 46.6978 )
								if( Positive_Money_Flow_Sum <= 1.20946e+07 )
									ret := 0.101777
								if( Positive_Money_Flow_Sum > 1.20946e+07 )
									ret := -0.086674
							if( rsi1 > 46.6978 )
								if( Negative_Money_Flow_Sum <= 157208 )
									ret := -0.289530
								if( Negative_Money_Flow_Sum > 157208 )
									ret := -0.116513
						if( MFI_High > -14.061 )
							if( Positive_Money_Flow <= 946038 )
								if( Raw_Money_Flow <= 28274.1 )
									ret := -0.494737
								if( Raw_Money_Flow > 28274.1 )
									ret := -0.086022
							if( Positive_Money_Flow > 946038 )
								if( Money_Flow_Ratio <= 1.97974 )
									ret := -0.718750 // sell
								if( Money_Flow_Ratio > 1.97974 )
									ret := -0.333333
				if( Negative_Money_Flow > 73.1901 )
					if( rsi1 <= 52.6989 )
						if( Money_Flow_Ratio <= 0.271683 )
							if( rsi1 <= 40.0018 )
								if( Negative_Money_Flow_Sum <= 2.76161e+07 )
									ret := 0.250220
								if( Negative_Money_Flow_Sum > 2.76161e+07 )
									ret := -0.002882
							if( rsi1 > 40.0018 )
								if( Money_Flow_Ratio <= 0.140317 )
									ret := -0.086656
								if( Money_Flow_Ratio > 0.140317 )
									ret := 0.113320
						if( Money_Flow_Ratio > 0.271683 )
							if( Raw_Money_Flow <= 44548.7 )
								if( rsi1 <= 46.982 )
									ret := 0.244663
								if( rsi1 > 46.982 )
									ret := 0.040911
							if( Raw_Money_Flow > 44548.7 )
								if( Negative_Money_Flow_Sum <= 9.03865e+07 )
									ret := -0.015846
								if( Negative_Money_Flow_Sum > 9.03865e+07 )
									ret := -0.539604
					if( rsi1 > 52.6989 )
						if( Money_Flow_Ratio <= 0.553721 )
							if( Typical_Price <= 9.09338 )
								if( Raw_Money_Flow <= 23504.8 )
									ret := -0.523649
								if( Raw_Money_Flow > 23504.8 )
									ret := -0.215385
							if( Typical_Price > 9.09338 )
								if( Negative_Money_Flow <= 4.47774e+06 )
									ret := -0.129193
								if( Negative_Money_Flow > 4.47774e+06 )
									ret := -0.586957
						if( Money_Flow_Ratio > 0.553721 )
							if( d <= 83.1042 )
								if( MFI_Low <= 44.7358 )
									ret := -0.108903
								if( MFI_Low > 44.7358 )
									ret := 0.148073
							if( d > 83.1042 )
								if( Positive_Money_Flow <= 160.203 )
									ret := 0.067400
								if( Positive_Money_Flow > 160.203 )
									ret := -0.396825
			if( MFI_High > -13.3388 )
				if( smoothK_k <= 68.0518 )
					if( Raw_Money_Flow <= 65623.8 )
						if( MFI_High <= -4.80457 )
							if( Positive_Money_Flow <= 126.883 )
								if( Positive_Money_Flow_Sum <= 7.73072e+06 )
									ret := 0.290503
								if( Positive_Money_Flow_Sum > 7.73072e+06 )
									ret := 0.596774
							if( Positive_Money_Flow > 126.883 )
								if( rsi1 <= 57.1718 )
									ret := 0.254266
								if( rsi1 > 57.1718 )
									ret := -0.013491
						if( MFI_High > -4.80457 )
							if( Positive_Money_Flow_Sum <= 1.49989e+07 )
								if( Negative_Money_Flow <= 19.701 )
									ret := -0.130169
								if( Negative_Money_Flow > 19.701 )
									ret := 0.223638
							if( Positive_Money_Flow_Sum > 1.49989e+07 )
								if( MFI_Low <= 72.1855 )
									ret := 0.152672
								if( MFI_Low > 72.1855 )
									ret := 0.574586
					if( Raw_Money_Flow > 65623.8 )
						if( rsi1 <= 37.5875 )
							if( Typical_Price <= 10.0531 )
								if( rsi1 <= 36.0349 )
									ret := -0.217391
								if( rsi1 > 36.0349 )
									ret := 0.444444
							if( Typical_Price > 10.0531 )
								if( d_k <= -9.54609 )
									ret := 0.333333
								if( d_k > -9.54609 )
									ret := 0.790698 // buy
						if( rsi1 > 37.5875 )
							if( d <= 44.6764 )
								if( MFI <= 97.9829 )
									ret := -0.146733
								if( MFI > 97.9829 )
									ret := 0.258741
							if( d > 44.6764 )
								if( Negative_Money_Flow_Sum <= 2.98432e+07 )
									ret := 0.034529
								if( Negative_Money_Flow_Sum > 2.98432e+07 )
									ret := -0.937500 // sell
				if( smoothK_k > 68.0518 )
					if( Positive_Money_Flow <= 3.08561 )
						if( Raw_Money_Flow <= 592.153 )
							if( smoothK_k <= 84.9767 )
								if( Typical_Price <= 1.28402 )
									ret := -0.045455
								if( Typical_Price > 1.28402 )
									ret := -0.592593
							if( smoothK_k > 84.9767 )
								if( rsi1 <= 59.4422 )
									ret := 0.633333
								if( rsi1 > 59.4422 )
									ret := -0.473684
						if( Raw_Money_Flow > 592.153 )
							if( MFI <= 69.6337 )
								if( d <= 83.2937 )
									ret := 0.500000
								if( d > 83.2937 )
									ret := 0.127596
							if( MFI > 69.6337 )
								if( Negative_Money_Flow_Sum <= 2.61817e+06 )
									ret := 0.113609
								if( Negative_Money_Flow_Sum > 2.61817e+06 )
									ret := -0.021739
					if( Positive_Money_Flow > 3.08561 )
						if( Positive_Money_Flow_Sum <= 7.9873e+06 )
							if( Positive_Money_Flow_Sum <= 795563 )
								if( k <= 94.9554 )
									ret := -0.070831
								if( k > 94.9554 )
									ret := 0.095041
							if( Positive_Money_Flow_Sum > 795563 )
								if( Typical_Price <= 4.50111 )
									ret := -0.381616
								if( Typical_Price > 4.50111 )
									ret := -0.123089
						if( Positive_Money_Flow_Sum > 7.9873e+06 )
							if( rsi1 <= 49.9705 )
								if( Positive_Money_Flow_Sum <= 2.36582e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 2.36582e+07 )
									ret := 0.975610 // buy
							if( rsi1 > 49.9705 )
								if( Positive_Money_Flow_Sum <= 6.16211e+07 )
									ret := 0.031054
								if( Positive_Money_Flow_Sum > 6.16211e+07 )
									ret := -0.291925
		if( Positive_Money_Flow_Sum > 6.79643e+07 )
			if( Typical_Price <= 51.1609 )
				if( MFI_Low <= 59.1778 )
					if( Negative_Money_Flow_Sum <= 3.93571e+07 )
						if( Raw_Money_Flow <= 759592 )
							ret := -0.105263
						if( Raw_Money_Flow > 759592 )
							if( MFI_High <= -10.198 )
								if( Positive_Money_Flow <= 3.75042e+06 )
									ret := 0.981132 // buy
								if( Positive_Money_Flow > 3.75042e+06 )
									ret := 0.842105 // buy
							if( MFI_High > -10.198 )
								if( Positive_Money_Flow_Sum <= 6.9373e+07 )
									ret := -0.166667
								if( Positive_Money_Flow_Sum > 6.9373e+07 )
									ret := 0.709091 // buy
					if( Negative_Money_Flow_Sum > 3.93571e+07 )
						if( Negative_Money_Flow_Sum <= 6.14973e+07 )
							if( Negative_Money_Flow_Sum <= 5.6329e+07 )
								if( Positive_Money_Flow <= 15747.3 )
									ret := 0.673469
								if( Positive_Money_Flow > 15747.3 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 5.6329e+07 )
								if( d_k <= -3.84707 )
									ret := -0.941176 // sell
								if( d_k > -3.84707 )
									ret := -0.571429
						if( Negative_Money_Flow_Sum > 6.14973e+07 )
							if( k <= 45.4017 )
								if( d <= 28.07 )
									ret := 0.909091 // buy
								if( d > 28.07 )
									ret := 1.000000 // buy
							if( k > 45.4017 )
								if( Negative_Money_Flow_Sum <= 7.23204e+07 )
									ret := 0.828571 // buy
								if( Negative_Money_Flow_Sum > 7.23204e+07 )
									ret := 0.000000
				if( MFI_Low > 59.1778 )
					if( Negative_Money_Flow_Sum <= 1.51605e+06 )
						if( d <= 95.7492 )
							ret := 0.444444
						if( d > 95.7492 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 1.51605e+06 )
						if( MFI_Low <= 69.0881 )
							if( Positive_Money_Flow <= 806225 )
								if( MFI_Low <= 64.601 )
									ret := -0.583333
								if( MFI_Low > 64.601 )
									ret := 0.130435
							if( Positive_Money_Flow > 806225 )
								if( Money_Flow_Ratio <= 6.5123 )
									ret := 0.544118
								if( Money_Flow_Ratio > 6.5123 )
									ret := -0.545455
						if( MFI_Low > 69.0881 )
							if( d_k <= -7.47805 )
								ret := -0.461538
							if( d_k > -7.47805 )
								if( d <= 97.6905 )
									ret := 0.764706 // buy
								if( d > 97.6905 )
									ret := 0.250000
			if( Typical_Price > 51.1609 )
				if( MFI <= 98.1252 )
					if( Negative_Money_Flow_Sum <= 3.69524e+06 )
						if( Positive_Money_Flow_Sum <= 1.02645e+08 )
							if( smoothD_d <= 64.6125 )
								ret := 0.791667 // buy
							if( smoothD_d > 64.6125 )
								ret := -0.666667
						if( Positive_Money_Flow_Sum > 1.02645e+08 )
							ret := 0.809524 // buy
					if( Negative_Money_Flow_Sum > 3.69524e+06 )
						if( Positive_Money_Flow_Sum <= 1.56657e+08 )
							if( Positive_Money_Flow_Sum <= 8.06285e+07 )
								if( Raw_Money_Flow <= 9.54424e+06 )
									ret := -0.193966
								if( Raw_Money_Flow > 9.54424e+06 )
									ret := 0.184000
							if( Positive_Money_Flow_Sum > 8.06285e+07 )
								if( Positive_Money_Flow <= 61173.7 )
									ret := 0.369305
								if( Positive_Money_Flow > 61173.7 )
									ret := 0.033784
						if( Positive_Money_Flow_Sum > 1.56657e+08 )
							if( MFI_Low <= 25.2056 )
								if( rsi1 <= 41.2829 )
									ret := 0.444444
								if( rsi1 > 41.2829 )
									ret := 1.000000 // buy
							if( MFI_Low > 25.2056 )
								if( smoothD_d <= 72.8145 )
									ret := -0.598870
								if( smoothD_d > 72.8145 )
									ret := 0.025316
				if( MFI > 98.1252 )
					if( Negative_Money_Flow <= 3801 )
						if( Raw_Money_Flow <= 2.69272e+07 )
							if( k <= 98.5568 )
								if( d_k <= 2.20446 )
									ret := -1.000000 // sell
								if( d_k > 2.20446 )
									ret := -0.461538
							if( k > 98.5568 )
								ret := -0.550000
						if( Raw_Money_Flow > 2.69272e+07 )
							if( Positive_Money_Flow_Sum <= 1.17254e+08 )
								ret := 0.526316
							if( Positive_Money_Flow_Sum > 1.17254e+08 )
								ret := -0.666667
					if( Negative_Money_Flow > 3801 )
						ret := 0.400000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_APPS_15Min_56a8d3a1(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


