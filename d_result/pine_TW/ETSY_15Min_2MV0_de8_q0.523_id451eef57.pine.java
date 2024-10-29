//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: ETSY_15Min_2MV0_451eef57 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETSY_15Min_2MV0_451eef57", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETSY_15Min_451eef57(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Positive_Money_Flow_Sum <= 4.4988e+07 )
		if( Positive_Money_Flow <= 4467.05 )
			if( Raw_Money_Flow <= 262502 )
				if( Positive_Money_Flow_Sum <= 4.31217e+06 )
					if( Raw_Money_Flow <= 2382.85 )
						if( Typical_Price <= 14.2881 )
							if( VIP <= 1.30152 )
								if( Negative_Money_Flow_Sum <= 1.20011e+07 )
									ret := -0.896552 // sell
								if( Negative_Money_Flow_Sum > 1.20011e+07 )
									ret := -0.500000
							if( VIP > 1.30152 )
								ret := 0.166667
						if( Typical_Price > 14.2881 )
							if( Raw_Money_Flow <= 1761 )
								if( Raw_Money_Flow <= 1668.7 )
									ret := 0.250000
								if( Raw_Money_Flow > 1668.7 )
									ret := -0.750000 // sell
							if( Raw_Money_Flow > 1761 )
								ret := 0.750000 // buy
					if( Raw_Money_Flow > 2382.85 )
						if( VIM <= 1.43904 )
							if( Positive_Money_Flow_Sum <= 2.29306e+06 )
								if( MFI_Low <= 36.8765 )
									ret := 0.032680
								if( MFI_Low > 36.8765 )
									ret := -0.265625
							if( Positive_Money_Flow_Sum > 2.29306e+06 )
								if( Money_Flow_Ratio <= 0.148796 )
									ret := -0.347826
								if( Money_Flow_Ratio > 0.148796 )
									ret := 0.214545
						if( VIM > 1.43904 )
							if( Positive_Money_Flow_Sum <= 3.61361e+06 )
								if( VIP <= 1.79171 )
									ret := 0.310902
								if( VIP > 1.79171 )
									ret := 0.095238
							if( Positive_Money_Flow_Sum > 3.61361e+06 )
								if( VIP <= 1.02448 )
									ret := 0.833333 // buy
								if( VIP > 1.02448 )
									ret := -0.625000
				if( Positive_Money_Flow_Sum > 4.31217e+06 )
					if( VIP_VIM <= -0.309318 )
						if( MFI <= 46.7227 )
							if( Positive_Money_Flow_Sum <= 5.1046e+06 )
								if( Typical_Price <= 36.2923 )
									ret := 0.125000
								if( Typical_Price > 36.2923 )
									ret := 0.756098 // buy
							if( Positive_Money_Flow_Sum > 5.1046e+06 )
								if( Negative_Money_Flow_Sum <= 2.13532e+08 )
									ret := 0.184105
								if( Negative_Money_Flow_Sum > 2.13532e+08 )
									ret := -0.264151
						if( MFI > 46.7227 )
							if( Negative_Money_Flow_Sum <= 1.02475e+07 )
								if( VIP <= 1.11228 )
									ret := 0.580645
								if( VIP > 1.11228 )
									ret := -0.153846
							if( Negative_Money_Flow_Sum > 1.02475e+07 )
								if( Positive_Money_Flow_Sum <= 4.14705e+07 )
									ret := -0.504274
								if( Positive_Money_Flow_Sum > 4.14705e+07 )
									ret := 0.500000
					if( VIP_VIM > -0.309318 )
						if( Negative_Money_Flow_Sum <= 5.37011e+06 )
							if( MFI_High <= 0.939569 )
								if( Positive_Money_Flow_Sum <= 1.08209e+07 )
									ret := 0.043478
								if( Positive_Money_Flow_Sum > 1.08209e+07 )
									ret := -0.621622
							if( MFI_High > 0.939569 )
								if( VIM <= 1.54555 )
									ret := 0.368932
								if( VIM > 1.54555 )
									ret := 0.101449
						if( Negative_Money_Flow_Sum > 5.37011e+06 )
							if( Negative_Money_Flow <= 0.992352 )
								if( Negative_Money_Flow_Sum <= 9.75308e+06 )
									ret := 0.409091
								if( Negative_Money_Flow_Sum > 9.75308e+06 )
									ret := 0.045603
							if( Negative_Money_Flow > 0.992352 )
								if( VIM <= 1.77121 )
									ret := 0.362534
								if( VIM > 1.77121 )
									ret := 0.153310
			if( Raw_Money_Flow > 262502 )
				if( Negative_Money_Flow_Sum <= 2.69772e+08 )
					if( Typical_Price <= 202.677 )
						if( Negative_Money_Flow_Sum <= 1.99389e+08 )
							if( Positive_Money_Flow_Sum <= 3.60735e+07 )
								if( Typical_Price <= 62.4612 )
									ret := 0.082097
								if( Typical_Price > 62.4612 )
									ret := 0.028387
							if( Positive_Money_Flow_Sum > 3.60735e+07 )
								if( VIP <= 0.763624 )
									ret := -0.327273
								if( VIP > 0.763624 )
									ret := 0.175882
						if( Negative_Money_Flow_Sum > 1.99389e+08 )
							if( Positive_Money_Flow_Sum <= 1.52823e+07 )
								if( VIP_VIM <= -1.00617 )
									ret := 0.125000
								if( VIP_VIM > -1.00617 )
									ret := 0.776316 // buy
							if( Positive_Money_Flow_Sum > 1.52823e+07 )
								if( Negative_Money_Flow_Sum <= 2.19785e+08 )
									ret := -0.220000
								if( Negative_Money_Flow_Sum > 2.19785e+08 )
									ret := 0.411765
					if( Typical_Price > 202.677 )
						if( Raw_Money_Flow <= 1.68861e+07 )
							if( VIM <= 3.78008 )
								if( VIM <= 1.90019 )
									ret := -0.015385
								if( VIM > 1.90019 )
									ret := -0.421053
							if( VIM > 3.78008 )
								if( Raw_Money_Flow <= 515881 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 515881 )
									ret := 0.500000
						if( Raw_Money_Flow > 1.68861e+07 )
							if( Negative_Money_Flow_Sum <= 2.02926e+08 )
								if( Negative_Money_Flow_Sum <= 4.44394e+07 )
									ret := -0.850000 // sell
								if( Negative_Money_Flow_Sum > 4.44394e+07 )
									ret := -0.257485
							if( Negative_Money_Flow_Sum > 2.02926e+08 )
								if( MFI <= 3.04153 )
									ret := -1.000000 // sell
								if( MFI > 3.04153 )
									ret := -0.619048
				if( Negative_Money_Flow_Sum > 2.69772e+08 )
					if( Typical_Price <= 266.018 )
						if( Typical_Price <= 55.5729 )
							ret := 0.250000
						if( Typical_Price > 55.5729 )
							if( Negative_Money_Flow_Sum <= 3.69061e+08 )
								if( Raw_Money_Flow <= 4.9665e+07 )
									ret := 0.809524 // buy
								if( Raw_Money_Flow > 4.9665e+07 )
									ret := 0.550000
							if( Negative_Money_Flow_Sum > 3.69061e+08 )
								if( Raw_Money_Flow <= 1.19679e+06 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 1.19679e+06 )
									ret := 1.000000 // buy
					if( Typical_Price > 266.018 )
						ret := -0.800000 // sell
		if( Positive_Money_Flow > 4467.05 )
			if( Negative_Money_Flow <= 2.65332 )
				if( Money_Flow_Ratio <= 55.7382 )
					if( VIM <= 1.3084 )
						if( Negative_Money_Flow_Sum <= 1.76672e+06 )
							if( VIP_VIM <= 0.108296 )
								if( Positive_Money_Flow_Sum <= 1.01856e+06 )
									ret := 0.720000 // buy
								if( Positive_Money_Flow_Sum > 1.01856e+06 )
									ret := 0.118557
							if( VIP_VIM > 0.108296 )
								if( MFI <= 46.7813 )
									ret := 0.652174
								if( MFI > 46.7813 )
									ret := -0.132663
						if( Negative_Money_Flow_Sum > 1.76672e+06 )
							if( Typical_Price <= 42.7783 )
								if( Positive_Money_Flow_Sum <= 4.00304e+07 )
									ret := 0.085604
								if( Positive_Money_Flow_Sum > 4.00304e+07 )
									ret := 0.609195
							if( Typical_Price > 42.7783 )
								if( Positive_Money_Flow <= 7.32791e+06 )
									ret := 0.021881
								if( Positive_Money_Flow > 7.32791e+06 )
									ret := 0.116205
					if( VIM > 1.3084 )
						if( Positive_Money_Flow_Sum <= 1.59868e+07 )
							if( Negative_Money_Flow_Sum <= 235973 )
								if( MFI <= 82.027 )
									ret := -0.551724
								if( MFI > 82.027 )
									ret := 0.370370
							if( Negative_Money_Flow_Sum > 235973 )
								if( Typical_Price <= 49.6059 )
									ret := 0.121284
								if( Typical_Price > 49.6059 )
									ret := -0.004691
						if( Positive_Money_Flow_Sum > 1.59868e+07 )
							if( VIP <= 0.629799 )
								if( MFI_Low <= -6.35458 )
									ret := 0.666667
								if( MFI_Low > -6.35458 )
									ret := 0.234043
							if( VIP > 0.629799 )
								if( Negative_Money_Flow_Sum <= 997737 )
									ret := 0.384615
								if( Negative_Money_Flow_Sum > 997737 )
									ret := -0.130620
				if( Money_Flow_Ratio > 55.7382 )
					if( Positive_Money_Flow <= 2.29998e+07 )
						if( Money_Flow_Ratio <= 609.305 )
							if( Positive_Money_Flow <= 2.09141e+07 )
								if( Positive_Money_Flow_Sum <= 1.02993e+07 )
									ret := 0.583333
								if( Positive_Money_Flow_Sum > 1.02993e+07 )
									ret := -0.255319
							if( Positive_Money_Flow > 2.09141e+07 )
								if( VIM <= 1.06456 )
									ret := 1.000000 // buy
								if( VIM > 1.06456 )
									ret := 0.750000 // buy
						if( Money_Flow_Ratio > 609.305 )
							if( MFI_Low <= 79.8404 )
								ret := 1.000000 // buy
							if( MFI_Low > 79.8404 )
								if( MFI_High <= 19.9011 )
									ret := 0.000000
								if( MFI_High > 19.9011 )
									ret := 0.750000 // buy
					if( Positive_Money_Flow > 2.29998e+07 )
						if( Raw_Money_Flow <= 3.97913e+07 )
							if( Raw_Money_Flow <= 3.07502e+07 )
								if( Raw_Money_Flow <= 2.70734e+07 )
									ret := -0.916667 // sell
								if( Raw_Money_Flow > 2.70734e+07 )
									ret := 0.400000
							if( Raw_Money_Flow > 3.07502e+07 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 3.97913e+07 )
							ret := 0.333333
			if( Negative_Money_Flow > 2.65332 )
				if( Negative_Money_Flow <= 116715 )
					if( Negative_Money_Flow_Sum <= 7.87944e+07 )
						if( Positive_Money_Flow_Sum <= 2.65719e+07 )
							if( VIP <= 1.10815 )
								if( Positive_Money_Flow_Sum <= 1.09303e+07 )
									ret := 0.448276
								if( Positive_Money_Flow_Sum > 1.09303e+07 )
									ret := 0.047619
							if( VIP > 1.10815 )
								if( Typical_Price <= 29.2788 )
									ret := 0.328000
								if( Typical_Price > 29.2788 )
									ret := 0.005302
						if( Positive_Money_Flow_Sum > 2.65719e+07 )
							if( Positive_Money_Flow <= 43992.7 )
								if( VIP_VIM <= -0.155296 )
									ret := -0.218750
								if( VIP_VIM > -0.155296 )
									ret := 0.372973
							if( Positive_Money_Flow > 43992.7 )
								if( Negative_Money_Flow_Sum <= 4.54804e+06 )
									ret := 0.238095
								if( Negative_Money_Flow_Sum > 4.54804e+06 )
									ret := 0.738318 // buy
					if( Negative_Money_Flow_Sum > 7.87944e+07 )
						if( MFI <= 12.8353 )
							if( VIP <= 0.889359 )
								if( Negative_Money_Flow_Sum <= 2.37286e+08 )
									ret := 0.920000 // buy
								if( Negative_Money_Flow_Sum > 2.37286e+08 )
									ret := -0.200000
							if( VIP > 0.889359 )
								if( MFI_High <= -74.3946 )
									ret := 0.410714
								if( MFI_High > -74.3946 )
									ret := -0.180328
						if( MFI > 12.8353 )
							if( Negative_Money_Flow_Sum <= 8.78543e+07 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 8.78543e+07 )
								if( Typical_Price <= 65.185 )
									ret := -0.500000
								if( Typical_Price > 65.185 )
									ret := 0.621951
				if( Negative_Money_Flow > 116715 )
					if( VIP_VIM <= 0.254098 )
						if( VIP_VIM <= -0.787579 )
							if( Raw_Money_Flow <= 249690 )
								ret := -0.500000
							if( Raw_Money_Flow > 249690 )
								if( MFI <= 12.1228 )
									ret := 1.000000 // buy
								if( MFI > 12.1228 )
									ret := 0.500000
						if( VIP_VIM > -0.787579 )
							if( Typical_Price <= 196.231 )
								if( VIP <= 0.933318 )
									ret := 0.246575
								if( VIP > 0.933318 )
									ret := -0.118483
							if( Typical_Price > 196.231 )
								if( VIP_VIM <= -0.494883 )
									ret := 0.200000
								if( VIP_VIM > -0.494883 )
									ret := -1.000000 // sell
					if( VIP_VIM > 0.254098 )
						if( Positive_Money_Flow_Sum <= 2.14282e+07 )
							if( MFI_Low <= 50.8249 )
								if( Positive_Money_Flow_Sum <= 4.92086e+06 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 4.92086e+06 )
									ret := -0.636364
							if( MFI_Low > 50.8249 )
								if( Negative_Money_Flow_Sum <= 4.92444e+06 )
									ret := 0.696970
								if( Negative_Money_Flow_Sum > 4.92444e+06 )
									ret := -0.500000
						if( Positive_Money_Flow_Sum > 2.14282e+07 )
							if( Raw_Money_Flow <= 2.10155e+06 )
								if( VIP <= 1.1886 )
									ret := 0.000000
								if( VIP > 1.1886 )
									ret := 0.888889 // buy
							if( Raw_Money_Flow > 2.10155e+06 )
								ret := -1.000000 // sell
	if( Positive_Money_Flow_Sum > 4.4988e+07 )
		if( Negative_Money_Flow <= 37.0799 )
			if( Money_Flow_Ratio <= 0.310369 )
				if( VIP_VIM <= -0.658769 )
					if( Negative_Money_Flow_Sum <= 2.55522e+08 )
						if( Positive_Money_Flow <= 2.73249e+07 )
							if( VIP <= 0.665799 )
								ret := 1.000000 // buy
							if( VIP > 0.665799 )
								ret := 0.750000 // buy
						if( Positive_Money_Flow > 2.73249e+07 )
							ret := 0.500000
					if( Negative_Money_Flow_Sum > 2.55522e+08 )
						if( Positive_Money_Flow_Sum <= 7.75716e+07 )
							ret := 0.000000
						if( Positive_Money_Flow_Sum > 7.75716e+07 )
							if( Positive_Money_Flow_Sum <= 9.60984e+07 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 9.60984e+07 )
								ret := 0.200000
				if( VIP_VIM > -0.658769 )
					if( VIM <= 1.35085 )
						if( Negative_Money_Flow_Sum <= 2.04301e+08 )
							if( Typical_Price <= 126.58 )
								if( Raw_Money_Flow <= 1.27723e+07 )
									ret := -0.250000
								if( Raw_Money_Flow > 1.27723e+07 )
									ret := 0.636364
							if( Typical_Price > 126.58 )
								if( Typical_Price <= 213.387 )
									ret := -0.500000
								if( Typical_Price > 213.387 )
									ret := 0.666667
						if( Negative_Money_Flow_Sum > 2.04301e+08 )
							if( Negative_Money_Flow_Sum <= 2.7168e+08 )
								if( Raw_Money_Flow <= 194856 )
									ret := 0.107143
								if( Raw_Money_Flow > 194856 )
									ret := 0.584906
							if( Negative_Money_Flow_Sum > 2.7168e+08 )
								if( VIM <= 1.10735 )
									ret := -0.625000
								if( VIM > 1.10735 )
									ret := 0.189873
					if( VIM > 1.35085 )
						if( Typical_Price <= 216.501 )
							if( Raw_Money_Flow <= 36314 )
								ret := 0.250000
							if( Raw_Money_Flow > 36314 )
								if( MFI_Low <= -3.58855 )
									ret := 0.750000 // buy
								if( MFI_Low > -3.58855 )
									ret := 1.000000 // buy
						if( Typical_Price > 216.501 )
							ret := 0.400000
			if( Money_Flow_Ratio > 0.310369 )
				if( Raw_Money_Flow <= 250642 )
					if( Positive_Money_Flow_Sum <= 6.46571e+07 )
						if( VIP <= 0.961704 )
							if( Typical_Price <= 71.9376 )
								if( Money_Flow_Ratio <= 0.770935 )
									ret := -0.625000
								if( Money_Flow_Ratio > 0.770935 )
									ret := 0.000000
							if( Typical_Price > 71.9376 )
								if( MFI <= 29.0882 )
									ret := -0.214286
								if( MFI > 29.0882 )
									ret := 0.362069
						if( VIP > 0.961704 )
							if( Positive_Money_Flow <= 242.199 )
								if( MFI_Low <= 20.3591 )
									ret := -0.458333
								if( MFI_Low > 20.3591 )
									ret := 0.243243
							if( Positive_Money_Flow > 242.199 )
								if( MFI <= 52.5931 )
									ret := -0.182065
								if( MFI > 52.5931 )
									ret := -0.351190
					if( Positive_Money_Flow_Sum > 6.46571e+07 )
						if( VIP <= 4.80257 )
							if( Positive_Money_Flow_Sum <= 8.1127e+07 )
								if( Negative_Money_Flow_Sum <= 2.30586e+08 )
									ret := 0.037954
								if( Negative_Money_Flow_Sum > 2.30586e+08 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 8.1127e+07 )
								if( Positive_Money_Flow_Sum <= 1.06395e+08 )
									ret := -0.210660
								if( Positive_Money_Flow_Sum > 1.06395e+08 )
									ret := -0.024155
						if( VIP > 4.80257 )
							if( Raw_Money_Flow <= 39390.8 )
								ret := -0.500000
							if( Raw_Money_Flow > 39390.8 )
								ret := -1.000000 // sell
				if( Raw_Money_Flow > 250642 )
					if( Negative_Money_Flow_Sum <= 6.99623e+07 )
						if( MFI_High <= -21.2282 )
							if( Raw_Money_Flow <= 1.35614e+06 )
								if( MFI <= 48.2856 )
									ret := 0.750000 // buy
								if( MFI > 48.2856 )
									ret := -0.555556
							if( Raw_Money_Flow > 1.35614e+06 )
								if( Positive_Money_Flow_Sum <= 6.04508e+07 )
									ret := 0.052052
								if( Positive_Money_Flow_Sum > 6.04508e+07 )
									ret := 0.207426
						if( MFI_High > -21.2282 )
							if( Positive_Money_Flow_Sum <= 3.24723e+08 )
								if( Raw_Money_Flow <= 1.22882e+08 )
									ret := -0.007569
								if( Raw_Money_Flow > 1.22882e+08 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 3.24723e+08 )
								if( Positive_Money_Flow_Sum <= 5.80714e+08 )
									ret := 0.486726
								if( Positive_Money_Flow_Sum > 5.80714e+08 )
									ret := -0.250000
					if( Negative_Money_Flow_Sum > 6.99623e+07 )
						if( Typical_Price <= 63.9917 )
							if( Positive_Money_Flow_Sum <= 5.24838e+07 )
								if( VIM <= 1.15106 )
									ret := 0.600000
								if( VIM > 1.15106 )
									ret := -0.176471
							if( Positive_Money_Flow_Sum > 5.24838e+07 )
								if( Positive_Money_Flow <= 4.5739e+06 )
									ret := 0.120000
								if( Positive_Money_Flow > 4.5739e+06 )
									ret := -0.439153
						if( Typical_Price > 63.9917 )
							if( Negative_Money_Flow_Sum <= 3.40096e+08 )
								if( Negative_Money_Flow_Sum <= 2.18956e+08 )
									ret := -0.044368
								if( Negative_Money_Flow_Sum > 2.18956e+08 )
									ret := -0.256250
							if( Negative_Money_Flow_Sum > 3.40096e+08 )
								if( VIP <= 0.865599 )
									ret := 0.571429
								if( VIP > 0.865599 )
									ret := 0.000000
		if( Negative_Money_Flow > 37.0799 )
			if( Negative_Money_Flow <= 60872.8 )
				if( Negative_Money_Flow_Sum <= 1.10648e+08 )
					if( Money_Flow_Ratio <= 1.98073 )
						if( MFI_High <= -18.7968 )
							if( Negative_Money_Flow_Sum <= 4.99816e+07 )
								if( Negative_Money_Flow_Sum <= 4.17009e+07 )
									ret := -0.186047
								if( Negative_Money_Flow_Sum > 4.17009e+07 )
									ret := 0.636364
							if( Negative_Money_Flow_Sum > 4.99816e+07 )
								if( Negative_Money_Flow_Sum <= 6.03977e+07 )
									ret := -0.279412
								if( Negative_Money_Flow_Sum > 6.03977e+07 )
									ret := 0.156146
						if( MFI_High > -18.7968 )
							if( Typical_Price <= 151.2 )
								if( VIM <= 1.45045 )
									ret := -0.397129
								if( VIM > 1.45045 )
									ret := 0.125000
							if( Typical_Price > 151.2 )
								if( MFI <= 61.8389 )
									ret := -1.000000 // sell
								if( MFI > 61.8389 )
									ret := 0.500000
					if( Money_Flow_Ratio > 1.98073 )
						if( Positive_Money_Flow_Sum <= 5.23284e+07 )
							if( Money_Flow_Ratio <= 153.1 )
								if( VIP_VIM <= -0.104124 )
									ret := 0.533333
								if( VIP_VIM > -0.104124 )
									ret := -0.429688
							if( Money_Flow_Ratio > 153.1 )
								if( VIP_VIM <= 0.563481 )
									ret := -0.500000
								if( VIP_VIM > 0.563481 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 5.23284e+07 )
							if( Positive_Money_Flow_Sum <= 7.30929e+07 )
								if( VIP <= 1.73261 )
									ret := 0.311787
								if( VIP > 1.73261 )
									ret := 0.700599 // buy
							if( Positive_Money_Flow_Sum > 7.30929e+07 )
								if( Raw_Money_Flow <= 25324.8 )
									ret := -0.017582
								if( Raw_Money_Flow > 25324.8 )
									ret := 0.250583
				if( Negative_Money_Flow_Sum > 1.10648e+08 )
					if( Typical_Price <= 121.845 )
						if( Money_Flow_Ratio <= 0.777613 )
							if( Negative_Money_Flow_Sum <= 1.55974e+08 )
								if( VIP <= 1.17487 )
									ret := 0.845238 // buy
								if( VIP > 1.17487 )
									ret := 0.375000
							if( Negative_Money_Flow_Sum > 1.55974e+08 )
								if( Negative_Money_Flow <= 27692.5 )
									ret := -0.096774
								if( Negative_Money_Flow > 27692.5 )
									ret := 0.586207
						if( Money_Flow_Ratio > 0.777613 )
							if( Negative_Money_Flow <= 7783.11 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 7783.11 )
								if( Money_Flow_Ratio <= 1.06495 )
									ret := -0.272727
								if( Money_Flow_Ratio > 1.06495 )
									ret := 0.666667
					if( Typical_Price > 121.845 )
						if( Negative_Money_Flow <= 14206.3 )
							if( VIP <= 1.06059 )
								if( Positive_Money_Flow_Sum <= 5.47246e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 5.47246e+07 )
									ret := 1.000000 // buy
							if( VIP > 1.06059 )
								if( Positive_Money_Flow_Sum <= 8.9356e+07 )
									ret := -0.030303
								if( Positive_Money_Flow_Sum > 8.9356e+07 )
									ret := 0.866667 // buy
						if( Negative_Money_Flow > 14206.3 )
							if( VIP <= 1.20053 )
								if( Negative_Money_Flow_Sum <= 1.19124e+08 )
									ret := 0.380952
								if( Negative_Money_Flow_Sum > 1.19124e+08 )
									ret := -0.171171
							if( VIP > 1.20053 )
								if( Positive_Money_Flow_Sum <= 4.69316e+07 )
									ret := -0.833333 // sell
								if( Positive_Money_Flow_Sum > 4.69316e+07 )
									ret := 0.434211
			if( Negative_Money_Flow > 60872.8 )
				if( Positive_Money_Flow_Sum <= 5.11098e+07 )
					if( Raw_Money_Flow <= 2.40057e+06 )
						if( MFI_High <= -48.37 )
							if( Negative_Money_Flow_Sum <= 2.11425e+08 )
								if( Typical_Price <= 128.923 )
									ret := 0.777778 // buy
								if( Typical_Price > 128.923 )
									ret := 0.312500
							if( Negative_Money_Flow_Sum > 2.11425e+08 )
								if( Money_Flow_Ratio <= 0.218984 )
									ret := 0.250000
								if( Money_Flow_Ratio > 0.218984 )
									ret := -0.500000
						if( MFI_High > -48.37 )
							if( Typical_Price <= 60.2217 )
								if( Money_Flow_Ratio <= 1.54338 )
									ret := -0.272727
								if( Money_Flow_Ratio > 1.54338 )
									ret := 0.523810
							if( Typical_Price > 60.2217 )
								if( VIP <= 1.60228 )
									ret := -0.266667
								if( VIP > 1.60228 )
									ret := 0.142857
					if( Raw_Money_Flow > 2.40057e+06 )
						if( Positive_Money_Flow_Sum <= 5.03403e+07 )
							if( Raw_Money_Flow <= 7.48367e+06 )
								if( Money_Flow_Ratio <= 0.857027 )
									ret := -0.360902
								if( Money_Flow_Ratio > 0.857027 )
									ret := -0.094972
							if( Raw_Money_Flow > 7.48367e+06 )
								if( VIP_VIM <= -0.126579 )
									ret := -0.154982
								if( VIP_VIM > -0.126579 )
									ret := 0.181070
						if( Positive_Money_Flow_Sum > 5.03403e+07 )
							if( VIP_VIM <= 0.156468 )
								if( MFI <= 23.9673 )
									ret := 0.333333
								if( MFI > 23.9673 )
									ret := -0.606742
							if( VIP_VIM > 0.156468 )
								if( VIP_VIM <= 0.639983 )
									ret := 0.137931
								if( VIP_VIM > 0.639983 )
									ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 5.11098e+07 )
					if( Positive_Money_Flow_Sum <= 2.17649e+08 )
						if( Positive_Money_Flow_Sum <= 1.98812e+08 )
							if( VIM <= 1.39338 )
								if( Negative_Money_Flow_Sum <= 1.36089e+07 )
									ret := -0.152113
								if( Negative_Money_Flow_Sum > 1.36089e+07 )
									ret := 0.055248
							if( VIM > 1.39338 )
								if( Positive_Money_Flow_Sum <= 1.71116e+08 )
									ret := -0.028571
								if( Positive_Money_Flow_Sum > 1.71116e+08 )
									ret := -0.840000 // sell
						if( Positive_Money_Flow_Sum > 1.98812e+08 )
							if( Typical_Price <= 178.386 )
								if( VIM <= 0.891122 )
									ret := 0.701149 // buy
								if( VIM > 0.891122 )
									ret := 0.250000
							if( Typical_Price > 178.386 )
								if( Raw_Money_Flow <= 3.95938e+07 )
									ret := -0.225806
								if( Raw_Money_Flow > 3.95938e+07 )
									ret := 0.454545
					if( Positive_Money_Flow_Sum > 2.17649e+08 )
						if( MFI_High <= 6.28046 )
							if( Raw_Money_Flow <= 9.87221e+07 )
								if( VIP_VIM <= -0.294242 )
									ret := -0.633333
								if( VIP_VIM > -0.294242 )
									ret := -0.106682
							if( Raw_Money_Flow > 9.87221e+07 )
								if( VIM <= 0.745828 )
									ret := -0.250000
								if( VIM > 0.745828 )
									ret := 0.809524 // buy
						if( MFI_High > 6.28046 )
							if( Money_Flow_Ratio <= 18.5832 )
								if( VIM <= 1.03688 )
									ret := 0.285714
								if( VIM > 1.03688 )
									ret := 0.687500
							if( Money_Flow_Ratio > 18.5832 )
								if( Typical_Price <= 110.469 )
									ret := 0.428571
								if( Typical_Price > 110.469 )
									ret := -0.500000
	
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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_ETSY_15Min_451eef57(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)

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


